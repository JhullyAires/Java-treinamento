<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.List, br.com.alura.gerenciador.servlet.Empresa" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	Lista de empresas: <br />
	<ul>
	<%
		List<Empresa> lista = (List<Empresa>)request.getAttribute("empresas");
		// fazendo um la�o
		for (Empresa empresa : lista) { // para cada empresa dentro dessa lista, fa�a alguma coisa
	%>
		<li><%= empresa.getNome() %></li>
	<%
		}
	%>	
	</ul>	
</body>
</html>