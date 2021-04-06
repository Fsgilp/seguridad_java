package com.curso.modelo.entidad;

import java.util.ArrayList;
import java.util.List;

public class Usuario {

	private int id;
	private String nombre;
	private String login;
	private String pw;
	private String rol;
	
	public Usuario() {
		super();
	}

	public Usuario(int id, String nombre, String login, String pw, String rol) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.login = login;
		this.pw = pw;
		this.rol = rol;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public String getRol() {
		return rol;
	}

	public void setRol(String rol) {
		this.rol = rol;
	}

}
