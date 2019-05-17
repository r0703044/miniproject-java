/**
 * Author : wardb 
 * naam : Ward Beyens 
 * studentNr : r0703044
 */
package fact.it.www;

import fact.it.www.beans.Attractie;
import fact.it.www.beans.Bezoeker;
import fact.it.www.beans.Personeelslid;
import fact.it.www.beans.Pretpark;
import java.io.IOException;
import java.util.ArrayList;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(name = "MaakServlet", urlPatterns = {"/MaakServlet"})
public class MaakServlet extends HttpServlet {

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

        HttpSession session = request.getSession();

        /**
         * BEZOEKER
         */
        if (request.getParameter("bezoeker") != null) {
            String voornaam = request.getParameter("voornaam");
            String familienaam = request.getParameter("familienaam");
            Bezoeker bezoekernaam = new Bezoeker(voornaam, familienaam);
            if (request.getParameter("attractieKeuze") != null) {
                if (!request.getParameter("attractieKeuze").endsWith("leeg")) {
                    bezoekernaam.voegToeAanWishlist(request.getParameter("attractieKeuze"));
                }
            }
            RequestDispatcher rd = request.getRequestDispatcher("VerwelkomBezoeker.jsp");
            // request.setAttribute("bezoeker", bezoekernaam);
            ArrayList<Bezoeker> bezoekers = (ArrayList<Bezoeker>) session.getAttribute("bezoekers");
            bezoekers.add(bezoekernaam);
            rd.forward(request, response);
        }
        /**
         * BEZOEKER met Pretpark
         */
        if (request.getParameter("bezoekerExtra") != null) {
            String voornaam = request.getParameter("voornaam");
            String familienaam = request.getParameter("familienaam");
            Bezoeker nieuweBezoekerExtra = new Bezoeker(voornaam, familienaam);
            if (request.getParameter("attractieKeuze") != null) {
                if (!request.getParameter("attractieKeuze").endsWith("leeg")) {
                    nieuweBezoekerExtra.voegToeAanWishlist(request.getParameter("attractieKeuze"));
                }
            }
            if (request.getParameter("pretparkkeuze") != null) {
                ArrayList<Pretpark> pretparken = (ArrayList<Pretpark>) session.getAttribute("pretparken");
                String indexpretparkkeuze = request.getParameter("pretparkkeuze");
                Integer indexpretpark = Integer.parseInt(indexpretparkkeuze);
                Pretpark gekozenpretparkdoorbezoeker = pretparken.get(indexpretpark);
                gekozenpretparkdoorbezoeker.registreerBezoeker(nieuweBezoekerExtra);
            }
            //if (request.getParameter("pretparkkeuze") != null) {
            //    Pretpark pretparkkeuze = new Pretpark(request.getParameter("pretparkkeuze"));
            //    pretparkkeuze.registreerBezoeker(nieuweBezoekerExtra);
            //}
            RequestDispatcher rd = request.getRequestDispatcher("VerwelkomBezoeker.jsp");
            //request.setAttribute("bezoeker", nieuweBezoekerExtra);
            ArrayList<Bezoeker> bezoekers = (ArrayList<Bezoeker>) session.getAttribute("bezoekers");
            bezoekers.add(nieuweBezoekerExtra);
            rd.forward(request, response);
        }
        /**
         * PRETPARK met attracties
         */
        if (request.getParameter("nieuweAttractie") != null) {
            String naamPretpark = request.getParameter("naamPretpark");
            Pretpark nieuwpretpark = new Pretpark(naamPretpark);
            String naamAttractie = request.getParameter("naamAttractie");
            long duur = Long.parseLong(request.getParameter("duur"));
            String naamFoto = request.getParameter("naamFoto");
            Attractie nieuweAttractie = new Attractie(naamAttractie, duur);
            nieuweAttractie.setFoto(naamFoto);
            nieuwpretpark.voegAttractieToe(nieuweAttractie);
            Attractie attractie1 = new Attractie("Python");
            nieuwpretpark.voegAttractieToe(attractie1);
            attractie1.setDuur(3);
            attractie1.setFoto("Python");
            Personeelslid nieuwPersoneelslid1 = new Personeelslid("Johny", "English");
            attractie1.setVerantwoordelijke(nieuwPersoneelslid1);
            Attractie attractie2 = new Attractie("Baron 1898");
            nieuwpretpark.voegAttractieToe(attractie2);
            attractie2.setDuur(5);
            attractie2.setFoto("Baron 1898");
            Personeelslid nieuwPersoneelslid2 = new Personeelslid("Tony", "Stark");
            attractie2.setVerantwoordelijke(nieuwPersoneelslid2);
            Attractie attractie3 = new Attractie("Symbolica");
            nieuwpretpark.voegAttractieToe(attractie3);
            attractie3.setDuur(6);
            attractie3.setFoto("Symbolica");
            Personeelslid nieuwPersoneelslid3 = new Personeelslid("Steve", "Roggers");
            attractie3.setVerantwoordelijke(nieuwPersoneelslid3);
            Attractie attractie4 = new Attractie("Fata Morgana");
            nieuwpretpark.voegAttractieToe(attractie4);
            attractie4.setDuur(8);
            attractie4.setFoto("Fata Morgana");
            Personeelslid nieuwPersoneelslid4 = new Personeelslid("Natasha", "Romanov");
            attractie4.setVerantwoordelijke(nieuwPersoneelslid4);
            //In MaakServlet zorg je ervoor dat dit personeelslid als verantwoordelijke voor de attractie wordt vastgelegd.
            ArrayList<Personeelslid> personeelsleden = (ArrayList<Personeelslid>) session.getAttribute("personeelsleden");
            String indexpersoneelslid = request.getParameter("personeelsleden");
            Integer indexPersoneel = Integer.parseInt(indexpersoneelslid);
            Personeelslid personeelslidVerantwoordelijke = personeelsleden.get(indexPersoneel);
            nieuweAttractie.setVerantwoordelijke(personeelslidVerantwoordelijke);
            //request.setAttribute("pretpark", nieuwpretpark);
            ArrayList<Pretpark> pretparken = (ArrayList<Pretpark>) session.getAttribute("pretparken");
            pretparken.add(nieuwpretpark);
            //aanpassen laatste element naar laatste index
            Integer grootte = pretparken.size();
            Integer pretparkIndexIntiger = grootte - 1;
            request.setAttribute("gekozenIndex", pretparkIndexIntiger);
            RequestDispatcher rd = request.getRequestDispatcher("OverzichtPretparkAttracties.jsp");
            rd.forward(request, response);
        }
        /**
         * PERSONEELSLID
         */
        if (request.getParameter("personeelslid") != null) {
            String voornaam = request.getParameter("voornaam");
            String familienaam = request.getParameter("familienaam");
            Personeelslid nieuwpersoneel = new Personeelslid(voornaam, familienaam);
            RequestDispatcher rd = request.getRequestDispatcher("VerwelkomPersoneelslid.jsp");
            // request.setAttribute("personeelslid", nieuwpersoneel);
            ArrayList<Personeelslid> personeelsleden = (ArrayList<Personeelslid>) session.getAttribute("personeelsleden");
            personeelsleden.add(nieuwpersoneel);
            rd.forward(request, response);
        }
        /**
         * OVERZICHT PRETPARKEN INDEX DOORSTUREN
         */
        if (request.getParameter("overzichtPretparken") != null) {
            String pretparkIndex = request.getParameter("overzichtPretparken");
            ArrayList<Pretpark> pretparken = (ArrayList<Pretpark>) session.getAttribute("pretparken");
            Integer pretparkIndexIntiger = Integer.parseInt(pretparkIndex);
            request.setAttribute("gekozenIndex", pretparkIndexIntiger);
            RequestDispatcher rd = request.getRequestDispatcher("OverzichtPretparkAttracties.jsp");
            rd.forward(request, response);
        }
        /**
         * ATTRACTIE ZOEKEN
         */
        if (request.getParameter("attractieZoeken") != null) {
            Attractie attractieTeZoeken = new Attractie();
            session.setAttribute("AttractieGevonden", null);
            ArrayList<Pretpark> pretparken = (ArrayList<Pretpark>) session.getAttribute("pretparken");
            for (int index = 0; index < pretparken.size(); index++) {
                if (pretparken.get(index).zoekAttractieOpNaam(request.getParameter("attractieZoekenNaam")) != null) {
                    attractieTeZoeken = pretparken.get(index).zoekAttractieOpNaam(request.getParameter("attractieZoekenNaam"));
                    session.setAttribute("gevondenAttractie", attractieTeZoeken);
                    RequestDispatcher rd = request.getRequestDispatcher("wijzigenAttractie.jsp");
                    rd.forward(request, response);
                }
            }
            RequestDispatcher rd = request.getRequestDispatcher("nietGevonden.jsp");
            rd.forward(request, response);
        }
        /**
         * ATTRACTIE wijzigen
         */
        if (request.getParameter("attractieWijzigen") != null) {
            Attractie attractieTeWijzigen = (Attractie) session.getAttribute("gevondenAttractie");
            //session.setAttribute("AttractieTeWijzigen", attractieTeWijzigen);
            if (!"".equals(request.getParameter("attractieWijzigenNaam")) || !"".equals(request.getParameter("attractieWijzigenFoto")) || !"".equals(request.getParameter("attractieWijzigenDuur")) || !"".equals(request.getParameter("attractieWijzigenPersoneel"))) {
                String attractieWijzigenNaam = request.getParameter("attractieWijzigenNaam");
                attractieTeWijzigen.setNaam(attractieWijzigenNaam);
                String attractieWijzigenDuur = request.getParameter("attractieWijzigenDuur");
                Long attractieWijzigenDuurLong = Long.parseLong(attractieWijzigenDuur);
                attractieTeWijzigen.setDuur(attractieWijzigenDuurLong);
                String attractieWijzigenFoto = request.getParameter("attractieWijzigenFoto");
                attractieTeWijzigen.setFoto(attractieWijzigenFoto);
                ArrayList<Personeelslid> personeelsleden = (ArrayList<Personeelslid>) session.getAttribute("personeelsleden");
                String attractieWijzigenPersoneel = request.getParameter("attractieWijzigenPersoneel");
                Integer attractieWijzigenPersoneelIndex = Integer.parseInt(attractieWijzigenPersoneel);
                Personeelslid attractieWijzigenPersoneelGekozen = personeelsleden.get(attractieWijzigenPersoneelIndex);
                attractieTeWijzigen.setVerantwoordelijke(attractieWijzigenPersoneelGekozen);
            }
            session.setAttribute("gevondenAttractie", attractieTeWijzigen);
            RequestDispatcher rd = request.getRequestDispatcher("wijzigenAttractie.jsp");
            rd.forward(request, response);
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
