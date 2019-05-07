package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;
import fact.it.www.beans.Personeelslid;
import fact.it.www.beans.Pretpark;

public final class NieuweAttractie_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Nieuwe Attractie | Pretpark</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"r0703044basis.css\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
 ArrayList<Personeelslid> personeelsleden = new ArrayList<>();

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
        
      out.write("\n");
      out.write("        <div class=\"container\">                    \n");
      out.write("            ");
Pretpark nieuwepretparknaam = (Pretpark) request.getAttribute("pretpark");
      out.write("           \n");
      out.write("            <h1>Vul hier de gegevens van de nieuwe Attractie in!</h1>        \n");
      out.write("            <form action =\"MaakServlet\">              \n");
      out.write("                <p>\n");
      out.write("                    Maak een nieuwe attractie in Pretpark:\n");
      out.write("                </p>\n");
      out.write("                <p>\n");
      out.write("                    <input type=\"text\" name=\"naamPretpark\" value=\"");
      out.print(request.getParameter("naamPretpark"));
      out.write("\" id=\"naamAttractie\" class=\"inputTitel\">\n");
      out.write("                </p>\n");
      out.write("                <p> \n");
      out.write("                    <label for=\"naamAttractie\"> Naam van de nieuwe attractie: </label>\n");
      out.write("                    <input type=\"text\" name=\"naamAttractie\" id=\"naamAttractie\">\n");
      out.write("                </p>\n");
      out.write("                <p> \n");
      out.write("                    <label for=\"duur\"> Duur: </label>\n");
      out.write("                    <input type=\"text\" name=\"duur\" id=\"duur\" class=\"rechts\">\n");
      out.write("                    minuten\n");
      out.write("                </p>\n");
      out.write("\n");
      out.write("                <p> \n");
      out.write("                    <label for=\"naamFoto\"> Naam van de foto: </label>\n");
      out.write("                    <input type=\"text\" name=\"naamFoto\" id=\"naamFoto\">\n");
      out.write("                </p>\n");
      out.write("\n");
      out.write("                <p>\n");
      out.write("                    <select name=\"personeelsleden\">\n");
      out.write("                        ");
 for (int index = 0; index < personeelsleden.size(); index++) {
      out.write("\n");
      out.write("                        <option value=\"");
      out.print((index));
      out.write('"');
      out.write('>');
      out.print(personeelsleden.get(index));
      out.write(" </option>\n");
      out.write("                        ");
}
      out.write("\n");
      out.write("                    </select>\n");
      out.write("                </p>\n");
      out.write("\n");
      out.write("                <p> \n");
      out.write("                    <input type=\"submit\" value=\"Verzenden!\" name=\"nieuweAttractie\" class=\"verzendenCSS\"> \n");
      out.write("                </p>\n");
      out.write("            </form>\n");
      out.write("            <p> <a href=\"index.jsp\">Ga terug naar de homepagina</a> </p>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
