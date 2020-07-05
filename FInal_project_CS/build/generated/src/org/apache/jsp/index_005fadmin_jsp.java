package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_005fadmin_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/admin_header.jsp");
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
      response.setContentType("text/html; charset=ISO-8859-1");
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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <title>Insert title here</title>\r\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css?family=Poppins:300,400,500,600,700,800,900\" rel=\"stylesheet\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/style_1.css\">\r\n");
      out.write("\r\n");
      out.write("    </head>\r\n");
      out.write("    <body style =\"background-image: url(img/background/des.jpg); background-repeat: no-repeat; background-size: cover\">\r\n");
      out.write("        ");
      out.write("        <style>\r\n");
      out.write("            body{\r\n");
      out.write("                margin :0;\r\n");
      out.write("                padding: 0;\r\n");
      out.write("                font-family:verdana,san-serif,Geneva;\r\n");
      out.write("                font-size:30px;\r\n");
      out.write("            }\r\n");
      out.write("            header {\r\n");
      out.write("                height:150px;\r\n");
      out.write("                position:fixed;\r\n");
      out.write("                background:#505050;\r\n");
      out.write("                width:100%;\r\n");
      out.write("                top:0;}\r\n");
      out.write("            .logo {\r\n");
      out.write("                float:left;\r\n");
      out.write("                margin-left:10%;\r\n");
      out.write("            }\r\n");
      out.write("            .logo a {\r\n");
      out.write("                color:blue;\r\n");
      out.write("                font-size:30px;\r\n");
      out.write("                margin-top:25px;\r\n");
      out.write("                display:block;\r\n");
      out.write("                text-decoration:none;\r\n");
      out.write("            }.menu {\r\n");
      out.write("                float:right;\r\n");
      out.write("                margin-right:10%;\r\n");
      out.write("                margin-top:35px;\r\n");
      out.write("            }\r\n");
      out.write("            .menu ul {\r\n");
      out.write("                margin:0px;\r\n");
      out.write("                padding:0px;\r\n");
      out.write("                list-style:none;\r\n");
      out.write("            }\r\n");
      out.write("            .menu ul li {\r\n");
      out.write("                float:left;\r\n");
      out.write("            }\r\n");
      out.write("            .menu ul li a {\r\n");
      out.write("                color:#fff;\r\n");
      out.write("                text-decoration:none;\r\n");
      out.write("                margin-left:10px;\r\n");
      out.write("                margin-right:10px;\r\n");
      out.write("            }\r\n");
      out.write("            \r\n");
      out.write("\r\n");
      out.write("        </style>\r\n");
      out.write("        <title>Insert title here</title>\r\n");
      out.write("\r\n");
      out.write("    </head>\r\n");
      out.write("    <body class=\"admin_header\">\r\n");
      out.write("    <header ><div class=\"logo\">\r\n");
      out.write("            <a href=\"index_admin.jsp\">MENU</a></div>\r\n");
      out.write("        <div class=\"menu\">\r\n");
      out.write("            <p style=\"color:#fff;font-size: 30px\">Welcome In Admin-Panel</p>\r\n");
      out.write("        </div><!-- menu -->\r\n");
      out.write("    </header><!-- header -->\r\n");
      out.write("    </body>");
      out.write("\r\n");
      out.write("        <div class=\"wrapper d-flex align-items-stretch\" >\r\n");
      out.write("\r\n");
      out.write("            <nav id=\"sidebar\">\r\n");
      out.write("                <!--button of 3 lines-->\r\n");
      out.write("                <div class=\"custom-menu\">\r\n");
      out.write("                    <button type=\"button\" id=\"sidebarCollapse\" class=\"btn btn-primary\">\r\n");
      out.write("                        <i class=\"fa fa-bars\"></i>\r\n");
      out.write("                        <span class=\"sr-only\">Toggle Menu</span>\r\n");
      out.write("                    </button>\r\n");
      out.write("                </div>\r\n");
      out.write("                <!--end of btn-->\r\n");
      out.write("                <h1 style=\"font-style:san-serif;text-align:center;margin-top:12px;font-size:15px\"></h1>\r\n");
      out.write("                <h1 style=\"text-align:center\"><a href=\"#\" class=\"logo\">Dashboard</a></h1>\r\n");
      out.write("                <ul class=\"list-unstyled components mb-5\">\r\n");
      out.write("                    <li class=\"active\"><a href=\"index_admin.jsp\"><span class=\"fa fa-paper-plane mr-3\"></span>Home Page</a></li>\r\n");
      out.write("                    <li><a href=\"category_action.jsp\"><span class=\"fa fa-paper-plane mr-3\"></span>Category</a></li>\r\n");
      out.write("                    <li><a href=\"services_admin.jsp\"><span class=\"fa fa-paper-plane mr-3\"></span>Services</a></li>\r\n");
      out.write("                    <li><a href=\"bookingDetails_admin.jsp\"><span class=\"fa fa-paper-plane mr-3\"></span>Booking-Details</a></li>\r\n");
      out.write("                    <li><a href=\"reviews_admin.jsp\"><span class=\"fa fa-paper-plane mr-3\"></span>Reviews</a></li>\r\n");
      out.write("                    <li><a href=\"query_admin.jsp\"><span class=\"fa fa-paper-plane mr-3\"></span>Customer-Speaks</a></li>\r\n");
      out.write("                    <li><a href=\"report_action.jsp\"><span class=\"fa fa-paper-plane mr-3\"></span>Report</a></li>\r\n");
      out.write("                </ul>\r\n");
      out.write("            </nav>\r\n");
      out.write("            <!-- Page Content  -->\r\n");
      out.write("            <div id=\"content\" class=\"p-4 p-md-5 pt-5\"><h2 class=\"mb-4\" style=\"margin-top: 100px\">Welcome in City-Sermon</h2>\r\n");
      out.write("                <p style=\"color:#fff;font-size:15px;\">It is an online platform that connect users with the professionals service provider in their near by area.</p>\r\n");
      out.write("                <p style=\"color:#fff;font-size:15px;\">These are all On-demand sevice provide application who provide the services to the local clients and making good revenue for the business.This type of app supports the online transactions,GPS location and provide call/SMS notification to service providers.It also maintains the history of service provider offered by local vendors.With on-demand services,local vendors easily get work and client get good services on the spot.</p>\r\n");
      out.write("            </div>\r\n");
      out.write("            <script src=\"js/jquery.min.js\"></script>\r\n");
      out.write("            <script src=\"js/popper.js\"></script>\r\n");
      out.write("            <script src=\"js/bootstrap.min.js\"></script>\r\n");
      out.write("            <script src=\"js/main.js\"></script>\r\n");
      out.write("        </div>\r\n");
      out.write("    </body>\r\n");
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
