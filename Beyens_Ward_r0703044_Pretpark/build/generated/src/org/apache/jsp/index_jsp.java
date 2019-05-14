package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write(" \n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Pretpark Ward Beyens</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"r0703044basis.css\">\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body>\n");
      out.write("        <div class=\"container\" style=\"width: 80vw\">\n");
      out.write("            <h1>Pretpark Ward Beyens</h1>\n");
      out.write("            <p>Welkom op mijn MINIproject over mijn eigen gemaakte pretpark!</p>\n");
      out.write("            <img src=\"images/Pretpark.jpg\" alt=\"pretpark foto\">\n");
      out.write("            <p class=\"meer\">\n");
      out.write("                <a href=\"NieuweBezoeker.jsp\"> nieuwe bezoeker </a>\n");
      out.write("                <a href=\"NieuwPretpark.jsp\"> nieuw Pretpark </a>\n");
      out.write("            </p>\n");
      out.write("            <p class=\"meer\">\n");
      out.write("                <a href=\"NieuwPersoneelslid.jsp\"> nieuw Personeelslid </a>\n");
      out.write("                <a href=\"OpvulServlet\"> <span class=\"aandachtextra\">opvullen</span>  </a>\n");
      out.write("            </p>\n");
      out.write("            <p class=\"meer\">\n");
      out.write("                <a href=\"OverzichtBezoekers.jsp\"> overzicht bezoekers </a>\n");
      out.write("                <a href=\"OverzichtPretparken.jsp\"> overzicht pretparken </a>\n");
      out.write("            </p>\n");
      out.write("            <br>\n");
      out.write("            <br>\n");
      out.write("            <hr>\n");
      out.write("            <h2>Attractie zoeken </h2>\n");
      out.write("            <form action =\"MaakServlet\">\n");
      out.write("                <p> \n");
      out.write("                    <label for=\"attractieZoekenNaam\"> De naam van de attractie die u wilt zoeken:  </label>\n");
      out.write("                    <input type=\"text\" name=\"attractieZoekenNaam\" id=\"attractieZoekenNaam\">\n");
      out.write("                </p>\n");
      out.write("                <p> \n");
      out.write("                    <input type=\"submit\" value=\"Zoeken!\" name=\"attractieZoeken\" class=\"verzendenCSS\"> \n");
      out.write("                </p>\n");
      out.write("            </form>\n");
      out.write("            <footer>\n");
      out.write("                <p>&copy; Ward Beyens</p>\n");
      out.write("            </footer>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("\n");
      out.write("</html>\n");
      out.write("\n");
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
