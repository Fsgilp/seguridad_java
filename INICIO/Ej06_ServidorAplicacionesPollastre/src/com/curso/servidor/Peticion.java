package com.curso.servidor;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Map;

public class Peticion {

	private String metodo;
	private String recurso;
	private Socket socket;
	private Map<String,String> parametros;

	public Peticion() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Peticion(String metodo, String recurso, Socket socket, Map<String,String> parametros) {
		super();
		this.metodo = metodo;
		this.recurso = recurso;
		this.socket = socket;
		this.setParametros(parametros);
	}

	public String getMetodo() {
		return metodo;
	}

	public void setMetodo(String metodo) {
		this.metodo = metodo;
	}

	public String getRecurso() {
		return recurso;
	}

	public void setRecurso(String recurso) {
		this.recurso = recurso;
	}
	
	public PrintWriter getWriter(){
		PrintWriter out = null;
		
		try {
			OutputStream os = socket.getOutputStream();
			out = new PrintWriter(os);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return out;
		
	}

	public void setParametros(Map<String,String> parametros) {
		this.parametros = parametros;
	}

	public Map<String,String> getParametros() {
		return parametros;
	}
	
	public String getParametro(String clave){
		return parametros.get(clave);
	}

}
