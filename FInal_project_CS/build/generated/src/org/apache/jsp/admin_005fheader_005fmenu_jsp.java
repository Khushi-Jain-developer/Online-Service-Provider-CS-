package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class admin_005fheader_005fmenu_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<div style=\" height:180px;\n");
      out.write("     position:fixed;\n");
      out.write("     background:#505050;\n");
      out.write("     width:100%;\n");
      out.write("     margin-left:-8px;\n");
      out.write("     top:0;\">\n");
      out.write("    <br><p style=\"color:#fff;\" align=\"right\">Last Updated : ");
      out.print( new java.util.Date());
      out.write("</p>\n");
      out.write("    <h1 style=\"color:blue;\n");
      out.write("        font-size:30px;\n");
      out.write("        margin-top:25px;\n");
      out.write("        margin-left:60px;\n");
      out.write("        display:block;\n");
      out.write("        text-decoration:none;\" align=\"left\"><a href=\"index_admin.jsp\">MENU</a></h1>\n");
      out.write("    <h1 style=\"color:#fff;\n");
      out.write("        text-decoration:none;\n");
      out.write("        margin-left:10px;\n");
      out.write("        margin-right:10px;\" align=\"right\">Welcome In Admin-Panel</h1><br>\n");
      out.write("\n");
      out.write("</div>\n");
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
