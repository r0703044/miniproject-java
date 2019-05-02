<%-- 
    Document   : OverzichtBezoekers
    Created on : 2-mei-2019, 18:02:52
    Author     : wardb
    naam       : Ward Beyens
    studentNr  : r0703044
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="fact.it.www.beans.Bezoeker"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Overzicht Bezoekers sessie | Pretpark</title>
        <link rel="stylesheet" href="r0703044basis.css">
    </head>
    <body>
        <div class="container">
            <h1>Overzicht van de bezoekers</h1>
            <p>
                <% ArrayList<Bezoeker> bezoekers = (ArrayList<Bezoeker>) session.getAttribute("bezoekers");
                    if (bezoekers == null) {%>
            <p>U moet eerst de lijsten <span class="aandacht">opvullen</span> in de homepagina.</p>
            <%} else {
                for (int index = 0; index < bezoekers.size(); index++) {%>
            <p><%= bezoekers.get(index).toString()%> </p>
            <%}
                }%>
            <p> <a href="index.jsp">Ga terug naar de homepagina</a> </p>

        </div>
    </body>
</html>

