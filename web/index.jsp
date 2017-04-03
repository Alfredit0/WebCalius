<%-- 
    Document   : index
    Created on : 28/03/2017, 04:15:16 PM
    Author     : Meltsan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Envio de Notificación</title>
        
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
<!-- //js-->        
    </head>
    <body>
        <h1 style="text-align: center">Bienvenido al Sistema CALIUS</h1>
        <hr>
        <h2 style="text-align: center">Envio de Notificación</h2>
        <div class="form">
            <label>Asunto:</label>
            <input type="text" name="asunto" id="asunto" placeholder="Asunto de la notificación"/>            
            <label>Mensaje:</label>
            <textarea rows="6" name="mensaje" id="mensaje" placeholder="Mensaje a Enviar"></textarea>
            <button onclick="sendNotification()" class="btn btn-primary">Enviar</button>
            <p id="statusEnvio" class="center-block"></p>
        </div>        
        	    <script>
       
		function sendNotification() {
                    $('#statusEnvio').html("<img style='width:80px; height: 80px, margin-top:15px' src='Style/images/loading.gif' />");
                    var asunto = document.getElementById("mensaje").value;
                    var mensaje = document.getElementById("mensaje").value;
                    var settings = {                                            
                      "url": "https://calius.herokuapp.com/sendnotifications",
                      "method": "POST",
                      "headers": {
                        "accept": "application/json",
                        "content-type": "application/json"                                          
                      },                      
                      "data": "{\r\n\"passcon\" : \"KEY\",\r\n\"asunto\" : \""+asunto+"\",\r\n\"tipo\" : \"alumno\",\r\n\"destintario\" : \"2013060024\",\r\n\"mensaje\" : \" "+mensaje+" \",\r\n\"remitente\" : \"iduser024\"\r\n}\r\n"
                    };

                    $.ajax(settings).done(function (response) {
                      console.log(response);
                      $('#statusEnvio').html("<h3 style='text-align: center' class='text-success'>El Mensaje se ha enviado Correctamente <span class='glyphicon glyphicon-ok'></span></h3>");
                      document.getElementById("mensaje").value="";
                      document.getElementById("mensaje").value="";
                    });
    

		}	
    </script>	
    </body>
</html>
