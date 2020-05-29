package cl.cleverit.repository;

import java.util.ArrayList;

import cl.cleverit.model.dto.Usuario;

public interface IUsuarioService {

	Usuario getUsuario(int id) throws Exception;
	
	boolean saveUsuario(Usuario usuario);
	
	boolean deleteUsuario(int id);
	
	Usuario updateUsuario(Usuario usuario);

	ArrayList<Usuario> getListaUsuario() throws Exception;

}
