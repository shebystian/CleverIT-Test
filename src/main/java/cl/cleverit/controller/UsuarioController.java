package cl.cleverit.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import cl.cleverit.model.dto.Usuario;
import cl.cleverit.service.UsuarioService;

@RestController
public class UsuarioController {
	
	
	@Autowired UsuarioService usuarioService;
	
	@GetMapping("/usuario/{id}")
	public Usuario getUsuario(@PathVariable int id) throws Exception {
		return usuarioService.getUsuario(id);
	}
	
	@GetMapping("/usuario/")
	public ArrayList<Usuario> getListaUsuario() throws Exception {
		return usuarioService.getListaUsuario();
	}
	
	@PostMapping("/usuario/")
	public boolean saveUsuario(@RequestBody Usuario usuario) {
		return usuarioService.saveUsuario(usuario);
	}
	
	@DeleteMapping("/usuario/{id}")
	public boolean deleteUsuario(@PathVariable int id) {
		return usuarioService.deleteUsuario(id);
	}
	
	@PutMapping("/usuario/")
	public Usuario updateUsuario(@RequestBody Usuario usuario) {
		return usuarioService.updateUsuario(usuario);
	}

}
