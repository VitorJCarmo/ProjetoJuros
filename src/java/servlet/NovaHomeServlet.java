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
@WebServlet(name = "NovaHomeServlet", urlPatterns = {"/NovaHomeServlet.html"})
public class NovaHomeServlet extends HttpServlet {

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
            out.println("<title>Servlet NovaHomeServlet</title>");      
            out.println("<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta/css/bootstrap.min.css\" integrity=\"sha384-/Y6pD6FV/Vv2HJnA6t+vslU6fwYXjCFtcEpHbNJ0lyAFsXTsjBbfaDjzALeQsN6M\" crossorigin=\"anonymous\">");
            out.println("<link rel='stylesheet' type='text/css' href='" + request.getContextPath() +  "/styleHome.css' />");
            out.println("<meta charset=\"utf-8\">\n" +
            "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">");
            
            out.println("</head>");
            out.println("<body>");
            
            out.println("<nav class=\"navbar navbar-light navbar-expand-md bg-faded justify-content-center\">\n" +
                            "    <a href=\"/\" class=\"navbar-brand d-flex w-50 mr-auto\">Calculadora de Juros</a>\n" +
                            "    <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#collapsingNavbar3\">\n" +
                            "        <span class=\"navbar-toggler-icon\"></span>\n" +
                            "    </button>\n" +
                            "    <div class=\"navbar-collapse collapse\" id=\"collapsingNavbar3\">\n" +
                            "        <ul class=\"navbar-nav mx-auto w-100 justify-content-center\">\n" +
                            "            <li class=\"nav-item active\">\n" +
                            "                <a class=\"nav-link\" href=\"#\">Home</a>\n" +
                            "            </li>\n" +
                            "            <li class=\"nav-item\">\n" +
                            "                <a class=\"nav-link\" href=\"#\">Juros Simples</a>\n" +
                            "            </li>\n" +
                            "            <li class=\"nav-item\">\n" +
                            "                <a class=\"nav-link\" href=\"#\">Juros Composto</a>\n" +
                            "            </li>\n" +
                            "        </ul>\n" +
                            "        <ul class=\"nav navbar-nav ml-auto w-100 justify-content-end\">\n" +
                            "            <li class=\"nav-item\">\n" +
                            "            </li>\n" +

                            "        </ul>\n" +
                            "    </div>\n" +
                            "</nav>");
            
            out.println("<div class='container-fluid'>"
                    + "<div class='container'>"
                    + "<h2>Juros Simples</h2>"
                    + "<p>Lorem ipsum dolor sit amet, cu meis doming audire usu, ocurreret adolescens mea et. Eu pro latine eripuit. Ex ius impedit delectus, numquam epicurei id cum. Iudicabit mnesarchum cu nec. Eu posidonium repudiandae duo, qui torquatos persecuti interpretaris ei. Mei option constituam et, at vix quidam noluisse.\n" +
"                   \n" +
"                   Ubique civibus in his. Eos suas hinc vocent in, ea alii nominati ullamcorper usu, sit insolens definitiones ad. Erat delenit eos no, eos cibo utamur et. Eum simul recteque consulatu cu, usu graecis alienum neglegentur ne, nibh docendi duo ad. Dicta facilis contentiones ne his, tempor conclusionemque ex ius.</p>"

                    + "<p><a href=\"#\" class=\"btn btn-outlined btn-block btn-success\">Calcular Juros Simples</a></p>"

                    + "<h2>Juros Compostos</h2>"
                    + "<p>Lorem ipsum dolor sit amet, choro fabulas consectetuer has ne, est at mundi theophrastus. Per prima posse nostrud ea. Quo ea eros volutpat. Ei mutat utinam vix, sit graeco patrioque ne. Ad pro accusam dolores, eos veritus honestatis ut.\n" +
                        "\n" +
                        "Ut vim porro aliquam similique, quo mazim zril persequeris te. Fierent pertinacia assueverit cu duo. Nam cu etiam putant, vel ei amet iusto similique. Alienum urbanitas ius ut. Aeque dissentias nam in, aperiam suavitate scriptorem duo at, elit causae delicata sea ei.\n" +
                        "\n" +
                        "Per ex modo facer dissentiet, eam in eros nominati scriptorem. Usu eu diam modus veniam. Posse tantas salutatus eam eu, errem quaerendum eos at, aperiri praesent ad ius. Ut aperiri repudiare prodesset per, no diam cetero lobortis cum. Laboramus dissentiunt at quo. Ex nibh gubergren sit, utinam mollis habemus ut his.\n" +
                        "\n" +
                        "No vix viderer recusabo erroribus, eos ex sumo illud. Et amet ignota blandit eam. No novum noster vivendo vim, cum at tation impetus consequat. Ferri autem eu nec. Id paulo periculis vim. Tollit iuvaret in eos, sea persius euripidis eu, ea vim sententiae definiebas. No agam homero labores has.\n" +
                        "\n" +
                        "Cetero perfecto eu mel, et est case aliquid. Pri eu putent iisque pertinax, everti nominati instructior ei mei. Vide iusto voluptaria cu has. His dissentias accommodare ea, sea epicuri offendit ne, vulputate voluptatum sit id.</p>"
                    + ""
                    + "<p><a href=\"#\" class=\"btn btn-outlined btn-block btn-success\">Calcular Juros Compostos</a></p>"
                    + ""
                    + ""
                    + "");
 
     

                   
            
            
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
