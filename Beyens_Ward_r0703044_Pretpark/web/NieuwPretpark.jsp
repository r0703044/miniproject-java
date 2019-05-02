<%-- 
    Document   : NieuwPretpark
    Created on : 2-apr-2019, 14:30:56
    Author     : wardb
    naam       : Ward Beyens
    studentNr  : r0703044
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Nieuw Pretpark | Pretpark</title>
        <link rel="stylesheet" href="r0703044basis.css">
    </head>
    <body>
        <div class="container">
            <h1>Vul hier de gegevens van het nieuwe Pretpark in!</h1>
            <form action ="NieuweAttractie.jsp">
                <p> 
                    <label for="naamPretpark"> Naam van het nieuwe pretpark: </label>
                    <input type="text" name="naamPretpark" id="naamPretpark">
                </p>
                <p> 
                    <input type="submit" value="Verzenden!" name="nieuwPretpark" class="verzendenCSS"> 
                </p>
            </form>
            <p> <a href="index.jsp">Ga terug naar de homepagina</a> </p>
        </div>
    </body>
</html>