<%-- 
    Document   : index
    Created on : 28/03/2017, 04:15:16 PM
    Author     : Meltsan
--%>
<%@ page import="MDD5.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Iniciar sesión - CALIUS</title>
        
<!-- Bootstrap Core CSS -->
<link href="Style/css/bootstrap.css" rel='stylesheet' type='text/css' />
<!-- Graph CSS -->
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
<script src="md5.js"></script>
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
<!-- //js-->        
    </head>
    <body onload="nobackbutton();" style="background-image: url('images/fondo.jpg');">
        <nav class="navbar navbar-default">
            <div class="container-fluid"><br>
                <h1 style="text-align: center; color: white; font-size:1.8em;">Bienvenido al Sistema CALIUS</h1><br>
            </div>
        </nav>
        <hr>
    <center><img src="images/logo.png"></center><br>
        <h2 style="text-align: center; font-family:roboto;">Iniciar sesión</h2>

        <div class="form">
            <label>Usuario</label>
            <input type="text" name="user" id="user" placeholder="Nombre de usuario" />            
            <label>Contraseña</label>
            <input type="password" name="pass" id="pass" placeholder="Escriba su contraseña" ></textarea>
            <button onclick="verificarUsuario()" class="btn btn-primary">Enviar</button>
            <p id="statusEnvio" class="center-block"></p>
        </div>  

      <footer class="footer">
      <div class="container">
        <h1 style="text-align: center; color: white; font-size:1.5em;">Universidad de la Sierra Sur</h1>
        <p style="text-align: center; color: white;font-size:0.8em;">Copyright 2017 - 806 - Lic. en Informática</p>
      </div>
    </footer>
        	    <script>
                        function nobackbutton(){	
                        window.location.hash="no-back-button";	
                        window.location.hash="Again-No-back-button" //chrome	
                        window.onhashchange=function(){window.location.hash="no-back-button";}	
                     }
                     function verificarUsuario() {
                         if ($('#user').val().trim()=="" || $('#pass').val().trim()=="") {
                            swal({
                                title: "Error al iniciar sesión",
                                text: "Compruebe no dejar campos vacíos",
                                type: "error",
                                confirmButtonColor: "#a42219"
                              });
                              return false;
                        }
                        else{
                        $('#statusEnvio').html("<img style='width:80px; height: 80px, margin-top:15px' src='Style/images/loading.gif' />");
                        var usuario = document.getElementById("user").value;
                        var contrasena = document.getElementById("pass").value;
                        var MD5 = md5(contrasena);
                        alert(MD5);
                        var settings = {                                            
                          "url": "https://calius.herokuapp.com/loginuser",
                          "method": "POST",
                          "headers": {
                            "accept": "application/json", 
                            "content-type": "application/json"                                          
                          },                      
                          "data": "{\r\n\"passcon\" : \"12345\",\r\n\"iduser\" : \""+usuario+"\",\r\n\"password\" : \""+MD5+"\",\r\n\"usuarioTipo\":2}\r\n" 
                        };
                        
                        $.ajax(settings).done(function (response){
                          console.log(response);
                          //$('#statusEnvio').html("<h3 style='text-align: center' class='text-success'>El Mensaje se ha enviado Correctamente: total enviados: "+response.totalenviados+" <span class='glyphicon glyphicon-ok'></span></h3>");
                          if (response.status ==false){
                              swal({
                                title: "Error al iniciar sesión",
                                text: "Inténtelo nuevamente",
                                type: "error",
                                confirmButtonColor: "#a42219"
                              });
                          $('#statusEnvio').html("");
                          }
                            else{
                                 location.href ="iniciasesion.jsp?user="+usuario; 
                            }
                    });}
                    }	
    </script>	
    </body>
</html>
