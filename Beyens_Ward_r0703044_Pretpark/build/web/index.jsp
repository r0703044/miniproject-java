<%-- 
    Document   : index
    Created on : 1-apr-2019, 22:48:49
    Author     : wardb
    naam       : Ward Beyens
    studentNr  : r0703044
    werkend 17 op 20
--%> 

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Pretpark Ward Beyens</title>
        <link rel="stylesheet" href="r0703044basis.css">
    </head>

    <body>
        <div class="container" style="width: 80vw">
            <h1>Pretpark Ward Beyens</h1>
            <p>Welkom op mijn MINIproject over mijn eigen gemaakte pretpark!</p>
            <img src="images/Pretpark.jpg" alt="pretpark foto">
            <p class="meer">
                <a href="NieuweBezoeker.jsp"> nieuwe bezoeker </a>
                <a href="NieuwPretpark.jsp"> nieuw Pretpark </a>
            </p>
            <p class="meer">
                <a href="NieuwPersoneelslid.jsp"> nieuw Personeelslid </a>
                <a href="OpvulServlet"> <span class="aandachtextra">opvullen</span>  </a>
            </p>
            <p class="meer">
                <a href="OverzichtBezoekers.jsp"> overzicht bezoekers </a>
                <a href="OverzichtPretparken.jsp"> overzicht pretparken </a>
            </p>
            <br>
            <br>
            <hr>
            <h2>Attractie zoeken </h2>
            <form action ="MaakServlet">
                <p> 
                    <label for="attractieZoekenNaam"> De naam van de attractie die u wilt zoeken:  </label>
                    <input type="text" name="attractieZoekenNaam" id="attractieZoekenNaam">
                </p>
                <p> 
                    <input type="submit" value="Zoeken!" name="attractieZoeken" class="verzendenCSS"> 
                </p>
            </form>
            <footer>
                <p>&copy; Ward Beyens</p>
            </footer>
        </div>
    </body>
</html>

