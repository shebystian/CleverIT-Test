package cl.cleverit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.cleverit.controller.UsuarioController;
import cl.cleverit.model.entities.Usuario;

@Service
public class UsuarioService implements IUsuarioService {
	
	@Autowired UsuarioController usuarioController;

	@Override
	public Usuario getUsuario(int id) {
		
		return usuarioController.getUsuario(id);
	}

	

}
