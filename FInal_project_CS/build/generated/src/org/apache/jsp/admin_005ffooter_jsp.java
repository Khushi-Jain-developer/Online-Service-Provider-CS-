package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class admin_005ffooter_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\r\n");
      out.write("<style>\r\n");
      out.write("    footer {\r\n");
      out.write("        margin-left: -10px;\r\n");
      out.write("        width:100%;\r\n");
      out.write("        height:120px;\r\n");
      out.write("        background:#505050;\r\n");
      out.write("        text-align:center;\r\n");
      out.write("        color:#fff;\r\n");
      out.write("        font-size: 20px;\r\n");
      out.write("    }\r\n");
      out.write("    .copyright p {\r\n");
      out.write("        margin:0;\r\n");
      out.write("        text-align:center;\r\n");
      out.write("        line-height:100px;\r\n");
      out.write("\r\n");
      out.write("    }\r\n");
      out.write("</style>\t\r\n");
      out.write("    <!-- Footer -->\r\n");
      out.write("    <footer>    \r\n");
      out.write("        <p>Last Updated : ");
      out.print( new java.util.Date());
      out.write("</p>\r\n");
      out.write("        <p class=\"copyright\">&copy; 2019 Copyright, All Rights Reserved</p>\r\n");
      out.write("    </footer><!-- footer -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
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
