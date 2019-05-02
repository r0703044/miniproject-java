<%-- 
    Document   : NieuweAttractie
    Created on : 2-apr-2019, 15:07:39
    Author     : wardb
    naam       : Ward Beyens
    studentNr  : r0703044
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="fact.it.www.beans.Personeelslid"%>
<%@page import="fact.it.www.beans.Pretpark"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Nieuwe Attractie | Pretpark</title>
        <link rel="stylesheet" href="r0703044basis.css">
    </head>
    <body>
        <% ArrayList<Personeelslid> personeelsleden = new ArrayList<>();

            Personeelslid personeelslid1 = new Personeelslid("Tony", "Stark");
            Personeelslid personeelslid2 = new Personeelslid("Bruce", "Banner");
            Personeelslid personeelslid3 = new Personeelslid("Natasha", "Romanov");
            Personeelslid personeelslidEerste = new Personeelslid("Gertje", "Optnippertje");
            Personeelslid personeelslidTweede = new Personeelslid("Thibaut", "Defrisco");
            Personeelslid personeelslidDerde = new Personeelslid("Knapen", "Dokter");
            personeelsleden.add(personeelslid1);
            personeelsleden.add(personeelslid2);
            personeelsleden.add(personeelslid3);
            personeelsleden.add(personeelslidEerste);
            personeelsleden.add(personeelslidTweede);
            personeelsleden.add(personeelslidDerde);
        %>
        <div class="container">                    
            <%Pretpark nieuwepretparknaam = (Pretpark) request.getAttribute("pretpark");%>           
            <h1>Vul hier de gegevens van de nieuwe Attractie in!</h1>        
            <form action ="MaakServlet">              
                <p>
                    Maak een nieuwe attractie in Pretpark:
                </p>
                <p>
                    <input type="text" name="naamPretpark" value="<%=request.getParameter("naamPretpark")%>" id="naamAttractie" class="inputTitel">
                </p>
                <p> 
                    <label for="naamAttractie"> Naam van de nieuwe attractie: </label>
                    <input type="text" name="naamAttractie" id="naamAttractie">
                </p>
                <p> 
                    <label for="duur"> Duur: </label>
                    <input type="text" name="duur" id="duur" class="rechts">
                    minuten
                </p>

                <p> 
                    <label for="naamFoto"> Naam van de foto: </label>
                    <input type="text" name="naamFoto" id="naamFoto">
                </p>

                <p>
                    <select name="personeelsleden">
                        <% for (int index = 0; index < personeelsleden.size(); index++) {%>
                        <option value="<%=(index)%>"><%=personeelsleden.get(index)%> </option>
                        <%}%>
                    </select>
                </p>

                <p> 
                    <input type="submit" value="Verzenden!" name="nieuweAttractie" class="verzendenCSS"> 
                </p>
            </form>
            <p> <a href="index.jsp">Ga terug naar de homepagina</a> </p>
        </div>
    </body>
</html>
