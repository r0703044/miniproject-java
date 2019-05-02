package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import fact.it.www.beans.Persoon;
import fact.it.www.beans.Bezoeker;

public final class BevestigBezoeker_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Bevestiging Bezoeker</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"r0703044basis.css\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"container\">\n");
      out.write("            ");
Bezoeker bezoekerservlet = (Bezoeker) request.getAttribute("bezoeker");
      out.write("\n");
      out.write("            <p>\n");
      out.write("                De volgende bezoeker werd geregistreerd: ");
      out.print(bezoekerservlet.toString());
      out.write("\n");
      out.write("            </p>   \n");
      out.write("            <p>\n");
      out.write("                ");
if (request.getParameter("gekozen").equals("geen")) {
      out.write("\n");
      out.write("                U heeft geen favoriet gekozen ");

                } else {
      out.write("\n");
      out.write("                Uw wishlist = ");
      out.print(bezoekerservlet.getWishlist().get(0));
      out.write("\n");
      out.write("                ");
}
      out.write("\n");
      out.write("                </c:if>\n");
      out.write("            </p>\n");
      out.write("            \n");
      out.write("            <p><a href=\"Nieuwebezoeker.jsp\">Ga terug naar de NieuweBezoekerpagina</a></p>\n");
      out.write("\n");
      out.write("            <p><a href=\"index.jsp\">Ga terug naar Homepagina</a></p>\n");
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
