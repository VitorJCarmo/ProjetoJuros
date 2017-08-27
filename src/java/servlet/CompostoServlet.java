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
            double m, c, i, t, ctotal,j,jant,jt,mt;
            DecimalFormat df = new DecimalFormat("#,###.00");
            
            ctotal = m = c = i = t = j = jant = jt = mt = 0;
           
            
            String mensagem;
            mensagem = "";
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Juros Compostos</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Cálculo de Juros Compostos</h1>");
            out.println("<div style='float:left; margin-right: 200px;'>");
            out.println("<form>");
            out.println("<p>Capital: <input required type='number' min='0' name='c'> ");
            out.println("<p>Taxa de Juros (% ao mês): <input required type='number' min='0' name='i'> ");
            out.println("<p>Tempo total (meses): <input required type='number' min='1' name='t'>");
            out.println("<p><input required type='submit' value='Calcular'></p>");
            out.println("</form>");
   
            //Tratamento de erros e atribuição dos valores às variáveis
            try {
                if (request.getParameter("c") != null && request.getParameter("i") != null && request.getParameter("t") != null )
                   c = Double.parseDouble(request.getParameter("c"));
                   i = Double.parseDouble(request.getParameter("i"));
                   t = Double.parseDouble(request.getParameter("t"));
                   i = i/100;
            }
            catch (Exception ex) {
                out.println("<h3 style='color:red'>Preencha os campos corretamente!</h3>");
            }

            out.println("<h3 style='color:red;'>"+mensagem+"</h3>");
            out.println("<h3><a href='index.html'>Voltar</a></h3>");
            out.println("</div>");
            
            //Exibição da tabela
            out.println("<div>");
            out.println("<table table border='1'>");
            out.println("<tr><th>Mês</th> <th>Juros</th> <th>Montante</th></tr>");
            
            for (int ct = 1; ct <= t; ct++){
                ctotal = c * Math.pow((1+i),ct);
                j = ctotal - c;
                out.println("<tr><td>"+ct+"</td> <td>R$ "+ df.format(j - jant) +" </td><td>R$ "+ df.format(ctotal)+"</td>");
                mt += ctotal;
                
                //jant = juros anterior;
                //jt = juros total
                jt += j - jant;
                jant = j;
                
                if (ct==t) {
                    out.println("<tr><td>Total:</td><td>R$ "+df.format(jt)+"</td><td>R$ "+df.format(mt)+"</td>");
                }
            }
                       
            out.println("<table>");
            out.println("</div>");            
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
