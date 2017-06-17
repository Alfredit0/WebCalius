<%-- 
    Document   : iniciasesion.jsp
    Created on : 6/05/2017, 11:01:39 AM
    Author     : Joseph
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    String nombre = request.getParameter("user");
    request.getSession().setAttribute("usuario", nombre);
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Sesion</title>
    </head>
    <body>
        <% response.sendRedirect("envionotificacion.jsp");             %>
    </body>
</html>
