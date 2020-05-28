package cl.cleverit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import cl.cleverit.model.dataAccess.UsuarioDataAccess;
import cl.cleverit.model.entities.Usuario;

@RestController
public class UsuarioController {
	
	@Autowired UsuarioDataAccess usuarioDA;
	
	@GetMapping("/usuario/{id}")
	public Usuario getUsuario(@PathVariable int id) {
		return usuarioDA.getUsuarioById(id);
	}

}
