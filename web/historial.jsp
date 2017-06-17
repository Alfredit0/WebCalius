<%-- 
    Document   : historial
    Created on : 15/04/2017, 02:45:49 PM
    Author     : Joseph
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<% 

String nombreuser = (String)request.getSession().getAttribute("usuario");
if (nombreuser == null) 
{
    response.sendRedirect("index_1.jsp");
}
else{
%>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <title>Historial de notificaciones - CALIUS</title>

    <link href="Style/css/bootstrap.css" rel="stylesheet">
    <style type="text/css">
           .pie{background: #a42219;}
           #todoancho{width: 100%;}
           .footer {
             position: absolute;
             bottom: 0;
             width: 100%;
             /* Set the fixed height of the footer here */

             background-color: #a42219;
           }
           html {
             position: relative;
             min-height: 100%;
           }
           body {
             /* Margin bottom by footer height */
             margin-bottom: 60px;
           }
    </style>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.0/jquery.min.js"></script>
    <script>
    function verdetalles(asunto,fecha,destinatario,mensaje)
    {
        swal("Asunto: "+asunto+"", "Fecha: "+fecha+" \n Destinatario: "+destinatario+" \n Mensaje: "+mensaje+"");
    }
    </script>
    <script src="sweetalert/sweetalert.min.js"></script>
    <link rel="stylesheet" type="text/css" href="sweetalert/sweetalert.css">
  </head>
  <body>
    <nav class="navbar navbar-default">
      <div class="container-fluid">

      <h1 style="text-align:center;color:white;">C A L I U S</h1>
          <div class="dropdown active" style="float:right;">
                    <a class="dropdown-toggle" data-toggle="dropdown" href="#">Nombre de usuario <span class="caret"></span></a>
                    <ul class="dropdown-menu">
                      <li><a href="envionotificacion.jsp">Envío de notificaciones</a></li>
                      <li><a href="cierrasesion.jsp">Cerrar sesión</a></li>
                    </ul>
          </div>
      </div>
    </nav>
    <br>
    <h2 style="text-align:center">Historial de notificaciones</h2>
    <div class="form2">
        <ul>
          <table class="table table-hover">
            <thead>
              <tr>
                <th>Asunto</th>
                <th>Fecha</th>
              </tr>
            </thead>
            <tbody id="ja">
                <script type="text/javascript">
                    var settings = {                                            
                        "url": "https://calius.herokuapp.com/historialnotificaciones",
                        "method": "POST",
                        "headers": {
                          "accept": "application/json",
                          "content-type": "application/json"                                          
                        },                      
                        "data": "{\r\n\"passcon\" : \"12345\",\r\n\"no\" : 10\r\n}\r\n"
                    };

                    $.ajax(settings).done(function (response) {
                        var cadena="";
                        $.each(response.mensajes, function(i, item) {
                            cadena=cadena+'<tr id="mostrar1" onclick="verdetalles(\''+item.asunto+'\',\''+item.fecha+'\',\''+item.destinatario+'\',\''+item.mensaje+'\');"><td>'+item.asunto+'</td><td>'+item.fecha+'</td></tr>';
                        });
                        document.getElementById("ja").innerHTML = cadena;
                     });
                </script>


            </tbody>
          </table>
          <br><br>
    <center><button onclick="window.location='envionotificacion.jsp';" class="btn btn-alert">Ir a página principal</button></center>
    </div>

    <footer class="footer">
      <div class="container">
        <h1 style="text-align: center; color: white; font-size:1.5em;">Universidad de la Sierra Sur</h1>
        <p style="text-align: center; color: white;font-size:0.8em;">Copyright 2017 - 806 - Lic. en Informática</p>
      </div>
    </footer>
      <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
      <script src="Style/js/jquery-1.10.2.min.js"></script>
      <!-- Include all compiled plugins (below), or include individual files as needed -->
      <script src="Style/js/bootstrap.min.js"></script>
  </body>
</html>
<% } %>