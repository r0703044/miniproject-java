package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;
import fact.it.www.beans.Pretpark;

public final class OverzichtPretparken_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Overzicht Pretparken sessie | Pretpark</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"r0703044basis.css\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <h1>Overzicht van de pretparken</h1>\n");
      out.write("            <p>\n");
      out.write("                ");
 ArrayList<Pretpark> pretparken = (ArrayList<Pretpark>) session.getAttribute("pretparken");
                    if (pretparken == null) {
      out.write("\n");
      out.write("            <p>U moet eerst de lijsten <span class=\"aandacht\">opvullen</span> in de homepagina.</p>\n");
      out.write("            ");
} else {
                for (int index = 0; index < pretparken.size(); index++) {
      out.write("\n");
      out.write("\n");
      out.write("            <form action =\"MaakServlet.java\">\n");
      out.write("                <br>\n");
      out.write("                <p> \n");
      out.write("                    <input type=\"submit\" value=\"");
      out.print( pretparken.get(index).getNaam());
      out.write("\" name=\"");
      out.print( pretparken.get(index).getNaam());
      out.write("\" class=\"verzendenCSS\"> \n");
      out.write("                </p>\n");
      out.write("            </form>\n");
      out.write("            ");
}
                }
      out.write("\n");
      out.write("            <p> <a href=\"index.jsp\">Ga terug naar de homepagina</a> </p>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
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
