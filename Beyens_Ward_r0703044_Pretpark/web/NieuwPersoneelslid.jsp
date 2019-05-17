<%-- 
    Document   : NieuweBezoeker
    Created on : 1-may-2019, 14:59:11
    Author     : wardb
    naam       : Ward Beyens
    studentNr  : r0703044
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Nieuw Personeelslid | Pretpark</title>
        <link rel="stylesheet" href="r0703044basis.css">
    </head>
    <body>
        <div class="container">
            <h1>Vul hier de gegevens van het nieuw personeelslid in!</h1>
            <form action ="MaakServlet">
                <p> 
                    <label for="voornaam"> Voornaam: </label>
                    <input type="text" name="voornaam" id="voornaam">
                </p>
                <p> 
                    <label for="familienaam"> Familienaam:  </label>
                    <input type="text" name="familienaam" id="familienaam">
                </p>
                <p> 
                    <input type="submit" value="Verzenden!" name="personeelslid" class="verzendenCSS"> 
                </p>
            </form>
            <p> <a href="index.jsp">Ga terug naar de homepagina</a> </p>
        </div>
    </body>
</html>