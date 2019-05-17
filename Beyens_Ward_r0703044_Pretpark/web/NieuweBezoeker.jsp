<%-- 
    Document   : NieuweBezoeker
    Created on : 1-apr-2019, 22:52:03
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
        <title>Nieuwe Bezoeker | Pretpark</title>
        <link rel="stylesheet" href="r0703044basis.css">
    </head>
    <body>
        <div class="container">
            <h1>Vul hier uw gegevens in!</h1>
            <form action ="MaakServlet">

                <p> 
                    <label for="voornaam"> Voornaam: </label>
                    <input type="text" name="voornaam" id="voornaam">
                </p>

                <p> 
                    <label for="familienaam"> Familienaam:  </label>
                    <input type="text" name="familienaam" id="familienaam">
                </p>

                </p>
                </p>
                <label for="attractieKeuze"> Voorkeur attractie: </label>
                <select name="attractieKeuze"> 
                    <option value="leeg"> </option>
                    <%
                        String[] achtbanen = {"Symbolica", "Droomvlucht", "Carnaval Festival", "Fata Morgana", "Sprookjesbos", "Baron 1898", "Python", "De Vliegende Hollander", "Joris en de Draak"};
                        for (int i = 0; i < achtbanen.length; i++) {%>
                    <option value= "<%=achtbanen[i]%>"><%=achtbanen[i]%></option>
                    <%}%>
                </select>
                </p>
                <p> Pretpark:
                </p>
                <p> 
                    <%ArrayList<Pretpark> pretparkkeuze = (ArrayList<Pretpark>)session.getAttribute("pretparken");
                        for (int index = 0; index < pretparkkeuze.size() ; index++) {%>
                    <input type="radio" 
                           name="pretparkkeuze" 
                           id="<%=index%>" 
                           value="<%=index%>">
                    &nbsp;                    
                    <label for="<%=index%>">
                        <%=pretparkkeuze.get(index).getNaam()%>
                    </label>

                </p>
                <%}%>
                <p>
                </p>
                <p> 
                    <input type="submit" value="Ga door als bezoeker zonder pretparkregistratie" name="bezoeker" class="verzendenCSS"> 
                </p>
                <p> 
                    <input type="submit" value="Ga door als bezoeker met pretparkregistratie" name="bezoekerExtra" class="verzendenCSS"> 
                </p>
            </form>
            <p> <a href="index.jsp">Ga terug naar de homepagina</a> </p>
        </div>
    </body>
</html>