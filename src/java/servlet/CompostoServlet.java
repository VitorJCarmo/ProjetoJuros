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
            double m, c, i, t, total;
           
            total = 0;
            m = 0;
            c = 0;
            i = 0;
            t = 0;  
            
            String mensagem;
            mensagem = "";
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet CompostoServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Cálculo de Juros Compostos</h1>");
            out.println("<div style='float:left; margin-right: 200px;'>");
            out.println("<form>");
            out.println("<p>Capital: <input type='text' name='c'> ");
            out.println("<p>Taxa de Juros (% ao mês): <input type='text' name='i'> ");
            out.println("<p>Tempo total (meses): <input type='text' name='t'>");
            out.println("<p><input type='submit' value='Calcular'></p>");
            out.println("</form>");
                                   
            try {
                if (request.getParameter("c") != null)
                   c = Double.parseDouble(request.getParameter("c"));
                   
                   
            }
            catch(Exception ex){
                   mensagem += "Valor inválido de capital <br>";
                  
                   
            }
            
            try {
                if (request.getParameter("i") != null)
                   i = Double.parseDouble(request.getParameter("i"));
                   
            }
            catch(Exception ex){
                   mensagem += "Valor inválido de taxa de juros <br>";
                   
            }
            
            try {
                if (request.getParameter("t") != null)
                   t = Double.parseDouble(request.getParameter("t"));
                  
            }
            catch(Exception ex){
                   mensagem += "Valor inválido de tempo <br>";
                   
            }
            
            out.println("<h3 style='color:red;'>"+mensagem+"</h3>");
            out.println("<h3><a href='index.html'>Voltar</a></h3>");
            out.println("</div>");
            
            
            out.println("<table table border='1'>");
            out.println("<tr><th>Mês</th> <th>Montante</th></tr>");
            
           
            
            for (int ct = 1; ct <= t; ct++){
              m = c * Math.pow((1+i),ct);
              out.println("<tr><td>"+ ct +"</td><td>"+m+"</td></tr>");
              total += m; 
              
            }
            
            out.println("<table>");
            out.println("<h3>Total:"+total+"</h3>");
            
           
            
            
            
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
