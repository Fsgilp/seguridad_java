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
		Datos de la pel�cula
	</h1>
	
	<form action="SVPeliculas" method="get">	
	
		<input type="hidden" name="accion" value="verFormulario"/>
	
		<p class="botonera">
			<!-- Si se pulsa este bot�n el formulario env�a 
			     GET SVPeliculas?accion=verFormulario -->
			<input type="submit" value="Nuevo"/>
		</p>		

		<table>
			<tr>
				<td>T�tulo</td>
				<td>
					${peliculaSel.titulo}
				</td>
			</tr>
			<tr>
				<td>Director</td>
				<td>
					${peliculaSel.director}
				</td>
			</tr>
			<tr>
				<td>Genero</td>
				<td>
					${peliculaSel.genero}
				</td>
			</tr>	
			<tr>
				<td>A�o</td>
				<td>
					${peliculaSel.year}
				</td>
			</tr>	
		</table>
	

	</form>

</body>
</html>






