package concesionarioLocoJoe;

import java.io.PrintWriter;

import com.curso.servidor.Peticion;
import com.curso.servidor.api.Accion;

public class ClientesAccion implements Accion {

	@Override
	public void ejecutar(Peticion peticion) {
		
		//Recogeriamos los parametros
		//select * from vehiculo
		//Recorrer el resultado y crear el HTML
		
		String nombre = peticion.getParametro("nombre");
		String direccion = peticion.getParametro("direccion");
		String telefono = peticion.getParametro("telefono");
		
		System.out.println(nombre+", "+direccion+", "+telefono);
		
		PrintWriter out = peticion.getWriter();
		out.println("<html>");
		out.println("<head></head>");
		out.println("<body>");
		out.println("<h2 align='center'><font color='green'>CLIENTES</font></h2>");
		
		out.println("<form action='clientes'>");
		out.println("	<p align='center'><input type='submit' value='Enviar'/></p>");
		out.println("	<table align='center'>");	
		out.println("		<tr>");
		out.println("			<td>Nombre</td>");
		out.println("			<td><input type='text' name='nombre'/></td>");
		out.println("		</tr>");
		out.println("		<tr>");
		out.println("			<td>Dirección</td>");	
		out.println("			<td><input type='text' name='direccion'/></td>");
		out.println("		</tr>");
		out.println("		<tr>");
		out.println("			<td>Telefono</td>");	
		out.println("			<td><input type='text' name='telefono'/></td>");
		out.println("		</tr>");
		out.println("	</table>");
		out.println("</form>");		
		
		out.println("</body>");
		out.println("</html>");
		
		out.flush();

				
	}

}
