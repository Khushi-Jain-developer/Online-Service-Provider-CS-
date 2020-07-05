package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_005fadmin_005flogin_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/admin_header.jsp");
    _jspx_dependants.add("/adminlogin_form.jsp");
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

      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"ISO-8859-1\">\n");
      out.write("        <title>Insert title here</title>\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css?family=Poppins:300,400,500,600,700,800,900\" rel=\"stylesheet\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/main.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/style_1.css\">\n");
      out.write("        <style>\n");
      out.write("            #admin_form{\n");
      out.write("                margin-left: 100px;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"wrapper d-flex align-items-stretch\" style=\"margin-top:-30px;\" >\n");
      out.write("            ");
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
      out.write("\n");
      out.write("            <nav id=\"sidebar\">\n");
      out.write("                <div class=\"custom-menu\"><button type=\"button\" id=\"sidebarCollapse\" class=\"btn btn-primary\">\n");
      out.write("                        <i class=\"fa fa-bars\"></i>\n");
      out.write("                        <span class=\"sr-only\">Toggle Menu</span>\n");
      out.write("                    </button></div>\n");
      out.write("                <h1 style=\"font-style:san-serif;text-align:center;margin-top:12px;color:#fff;font-size:15px\">\n");
      out.write("                </h1>\n");
      out.write("                <h1 style=\"text-align:center\"><a href=\"#\" class=\"logo\">Dashboard</a></h1>\n");
      out.write("                <ul class=\"list-unstyled components mb-5\">\n");
      out.write("                    <li class=\"active\"><a href=\"#\"><span class=\"fa fa-paper-plane mr-3\"></span>Home Page</a></li>\n");
      out.write("                    <li><a href=\"#\"><span class=\"fa fa-paper-plane mr-3\"></span>Category</a></li>\n");
      out.write("                    <li><a href=\"#\"><span class=\"fa fa-paper-plane mr-3\"></span>Services</a></li>\n");
      out.write("                    <li><a href=\"#\"><span class=\"fa fa-paper-plane mr-3\"></span>Booking-Details</a></li>\n");
      out.write("                    <li><a href=\"#\"><span class=\"fa fa-paper-plane mr-3\"></span>Payment Details</a></li>\n");
      out.write("                    <li><a href=\"#\"><span class=\"fa fa-paper-plane mr-3\"></span>Reviews</a></li>\n");
      out.write("                    <li><a href=\"#\"><span class=\"fa fa-paper-plane mr-3\"></span>Customer-Speaks</a></li>\n");
      out.write("                    <li><a href=\"#\"><span class=\"fa fa-paper-plane mr-3\"></span>Report</a></li>\n");
      out.write("                </ul>\n");
      out.write("            </nav>\n");
      out.write("            <!-- Page Content  -->\n");
      out.write("            <div style=\"margin-left:500px;\">\n");
      out.write("                ");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <title>Log In Page</title>\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/Userlogin.css\">\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        <form action=\"Controller/login_admin_controller.jsp\" method=\"get\">\r\n");
      out.write("            <h1 style=\"color:#fff\"> Log in</h1>\r\n");
      out.write("            <div class=\"inset\">\r\n");
      out.write("                <p>\r\n");
      out.write("                    <label for=\"email\">EMAIL ADDRESS</label>\r\n");
      out.write("                    <input type=\"text\" name=\"email\" id=\"email\">\r\n");
      out.write("                </p>\r\n");
      out.write("                <p>\r\n");
      out.write("                    <label for=\"password\">PASSWORD</label>\r\n");
      out.write("                    <input type=\"password\" name=\"password\" id=\"password\">\r\n");
      out.write("                </p>\r\n");
      out.write("                <p>\r\n");
      out.write("                    <input type=\"checkbox\" name=\"remember\" id=\"remember\">\r\n");
      out.write("                    <label for=\"remember\">Remember me</label>\r\n");
      out.write("                </p>\r\n");
      out.write("            </div>\r\n");
      out.write("            <p class=\"p-container\">\r\n");
      out.write("                <span>Forgot password ?</span>\r\n");
      out.write("                <input type=\"submit\" name=\"go\" id=\"go\" value=\"Log in\">\r\n");
      out.write("            </p>\r\n");
      out.write("            <p class=\"p-container\"> <span class=\"right\"><a href=\"index_admin_login.jsp\"><strong>Back to page</strong> </a>\r\n");
      out.write("                </span>\r\n");
      out.write("            </p>\r\n");
      out.write("        </form>\r\n");
      out.write("    </body>\r\n");
      out.write("\r\n");
      out.write("</html>");
      out.write("\n");
      out.write("                <p></p>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <script src=\"js/jquery.min.js\"></script>\n");
      out.write("        <script src=\"js/popper.js\"></script>\n");
      out.write("        <script src=\"js/bootstrap.min.js\"></script>\n");
      out.write("        <script src=\"js/main.js\"></script>\n");
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
