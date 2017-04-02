<%-- 
    Document   : envionotificacion
    Created on : 2/04/2017, 11:43:27 AM
    Author     : Meltsan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <title>CALIUS</title>

    <link href="Style/css/bootstrap.css" rel="stylesheet">
    <style type="text/css">
    .pie{background: #a42219;}
     #todoancho{width: 100%;}
    </style>
  </head>
  <body>
  <nav class="navbar navbar-default">
    <div class="container-fluid">

    <h1 style="text-align:center;color:white;">C A L I U S</h1>
    <div class="dropdown active" style="float:right;">
                  <a class="dropdown-toggle" data-toggle="dropdown" href="#">Nombre de usuario <span class="caret"></span></a>
                  <ul class="dropdown-menu">
                    <li><a href="#">Ver historial</a></li>
                    <li><a href="#">Cerrar sesión</a></li>
                  </ul>
    </div>
    </div>
  </nav>
  <br>
  <h2 style="text-align:center">Enviar notificación</h2>
    <div class="login-page">
  <div class="form">
    <form class="register-form">
      Asunto
      <input type="text"/>
      Enviar a:
      <select>
        <option value="volvo">Todos los alumnos</option>
        <option value="saab">Alumno</option>
        <option value="mercedes">Grupo</option>
        <option value="audi">Carrera</option>
      </select>
      Selecciona
      <select>
        <option value="volvo">206</option>
        <option value="saab">406</option>
        <option value="mercedes">606</option>
        <option value="audi">806</option>
      </select>
      Escribe el mensaje:<br>
      <textarea class="form-control" rows="6"></textarea>
      <button>Enviar</button>
    </form>
  </div>
</div>
<div class=" pie" id="todoancho"> 
      <div class="container">
        <div class="col-lg-12 pie">
          <div class="row pie">
            <div class="col-lg-12" style="text-align:center;"><br>
              <p style="color:#fff;">Universidad de la Sierra Sur</p>
            </div>
          </div>
          </div>
        </div>
      </div>
    <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
    <script src="Style/js/jquery-1.10.2.min.js"></script>
    <!-- Include all compiled plugins (below), or include individual files as needed -->
    <script src="Style/js/bootstrap.min.js"></script>
  </body>
</html>