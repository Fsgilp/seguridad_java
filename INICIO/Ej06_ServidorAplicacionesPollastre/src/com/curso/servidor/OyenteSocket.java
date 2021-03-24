package com.curso.servidor;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class OyenteSocket {

	private int puerto;

	public OyenteSocket() {
		super();
		puerto = 8080;
	}

	public OyenteSocket(int puerto) {
		super();
		this.puerto = puerto;
	}
	
	public void escuchar(){
		
		try {
			ServerSocket svSk = new ServerSocket(puerto);
			
			while(true){
				System.out.println("Esperando una petición...");
				Socket sk = svSk.accept();
			
				HiloPeticion hiloPeticion = new HiloPeticion(sk);
				Thread th = new Thread(hiloPeticion);
				th.start();
			}			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}




























