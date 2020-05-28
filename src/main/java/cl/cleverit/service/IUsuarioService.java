package cl.cleverit.service;

import cl.cleverit.model.entities.Usuario;

public interface IUsuarioService {

	Usuario getUsuario(int id) throws Exception;
	
	boolean saveUsuario(Usuario usuario);
	
	boolean deleteUsuario(int id);
	
	Usuario updateUsuario(Usuario usuario);

}
