package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;
import fact.it.www.beans.Personeelslid;
import fact.it.www.beans.Attractie;

public final class wijzigenAttractie_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title> overzicht & wijzigen attractie | Pretpark</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"r0703044basis.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://use.fontawesome.com/releases/v5.8.1/css/all.css\" integrity=\"sha384-50oBUHEmvpQ+1lW4y57PTFmhCaXp0ML5d60M1M7uH2+nqUivzIebhndOJK28anvf\" crossorigin=\"anonymous\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
 Attractie attractie = (Attractie) session.getAttribute("gevondenAttractie");
      out.write("\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <h1> overzicht & wijzigen attractie </h1>\n");
      out.write("            <br>\n");
      out.write("            <h2> Overzicht</h2>\n");
      out.write("            <br>\n");
      out.write("            <img src=\"images/");
      out.print( attractie.getFoto());
      out.write(".jpg\" \n");
      out.write("                 alt=\"");
      out.print( attractie.getFoto());
      out.write("\"\n");
      out.write("                 title=\"Naam: ");
      out.print( attractie.getNaam());
      out.write(" Foto: ");
      out.print( attractie.getFoto());
      out.write("\"\n");
      out.write("                 width=\"400\" onerror=\"this.src='images/geenFoto.jpg'\">\n");
      out.write("            <p class=\"bijFoto\"> ");
      out.print( attractie.getNaam());
      out.write("\n");
      out.write("                <span class=\"fas fa-level-up-alt\"></span></p>\n");
      out.write("            <p class=\"bijFoto\"> Duur: ");
      out.print( attractie.getDuur());
      out.write(" minuten \n");
      out.write("                <span class=\"fas fa-level-up-alt\"></span></p>\n");
      out.write("            <p class=\"bijFoto\"> verantwoordelijke: \n");
      out.write("                ");
      out.print( attractie.getVerantwoordelijke().getFamilienaam());
      out.write(" \n");
      out.write("                ");
      out.print( attractie.getVerantwoordelijke().getVoornaam());
      out.write("\n");
      out.write("                <span class=\"fas fa-level-up-alt\"></span></p>\n");
      out.write("            <br>\n");
      out.write("            <h2> Wijzigen van <span class=\"nadruk\"> ");
      out.print( attractie.getNaam());
      out.write("</span> </h2>\n");
      out.write("            <br>\n");
      out.write("            <form action =\"MaakServlet\">\n");
      out.write("                <p> \n");
      out.write("                    <label for=\"attractieWijzigenNaam\"> De naam van de attractie wijzigen:  </label>\n");
      out.write("                    <input type=\"text\" name=\"attractieWijzigenNaam\" id=\"attractieWijzigenNaam\" value=\"");
      out.print( attractie.getNaam());
      out.write("\">\n");
      out.write("                </p>\n");
      out.write("                <p> \n");
      out.write("                    <label for=\"attractieWijzigenDuur\"> De duur van de attractie wijzigen:  </label>\n");
      out.write("                    <input type=\"text\" name=\"attractieWijzigenDuur\" id=\"attractieWijzigenDuur\" value=\"");
      out.print( attractie.getDuur());
      out.write("\">\n");
      out.write("                </p>\n");
      out.write("                <p> \n");
      out.write("                    <label for=\"attractieWijzigenFoto\"> De naam van de foto wijzigen:  </label>\n");
      out.write("                    <input type=\"text\" name=\"attractieWijzigenFoto\" id=\"attractieWijzigenFoto\" value=\"");
      out.print( attractie.getFoto());
      out.write("\">\n");
      out.write("                </p>\n");
      out.write("                ");
ArrayList<Personeelslid> personeelsleden = (ArrayList<Personeelslid>) session.getAttribute("personeelsleden");
      out.write("\n");
      out.write("                <p> \n");
      out.write("                    <label for=\"attractieWijzigenPersoneel\"> De naam van de verantwoordelijke wijzigen:  </label>\n");
      out.write("                    <select name=\"attractieWijzigenPersoneel\" id=\"attractieWijzigenPersoneel\">\n");
      out.write("                        ");
 for (int i = 0; i < personeelsleden.size(); i++) {
      out.write("\n");
      out.write("                        ");
if (personeelsleden.get(i).getFamilienaam() == attractie.getVerantwoordelijke().getFamilienaam()) {
      out.write("\n");
      out.write("                        <option value=\"");
      out.print((i));
      out.write("\" selected> ");
      out.print(personeelsleden.get(i).getFamilienaam());
      out.write(' ');
      out.write(' ');
      out.print(personeelsleden.get(i).getVoornaam());
      out.write(" </option>\n");
      out.write("                        ");
} else {
      out.write("\n");
      out.write("                        <option value=\"");
      out.print((i));
      out.write("\"> ");
      out.print(personeelsleden.get(i).getFamilienaam());
      out.write(' ');
      out.write(' ');
      out.print(personeelsleden.get(i).getVoornaam());
      out.write(" </option>\n");
      out.write("                        ");
}
                            }
                        
      out.write("\n");
      out.write("                    </select>\n");
      out.write("                </p>\n");
      out.write("                <p> \n");
      out.write("                    <input type=\"submit\" value=\"Wijzigen!\" name=\"attractieWijzigen\" class=\"verzendenCSS\"> \n");
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
