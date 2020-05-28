package cl.cleverit.model.entities;

import java.io.Serializable;
import java.util.List;

public class Data implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -295705023832571775L;

	public Data() {
		// TODO Auto-generated constructor stub
	}
	
	public List<Usuario> getUsuario() {
		return usuario;
	}

	public void setUsuario(List<Usuario> usuario) {
		this.usuario = usuario;
	}

	private List<Usuario> usuario;

}
