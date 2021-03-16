package com.curso.servidor;

import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AnalizadorHTTP {

	//SINGLETON
	private static AnalizadorHTTP analizadorHTTP;
	
	public static AnalizadorHTTP getAnalizadorHTTP(){
		if(analizadorHTTP == null)
			analizadorHTTP = new AnalizadorHTTP();
		return analizadorHTTP;
	}	

	//Si declaramos el socket como atributo no es Thread-safe
	//private Socket socket;
	//Esto no sera Thread-safe: distintos hilos 'pisarian' el atributo
	//public void setSocket(Socket socket){
	//	this.socket = socket;
	//}
	
	private AnalizadorHTTP() {
		super();
	}
	
	//Esto si es Thread-safe: cada hilo llama al método con su propio socket
	public Peticion analizar(Socket socket){
		Peticion peticion = null;
		try {
			InputStream is = socket.getInputStream();			
			Scanner sc = new Scanner(is);
			String peticionHTTP = sc.nextLine();
			System.out.println("Petición HTTP recibida:"+peticionHTTP);
			
			String [] trozos = peticionHTTP.split(" ");
			String tipoPeticion      = trozos[0];
			String recursoParametros = trozos[1];
			
			String [] trozos2 = recursoParametros.split("\\?");
			String recurso = trozos2[0];
			Map<String,String> mapaParametros = new HashMap<String,String>();
			if(trozos2.length>1){
				String[] arrayParametros = trozos2[1].split("&");
				for(String param: arrayParametros){
					String [] trozosParametro = param.split("=");
					String clave = trozosParametro[0];
					String valor = "";
					if(trozosParametro.length>1){
						valor = trozosParametro[1];
					}
					mapaParametros.put(clave, valor);
				}
			}
			
			//Parámetros
			//Cookies
			//...			
			//Si hay algun fallo devolveríamos un html con el error
			//adecuado y la cabecera con el código de error correspondiente
			
			//Si todo ha ido bien creamos el objeto de tipo petición
			peticion = new Peticion(tipoPeticion, recurso, socket, mapaParametros);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		return peticion;
		
	}

}
