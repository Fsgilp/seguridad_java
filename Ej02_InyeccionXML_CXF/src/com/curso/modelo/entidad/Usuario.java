package com.curso.modelo.entidad;

public class Usuario {

	private int id;
	private String login;
	private String pw;
	private String rol;

	public Usuario() {
		super();
	}

	public Usuario(int id, String login, String pw, String rol) {
		super();
		this.id = id;
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

	@Override
	public String toString() {
		return "Usuario [id=" + id + ", login=" + login + ", pw=" + pw
				+ ", rol=" + rol + "]";
	}

}


