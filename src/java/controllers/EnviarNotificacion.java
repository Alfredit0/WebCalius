/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import sun.net.www.http.HttpClient;

/**
 *
 * @author Meltsan
 */
@WebServlet(name = "EnviarNotificacion", urlPatterns = {"/EnviarNotificacion"})
public class EnviarNotificacion extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet EnviarNotificacion</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet EnviarNotificacion at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }
    /*public void llamarServicioWeb(){
        JSONObject requestRegistrationId = new JSONObject();
        requestRegistrationId.put("registrationId", "hola");
        BufferedReader in = null;
        try {
            HttpClient client = new DefaultHttpClient();
            HttpPost httpPost = new HttpPost();
            httpPost.setURI(new URI(URL_REGISTRO_ID));
            httpPost.setEntity(new StringEntity(requestRegistrationId
                    .toString(), "UTF-8"));
            httpPost.setHeader("Accept", "application/json");
            httpPost.setHeader("content-type", "application/json");

            HttpResponse response = client.execute(httpPost);
            InputStreamReader lectura = new InputStreamReader(response.getEntity().getContent());
            in = new BufferedReader(lectura);
            StringBuffer sb = new StringBuffer("");
            String line = "";
            while ((line = in.readLine()) != null) {
                sb.append(line);
            }
            in.close();
            System.out.println("INFO"+ sb.toString());
        } catch (Exception e) {
            System.out.println("ERROR" +  e.getMessage()+ e);
        } finally {
            if (in != null) {
                try {
                    in.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }        
    }*/

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
