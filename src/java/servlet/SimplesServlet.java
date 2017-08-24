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
 * @author estagio
 */
@WebServlet(name = "SimplesServlet", urlPatterns = {"/juros-simples.html"})
public class SimplesServlet extends HttpServlet {

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
            out.println("<title>Servlet SimplesServlet</title>");            
            out.println("</head>");
            out.println("<style>");
            out.println("ul{list-style-type: none;margin: 2px;padding: 2px;overflow: hidden;background-color: #333;text-align: center;}");
            out.println("li {text-align: center;display: inline;}");
            out.println("a {color: white;text-align: center;padding: 4px 4px;text-decoration: none;}");
            out.println ("li a:hover {background-color: FireBrick;}");
            out.println("#main{margin-left:600px;margin-top:200px}");
            out.println("</style>");
            out.println("<body>");
            out.println("<h1 align='center'>Cálculo de Juros Simples</h1>");
            out.println("<div id='menu'>");
            out.println("<ul>");
            out.println("<li><a href='home.html'>Home  </a></li>");
            out.println("<li><a href='juros-simples.html' >Juros Simples  </a></li>");
            out.println("<li><a href='juros-composto.html' >Juros Composto</a></li>");
            out.println("</ul>");
            out.println("</div>");
            //Montante = Capital.(1+(taxa de juros.parcelas))
            
            //cap.(1+(taxa.par)
            double Mont=0;
            double cap=0;
            double taxa=0;
            double par=0;
            String mensagem="";
            out.println("<form>");
            out.println("<p>Capital: <input type='text' name='cap'> ");
            out.println("<p>Taxa de Juros (% ao mês): <input type='text' name='taxa'> ");
             out.println("<p>Tempo total (meses): <input type='text' name='par'>");
             out.println("<p><input type='submit' value='Calcular'></p>");
             out.println("</form>");
                                    
             try {
                 if (request.getParameter("cap") != null)
                    cap = Double.parseDouble(request.getParameter("cap"));
                 
                    
             }
             catch(Exception ex){
                    mensagem += "Valor do capital inválido <br>";
                   
                    
             }
             
             try {
                 if (request.getParameter("taxa") != null)
                    taxa = Double.parseDouble(request.getParameter("taxa"));
                    
             }
             catch(Exception ex){
                    mensagem += "Valor da taxa de juros inválido<br>";
                    
             }
             
             try {
                 if (request.getParameter("par") != null)
                    par = Double.parseDouble(request.getParameter("par"));
                   
             }
             catch(Exception ex){
                    mensagem += "Valor das parcelas inválido <br>";
                   
             }
             Mont = (cap*(1+((taxa/100)*par)));
             out.println("<h3 style='color:red;'>"+mensagem+"</h3>");
             out.println("<h3 style='color:red;'>Montante:  "+Mont+"</h3>");
             out.println("<h3><a href='index.html'>Voltar</h3>");
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
