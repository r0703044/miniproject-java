package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;
import fact.it.www.beans.Pretpark;
import fact.it.www.beans.Bezoeker;

public final class OverzichtPretparkAttracties_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Overzicht Attracties| Pretpark</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"r0703044basis.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://use.fontawesome.com/releases/v5.8.1/css/all.css\" integrity=\"sha384-50oBUHEmvpQ+1lW4y57PTFmhCaXp0ML5d60M1M7uH2+nqUivzIebhndOJK28anvf\" crossorigin=\"anonymous\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"container\">\n");
      out.write("            ");
Pretpark nieuwpretpark = (Pretpark) request.getAttribute("pretpark");
      out.write("\n");
      out.write("            ");
ArrayList<Pretpark> pretparken = (ArrayList<Pretpark>) session.getAttribute("pretparken");
      out.write("\n");
      out.write("\n");
      out.write("            <h1>Overzicht van de attracties in het pretpark </h1> \n");
      out.write("            <h1><span class=\"inputTitel\">");
      out.print(pretparken.get(pretparken.size() - 1).getNaam());
      out.write("</span></h1>      \n");
      out.write("\n");
      out.write("            ");
for (int index = 0; index < pretparken.get(pretparken.size() - 1).getAttracties().size(); index++) {
      out.write("\n");
      out.write("\n");
      out.write("            <img src=\"images/");
      out.print(pretparken.get(pretparken.size() - 1).getAttracties().get(index).getNaam());
      out.write(".jpg\" \n");
      out.write("                 alt=\"");
      out.print(pretparken.get(pretparken.size() - 1).getAttracties().get(index).getNaam());
      out.write("\" \n");
      out.write("                 width=\"400\" onerror=\"this.src='images/geenFoto.jpg'\">\n");
      out.write("            <p class=\"bijFoto\"> ");
      out.print(pretparken.get(pretparken.size() - 1).getAttracties().get(index).getNaam());
      out.write(" <span class=\"fas fa-level-up-alt\"></span></p>\n");
      out.write("            <p class=\"bijFoto\"> duur: ");
      out.print( pretparken.get(pretparken.size() - 1).getAttracties().get(index).getDuur());
      out.write("\n");
      out.write("                <span class=\"fas fa-level-up-alt\"></span></p>\n");
      out.write("            <p class=\"bijFoto\"> verantwoordelijke:\n");
      out.write("                ");
      out.print( pretparken.get(pretparken.size() - 1).getAttracties().get(index).getVerantwoordelijke().getFamilienaam());
      out.write("\n");
      out.write("                 \n");
      out.write("                ");
      out.print( pretparken.get(pretparken.size() - 1).getAttracties().get(index).getVerantwoordelijke().getVoornaam());
      out.write("\n");
      out.write("                <span class=\"fas fa-level-up-alt\"></span></p>\n");
      out.write("\n");
      out.write("            ");
}
      out.write("\n");
      out.write("            <p> <a href=\"index.jsp\">Ga terug naar de homepagina</a> </p>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
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
