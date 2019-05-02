package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class NieuweBezoeker_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Nieuwe Bezoeker | Pretpark</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"r0703044basis.css\">\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <h1>Vul hier uw gegevens in!</h1>\n");
      out.write("            <form action =\"MaakServlet\">\n");
      out.write("\n");
      out.write("                <p> \n");
      out.write("                    <label for=\"voornaam\"> Voornaam: </label>\n");
      out.write("                    <input type=\"text\" name=\"voornaam\" id=\"voornaam\">\n");
      out.write("                </p>\n");
      out.write("\n");
      out.write("                <p> \n");
      out.write("                    <label for=\"familienaam\"> Familienaam:  </label>\n");
      out.write("                    <input type=\"text\" name=\"familienaam\" id=\"familienaam\">\n");
      out.write("                </p>\n");
      out.write("\n");
      out.write("                </p>\n");
      out.write("                <input type=\"checkbox\" name=\"eerstekeer\" value=\"eerstekeer\" id=\"eerstekeer\"> \n");
      out.write("                <label for=\"eerstekeer\">Ik heb het pretpark al eens bezocht</label>\n");
      out.write("                </p>\n");
      out.write("\n");
      out.write("                </p>\n");
      out.write("                <label for=\"attractieKeuze\"> Voorkeur attractie: </label>\n");
      out.write("                <select name=\"attractieKeuze\"> \n");
      out.write("                    <option value=\"leeg\"> </option>\n");
      out.write("                    ");

                        String[] achtbanen = {"Symbolica", "Droomvlucht", "Carnaval Festival", "Fata Morgana", "Sprookjesbos", "Baron 1898", "Python", "De Vliegende Hollander", "Joris en de Draak"};
                        for (int i = 0; i < achtbanen.length; i++) {
      out.write("\n");
      out.write("                    <option value= \"");
      out.print(achtbanen[i]);
      out.write('"');
      out.write('>');
      out.print(achtbanen[i]);
      out.write("</option>\n");
      out.write("                    ");
}
      out.write("\n");
      out.write("                </select>\n");
      out.write("                </p>\n");
      out.write("\n");
      out.write("                <p> Pretpark: \n");
      out.write("                    ");
String[] pretparkkeuze = {"Efteling", "Bobbejaanland", "Walibi", "Fantasialand", "Plopsaland"};
                            for (int index = 0; index < pretparkkeuze.length; index++) {
      out.write("\n");
      out.write("                    <input type=\"radio\" \n");
      out.write("                           name=\"pretparkkeuze\" \n");
      out.write("                           id=\"");
      out.print(pretparkkeuze[index]);
      out.write("\" \n");
      out.write("                           value=\"");
      out.print(pretparkkeuze[index]);
      out.write("\">\n");
      out.write("                    &nbsp;                    \n");
      out.write("                    <label for=\"");
      out.print(pretparkkeuze[index]);
      out.write("\">\n");
      out.write("                        ");
      out.print(pretparkkeuze[index]);
      out.write("\n");
      out.write("                    </label>\n");
      out.write("                    ");
}
      out.write("\n");
      out.write("                </p>\n");
      out.write("                <p>\n");
      out.write("                </p>\n");
      out.write("                <p> \n");
      out.write("                    <input type=\"submit\" value=\"Ga door als bezoeker zonder pretparkregistratie\" name=\"bezoeker\" class=\"verzendenCSS\"> \n");
      out.write("                </p>\n");
      out.write("            </form>\n");
      out.write("            <p> <a href=\"index.jsp\">Ga terug naar de homepagina</a> </p>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("</html>");
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
