<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>

<link href="css/estilos.css" rel="stylesheet" type="text/css">

</head>

<body>

	<h1>
		Formulario de películas	
	</h1>

	<form id="formulario" action="SVPeliculas" method="POST">
	
		<input type="hidden" id="accion" name="accion" value="insertar"/>

		<p class="botonera">
			<input type="submit" value="Guardar"/>
		</p>
	
		<input type="hidden" id="idPelicula" name="idPelicula" value="${peliculaSel.id}"/>
		 
		<table>
			<tr>
				<td>Título</td>
				<td>
					<input type="text" name="titulo" value="${peliculaSel.titulo}"/>
				</td>
			</tr>
			<tr>
				<td>Director</td>
				<td>
					<input type="text" name="director" value="${peliculaSel.director}"/>
				</td>
			</tr>
			<tr>
				<td>Genero</td>
				<td>
					<input type="text" name="genero" value="${peliculaSel.genero}"/>
				</td>
			</tr>	
			<tr>
				<td>Año</td>
				<td>
					<input type="text" name="year" value="0${peliculaSel.year}"/>
				</td>
			</tr>	
		</table>
		
		<hr/>
		Este código garantiza que se va a ejecutar alguno de los alerts
		<p align="center">
			&#x27;&#x3B;&#x61;&#x6C;&#x65;&#x72;&#x74;&#x28;&#x53;&#x74;&#x72;&#x69;&#x6E;&#x67;&#x2E;&#x66;&#x72;&#x6F;&#x6D;&#x43;&#x68;&#x61;&#x72;&#x43;&#x6F;&#x64;&#x65;&#x28;&#x38;&#x38;&#x2C;&#x38;&#x33;&#x2C;&#x38;&#x33;&#x29;&#x29;&#x2F;&#x2F;&#x27;&#x3B;&#x61;&#x6C;&#x65;&#x72;&#x74;&#x28;&#x53;&#x74;&#x72;&#x69;&#x6E;&#x67;&#x2E;&#x66;&#x72;&#x6F;&#x6D;&#x43;&#x68;&#x61;&#x72;&#x43;&#x6F;&#x64;&#x65;&#x28;&#x38;&#x38;&#x2C;&#x38;&#x33;&#x2C;&#x38;&#x33;&#x29;&#x29;&#x2F;&#x2F;&#x22;&#x3B;&#x0A;&#x61;&#x6C;&#x65;&#x72;&#x74;&#x28;&#x53;&#x74;&#x72;&#x69;&#x6E;&#x67;&#x2E;&#x66;&#x72;&#x6F;&#x6D;&#x43;&#x68;&#x61;&#x72;&#x43;&#x6F;&#x64;&#x65;&#x28;&#x38;&#x38;&#x2C;&#x38;&#x33;&#x2C;&#x38;&#x33;&#x29;&#x29;&#x2F;&#x2F;&#x22;&#x3B;&#x61;&#x6C;&#x65;&#x72;&#x74;&#x28;&#x53;&#x74;&#x72;&#x69;&#x6E;&#x67;&#x2E;&#x66;&#x72;&#x6F;&#x6D;&#x43;&#x68;&#x61;&#x72;&#x43;&#x6F;&#x64;&#x65;&#x28;&#x38;&#x38;&#x2C;&#x38;&#x33;&#x2C;&#x38;&#x33;&#x29;&#x29;&#x2F;&#x2F;&#x2D;&#x2D;&#x0A;&#x3E;&#x3C;&#x2F;&#x53;&#x43;&#x52;&#x49;&#x50;&#x54;&#x3E;&#x22;&#x3E;&#x27;&#x3E;&#x3C;&#x53;&#x43;&#x52;&#x49;&#x50;&#x54;&#x3E;&#x61;&#x6C;&#x65;&#x72;&#x74;&#x28;&#x53;&#x74;&#x72;&#x69;&#x6E;&#x67;&#x2E;&#x66;&#x72;&#x6F;&#x6D;&#x43;&#x68;&#x61;&#x72;&#x43;&#x6F;&#x64;&#x65;&#x28;&#x38;&#x38;&#x2C;&#x38;&#x33;&#x2C;&#x38;&#x33;&#x29;&#x29;&#x3C;&#x2F;&#x53;&#x43;&#x52;&#x49;&#x50;&#x54;&#x3E;
		</p>
	
	</form>

</body>
</html>




