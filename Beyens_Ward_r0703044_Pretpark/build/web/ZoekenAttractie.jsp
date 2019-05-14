<%-- 
    Document   : ZoekenAttractie
    Created on : 14-mei-2019, 14:52:21
    Author     : wardb
--%>


<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Attractie zoeken | Pretpark</title>
        <link rel="stylesheet" href="r0703044basis.css">
    </head>
    <body>
        <div class="container">
            <h1>Attractie zoeken </h1>
            <form action ="MaakServlet">
                <p> 
                    <label for="attractieZoekenNaam"> De naam van de attractie die u wilt zoeken:  </label>
                    <input type="text" name="attractieZoekenNaam" id="attractieZoekenNaam">
                </p>
                <p> 
                    <input type="submit" value="Zoeken!" name="attractieZoeken" class="verzendenCSS"> 
                </p>
            </form>

            <p> <a href="index.jsp">Ga terug naar de homepagina</a> </p>

        </div>
    </body>
</html>
