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
@WebServlet(name = "HomeServlet", urlPatterns = {"/home.html"})
public class HomeServlet extends HttpServlet {

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
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Home - Calculadora de Juros</title>"
                    + "<link href=\"https://fonts.googleapis.com/css?family=Roboto\" rel=\"stylesheet\">");      
            out.println("<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta/css/bootstrap.min.css\" integrity=\"sha384-/Y6pD6FV/Vv2HJnA6t+vslU6fwYXjCFtcEpHbNJ0lyAFsXTsjBbfaDjzALeQsN6M\" crossorigin=\"anonymous\">");
            out.println("<link rel='stylesheet' type='text/css' href='" + request.getContextPath() +  "/styleHome.css' />");
            out.println("<meta charset=\"utf-8\">\n" +
            "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">");
            
            out.println("</head>");
            out.println("<body>");
            
            out.println("<nav class=\"navbar navbar-light navbar-expand-md bg-faded justify-content-center\">\n" +
                            "    <a href=\"NovaHomeServlet.html\" class=\"navbar-brand d-flex w-50 mr-auto\"><img src='dollar.png' width=\"40\" height=\"40\"></a>\n" +
                            "    <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#collapsingNavbar3\">\n" +
                            "        <span class=\"navbar-toggler-icon\"></span>\n" +
                            "    </button>\n" +
                            "    <div class=\"navbar-collapse collapse\" id=\"collapsingNavbar3\">\n" +
                            "        <ul class=\"navbar-nav mx-auto w-100 justify-content-center\">\n" +
                            "            <li class=\"nav-item active\">\n" +
                            "                <a class=\"nav-link\" href=\"home.html\">Home</a>\n" +
                            "            </li>\n" +
                            "            <li class=\"nav-item\">\n" +
                            "                <a class=\"nav-link\" href=\"juros-simples.html\">Juros Simples</a>\n" +
                            "            </li>\n" +
                            "            <li class=\"nav-item\">\n" +
                            "                <a class=\"nav-link\" href=\"juros-composto.html\">Juros Composto</a>\n" +
                            "            </li>\n" +
                            "        </ul>\n" +
                            "        <ul class=\"nav navbar-nav ml-auto w-100 justify-content-end\">\n" +
                            "            <li class=\"nav-item\">\n" +
                            "            </li>\n" +

                            "        </ul>\n" +
                            "    </div>\n" +
                            "</nav>"
                                + "<div class='jumbotron jumbotron-fluid' id='jumbo'>\n" +
                                           "  <div class=\"container\">\n" +
                                           "    <h1 class=\"display-3\">Calculadora de Juros</h1>\n" +
                                           
                                           "  </div>\n" +
                                     "</div>");
            
            out.println("<div class='container-fluid' style='padding-bottom:30px;'>"
                    + "<div class='container'>"
                    + "<h2>Juros Simples</h2>"
                    + "<p>O regime de juros será simples quando o percentual de juros incidir apenas sobre o valor principal. Sobre os juros gerados a cada período não incidirão novos juros. Valor Principal ou simplesmente principal é o valor inicial emprestado ou aplicado, antes de somarmos os juros. </p>"

                    + "<p><a href=\"juros-simples.html\" class=\"btn btn-outlined btn-block btn-success\">Calcular Juros Simples</a></p>"

                    + "<h2>Juros Composto</h2>"
                    + "<p>Juros compostos são os juros de um determinado período somados ao capital para o cálculo de novos juros nos períodos seguintes.\n" +
                        "\n" +
                        "Juros compostos fazem parte de disciplinas e conceitos de matemática financeira, e esses juros são representados através de um percentual.<br><br>\n" +
                        "\n" +
                        "A fórmula de juros compostos pode ser escrita através da remuneração cobrada pelo empréstimo de dinheiro. O valor da dívida é sempre corrigido e a taxa de juros é calculada sobre esse valor.\n" +
                        "\n" +
                        "O regime de juros compostos é o mais comum no sistema financeiro e o mais útil para cálculos de problemas do dia-a-dia.<br><br>\n" +
                        "\n" +
                        "O atual sistema financeiro utiliza o regime de juros compostos, pois ele oferece uma maior rentabilidade quando comparado ao regime de juros simples, uma vez que juros compostos incidem mês a mês, de acordo com o somatório acumulativo do capital com o rendimento mensal.\n" +
                        "\n" +
                        "Juros compostos são muito usados no comércio, como em bancos. Os juros compostos são utilizados na remuneração das cadernetas de poupança, e é conhecido como “juro sobre juro”.\n" +
                        "\n" +
                        "Os juros compostos em disciplinas de matemática financeira, geralmente são calculados e aprendidos com a utilização da calculadora HP 12C, mas também é possível resolver seus cálculos e a fórmula no Excel.</p>"

                                            + "<p><a href=\"juros-composto.html\" class=\"btn btn-outlined btn-block btn-success\">Calcular Juros Compostos</a></p>"
                    
                    + "</div>"
                    + "<div class='container'>"
                    + "<h2 style='text-align:center;'>Equipe</h2>"
                        + "<div class='row cartao' style='margin-top:30px; margin-left: 70px;'>"
                            + "<div class='col-sm-2' style='padding-left:50px;'>"
                                 + "<div class='card' style='width: 10rem;'>"
                                 + "<img class=\"card-img-top\" src=\"vinicius.png\" alt=\"Card image cap\">\n" +
                                        "  <div class=\"card-body\">\n" +
                                        "    <h4 class=\"card-title\">Vinícius Lima</h4>\n" +
                                        "    <p class=\"card-text\"></p>\n" +
                                        "  </div>"
                                 + "</div>"
                            + "</div>"
                            + "<div class='col-sm-2' style='padding-left:50px;'>"
                                 + "<div class='card ' style='width: 10rem;'>"
                                 + "<img class=\"card-img-top\" src=\"karin.png\" alt=\"Card image cap\">\n" +
                                        "  <div class=\"card-body\">\n" +
                                        "    <h4 class=\"card-title\">Karin Cristine</h4>\n" +
                                        "    <p class=\"card-text\"></p>\n" +
                                        "  </div>"
                                 + "</div>"
                            + "</div>"
                            + "<div class='col-sm-2' style='padding-left:50px;'>"
                                 + "<div class='card' style='width: 10rem;'>"
                                 + "<img class=\"card-img-top\" src=\"vitor.png\" alt=\"Card image cap\">\n" +
                                        "  <div class=\"card-body\">\n" +
                                        "    <h4 class=\"card-title\">Vitor Jesus</h4>\n" +
                                        "    <p class=\"card-text\"></p>\n" +
                                        "  </div>"
                                 + "</div>"
                            + "</div>"
                            + "<div class='col-sm-2' style='padding-left:50px;'>"
                                 + "<div class='card' style='width: 10rem;'>"
                                 + "<img class=\"card-img-top\" src=\"ernandes.png\" alt=\"Card image cap\">\n" +
                                        "  <div class=\"card-body\">\n" +
                                        "    <h4 class=\"card-title\">Ernandes Papa</h4>\n" +
                                       
                                        "  </div>"
                                 + "</div>"
                            + "</div>"
                            + "<div class='col-sm-2' style='padding-left:50px;'>"
                                 + "<div class='card' style='width: 10rem;'>"
                                 + "<img class=\"card-img-top\" src=\"stanislaw.png\" alt=\"Card image cap\">\n" +
                                        "  <div class=\"card-body\">\n" +
                                        "    <h4 class=\"card-title\">Stanislaw wieliczko</h4>\n" +
                                        "    <p class=\"card-text\"></p>\n" +
                                        "  </div>"
                                 + "</div>"
                            + "</div>"
                        + "</div>"
                    + "</div>"

                    
                    + "</div>"
                    
                    
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
