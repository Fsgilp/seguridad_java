package concesionarioLocoJoe;

import java.io.PrintWriter;

import com.curso.servidor.Peticion;
import com.curso.servidor.api.Accion;

public class CatalogoAccion implements Accion {

	@Override
	public void ejecutar(Peticion peticion) {

		System.out.println("EH!");
		
		//Recogeriamos los parametros
		//select * from vehiculo
		//Recorrer el resultado y crear el HTML
		
		PrintWriter out = peticion.getWriter();
		out.println("<html>");
		out.println("<head></head>");
		out.println("<body>");
		out.println("<h2 align='center'><font color='orange'>Vehiculos disponibles</font></h2>");
		out.println("<table align='center' border='1'>");
		out.println("<tr><th>Marca</th><th>Modelo</th><th>Precio</th></tr>");
		out.println("<tr><td>Renault</td><td>8</td><td>3.000</td></tr>");
		out.println("<tr><td>Talbot</td><td>Samba</td><td>500</td></tr>");
		out.println("<tr><td>Renault</td><td>5 Copa Turbo</td><td>30.000</td></tr>");
		out.println("<tr><td>Seat</td><td>131 Supermirafiori</td><td>600</td></tr>");
		out.println("<tr><td>Seat</td><td>124 Sport</td><td>8000</td></tr>");
		out.println("<tr><td>Citroën</td><td>2Cv</td><td>3000</td></tr>");
		out.println("</table>");
		out.println("<p align='center'><a href='clientes'>Zona clientes</a></p>");
		out.println("</body>");
		out.println("</html>");
		
		out.flush();

				
	}

}
