<%-- 
    Document   : envionotificacion
    Created on : 2/04/2017, 11:43:27 AM
    Author     : Meltsan
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

    <title>Enviar notificaciones - CALIUS</title>

    <link href="Style/css/bootstrap.css" rel="stylesheet">
    <link href="Style/css/font-awesome.css" rel='stylesheet' type='text/css' />
<!-- jQuery -->
<!-- lined-icons -->
<link rel="stylesheet" href=" Style/css/icon-font.min.css" type='text/css' />
	<link href="sweetalert/sweetalert.css"	rel='stylesheet' type='text/css' />
	<script src="sweetalert/sweetalert.min.js"></script>
<!-- /js -->
<script src="Style/js/jquery-1.10.2.min.js"></script>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.0/jquery.min.js"></script>
    <script src="sweetalert/sweetalert.min.js"></script>
<link rel="stylesheet" type="text/css" href="sweetalert/sweetalert.css">
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
    <script>     
		function Obtenergrupos() {
                    var settings = {                                            
                      "url": "https://calius.herokuapp.com/grupos",
                      "method": "GET",
                      "headers": {
                        "accept": "application/json", 
                        "content-type": "application/json"                                          
                      },                      
                    };
                    $.ajax(settings).done(function (response){
                      console.log(response);
                      var Grupos = response.grupos;
                      Grupos = Grupos.substring(1,Grupos.length-1);
                      var arreglo = Grupos.split(",");
                      var select = document.getElementById("grupos");
                      for(var i=0;i<arreglo.length;i++){
                            select.options[i] = new Option(arreglo[i], arreglo[i]);
                      }
                                  });
                    var settings = {                                            
                      "url": "https://calius.herokuapp.com/carreras",
                      "method": "GET",
                      "headers": {
                        "accept": "application/json", 
                        "content-type": "application/json"                                          
                      },                      
                    };
                    $.ajax(settings).done(function (response){
                      console.log(response);
                      var Carreras = response.carreras;
                      Carreras = Carreras.substring(1,Carreras.length-1)
                      var arreglo2 = Carreras.split(",");
                      var select = document.getElementById("carreras");
                      for(var i=0;i<arreglo2.length;i++){
                            select.options[i] = new Option(arreglo2[i], arreglo2[i]);
                      }
                    });
                    $("#matricula").css("display","none");
                    $("#grupos").css("display","none");
                    $("#carreras").css("display","none");
		}

        function cambiarcombos() {
            var unSelect = document.getElementById("cambiar");
            var valorCambiado =$(unSelect).val();
            if((valorCambiado == "1")){
                   $("#grupos").css("display","none");
                   $("#carreras").css("display","none");
                   $("#matricula").css("display","none");
                   $("#selecciona").css("display","none");
                   $("#matriculaalumno").css("display","none");
                 }
            else if((valorCambiado == "2")){
                   $("#grupos").css("display","none");
                   $("#carreras").css("display","none");
                   $("#matricula").css("display","block");
                   $("#selecciona").css("display","none");
                   $("#matriculaalumno").css("display","block");
                 }
            else if((valorCambiado == "3")){
                   $("#grupos").css("display","block");
                   $("#carreras").css("display","none");
                   $("#matricula").css("display","none");
                   $("#selecciona").css("display","block");
                   $("#matriculaalumno").css("display","none");
                 }
            else if((valorCambiado == "4")){
                   $("#grupos").css("display","none");
                   $("#carreras").css("display","block");
                   $("#matricula").css("display","none");
                   $("#selecciona").css("display","block");
                   $("#matriculaalumno").css("display","none");
                 }
        }
    </script>
  </head>
  <body onload="Obtenergrupos();" style="background-image: url('images/fondo.jpg');">

  <nav class="navbar navbar-default">
    <div class="container-fluid">

    <h1 style="text-align:center;color:white;">C A L I U S</h1>
    <div class="dropdown active" style="float:right;">
                  <a class="dropdown-toggle" data-toggle="dropdown" href="#">Nombre de usuario <span class="caret"></span></a>
                  <ul class="dropdown-menu">
                    <li><a href="historial.jsp">Ver historial</a></li>
                    <li><a href="cierrasesion.jsp">Cerrar sesión</a></li>
                  </ul>
    </div>
    </div>
  </nav>
      <br>
  <h2 style="text-align:center; font-family: roboto;">Enviar notificación</h2>
 
  <div class="form">

      <p font-family="roboto"><b>Asunto</b></p>
      <input type="text" id="asunto" required/>
      <p font-family="roboto"><b>Enviar a</b></p>
      <select name="cambiar" id="cambiar" onchange="cambiarcombos();">
        <option value="1">Todos los alumnos</option>
        <option value="2">Alumno</option>
        <option value="3">Grupo</option>
        <option value="4">Carrera</option>
      </select>
      <p font-family="roboto" name="selecciona" id="selecciona" style="display:none;"><b>Selecciona</b></p>
      <p font-family="roboto" name="matriculaalumno" id="matriculaalumno" style="display:none;"><b>Escribe la matrícula</b></p>
      <select name="grupos" id="grupos">
           
      </select>
      <select name="carreras" id="carreras">
           
      </select>
      <input type="text" name="matricula" id="matricula" required>
      <p font-family="roboto"><b>Escribe el mensaje</b></p><br>
      <textarea class="form-control" rows="6" id="mensaje" required></textarea>
      <button onclick="sendNotification()" >Enviar</button>
      <p id="statusEnvio" class="center-block"></p>
      <script>
       
		function sendNotification() {
                    $('#statusEnvio').html("<img style='width:80px; height: 80px, margin-top:15px' src='Style/images/loading.gif' />");
                    if ($('#asunto').val().trim()=="" || $('#mensaje').val().trim()=="") {
                            swal({
                                title: "Error al enviar notificación",
                                text: "Compruebe no dejar campos vacíos",
                                type: "error",
                                confirmButtonColor: "#a42219"
                              });
                              $('#statusEnvio').html("");
                              return false;
                        }else{
                    var asunto = document.getElementById("asunto").value;
                    var tipo;
                    var destinatario;
                    var unSelect = document.getElementById("cambiar");
                    var valorCambiado =$(unSelect).val();
                    if((valorCambiado == "1")){
                           destinatario="todos";
                           tipo="todos";
                         }
                    else if((valorCambiado == "2")){
                           destinatario=document.getElementById("matricula").value;
                           tipo="alumno";
                         }
                    else if((valorCambiado == "3")){
                          destinatario=$(document.getElementById("grupos")).val();
                          tipo="grupo"
                         }
                    else if((valorCambiado == "4")){
                          destinatario=$(document.getElementById("carreras")).val();
                          tipo="carrera";
                         }
                    var mensaje = document.getElementById("mensaje").value;
                    var settings = {                                            
                      "url": "https://calius.herokuapp.com/sendnotifications",
                      "method": "POST",
                      "headers": {
                        "accept": "application/json",
                        "content-type": "application/json"                                          
                      },                   
                     "data": "{\r\n\"passcon\" : \"12345\",\r\n\"asunto\" : \""+asunto+"\",\r\n\"tipo\" : \""+tipo+"\",\r\n\"destintario\" : \""+destinatario+"\",\r\n\"mensaje\" : \""+mensaje+"\",\r\n\"remitente\" : \"EM001\"\r\n}\r\n"                                    };
                    $.ajax(settings).done(function (response) {                      
                      console.log(response);
                      if(response.procstatus==true){
                          swal({
                            title: "Notificación enviada correctamente",
                            text: "",
                            type: "success",
                            confirmButtonColor: "#9fe0ae",
                            confirmButtonText: "Aceptar",
                            closeOnConfirm: false
                          },
                          function(){
                            location.href ="envionotificacion.jsp"; 
                          });
                      }
                      else
                          swal({
                                title: "Error al enviar notificación",
                                text: "Verifica tus datos e inténtalo nuevamente!",
                                type: "error",
                                confirmButtonColor: "#a42219"
                              });
                          $('#statusEnvio').html("");
                    });}
		}	
    </script>	
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