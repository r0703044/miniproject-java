<%-- 
    Document   : BevestigBezoeker
    Created on : 1-apr-2019, 23:03:48
    Author     : wardb
    naam       : Ward Beyens
    studentNr  : r0703044
--%>

<%@page import="fact.it.www.beans.Persoon"%>
<%@page import="fact.it.www.beans.Bezoeker"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>WELKOM bezoeker | Pretpark</title>
        <link rel="stylesheet" href="r0703044basis.css">
    </head>
    <body>
        <div class="container">
            <%Bezoeker bezoekernaam = (Bezoeker)request.getAttribute("bezoeker");%>
            <p>
                De volgende bezoeker werd geregistreerd: <%=bezoekernaam.toString()%>
            </p>
            <p>
                <%if (request.getParameter("attractieKeuze").equals("leeg")) {%>
                U heeft geen favoriet gekozen. <%
                } else {%>
                Uw wishlist = <%=bezoekernaam.getWishlist().get(0)%>
                <%}%>
                </c:if>
            </p>
            
            <p class="padding"><a href="NieuweBezoeker.jsp">bezoeker toevoegen</a></p>

            <p class="padding"><a href="index.jsp">Ga terug naar Homepagina</a></p>
        </div>
    </body>
</html>