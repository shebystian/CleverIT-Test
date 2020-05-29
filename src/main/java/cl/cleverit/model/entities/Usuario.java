package cl.cleverit.model.entities;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)

public class Usuario implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 4781307382045054021L;
	public Usuario() {
		// TODO Auto-generated constructor stub
	}
	
	private String id;
	private String nombre;
	private String apellido;
	private String profesion;
	private String email;
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public String getProfesion() {
		return profesion;
	}
	public void setProfesion(String profesion) {
		this.profesion = profesion;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	

}
