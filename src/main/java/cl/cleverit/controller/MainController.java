package cl.cleverit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
	
	@Autowired UsuarioController userC;

	@GetMapping("/")
	public String welcome(Model model) {
		
		model.addAttribute("mensaje","Hola, esta es la pag principal, para ver la lista de usuarios ve a /user");
		return "index";
	 }
	
	@GetMapping("/user")
	public String getListUser(Model model) throws Exception {
		
		String usuarios = userC.getListaUsuario();
		model.addAttribute("usuarios", usuarios);
		model.addAttribute("usuariosTitle", "Lista de Usuarios");
		
		return "user";
	 }

}

