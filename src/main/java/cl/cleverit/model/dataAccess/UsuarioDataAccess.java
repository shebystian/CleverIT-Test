package cl.cleverit.model.dataAccess;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;

import cl.cleverit.model.entities.Data;
import cl.cleverit.model.entities.Usuario;
import cl.cleverit.service.CleverClient;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

@Component
public class UsuarioDataAccess {
	
	@Autowired CleverClient cclient;
	@Autowired ObjectMapper objectMapper;
	
// modificar estos por los q corresponden
	@SuppressWarnings("unchecked")
	public Usuario getUsuarioById(int id) throws Exception {
		String assembledPath = "http://arsene.azurewebsites.net/User";
		
        CleverClient cclient = new CleverClient();
        String response = cclient.getClient(assembledPath);
        
        ArrayList<Usuario> user = new ArrayList<Usuario>();
        Data data = new Data();
        Gson gson =new Gson();
        ResponseEntity re = ResponseEntity.badRequest().body(data);
		//user= (ArrayList<Usuario>) (gson.fromJson(response, Usuario.class));
		
		Usuario usuario = new Usuario();
		if(id == 1) {
			usuario.setId("1");
			usuario.setNombre("Sebastian");
			usuario.setApellido("Sanchez");
		}
		else {
			usuario = new Usuario();
		}
		
		return  usuario;
	}
	
	public boolean saveUsuario(Usuario usuario) {
		if(usuario.getId() == "164922863")
			return true;
		else//aca crear metodo q llame a la interfaz del jpa
			return false;
	}
	
	public boolean deleteUsuario(int id) {
		if(id == 164922863)
			return true;
		else//aca crear metodo q llame a la interfaz del jpa
			return false;
	}
	
	public Usuario updateUsuario( Usuario usuario) {
		if(usuario.getId() == "164922863") {
			usuario.setNombre("Sebastian Andres");
			usuario.setApellido("Sanchez Aranguiz");
		}
		else {
			usuario.setNombre("Sebastian");
			usuario.setApellido("Sanchez");
		}
		return usuario;
	}

}
