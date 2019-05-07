<%-- 
    Document   : BevestigBezoeker
    Created on : 1-may-2019, 15:06:30
    Author     : wardb
    naam       : Ward Beyens
    studentNr  : r0703044
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="fact.it.www.beans.Personeelslid"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>WELKOM personeelslid | Pretpark</title>
        <link rel="stylesheet" href="r0703044basis.css">
    </head>
    <body>
        <div class="container">
            <% // Personeelslid personeel = (Personeelslid)request.getAttribute("personeelslid");
            ArrayList<Personeelslid> personeelsleden = (ArrayList<Personeelslid>)session.getAttribute("personeelsleden");
            %>
            <p>
                Hetvolgende personeelslid werd geregistreerd:</p>
            <p>
                <%= personeelsleden.get(personeelsleden.size()-1).toString()%>
            </p>  
            <p class="padding"><a href="NieuwPersoneelslid.jsp">personeelslid toevoegen</a></p>
            <p class="padding"><a href="index.jsp">Ga terug naar Homepagina</a></p>
        </div>
    </body>
</html>