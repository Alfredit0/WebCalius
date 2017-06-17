package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class envionotificacion_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
 

String nombreuser = (String)request.getSession().getAttribute("usuario");
if (nombreuser == null) 
{
    response.sendRedirect("index_1.jsp");
}
else{

      out.write("\n");
      out.write("<html lang=\"en\">\n");
      out.write("  <head>\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("\n");
      out.write("    <title>CALIUS</title>\n");
      out.write("\n");
      out.write("    <link href=\"Style/css/bootstrap.css\" rel=\"stylesheet\">\n");
      out.write("    <link href=\"Style/css/font-awesome.css\" rel='stylesheet' type='text/css' />\n");
      out.write("<!-- jQuery -->\n");
      out.write("<!-- lined-icons -->\n");
      out.write("<link rel=\"stylesheet\" href=\" Style/css/icon-font.min.css\" type='text/css' />\n");
      out.write("\t<link href=\"sweetalert/sweetalert.css\"\trel='stylesheet' type='text/css' />\n");
      out.write("\t<script src=\"sweetalert/sweetalert.min.js\"></script>\n");
      out.write("<!-- /js -->\n");
      out.write("<script src=\"Style/js/jquery-1.10.2.min.js\"></script>\n");
      out.write("<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.2.0/jquery.min.js\"></script>\n");
      out.write("    <script src=\"sweetalert/sweetalert.min.js\"></script>\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"sweetalert/sweetalert.css\">\n");
      out.write("    <style type=\"text/css\">\n");
      out.write("    .pie{background: #a42219;}\n");
      out.write("     #todoancho{width: 100%;}\n");
      out.write("    </style>\n");
      out.write("    <script>     \n");
      out.write("\t\tfunction Obtenergrupos() {\n");
      out.write("                    var settings = {                                            \n");
      out.write("                      \"url\": \"https://calius.herokuapp.com/grupos\",\n");
      out.write("                      \"method\": \"GET\",\n");
      out.write("                      \"headers\": {\n");
      out.write("                        \"accept\": \"application/json\", \n");
      out.write("                        \"content-type\": \"application/json\"                                          \n");
      out.write("                      },                      \n");
      out.write("                    };\n");
      out.write("\n");
      out.write("                    $.ajax(settings).done(function (response){\n");
      out.write("                      console.log(response);\n");
      out.write("                      alert(response.grupos);\n");
      out.write("                      var Grupos = response.grupos;\n");
      out.write("                      var arreglo = Grupos.split(\",\");\n");
      out.write("                      var select = document.getElementById(\"grupos\");\n");
      out.write("                      for(var i=0;i<arreglo.length;i++){\n");
      out.write("                            select.options[i] = new Option(arreglo[i], arreglo[i]);\n");
      out.write("       }\n");
      out.write("                                  });\n");
      out.write("    \n");
      out.write("                    \n");
      out.write("                    var settings = {                                            \n");
      out.write("                      \"url\": \"https://calius.herokuapp.com/carreras\",\n");
      out.write("                      \"method\": \"GET\",\n");
      out.write("                      \"headers\": {\n");
      out.write("                        \"accept\": \"application/json\", \n");
      out.write("                        \"content-type\": \"application/json\"                                          \n");
      out.write("                      },                      \n");
      out.write("                    };\n");
      out.write("                    $.ajax(settings).done(function (response){\n");
      out.write("                      console.log(response);\n");
      out.write("                      var Carreras = response.carreras;\n");
      out.write("                      var arreglo2 = Carreras.split(\",\");\n");
      out.write("                      var select = document.getElementById(\"carreras\");\n");
      out.write("                      for(var i=0;i<arreglo2.length;i++){\n");
      out.write("                            select.options[i] = new Option(arreglo2[i], arreglo2[i]);\n");
      out.write("       }\n");
      out.write("                                  });\n");
      out.write("                    $(\"#matricula\").css(\"display\",\"none\");\n");
      out.write("                    $(\"#grupos\").css(\"display\",\"none\");\n");
      out.write("                    $(\"#carreras\").css(\"display\",\"none\");\n");
      out.write("                   \n");
      out.write("\t\t}\n");
      out.write("\n");
      out.write("        function cambiarcombos() {\n");
      out.write("            var unSelect = document.getElementById(\"cambiar\");\n");
      out.write("            var valorCambiado =$(unSelect).val();\n");
      out.write("            if((valorCambiado == \"1\")){\n");
      out.write("                   $(\"#grupos\").css(\"display\",\"none\");\n");
      out.write("                   $(\"#carreras\").css(\"display\",\"none\");\n");
      out.write("                   $(\"#matricula\").css(\"display\",\"none\");\n");
      out.write("                 }\n");
      out.write("            else if((valorCambiado == \"2\")){\n");
      out.write("                   $(\"#grupos\").css(\"display\",\"none\");\n");
      out.write("                   $(\"#carreras\").css(\"display\",\"none\");\n");
      out.write("                   $(\"#matricula\").css(\"display\",\"block\");\n");
      out.write("                 }\n");
      out.write("            else if((valorCambiado == \"3\")){\n");
      out.write("                   $(\"#grupos\").css(\"display\",\"block\");\n");
      out.write("                   $(\"#carreras\").css(\"display\",\"none\");\n");
      out.write("                   $(\"#matricula\").css(\"display\",\"none\");\n");
      out.write("                 }\n");
      out.write("            else if((valorCambiado == \"4\")){\n");
      out.write("                   $(\"#grupos\").css(\"display\",\"none\");\n");
      out.write("                   $(\"#carreras\").css(\"display\",\"block\");\n");
      out.write("                   $(\"#matricula\").css(\"display\",\"none\");\n");
      out.write("                 }\n");
      out.write("        }\n");
      out.write("\n");
      out.write("\n");
      out.write("      \n");
      out.write("        \n");
      out.write("    </script>\n");
      out.write("  </head>\n");
      out.write("  <body onload=\"Obtenergrupos();\">\n");
      out.write("\n");
      out.write("  <nav class=\"navbar navbar-default\">\n");
      out.write("    <div class=\"container-fluid\">\n");
      out.write("\n");
      out.write("    <h1 style=\"text-align:center;color:white;\">C A L I U S</h1>\n");
      out.write("    <div class=\"dropdown active\" style=\"float:right;\">\n");
      out.write("                  <a class=\"dropdown-toggle\" data-toggle=\"dropdown\" href=\"#\">Nombre de usuario <span class=\"caret\"></span></a>\n");
      out.write("                  <ul class=\"dropdown-menu\">\n");
      out.write("                    <li><a href=\"#\">Ver historial</a></li>\n");
      out.write("                    <li><a href=\"#\">Cerrar sesión</a></li>\n");
      out.write("                  </ul>\n");
      out.write("    </div>\n");
      out.write("    </div>\n");
      out.write("  </nav>\n");
      out.write("  <br>\n");
      out.write("  <h2 style=\"text-align:center\">Enviar notificación</h2>\n");
      out.write("    <div class=\"login-page\">\n");
      out.write("  <div class=\"form\">\n");
      out.write("\n");
      out.write("      Asunto\n");
      out.write("      <input type=\"text\" id=\"asunto\" required/>\n");
      out.write("      Enviar a:\n");
      out.write("      <select name=\"cambiar\" id=\"cambiar\" onchange=\"cambiarcombos();\">\n");
      out.write("        <option value=\"1\">Todos los alumnos</option>\n");
      out.write("        <option value=\"2\">Alumno</option>\n");
      out.write("        <option value=\"3\">Grupo</option>\n");
      out.write("        <option value=\"4\">Carrera</option>\n");
      out.write("      </select>\n");
      out.write("      Selecciona\n");
      out.write("      <select name=\"grupos\" id=\"grupos\">\n");
      out.write("           \n");
      out.write("      </select>\n");
      out.write("      <select name=\"carreras\" id=\"carreras\">\n");
      out.write("           \n");
      out.write("      </select>\n");
      out.write("      <input type=\"text\" name=\"matricula\" id=\"matricula\" required>\n");
      out.write("      Escribe el mensaje:<br>\n");
      out.write("      <textarea class=\"form-control\" rows=\"6\" id=\"mensaje\" required></textarea>\n");
      out.write("      <button onclick=\"sendNotification()\">Enviar</button>\n");
      out.write("      <p id=\"statusEnvio\" class=\"center-block\"></p>\n");
      out.write("      <script>\n");
      out.write("       \n");
      out.write("\t\tfunction sendNotification() {\n");
      out.write("                    $('#statusEnvio').html(\"<img style='width:80px; height: 80px, margin-top:15px' src='Style/images/loading.gif' />\");\n");
      out.write("                    var asunto = document.getElementById(\"asunto\").value;\n");
      out.write("                    var tipo;\n");
      out.write("                    var destinatario;\n");
      out.write("                    var unSelect = document.getElementById(\"cambiar\");\n");
      out.write("                    var valorCambiado =$(unSelect).val();\n");
      out.write("                    if((valorCambiado == \"1\")){\n");
      out.write("                           destinatario=\"todos\";\n");
      out.write("                           tipo=\"todos\";\n");
      out.write("                         }\n");
      out.write("                    else if((valorCambiado == \"2\")){\n");
      out.write("                           destinatario=document.getElementById(\"matricula\").value;\n");
      out.write("                           tipo=\"alumno\";\n");
      out.write("                         }\n");
      out.write("                    else if((valorCambiado == \"3\")){\n");
      out.write("                          destinatario=$(document.getElementById(\"grupos\")).val();\n");
      out.write("                          tipo=\"grupo\"\n");
      out.write("                         }\n");
      out.write("                    else if((valorCambiado == \"4\")){\n");
      out.write("                          destinatario=$(document.getElementById(\"carreras\")).val();\n");
      out.write("                          tipo=\"carrera\";\n");
      out.write("                         }\n");
      out.write("                    var mensaje = document.getElementById(\"mensaje\").value;\n");
      out.write("                    var settings = {                                            \n");
      out.write("                      \"url\": \"https://calius.herokuapp.com/sendnotifications\",\n");
      out.write("                      \"method\": \"POST\",\n");
      out.write("                      \"headers\": {\n");
      out.write("                        \"accept\": \"application/json\",\n");
      out.write("                        \"content-type\": \"application/json\"                                          \n");
      out.write("                      },                   \n");
      out.write("                     \"data\": \"{\\r\\n\\\"passcon\\\" : \\\"12345\\\",\\r\\n\\\"asunto\\\" : \\\"\"+asunto+\"\\\",\\r\\n\\\"tipo\\\" : \\\"\"+tipo+\"\\\",\\r\\n\\\"destintario\\\" : \\\"\"+destinatario+\"\\\",\\r\\n\\\"mensaje\\\" : \\\"\"+mensaje+\"\\\",\\r\\n\\\"remitente\\\" : \\\"iduser024\\\"\\r\\n}\\r\\n\"\n");
      out.write("                      \n");
      out.write("                    };\n");
      out.write("                    $.ajax(settings).done(function (response) {                      \n");
      out.write("                      console.log(response);\n");
      out.write("                      if(response.procstatus==true){\n");
      out.write("                          swal({\n");
      out.write("                            title: \"Notificación enviada correctamente\",\n");
      out.write("                            text: \"\",\n");
      out.write("                            type: \"success\",\n");
      out.write("                            confirmButtonColor: \"#9fe0ae\",\n");
      out.write("                            confirmButtonText: \"Aceptar\",\n");
      out.write("                            closeOnConfirm: false\n");
      out.write("                          },\n");
      out.write("                          function(){\n");
      out.write("                            location.href =\"envionotificacion.jsp\"; \n");
      out.write("                          });\n");
      out.write("                      }\n");
      out.write("                      else\n");
      out.write("                          sweetAlert(\"Error al enviar notificación\", \"Verifica tus datos e inténtalo nuevamente!\", \"error\");\n");
      out.write("                    });\n");
      out.write("\t\t}\t\n");
      out.write("    </script>\t\n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("<div class=\" pie\" id=\"todoancho\"> \n");
      out.write("      <div class=\"container\">\n");
      out.write("        <div class=\"col-lg-12 pie\">\n");
      out.write("          <div class=\"row pie\">\n");
      out.write("            <div class=\"col-lg-12\" style=\"text-align:center;\"><br>\n");
      out.write("              <p style=\"color:#fff;\">Universidad de la Sierra Sur</p>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("    <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->\n");
      out.write("    <script src=\"Style/js/jquery-1.10.2.min.js\"></script>\n");
      out.write("    <!-- Include all compiled plugins (below), or include individual files as needed -->\n");
      out.write("    <script src=\"Style/js/bootstrap.min.js\"></script>\n");
      out.write("  </body>\n");
      out.write("</html>\n");
 } 
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
