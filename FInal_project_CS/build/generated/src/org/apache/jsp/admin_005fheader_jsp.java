package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class admin_005fheader_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    body{\r\n");
      out.write("        margin :0;\r\n");
      out.write("        padding: 0;\r\n");
      out.write("        font-family:verdana,san-serif,Geneva;\r\n");
      out.write("        font-size:30px;\r\n");
      out.write("    }\r\n");
      out.write("    header {\r\n");
      out.write("        height:150px;\r\n");
      out.write("        position:fixed;\r\n");
      out.write("        background:#505050;\r\n");
      out.write("        width:100%;\r\n");
      out.write("        top:0;}\r\n");
      out.write("    .logo {\r\n");
      out.write("        float:left;\r\n");
      out.write("        margin-left:10%;\r\n");
      out.write("    }\r\n");
      out.write("    .logo a {\r\n");
      out.write("        color:blue;\r\n");
      out.write("        font-size:30px;\r\n");
      out.write("        margin-top:25px;\r\n");
      out.write("        display:block;\r\n");
      out.write("        text-decoration:none;\r\n");
      out.write("    }.menu {\r\n");
      out.write("        float:right;\r\n");
      out.write("        margin-right:10%;\r\n");
      out.write("        margin-top:35px;\r\n");
      out.write("    }\r\n");
      out.write("    .menu ul {\r\n");
      out.write("        margin:0px;\r\n");
      out.write("        padding:0px;\r\n");
      out.write("        list-style:none;\r\n");
      out.write("    }\r\n");
      out.write("    .menu ul li {\r\n");
      out.write("        float:left;\r\n");
      out.write("    }\r\n");
      out.write("    .menu ul li a {\r\n");
      out.write("        color:#fff;\r\n");
      out.write("        text-decoration:none;\r\n");
      out.write("        margin-left:10px;\r\n");
      out.write("        margin-right:10px;\r\n");
      out.write("    }\r\n");
      out.write("</style>\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body class=\"admin_header\">\r\n");
      out.write("    <header ><div class=\"logo\">\r\n");
      out.write("            <a href=\"index_admin.jsp\">MENU</a></div>\r\n");
      out.write("        <div class=\"menu\">\r\n");
      out.write("            <p style=\"color:#fff;font-size: 30px\">Welcome In Admin-Panel</p>\r\n");
      out.write("        </div><!-- menu -->\r\n");
      out.write("    </header><!-- header -->\r\n");
      out.write("</body>");
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
