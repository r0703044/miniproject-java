<%-- 
    Document   : overzicht
    Created on : 23-apr-2019, 21:17:01
    Author     : wardb
    naam       : Ward Beyens
    studentNr  : r0703044
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="fact.it.www.beans.Pretpark"%>
<%@page import="fact.it.www.beans.Bezoeker"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Overzicht Attracties| Pretpark</title>
        <link rel="stylesheet" href="r0703044basis.css">
        <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.8.1/css/all.css" integrity="sha384-50oBUHEmvpQ+1lW4y57PTFmhCaXp0ML5d60M1M7uH2+nqUivzIebhndOJK28anvf" crossorigin="anonymous">
    </head>
    <body>
        <div class="container">
            <%Pretpark nieuwpretpark = (Pretpark) request.getAttribute("pretpark");%>
            <%ArrayList<Pretpark> pretparken = (ArrayList<Pretpark>) session.getAttribute("pretparken");
            Integer gekozenIndex = (Integer) request.getAttribute("gekozenIndex"); %>

            <h1>Overzicht van de attracties in het pretpark </h1> 
            <h1><span class="inputTitel"><%=pretparken.get(gekozenIndex).getNaam()%></span></h1>      

            <%for (int index = 0; index < pretparken.get(gekozenIndex).getAttracties().size(); index++) {%>

            <img src="images/<%=pretparken.get(gekozenIndex).getAttracties().get(index).getFoto()%>.jpg" 
                 alt="<%=pretparken.get(gekozenIndex).getAttracties().get(index).getFoto()%>" 
                 width="400" onerror="this.src='images/geenFoto.jpg'">
            <p class="bijFoto"> <%=pretparken.get(gekozenIndex).getAttracties().get(index).getNaam()%> <span class="fas fa-level-up-alt"></span></p>
            <p class="bijFoto"> duur: <%= pretparken.get(gekozenIndex).getAttracties().get(index).getDuur()%> minuten
                <span class="fas fa-level-up-alt"></span></p>
            <p class="bijFoto"> verantwoordelijke:
                <%= pretparken.get(gekozenIndex).getAttracties().get(index).getVerantwoordelijke().getFamilienaam()%>
                 
                <%= pretparken.get(gekozenIndex).getAttracties().get(index).getVerantwoordelijke().getVoornaam()%>
                <span class="fas fa-level-up-alt"></span></p>

            <%}%>
            <p> <a href="index.jsp">Ga terug naar de homepagina</a> </p>
        </div>
    </body>
</html>

