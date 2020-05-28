package cl.cleverit.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AliveController {

	//Acá iran los controladores que deben ser llamados desde el servicio, cada controlador debe contener los crud del servicio rest
	
	@GetMapping("/alive")
	public String getAlive(){
		return "Controlador ejecutado.";
	}
	
	

}
