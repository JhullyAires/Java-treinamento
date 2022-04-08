<%
 String nomeEmpresa = (String)request.getAttribute("empresa");
 System.out.println(nomeEmpresa);
%>

<html><body>
Empresa <%= nomeEmpresa %> cadrastrada com sucesso!
</body></html>


