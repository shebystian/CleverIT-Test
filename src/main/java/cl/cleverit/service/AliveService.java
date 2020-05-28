package cl.cleverit.service;

import org.springframework.beans.factory.annotation.Autowired;

import cl.cleverit.controller.AliveController;

public class AliveService {

	@Autowired AliveController aliveController;
	
	public String getAlive() {
		return aliveController.getAlive();
		
	}
}
