package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Common.SP_bean;

public final class SP_005fheader_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<style>\r\n");
      out.write("\r\n");
      out.write("    .menu ul {\r\n");
      out.write("        font-size: 25px;\r\n");
      out.write("    }\r\n");
      out.write("</style>\r\n");
      out.write("\r\n");
      out.write("<header>\r\n");
      out.write("    <div class=\"logo\">\r\n");
      out.write("        <a href=\"index_sp.jsp\">MENU</a>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"menu\">\r\n");
      out.write("        <nav>\r\n");
      out.write("            <ul>\r\n");
      out.write("                ");

                    if (session.getAttribute("SP") != null) {
                        //SP is logged in
                        SP_bean sp = (SP_bean) session.getAttribute("SP");
                
      out.write("\r\n");
      out.write("                <li><a href=\"#\">Welcome ");
      out.print(sp.getName());
      out.write("</a></li>\r\n");
      out.write("                <li><a href=\"sp_logout.jsp\">Logout</a></li>\r\n");
      out.write("                    ");

                    } else {
                    //SP is not logged in
                    
      out.write("\r\n");
      out.write("                <li><a href=\"sp_login.jsp\">Login</a></li>\r\n");
      out.write("                <li><a href=\"sp_reg.jsp\">Register</a></li>\r\n");
      out.write("                    ");

                        }
                    
      out.write("\r\n");
      out.write("            </ul>\r\n");
      out.write("        </nav>\r\n");
      out.write("    </div><!-- menu -->\r\n");
      out.write("</header><!-- header -->");
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
