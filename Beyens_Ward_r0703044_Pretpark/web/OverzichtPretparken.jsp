<%-- 
    Document   : OverzichtPretparken
    Created on : 2-mei-2019, 18:55:53
    Author     : wardb
    naam       : Ward Beyens
    studentNr  : r0703044
--%>
<%@page import="java.util.ArrayList"%>
<%@page import="fact.it.www.beans.Pretpark"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Overzicht Pretparken sessie | Pretpark</title>
        <link rel="stylesheet" href="r0703044basis.css">
    </head>
    <body>
        <div class="container">
            <h1>Overzicht van de pretparken</h1>
            <p>
                <% ArrayList<Pretpark> pretparken = (ArrayList<Pretpark>) session.getAttribute("pretparken");
                    if (pretparken == null) {%>
            <p>U moet eerst de lijsten <span class="aandacht">opvullen</span> in de homepagina.</p>
            <%} else {
                for (int index = 0; index < pretparken.size(); index++) {%>

            <form action ="MaakServlet">
                <p> 
                    <button type="submit" value="<%= index%>" name="overzichtPretparken" class="verzendenCSS"> <%= pretparken.get(index).getNaam()%> </button>
                </p>
            </form>
            <%}
                }%>
            <p> <a href="index.jsp">Ga terug naar de homepagina</a> </p>
        </div>
    </body>
</html>


