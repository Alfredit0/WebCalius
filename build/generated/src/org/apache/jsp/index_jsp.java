package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Envio de Notificación</title>\n");
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
      out.write("<!-- //js-->        \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1 style=\"text-align: center\">Bienvenido al Sistema CALIUS</h1>\n");
      out.write("        <hr>\n");
      out.write("        <h2 style=\"text-align: center\">Envio de Notificación</h2>\n");
      out.write("        <div class=\"form\">\n");
      out.write("            <label>Asunto:</label>\n");
      out.write("            <input type=\"text\" name=\"asunto\" id=\"asunto\" placeholder=\"Asunto de la notificación\"/>            \n");
      out.write("            <label>Mensaje:</label>\n");
      out.write("            <textarea rows=\"6\" name=\"mensaje\" id=\"mensaje\" placeholder=\"Mensaje a Enviar\"></textarea>\n");
      out.write("            <button onclick=\"sendNotification()\" class=\"btn btn-primary\">Enviar</button>\n");
      out.write("            <p id=\"statusEnvio\" class=\"center-block\"></p>\n");
      out.write("        </div>        \n");
      out.write("        \t    <script>\n");
      out.write("       \n");
      out.write("\t\tfunction sendNotification() {\n");
      out.write("                    $('#statusEnvio').html(\"<img style='width:80px; height: 80px, margin-top:15px' src='Style/images/loading.gif' />\");\n");
      out.write("                    var asunto = document.getElementById(\"mensaje\").value;\n");
      out.write("                    var mensaje = document.getElementById(\"mensaje\").value;\n");
      out.write("                    var settings = {                                            \n");
      out.write("                      \"url\": \"https://calius.herokuapp.com/sendnotifications\",\n");
      out.write("                      \"method\": \"POST\",\n");
      out.write("                      \"headers\": {\n");
      out.write("                        \"accept\": \"application/json\",\n");
      out.write("                        \"content-type\": \"application/json\"                                          \n");
      out.write("                      },                      \n");
      out.write("                      \"data\": \"{\\r\\n\\\"passcon\\\" : \\\"KEY\\\",\\r\\n\\\"asunto\\\" : \\\"\"+asunto+\"\\\",\\r\\n\\\"tipo\\\" : \\\"alumno\\\",\\r\\n\\\"destintario\\\" : \\\"2013060024\\\",\\r\\n\\\"mensaje\\\" : \\\" \"+mensaje+\" \\\",\\r\\n\\\"remitente\\\" : \\\"iduser024\\\"\\r\\n}\\r\\n\"\n");
      out.write("                    };\n");
      out.write("\n");
      out.write("                    $.ajax(settings).done(function (response) {\n");
      out.write("                      console.log(response);\n");
      out.write("                      $('#statusEnvio').html(\"<h3 style='text-align: center' class='text-success'>El Mensaje se ha enviado Correctamente: total enviados: \"+response.totalenviados+\" <span class='glyphicon glyphicon-ok'></span></h3>\");\n");
      out.write("                      document.getElementById(\"mensaje\").value=\"\";\n");
      out.write("                      document.getElementById(\"mensaje\").value=\"\";\n");
      out.write("                    });\n");
      out.write("    \n");
      out.write("\n");
      out.write("\t\t}\t\n");
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
