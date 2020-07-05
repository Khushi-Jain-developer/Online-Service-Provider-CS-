package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class sp_005flogin_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>Log In Page</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/Userlogin.css\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <form action=\"Controller/login_Sp_controller.jsp\" method=\"post\">\n");
      out.write("            <h1 style=\"color:#fff\"> Log in</h1>\n");
      out.write("            <div class=\"inset\">\n");
      out.write("                <p>\n");
      out.write("                    <label for=\"email\">EMAIL ADDRESS</label>\n");
      out.write("                    <input type=\"text\" name=\"email\" id=\"email\" style=\"color:#fff\">\n");
      out.write("                </p>\n");
      out.write("                <p>\n");
      out.write("                    <label for=\"password\">PASSWORD</label>\n");
      out.write("                    <input type=\"password\" name=\"password\" id=\"password\" style=\"color:#fff\">\n");
      out.write("                </p>\n");
      out.write("                <p>\n");
      out.write("                    <input type=\"checkbox\" name=\"remember\" id=\"remember\">\n");
      out.write("                    <label for=\"remember\">Remember me</label>\n");
      out.write("                </p>\n");
      out.write("            </div>\n");
      out.write("            <p class=\"p-container\">\n");
      out.write("                <span>Forgot password ?</span>\n");
      out.write("                <input type=\"submit\" name=\"go\" id=\"go\" value=\"Log in\">\n");
      out.write("            </p>\n");
      out.write("            <p class=\"p-container\"> <span class=\"right\"><a href=\"sp_login_reg.jsp\"><strong>Back to page</strong> </a>\n");
      out.write("                </span>\n");
      out.write("            </p>\n");
      out.write("        </form>\n");
      out.write("    </body>\n");
      out.write("\n");
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
