/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.text.DecimalFormat; 

/**
 *
 * @author Vinícius
 */
@WebServlet(name = "CompostoServlet", urlPatterns = {"/juros-composto.html"})
public class CompostoServlet extends HttpServlet {

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
            double m, c, i, t, p;
            DecimalFormat df = new DecimalFormat("0.00");
            m = c = i = t = p = 0;
            
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>"
                    + "<meta http-equiv='X-UA-Compatible' content='IE=edge'>");
            out.println("<title>Calculadora Juros Composto</title>"
             + "<link href=\"https://fonts.googleapis.com/css?family=Roboto\" rel=\"stylesheet\">");      
            out.println("<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta/css/bootstrap.min.css\" integrity=\"sha384-/Y6pD6FV/Vv2HJnA6t+vslU6fwYXjCFtcEpHbNJ0lyAFsXTsjBbfaDjzALeQsN6M\" crossorigin=\"anonymous\">");
            out.println("<link rel='stylesheet' type='text/css' href='" + request.getContextPath() +  "/styleHome.css' />");
            out.println("<meta charset=\"utf-8\">\n" +
            "<meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">");            
            out.println("</head>");
            out.println("<body>");
            //Barra de navegação com o Juros Composto ativo.
                out.println("<nav class=\"navbar navbar-light navbar-expand-md bg-faded justify-content-center\">\n" +
                            "    <a href=\"NovaHomeServlet.html\" class=\"navbar-brand d-flex w-50 mr-auto\"><img src='dollar.png' width=\"40\" height=\"40\"></a>\n" +
                            "    <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#collapsingNavbar3\">\n" +
                            "        <span class=\"navbar-toggler-icon\"></span>\n" +
                            "    </button>\n" +
                            "    <div class=\"navbar-collapse collapse\" id=\"collapsingNavbar3\">\n" +
                            "        <ul class=\"navbar-nav mx-auto w-100 justify-content-center\">\n" +
                            "            <li class=\"nav-item\">\n" +
                            "                <a class=\"nav-link\" href=\"home.html\">Home</a>\n" +
                            "            </li>\n" +
                            "            <li class=\"nav-item\">\n" +
                            "                <a class=\"nav-link\" href=\"juros-simples.html\">Juros Simples</a>\n" +
                            "            </li>\n" +
                            "            <li class=\"nav-item active\">\n" +
                            "                <a class=\"nav-link\" href=\"juros-composto.html\">Juros Composto</a>\n" +
                            "            </li>\n" +
                            "        </ul>\n" +
                            "        <ul class=\"nav navbar-nav ml-auto w-100 justify-content-end\">\n" +
                            "            <li class=\"nav-item\">\n" +
                            "            </li>\n" +

                            "        </ul>\n" +
                            "    </div>\n" +
                            "</nav>");
                
             //Container principal com o formulário e 3 inputs para coletar dados.   
            out.println("<div class='container-fluid' style='padding-bottom:30px;'>"
                            + "<div class='container'>" 
                                + "<form>"
                                    + "<div class='form-row'>"
                                        + "<div class='form-group col-md-4'>"
                                             + "<label for='inputCapital' style='font-size: 150%;' class='col-form-label'>Capital</label>"
                                                    + "<input required min='0' step='0.01' type='number' class='form-control' id='inputCapital' placeholder='R$' name='c'>"
                                        + "</div>"
                                        + "<div class='form-group col-md-4'>"
                                             + "<label for='inputTaxa' style='font-size: 150%;' class='col-form-label'>Taxa de Juros</label>"
                                                    + "<input required min='0' step='0.0001' type='number' class='form-control' id='inputTaxa' placeholder='% ao mês' name='i'>"
                                        + "</div>"
                                        + "<div class='form-group col-md-4'>"
                                             + "<label for='inputTempo' style='font-size: 150%;' class='col-form-label'>Tempo total</label>"
                                                    + "<input required min='1' step='1' type='number' class='form-control' id='inputTempo' placeholder='Meses' name='t'>"
                                        + "</div>"
                                    + "</div>"
                                    + "<p><input type='submit' value='Calcular Juros Composto' class=\"btn btn-outlined btn-block btn-success\"></p>"
                                + "</form>");
            
                                //Atribuição dos dados às variáveis
                                if (request.getParameter("c") != null && request.getParameter("i") != null && request.getParameter("t") != null ) {
                                    c = Double.parseDouble(request.getParameter("c"));
                                    i = Double.parseDouble(request.getParameter("i"));
                                    t = Double.parseDouble(request.getParameter("t"));
                                    i = i/100;
                                    out.println("<table class='table table-striped '>"
                                         + "<tr >"
                                            + "<th class='text-center'>Mês</th>"
                                            + "<th class='text-center' style='padding-left: 120px;'>Juros</th>"
                                            + "<th class='text-center'>Montante</th>"
                                        + "</tr>");
                                }   
                                
                                // Cálculo do Juros Composto
            m=c;
            p = (1+i);
            for (int ct = 1; ct <= t; ct++){  
                    out.println("<tr><td class='text-center'>"+ct+"</td><td class='text-center' style='padding-left: 120px;'>R$"+df.format((i*m))+"</td><td class='text-center'>R$"+df.format((m * p))+"</td>");
                    m = m*p;
            }    
            
            out.println("</table>"
                    + "</div>"
                    + "</div>"
                                //Footer
                    + "<a href='http://www.fatecpg.com.br/default.aspx' target='_blank'><img style='padding-top: 20px; padding-bottom: 20px; display: block; margin: 0 auto;' src='logotipo-fatec-pg.png' width='200' heigth='150'></a>");
            
                               
            
            out.println("<script src=\"https://code.jquery.com/jquery-3.2.1.slim.min.js\" integrity=\"sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN\" crossorigin=\"anonymous\"></script>\n" +
            "    <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.11.0/umd/popper.min.js\" integrity=\"sha384-b/U6ypiBEHpOf/4+1nzFpr53nxSS+GLCkfwBdFNTxtclqqenISfwAzpKaMNFNmj4\" crossorigin=\"anonymous\"></script>\n" +
            "    <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta/js/bootstrap.min.js\" integrity=\"sha384-h0AbiXch4ZDo7tp9hKZ4TsHbi047NrKGLO3SEJAg45jXxnGIfYzk4Si90RDIqNm1\" crossorigin=\"anonymous\"></script>");
            out.println("</body>");
            out.println("</html>");
        }
    }
    
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
