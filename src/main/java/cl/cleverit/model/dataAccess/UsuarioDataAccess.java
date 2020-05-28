package cl.cleverit.model.dataAccess;

import org.springframework.stereotype.Component;

import cl.cleverit.model.entities.Usuario;

@Component
public class UsuarioDataAccess {
	
	
// modificar estos por los q corresponden
	public Usuario getUsuarioById(int id) {
		Usuario usuario = new Usuario();
		return  usuario;
	}
	
	public boolean saveUsuario(Usuario usuario) {
		//aca crear metodo q llame a la interfaz del jpa
		return true;
	}
	
	public boolean deleteUsuario(int id) {
		return true;
	}
	
	public Usuario updateUsuario( Usuario usuario) {
		return usuario;
	}

}
