package cl.cleverit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.cleverit.model.dataAccess.UsuarioDataAccess;
import cl.cleverit.model.entities.Usuario;

@Service
public class UsuarioService implements IUsuarioService {
	

	@Autowired UsuarioDataAccess usuarioDA;

	@Override
	public Usuario getUsuario(int id) throws Exception {
		
		return usuarioDA.getUsuarioById(id);
	}

	@Override
	public boolean saveUsuario(Usuario usuario) {
		
		return usuarioDA.saveUsuario(usuario);
	}

	@Override
	public boolean deleteUsuario(int id) {
		
		return usuarioDA.deleteUsuario(id);
	}

	@Override
	public Usuario updateUsuario(Usuario usuario) {
		return usuarioDA.updateUsuario(usuario);
	}

	@Override
	public String getListaUsuario() throws Exception {
		return usuarioDA.getListaUsuarios();
	}

}
