<%-- 
    Document   : cierrasesion
    Created on : 16/05/2017, 03:32:53 AM
    Author     : LabInfo01
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    response.setHeader("usuario", "no-cache");
    request.getSession().removeAttribute("usuario");
    
    session.invalidate();
    response.sendRedirect("envionotificacion.jsp");
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
    </body>
</html>
