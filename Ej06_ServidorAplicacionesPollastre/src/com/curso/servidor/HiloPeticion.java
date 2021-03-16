package com.curso.servidor;

import java.io.IOException;
import java.net.Socket;

public class HiloPeticion implements Runnable {

	private Socket socket;
	
	public HiloPeticion(Socket socket) {
		super();
		this.socket = socket;
	}

	public void run(){

		//Accedemos al analizador que es un singleton
		AnalizadorHTTP analizadorHTTP = AnalizadorHTTP.getAnalizadorHTTP();
		Peticion peticion = analizadorHTTP.analizar(socket);
		
		//Accedemos al procesador que es un singleton
		ProcesadorPeticiones procesador = ProcesadorPeticiones.getInstancia();
		procesador.procesarPeticion(peticion);
		
		try {
			peticion.getWriter().flush();
			socket.close();
		} catch (IOException e) {
			e.printStackTrace();
		}	
		
	}
	
}
