package com.curso.servidor;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import com.curso.servidor.api.Accion;

public class ProcesadorPeticiones {

	//SINGLETON
	private static ProcesadorPeticiones procesador;
	
	private ProcesadorPeticiones(){
		buscarAplicaciones();
	}	

	//////////////////////////////////////////
	//ATRIBUTOS NORMALES DE LA CLASE
	//MÉTODOS NORMALES DE LA CLASE
	Map <String,Accion> mapaAcciones = new HashMap<String, Accion>();
	
	private void buscarAplicaciones(){
		File directorioWeb = new File("web");

		File [] subdirectorios = directorioWeb.listFiles();
		for(File subdirectorio: subdirectorios){
			if(subdirectorio.isDirectory()){
				File webTxt = new File(subdirectorio.getPath()+"\\web.txt");
				if(webTxt.exists() && webTxt.isFile()){
					cargarClases(webTxt);
				}				
			}
		}
	}

	private void cargarClases(File webTxt) {
		Scanner sc = null;			
		try {
			sc = new Scanner(webTxt);
			while(sc.hasNextLine()){
				String linea = sc.nextLine();
				String [] trozos = linea.split("=");
							
				String clave = trozos[0];
				Accion a = (Accion) Class.forName(trozos[1]).newInstance();
				mapaAcciones.put(clave, a);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			sc.close();
		}
	}

	public static ProcesadorPeticiones getInstancia(){
		if(procesador==null)
			procesador = new ProcesadorPeticiones();
		return procesador;
	}
	
	//El metodo procesar petición es thread-safe: múltiples hilos
	//pueden llamarlo concurrentemente sin problema
	public void procesarPeticion(Peticion peticion){
		
		String recurso = peticion.getRecurso();
		if(recurso.endsWith(".html")){
			leerFicheroHtml(peticion);
		} else {
			//Simplificando: si no acaba en HTML es una ACCION
			
			Accion accion = mapaAcciones.get(recurso);
			accion.ejecutar(peticion); //Habría que capturar posibles excepciones para lanzar un error 500
		}
		
	}	

	private void leerFicheroHtml(Peticion peticion){

		/*try {
			Thread.sleep(10000);
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}*/
		
		String recurso = peticion.getRecurso();

		//File representa a un fichero o directorio del sistema de archivos.
		//No sirve para leer o escribir
		//Si sirve para averiguar datos como el tamaño, permisos, fechas de creación, si existe o no
		//Tambien sirve para RENOMBRAR Y BORRAR ficheros
		File fichero = new File("web"+recurso);
		
		Scanner sc = null;
		
		PrintWriter out = peticion.getWriter();
		out.println("HTTP/1.1 200 OK");
		out.println("Content-type: text/html");
		out.println();
		try {
			sc = new Scanner(fichero);
			while(sc.hasNextLine()){
				String linea = sc.nextLine();
				out.println(linea);			
			}	
			out.flush();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally{
			sc.close();
		}
		
		
	}
	
}
