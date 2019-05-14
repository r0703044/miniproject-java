<%-- 
    Document   : wijzigenAttractie
    Created on : 14-mei-2019, 15:06:10
    Author     : wardb
--%>

<%@page import="fact.it.www.beans.Attractie"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title> overzicht & wijzigen attractie | Pretpark</title>
        <link rel="stylesheet" href="r0703044basis.css">
    </head>
    <body>
        <% Attractie attractie = (Attractie) session.getAttribute("attractieGevonden"); %>
        
        <div class="container">
            <h1> overzicht & wijzigen attractie </h1>
            <p> 
                PAGINA WAAR ALLES VAN ATTRACTIE GEWIJZIGD EN GETOONT WORDT.
            </p>

            <h1>Overzicht van de attractie</h1> 
            

            <img src="images/.jpg" 
                 alt="" 
                 width="400" onerror="this.src='images/geenFoto.jpg'">
            <p class="bijFoto">  <span class="fas fa-level-up-alt"></span></p>
            <p class="bijFoto">
               
                <span class="fas fa-level-up-alt"></span></p>
            <p class="bijFoto"> verantwoordelijke:

                <span class="fas fa-level-up-alt"></span></p>




            <form action ="MaakServlet">
                <p> 
                    <label for="attractieWijzigenNaam"> De naam van de attractie wijzigen:  </label>
                    <input type="text" name="attractieWijzigenNaam" id="attractieWijzigenNaam">
                </p>
                <p> 
                    <input type="submit" value="Wijzigen!" name="attractieWijzigen" class="verzendenCSS"> 
                </p>
            </form>

            <p> <a href="index.jsp">Ga terug naar de homepagina</a> </p>

        </div>
    </body>
</html>
