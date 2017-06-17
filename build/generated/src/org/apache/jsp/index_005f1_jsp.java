package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import MDD5.*;

public final class index_005f1_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Iniciar sesión - CALIUS</title>\n");
      out.write("        \n");
      out.write("<!-- Bootstrap Core CSS -->\n");
      out.write("<link href=\"Style/css/bootstrap.css\" rel='stylesheet' type='text/css' />\n");
      out.write("<!-- Graph CSS -->\n");
      out.write("<link href=\"Style/css/font-awesome.css\" rel='stylesheet' type='text/css' />\n");
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
      out.write("<script src=\"md5.js\"></script>\n");
      out.write(" <style type=\"text/css\">\n");
      out.write("    .pie{background: #a42219;}\n");
      out.write("     #todoancho{width: 100%;}\n");
      out.write(".footer {\n");
      out.write("  position: absolute;\n");
      out.write("  bottom: 0;\n");
      out.write("  width: 100%;\n");
      out.write("  /* Set the fixed height of the footer here */\n");
      out.write("\n");
      out.write("  background-color: #a42219;\n");
      out.write("}\n");
      out.write("html {\n");
      out.write("  position: relative;\n");
      out.write("  min-height: 100%;\n");
      out.write("}\n");
      out.write("body {\n");
      out.write("  /* Margin bottom by footer height */\n");
      out.write("  margin-bottom: 60px;\n");
      out.write("}\n");
      out.write("    </style>\n");
      out.write("<!-- //js-->        \n");
      out.write("    </head>\n");
      out.write("    <body onload=\"nobackbutton();\" style=\"background-image: url('images/fondo.jpg');\">\n");
      out.write("        <nav class=\"navbar navbar-default\">\n");
      out.write("            <div class=\"container-fluid\"><br>\n");
      out.write("                <h1 style=\"text-align: center; color: white; font-size:1.8em;\">Bienvenido al Sistema CALIUS</h1><br>\n");
      out.write("            </div>\n");
      out.write("        </nav>\n");
      out.write("        <hr>\n");
      out.write("    <center><img src=\"images/logo.png\"></center><br>\n");
      out.write("        <h2 style=\"text-align: center; font-family:roboto;\">Iniciar sesión</h2>\n");
      out.write("\n");
      out.write("        <div class=\"form\">\n");
      out.write("            <label>Usuario</label>\n");
      out.write("            <input type=\"text\" name=\"user\" id=\"user\" placeholder=\"Nombre de usuario\" />            \n");
      out.write("            <label>Contraseña</label>\n");
      out.write("            <input type=\"password\" name=\"pass\" id=\"pass\" placeholder=\"Escriba su contraseña\" ></textarea>\n");
      out.write("            <button onclick=\"verificarUsuario()\" class=\"btn btn-primary\">Enviar</button>\n");
      out.write("            <p id=\"statusEnvio\" class=\"center-block\"></p>\n");
      out.write("        </div>  \n");
      out.write("\n");
      out.write("      <footer class=\"footer\">\n");
      out.write("      <div class=\"container\">\n");
      out.write("        <h1 style=\"text-align: center; color: white; font-size:1.5em;\">Universidad de la Sierra Sur</h1>\n");
      out.write("        <p style=\"text-align: center; color: white;font-size:0.8em;\">Copyright 2017 - 806 - Lic. en Informática</p>\n");
      out.write("      </div>\n");
      out.write("    </footer>\n");
      out.write("        \t    <script>\n");
      out.write("                        function nobackbutton(){\t\n");
      out.write("                        window.location.hash=\"no-back-button\";\t\n");
      out.write("                        window.location.hash=\"Again-No-back-button\" //chrome\t\n");
      out.write("                        window.onhashchange=function(){window.location.hash=\"no-back-button\";}\t\n");
      out.write("                     }\n");
      out.write("                     function verificarUsuario() {\n");
      out.write("                         if ($('#user').val().trim()==\"\" || $('#pass').val().trim()==\"\") {\n");
      out.write("                            swal({\n");
      out.write("                                title: \"Error al iniciar sesión\",\n");
      out.write("                                text: \"Compruebe no dejar campos vacíos\",\n");
      out.write("                                type: \"error\",\n");
      out.write("                                confirmButtonColor: \"#a42219\"\n");
      out.write("                              });\n");
      out.write("                              return false;\n");
      out.write("                        }\n");
      out.write("                        else{\n");
      out.write("                        $('#statusEnvio').html(\"<img style='width:80px; height: 80px, margin-top:15px' src='Style/images/loading.gif' />\");\n");
      out.write("                        var usuario = document.getElementById(\"user\").value;\n");
      out.write("                        var contrasena = document.getElementById(\"pass\").value;\n");
      out.write("                        var MD5 = md5(contrasena);\n");
      out.write("                        var settings = {                                            \n");
      out.write("                          \"url\": \"https://calius.herokuapp.com/loginuser\",\n");
      out.write("                          \"method\": \"POST\",\n");
      out.write("                          \"headers\": {\n");
      out.write("                            \"accept\": \"application/json\", \n");
      out.write("                            \"content-type\": \"application/json\"                                          \n");
      out.write("                          },                      \n");
      out.write("                          \"data\": \"{\\r\\n\\\"passcon\\\" : \\\"12345\\\",\\r\\n\\\"iduser\\\" : \\\"\"+usuario+\"\\\",\\r\\n\\\"password\\\" : \\\"\"+MD5+\"\\\",\\r\\n\\\"usuarioTipo\\\":2}\\r\\n\" \n");
      out.write("                        };\n");
      out.write("                        \n");
      out.write("                        $.ajax(settings).done(function (response){\n");
      out.write("                          console.log(response);\n");
      out.write("                          //$('#statusEnvio').html(\"<h3 style='text-align: center' class='text-success'>El Mensaje se ha enviado Correctamente: total enviados: \"+response.totalenviados+\" <span class='glyphicon glyphicon-ok'></span></h3>\");\n");
      out.write("                          if (response.status ==false){\n");
      out.write("                              swal({\n");
      out.write("                                title: \"Error al iniciar sesión\",\n");
      out.write("                                text: \"Inténtelo nuevamente\",\n");
      out.write("                                type: \"error\",\n");
      out.write("                                confirmButtonColor: \"#a42219\"\n");
      out.write("                              });\n");
      out.write("                          $('#statusEnvio').html(\"\");\n");
      out.write("                          }\n");
      out.write("                            else{\n");
      out.write("                                 location.href =\"iniciasesion.jsp?user=\"+usuario; \n");
      out.write("                            }\n");
      out.write("                    });}\n");
      out.write("                    }\t\n");
      out.write("    </script>\t\n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
