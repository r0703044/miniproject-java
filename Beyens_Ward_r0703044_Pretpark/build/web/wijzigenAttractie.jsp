<%-- 
    Document   : wijzigenAttractie
    Created on : 14-mei-2019, 15:06:10
    Author     : wardb
    naam       : Ward Beyens
    studentNr  : r0703044
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="fact.it.www.beans.Personeelslid"%>
<%@page import="fact.it.www.beans.Attractie"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title> overzicht & wijzigen attractie | Pretpark</title>
        <link rel="stylesheet" href="r0703044basis.css">
        <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.8.1/css/all.css" integrity="sha384-50oBUHEmvpQ+1lW4y57PTFmhCaXp0ML5d60M1M7uH2+nqUivzIebhndOJK28anvf" crossorigin="anonymous">
    </head>
    <body>
        <% Attractie attractie = (Attractie) session.getAttribute("gevondenAttractie");%>
        <div class="container">
            <h1> overzicht & wijzigen attractie </h1>
            <br>
            <h2> Overzicht</h2>
            <br>
            <img src="images/<%= attractie.getFoto()%>.jpg" 
                 alt="<%= attractie.getFoto()%>"
                 title="Naam: <%= attractie.getNaam()%> Foto: <%= attractie.getFoto()%>"
                 width="400" onerror="this.src='images/geenFoto.jpg'">
            <p class="bijFoto"> <%= attractie.getNaam()%>
                <span class="fas fa-level-up-alt"></span></p>
            <p class="bijFoto"> Duur: <%= attractie.getDuur()%> minuten 
                <span class="fas fa-level-up-alt"></span></p>
            <p class="bijFoto"> verantwoordelijke: 
                <%= attractie.getVerantwoordelijke().getFamilienaam()%> 
                <%= attractie.getVerantwoordelijke().getVoornaam()%>
                <span class="fas fa-level-up-alt"></span></p>
            <br>
            <h2> Wijzigen van <span class="nadruk"> <%= attractie.getNaam()%></span> </h2>
            <br>
            <form action ="MaakServlet">
                <p> 
                    <label for="attractieWijzigenNaam"> De naam van de attractie wijzigen:  </label>
                    <input type="text" name="attractieWijzigenNaam" id="attractieWijzigenNaam" value="<%= attractie.getNaam()%>">
                </p>
                <p> 
                    <label for="attractieWijzigenDuur"> De duur van de attractie wijzigen:  </label>
                    <input type="text" name="attractieWijzigenDuur" id="attractieWijzigenDuur" value="<%= attractie.getDuur()%>">
                </p>
                <p> 
                    <label for="attractieWijzigenFoto"> De naam van de foto wijzigen:  </label>
                    <input type="text" name="attractieWijzigenFoto" id="attractieWijzigenFoto" value="<%= attractie.getFoto()%>">
                </p>
                <%ArrayList<Personeelslid> personeelsleden = (ArrayList<Personeelslid>) session.getAttribute("personeelsleden");%>
                <p> 
                    <label for="attractieWijzigenPersoneel"> De naam van de verantwoordelijke wijzigen:  </label>
                    <select name="attractieWijzigenPersoneel" id="attractieWijzigenPersoneel">
                        <% for (int i = 0; i < personeelsleden.size(); i++) {%>
                        <%if (personeelsleden.get(i).getFamilienaam() == attractie.getVerantwoordelijke().getFamilienaam()) {%>
                        <option value="<%=(i)%>" selected> <%=personeelsleden.get(i).getFamilienaam()%>  <%=personeelsleden.get(i).getVoornaam()%> </option>
                        <%} else {%>
                        <option value="<%=(i)%>"> <%=personeelsleden.get(i).getFamilienaam()%>  <%=personeelsleden.get(i).getVoornaam()%> </option>
                        <%}
                            }
                        %>
                    </select>
                </p>
                <p> 
                    <input type="submit" value="Wijzigen!" name="attractieWijzigen" class="verzendenCSS"> 
                </p>
            </form>
            <p> <a href="index.jsp">Ga terug naar de homepagina</a> </p>
        </div>
    </body>
</html>
