package cl.cleverit.model.dataAccess;

import java.lang.reflect.Type;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import cl.cleverit.client.CleverClient;
import cl.cleverit.model.dto.Usuario;

@Component
public class UsuarioDataAccess {
	
	@Autowired CleverClient cClient;
	
	@Autowired ObjectMapper objectMapper;

	
	public Usuario getUsuarioById(int id) {
		try {
			
			
		}catch (Exception e) {
			e.printStackTrace();
			
		}
		return  null;
	}
	
	public ArrayList<Usuario> getUsuarios() {
		Gson gson = new Gson();
		try {
			String cadenaConLosUsuarios = cClient.getClientUsuarios();
			System.out.println(cadenaConLosUsuarios);
			ArrayList<Usuario> usuarios = null;
			Type listType = new TypeToken<ArrayList<Usuario>>(){}.getType();
			try {
				usuarios = gson.fromJson(cadenaConLosUsuarios, listType);
				if(usuarios != null && usuarios.size() > 0) {
					return usuarios;
				}	
			}catch (Exception e) {
				e.printStackTrace();
				return null;
			}
		}catch (Exception e) {
			e.printStackTrace();
			
		}
		return  new ArrayList<Usuario>(0);
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
