package com.curso.servidor;

public class Arranque {

	public static void main(String[] args) {
		
		System.out.println("Arrancando PollastreWeb 1.1");
		
		OyenteSocket osk = null;
		if(args.length>0){
			int puerto = Integer.parseInt(args[0]);
			osk = new OyenteSocket(puerto);
		} else {
			osk = new OyenteSocket();
		}
		osk.escuchar();
			
	}
	
}
