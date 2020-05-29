package cl.cleverit.model.dataAccess;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;

import cl.cleverit.model.entities.Usuario;
import cl.cleverit.service.CleverClient;

@Component
public class UsuarioDataAccess {
	
	@Autowired CleverClient cclient;
	
	@Autowired ObjectMapper objectMapper;

	public static final String BASE_URL = "http://arsene.azurewebsites.net";
	
	
	@SuppressWarnings({ "unchecked" })
	public Usuario getUsuarioById(int id) throws Exception {
		String assembledPath = "/User";
        CleverClient cclient = new CleverClient();
        String response = cclient.getClient(BASE_URL+assembledPath);
        Gson gson =new Gson();
        List<Object> user = (List<Object>) (gson.fromJson(response, Object.class));
		Usuario us = new Usuario();
		
		// quede pegado aca
		
		return  us;
	}
	
	@SuppressWarnings("null")
	public String getListaUsuarios() throws Exception {
		String assembledPath = "/User";
        CleverClient cclient = new CleverClient();
        String response = cclient.getClient(BASE_URL.concat(assembledPath));
        Gson gson =new Gson();
        @SuppressWarnings("unchecked")
		List<Object> user = (List<Object>) (gson.fromJson(response, Object.class));
		
		List<Usuario> usuarioList = null;
		/*
		for(Object objUser : user.toArray())
		{
			Usuario u = (Usuario)objUser;
			
			Usuario us = new Usuario();
			us.setId(u.getId());
			us.setNombre(u.getNombre());
			us.setApellido(u.getApellido());
			us.setEmail(u.getEmail());
			us.setProfesion(u.getProfesion());
			
			usuarioList.add(us);
		}
		*/
		return  response;
	}
	
	public boolean saveUsuario(Usuario usuario) {
		//CREAR METODO
		return true;
	}
	
	public boolean deleteUsuario(int id) {
		//CREAR METODO
		return true;
	}
	
	public Usuario updateUsuario( Usuario usuario) {
		//CREAR METODO
		
		return usuario;
	}

}
