<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>

<body onload="movida()">

	<h1>
		Validación XSS con ESAPI	
	</h1>

	<form id="formulario" action="SVESAPI" method="POST">
	
		<p class="botonera">
			<input type="submit" value="Guardar"/>
		</p>
	
		<table>
			<tr>
				<td>Nodo de texto (no esperamos html)</td>
				<td>
					<input type="text" name="textoHtml" value="<h1>Texto</h1>"/>
				</td>
			</tr>
			<tr>
				<td>Atributo</td>
				<td>
					<input type="text" name="atributo" value="green"/>
				</td>
			</tr>
			<tr>
				<td>CSS</td>
				<td>
					<input type="text" name="css" value="blue"/>
				</td>
			</tr>	
			<tr>
				<td>Parámetro Url</td>
				<td>
					<input type="text" name="parametroUrl" value="VALOR"/>
				</td>
			</tr>	
			<tr>
				<td>Url</td>
				<td>
					<input type="text" name="url" value="http://www.google.es"/>
				</td>
			</tr>	
			<tr>
				<td>Html</td>
				<td>
					<input type="text" name="html" value="<h1>Html</h1>"/>
				</td>
			</tr>	
			<tr>
				<td>Javascript</td>
				<td>
					<input type="text" name="javascript" value="¡Hola!"/>
				</td>
			</tr>	
		</table>
		
		<p align="center">
			&#x27;&#x3B;&#x61;&#x6C;&#x65;&#x72;&#x74;&#x28;&#x53;&#x74;&#x72;&#x69;&#x6E;&#x67;&#x2E;&#x66;&#x72;&#x6F;&#x6D;&#x43;&#x68;&#x61;&#x72;&#x43;&#x6F;&#x64;&#x65;&#x28;&#x38;&#x38;&#x2C;&#x38;&#x33;&#x2C;&#x38;&#x33;&#x29;&#x29;&#x2F;&#x2F;&#x27;&#x3B;&#x61;&#x6C;&#x65;&#x72;&#x74;&#x28;&#x53;&#x74;&#x72;&#x69;&#x6E;&#x67;&#x2E;&#x66;&#x72;&#x6F;&#x6D;&#x43;&#x68;&#x61;&#x72;&#x43;&#x6F;&#x64;&#x65;&#x28;&#x38;&#x38;&#x2C;&#x38;&#x33;&#x2C;&#x38;&#x33;&#x29;&#x29;&#x2F;&#x2F;&#x22;&#x3B;&#x0A;&#x61;&#x6C;&#x65;&#x72;&#x74;&#x28;&#x53;&#x74;&#x72;&#x69;&#x6E;&#x67;&#x2E;&#x66;&#x72;&#x6F;&#x6D;&#x43;&#x68;&#x61;&#x72;&#x43;&#x6F;&#x64;&#x65;&#x28;&#x38;&#x38;&#x2C;&#x38;&#x33;&#x2C;&#x38;&#x33;&#x29;&#x29;&#x2F;&#x2F;&#x22;&#x3B;&#x61;&#x6C;&#x65;&#x72;&#x74;&#x28;&#x53;&#x74;&#x72;&#x69;&#x6E;&#x67;&#x2E;&#x66;&#x72;&#x6F;&#x6D;&#x43;&#x68;&#x61;&#x72;&#x43;&#x6F;&#x64;&#x65;&#x28;&#x38;&#x38;&#x2C;&#x38;&#x33;&#x2C;&#x38;&#x33;&#x29;&#x29;&#x2F;&#x2F;&#x2D;&#x2D;&#x0A;&#x3E;&#x3C;&#x2F;&#x53;&#x43;&#x52;&#x49;&#x50;&#x54;&#x3E;&#x22;&#x3E;&#x27;&#x3E;&#x3C;&#x53;&#x43;&#x52;&#x49;&#x50;&#x54;&#x3E;&#x61;&#x6C;&#x65;&#x72;&#x74;&#x28;&#x53;&#x74;&#x72;&#x69;&#x6E;&#x67;&#x2E;&#x66;&#x72;&#x6F;&#x6D;&#x43;&#x68;&#x61;&#x72;&#x43;&#x6F;&#x64;&#x65;&#x28;&#x38;&#x38;&#x2C;&#x38;&#x33;&#x2C;&#x38;&#x33;&#x29;&#x29;&#x3C;&#x2F;&#x53;&#x43;&#x52;&#x49;&#x50;&#x54;&#x3E;
		</p>
		
	</form>

</body>
</html>