/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
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
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Author : wardb naam : Ward Beyens studentNr : r0703044
 */
public class MaakServletBackUp extends HttpServlet {

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

            nieuwpretpark.voegAttractieToe(nieuweAttractie);

            Attractie attractie1 = new Attractie("Python");
            nieuwpretpark.voegAttractieToe(attractie1);
            Attractie attractie2 = new Attractie("Baron 1898");
            nieuwpretpark.voegAttractieToe(attractie2);
            Attractie attractie3 = new Attractie("Symbolica");
            nieuwpretpark.voegAttractieToe(attractie3);
            Attractie attractie4 = new Attractie("Fata Morgana");
            nieuwpretpark.voegAttractieToe(attractie4);

            //In MaakServlet zorg je ervoor dat dit personeelslid als verantwoordelijke voor de attractie wordt vastgelegd.
            ArrayList<Personeelslid> personeelsleden = (ArrayList<Personeelslid>) session.getAttribute("personeelsleden");
            Personeelslid personeelslid = personeelsleden.get(0);
            nieuweAttractie.setVerantwoordelijke(personeelslid);

            //request.setAttribute("pretpark", nieuwpretpark);
            ArrayList<Pretpark> pretparken = (ArrayList<Pretpark>) session.getAttribute("pretparken");
            pretparken.add(nieuwpretpark);
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

        if (request.getParameter("overzichtPretparken") != null) {
            String pretparkIndex = request.getParameter("overzichtPretparken");
            //System.out.println(pretparkIndex);
            ArrayList<Pretpark> pretparken = (ArrayList<Pretpark>) session.getAttribute("pretparken");
            Integer pretparkIndexIntiger = Integer.parseInt(pretparkIndex);
            Pretpark pretparkGekozen = pretparken.get(pretparkIndexIntiger);
            //System.out.println(pretparkGekozen);
            pretparken.add(pretparkGekozen);
            RequestDispatcher rd = request.getRequestDispatcher("OverzichtPretparkAttracties.jsp");
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
