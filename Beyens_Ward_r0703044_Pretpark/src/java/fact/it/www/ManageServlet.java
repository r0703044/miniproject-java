/**
 * Author : wardb 
 * naam : Ward Beyens 
 * studentNr : r0703044
 */
package fact.it.www;

import fact.it.www.beans.Attractie;
import fact.it.www.beans.Bezoeker;
import fact.it.www.beans.Personeelslid;
import fact.it.www.beans.Persoon;
import fact.it.www.beans.Pretpark;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Author : wardb 
 * naam : Ward Beyens 
 * studentNr : r0703044
 */
@WebServlet(name = "ManageServlet", urlPatterns = {"/ManageServlet"})
public class ManageServlet extends HttpServlet {

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

            Personeelslid personeelslidEerste = new Personeelslid("Gertje", "Optnippertje");
            Personeelslid personeelslidTweede = new Personeelslid("Thibaut", "Defrisco");

            Personeelslid personeelslidDerde = new Personeelslid("Knapen", "Dokter");

            Bezoeker bezoeker_1 = new Bezoeker("Noor", "Baeyens");
            bezoeker_1.voegToeAanWishlist("Symbolica");
            bezoeker_1.voegToeAanWishlist("Droomvlucht");
            bezoeker_1.voegToeAanWishlist("Carnaval Festival");
            bezoeker_1.voegToeAanWishlist("Fata Morgana");
            bezoeker_1.voegToeAanWishlist("Sprookjesbos");
            bezoeker_1.setPretparkcode(50);

            Bezoeker bezoeker_2 = new Bezoeker("Ward", "Beyens");
            bezoeker_2.voegToeAanWishlist("Baron 1898");
            bezoeker_2.voegToeAanWishlist("Python");
            bezoeker_2.voegToeAanWishlist("De Vliegende Hollander");
            bezoeker_2.voegToeAanWishlist("Joris en de Draak");
            bezoeker_2.voegToeAanWishlist("Fata Morgana");
            bezoeker_2.setPretparkcode(100);

            Persoon persoon = new Persoon("Ryan", "Reynolds");

            Pretpark pretpark = new Pretpark("Magneto");

            Attractie attractieEerste = new Attractie("Python", 3);
            attractieEerste.setVerantwoordelijke(personeelslidEerste);

            Attractie attractieTweede = new Attractie("Symbolica", 6);
            attractieTweede.setVerantwoordelijke(personeelslidTweede);

            Attractie attractieDerde = new Attractie("Fata Morgana", 10);
            attractieDerde.setVerantwoordelijke(personeelslidDerde);

            pretpark.voegAttractieToe(attractieEerste);
            pretpark.voegAttractieToe(attractieTweede);
            pretpark.voegAttractieToe(attractieDerde);


            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Ward beyens</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1> Pretpark: " + pretpark.getNaam() + " </h1>");
            out.println("<h3> Attracties: </h3>");
            /*
            out.println("<p> " + attractieEerste.getNaam() + " <br> " + "Met als verantwoordelijke: " + attractieEerste.getVerantwoordelijke() + " <br> " + attractieEerste.getFoto()+ " </p>");
            out.println("<p> " + attractieTweede.getNaam()+ " <br> " + "Met als verantwoordelijke: " + attractieTweede.getVerantwoordelijke() + " <br> " + attractieTweede.getFoto()+ " </p>");
            out.println("<p> " + attractieDerde.getNaam()+ " <br> " + "Met als verantwoordelijke: " + attractieDerde.getVerantwoordelijke() + " <br> " + attractieDerde.getFoto()+ " </p>");
*/
            out.println("<p> " + attractieEerste.getNaam() + " <br> " + "Met als verantwoordelijke: " + attractieEerste.getVerantwoordelijke() + " <br> " + " </p>");
            out.println("<p> " + attractieTweede.getNaam()+ " <br> " + "Met als verantwoordelijke: " + attractieTweede.getVerantwoordelijke() + " <br> " + " </p>");
            out.println("<p> " + attractieDerde.getNaam()+ " <br> " + "Met als verantwoordelijke: " + attractieDerde.getVerantwoordelijke() + " <br> " + " </p>");

            out.println("<h3> Bezoekers: </h3>");
            out.println("<p> " + bezoeker_1.toString() + " heeft als wishlist: " + " <br> ");
            for (int i = 0; i < 5; i++) {
                out.print(bezoeker_1.getWishlist().get(i) + " ");
            }
            out.println("</p>");
            out.println("<p> " + bezoeker_2.toString() + " heeft als wishlist: " + " <br> ");
            for (int i = 0; i < 5; i++) {
                out.print(bezoeker_2.getWishlist().get(i) + " ");
            }
            out.println("</p>");

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
