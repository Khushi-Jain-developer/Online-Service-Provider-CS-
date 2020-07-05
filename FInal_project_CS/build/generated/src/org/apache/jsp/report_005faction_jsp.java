package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class report_005faction_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/admin_header_menu.jsp");
  }

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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body style=\"color: white; background-image: url(img/slider/slider2.jpg); background-repeat: no-repeat; background-size: cover\">\n");
      out.write("        ");
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
      out.write("\n");
      out.write("        <div style=\"width:100%; margin-top: 130px;\" >\n");
      out.write("            <div style=\"width:400px;float: left\">\n");
      out.write("                <br><br><br><br><br><br>\n");
      out.write("                <h2 align=\"center\" style=\"background-color: red;width:400px;\">Select The Report You Want To Generate</h2>\n");
      out.write("                <br><br><br>\n");
      out.write("                <center>\n");
      out.write("                    <form action=\"view_report_admin.jsp\">\n");
      out.write("                        <select name=\"s\" style=\"background-color: chartreuse;height:40px\">\n");
      out.write("                            <option selected disabled>Choose any one</option>\n");
      out.write("                            <option value=\"1\">List of registered Customers</option>\n");
      out.write("                            <option value=\"2\">List of registered Service-Providers</option>\n");
      out.write("                            <option value=\"3\">List of Services registered by different Vendors</option>\n");
      out.write("                            <option value=\"4\">List of payments given by Customers</option>\n");
      out.write("                            <option value=\"5\">List of registered feedbacks given by customer</option>\n");
      out.write("                            <option value=\"6\">List of bookings booked by customer</option>\n");
      out.write("                            <option value=\"7\">List of offers and packages offered by different Vendors</option>\n");
      out.write("                            <option value=\"8\">Admin registration Details</option>\n");
      out.write("                            <option value=\"9\">List of questions asked by vendors</option>\n");
      out.write("                            <option value=\"10\">Location details</option>\n");
      out.write("                        </select><br><br><br><br><br><br><br>\n");
      out.write("                        <input type=\"submit\" value =\"submit\" style=\"background-color: red;height:40px;color:#fff;font-size: 20px\"/>\n");
      out.write("                    </form>\n");
      out.write("                </center>\n");
      out.write("            </div>\n");
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
