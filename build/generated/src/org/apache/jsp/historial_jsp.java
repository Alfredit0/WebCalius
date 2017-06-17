package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class historial_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html lang=\"en\">\n");
      out.write("  <head>\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("\n");
      out.write("    <title>CALIUS</title>\n");
      out.write("\n");
      out.write("    <link href=\"Style/css/bootstrap.css\" rel=\"stylesheet\">\n");
      out.write("    <style type=\"text/css\">\n");
      out.write("    .pie{background: #a42219;}\n");
      out.write("     #todoancho{width: 100%;}\n");
      out.write("     .footer\n");
      out.write("{\n");
      out.write("  background-color: #a42219;\n");
      out.write("  position: absolute;\n");
      out.write("  bottom: 0;\n");
      out.write("  width: 100%;\n");
      out.write("\n");
      out.write("  color:red;\n");
      out.write("}\n");
      out.write("    </style>\n");
      out.write("    <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.2.0/jquery.min.js\"></script>\n");
      out.write("    <script>\n");
      out.write("    for(var i=1;i<10;i++)\n");
      out.write("    {var cadena=\"#mostrar\";\n");
      out.write("        cadena=cadena+(i);\n");
      out.write("        //alert(cadena);\n");
      out.write("    $(document).ready(function(e){    \n");
      out.write("        $(cadena).click(function(e){\n");
      out.write("            alert(i);\n");
      out.write("            swal(\"Asunto: Documentos faltantes\", \"Fecha: 15/04/17 \\n Destinatario: 2013060015 \\n Mensaje: Se informa que tienes que entregar cuanto antes los siguientes documentos originales: Acta de nacimiento y certificado de bachillerato. Pasa los más pronto posible al departamento de servicios escolares.\");\n");
      out.write("        });\n");
      out.write("    });\n");
      out.write("    }\n");
      out.write("    function verdetalles(val1,val2,val3,val4){\n");
      out.write("        swal(\"Asunto: \"+val1+\"\", \"Fecha: \"+val2+\" \\n Destinatario: \"+val3+\" \\n Mensaje: \"+val4+\"\");\n");
      out.write("\n");
      out.write("    }\n");
      out.write("    \n");
      out.write("    </script>\n");
      out.write("    <script src=\"sweetalert/sweetalert.min.js\"></script>\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"sweetalert/sweetalert.css\">\n");
      out.write("  </head>\n");
      out.write("  <body>\n");
      out.write("  <nav class=\"navbar navbar-default\">\n");
      out.write("    <div class=\"container-fluid\">\n");
      out.write("\n");
      out.write("    <h1 style=\"text-align:center;color:white;\">C A L I U S</h1>\n");
      out.write("        <div class=\"dropdown active\" style=\"float:right;\">\n");
      out.write("                  <a class=\"dropdown-toggle\" data-toggle=\"dropdown\" href=\"#\">Nombre de usuario <span class=\"caret\"></span></a>\n");
      out.write("                  <ul class=\"dropdown-menu\">\n");
      out.write("                    <li><a href=\"envionotificacion.jsp\">Envío de notificaciones</a></li>\n");
      out.write("                    <li><a href=\"#\">Cerrar sesión</a></li>\n");
      out.write("                  </ul>\n");
      out.write("    </div>\n");
      out.write("    </div>\n");
      out.write("  </nav>\n");
      out.write("  <br>\n");
      out.write("  <h2 style=\"text-align:center\">Historial de notificaciones</h2>\n");
      out.write("  <div class=\"form2\">\n");
      out.write("\n");
      out.write("      <ul>\n");
      out.write("        <table class=\"table table-hover\">\n");
      out.write("          <thead>\n");
      out.write("            <tr>\n");
      out.write("              <th>Asunto</th>\n");
      out.write("              <th>Fecha</th>\n");
      out.write("            </tr>\n");
      out.write("          </thead>\n");
      out.write("          <tbody id=\"ja\">\n");
      out.write("              <script type=\"text/javascript\">\n");
      out.write("                    var settings = {                                            \n");
      out.write("                      \"url\": \"https://calius.herokuapp.com/historialnotificaciones\",\n");
      out.write("                      \"method\": \"POST\",\n");
      out.write("                      \"headers\": {\n");
      out.write("                        \"accept\": \"application/json\",\n");
      out.write("                        \"content-type\": \"application/json\"                                          \n");
      out.write("                      },                      \n");
      out.write("                      \"data\": \"{\\r\\n\\\"passcon\\\" : \\\"12345\\\",\\r\\n\\\"no\\\" : 10\\r\\n}\\r\\n\"\n");
      out.write("                    };\n");
      out.write("\n");
      out.write("                    $.ajax(settings).done(function (response) {\n");
      out.write("                      console.log(response);\n");
      out.write("                  var cadena=\"\";\n");
      out.write("                  var mens = response.mensajes;\n");
      out.write("                  var arreglo = mens.substring(1,mens.length-1);\n");
      out.write("                  var arreglo2 = arreglo.split(\",\");\n");
      out.write("                  var arreglo3 = new Array;\n");
      out.write("                  for(var i=0;i<arreglo2.length-1;i=i+6)\n");
      out.write("                  {\n");
      out.write("                      arreglo3[i]=arreglo2[i].substring(5,arreglo2[i].length);\n");
      out.write("                      arreglo3[i+1]=arreglo2[i+1].substring(11,arreglo2[i+1].length);\n");
      out.write("                      arreglo3[i+2]=arreglo2[i+2].substring(14,arreglo2[i+2].length);\n");
      out.write("                      arreglo3[i+3]=arreglo2[i+3].substring(9,arreglo2[i+3].length);\n");
      out.write("                      arreglo3[i+4]=arreglo2[i+4].substring(7,arreglo2[i+4].length);\n");
      out.write("                      arreglo3[i+5]=arreglo2[i+5].substring(8,arreglo2[i+5].length-1);\n");
      out.write("\n");
      out.write("                      cadena=cadena+'<tr id=\"mostrar1\" onclick=\"verdetalles(\\''+arreglo3[i+5]+'\\',\\''+arreglo3[i+4]+'\\',\\''+arreglo3[i+2]+'\\',\\''+arreglo3[i+3]+'\\')\"><td>'+arreglo3[i+5]+'</td><td>'+arreglo3[i+4]+'</td></tr>';\n");
      out.write("                  }\n");
      out.write("                   document.getElementById(\"ja\").innerHTML = cadena;\n");
      out.write("                    });\n");
      out.write("\t\n");
      out.write("              </script>\n");
      out.write("\n");
      out.write("\n");
      out.write("          </tbody>\n");
      out.write("        </table>\n");
      out.write("        <br><br>\n");
      out.write("        \n");
      out.write("\n");
      out.write("        <center><button onclick=\"window.location='envionotificacion.jsp';\" class=\"btn btn-alert\">Ir a página principal</button></center>\n");
      out.write("  </div>\n");
      out.write("\n");
      out.write("<div class=\" pie footer\" id=\"todoancho\"> \n");
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
      out.write("</html>");
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
