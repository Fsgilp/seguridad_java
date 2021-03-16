<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<h1>
		Resultado de la validación con ESAPI	
	</h1>

	<form id="formulario" action="formularioESAPI.jsp">
	
		<p class="botonera">
			<input type="submit" value="Volver"/>
		</p>

		<table>
			<tr>
				<td>Nodo de texto en html</td>
				<td>
					<b>${textoHtml}</b><!-- Solo admito texto html -->
				</td>
			</tr>
			<tr>
				<td>Atributo</td>
				<td>
					<font color="${atributo}">Hola</font>
				</td>
			</tr>
			<tr>
				<td>CSS</td>
				<td>
					<div style="color:${css};">
						Css
					</div>
				</td>
			</tr>	
			<tr>
				<td>Parámetro Url</td>
				<td>
					<a href="inicio.html?param=${parametroUrl}">enlace</a>
				</td>
			</tr>	
			<tr>
				<td>Url</td>
				<td>
					<a href="${url}">enlace</a>
				</td>
			</tr>	
			<tr>
				<td>Html</td>
				<td>
					${html}<!-- Admito cualquier cosa que sea html -->
				</td>
			</tr>	
			<tr>
				<td>Javascript</td>
				<td>
					<input type="text" value="${javascript}"/>
					<script>
						var saludo = '${javascript}';
						alert(saludo);					
					</script>
				</td>
			</tr>	
		</table>
		
	</form>

</body>
</html>