package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Common.Query_bean;
import java.util.List;
import CRUD.Read_values;
import Common.Feedback_bean;

public final class query_005fadmin_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <title>Records Of Customer-Speaks</title>\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, user-scalable=no\" />\r\n");
      out.write("        <style>\r\n");
      out.write("            * {\r\n");
      out.write("                margin:0;\r\n");
      out.write("                padding:0;\r\n");
      out.write("                box-sizing: border-box;\r\n");
      out.write("            }\r\n");
      out.write("            #category {\r\n");
      out.write("                margin-top:100px;\r\n");
      out.write("                font-family:san-serif;\r\n");
      out.write("                text-align:center;\r\n");
      out.write("                font-size:20px;\r\n");
      out.write("                background:#800080;\r\n");
      out.write("            }\r\n");
      out.write("            #menu-bar {\r\n");
      out.write("                background:rgb(0,0,100);\r\n");
      out.write("            }\r\n");
      out.write("            #menu-bar ul {\r\n");
      out.write("                display:inline-flex;\r\n");
      out.write("                list-style:none;\r\n");
      out.write("                color: #fff;\r\n");
      out.write("            }\r\n");
      out.write("            #menu-bar ul li {\r\n");
      out.write("                width:120px;\r\n");
      out.write("                margin:15px;\r\n");
      out.write("                padding:15px;\r\n");
      out.write("            }\r\n");
      out.write("            #menu-bar ul li a {\r\n");
      out.write("                text-decoration:none;\r\n");
      out.write("                color: #fff;\r\n");
      out.write("            }\r\n");
      out.write("            .active,#menu-bar ul li:hover {\r\n");
      out.write("                background:#2bab0d;\r\n");
      out.write("                border-radius: 3px;\r\n");
      out.write("            }\r\n");
      out.write("            #menu-bar .fa {\r\n");
      out.write("                margin-right:10px;\r\n");
      out.write("            }\r\n");
      out.write("            #sub-menu {\r\n");
      out.write("                display:none;\r\n");
      out.write("            }\r\n");
      out.write("            #menu-bar ul li:hover #sub-menu {\r\n");
      out.write("                display:block;\r\n");
      out.write("                position:absolute;\r\n");
      out.write("                background:rgb(0,120,0);\r\n");
      out.write("                margin-top:15px;\r\n");
      out.write("                margin-left:-15px;\r\n");
      out.write("            }\r\n");
      out.write("            #menu-bar ul li:hover #sub-menu ul {\r\n");
      out.write("                display:block;\r\n");
      out.write("                margin:10px;\r\n");
      out.write("            }\r\n");
      out.write("            #menu-bar ul li:hover #sub-menu ul li {\r\n");
      out.write("                width:150px;\r\n");
      out.write("                padding:10px;\r\n");
      out.write("                border-bottom:1px dotted #fff;\r\n");
      out.write("                background:transparent;\r\n");
      out.write("                border-radius:o;\r\n");
      out.write("                text-align:left;\r\n");
      out.write("            }\r\n");
      out.write("            #menu-bar ul li:hover #sub-menu ul li:last-child {\r\n");
      out.write("                border-bottom:none;\r\n");
      out.write("            }\r\n");
      out.write("            #menu-bar ul li:hover #sub-menu ul li a:hover {\r\n");
      out.write("                color:#b2ff00;\r\n");
      out.write("            }\r\n");
      out.write("            .fa-angle-right {\r\n");
      out.write("                float:right;\r\n");
      out.write("            }\r\n");
      out.write("        </style>\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/header.css\" />\r\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css\">\r\n");
      out.write("    </head>\r\n");
      out.write("    <body style =\"background-image: url(img/portfolio/1.jpg); background-repeat: no-repeat; background-size: cover\">\r\n");
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
      out.write("\r\n");
      out.write("        <div style =\"margin-top:160px\"> <center>\r\n");
      out.write("                <h1 align =\"center\" style=\"margin-top:200px;color:black;text-decoration-line:underline;font-size:50px;\">QUERY - DETAILS</h1>\r\n");
      out.write("\r\n");
      out.write("                <table align =\"center\" border=\"1\" style=\"margin-top:70px;background-image: url(img/background/light4.jpg); background-repeat: no-repeat; background-size: cover\">\r\n");
      out.write("                    <tr style=\"font-weight: bold;text-align: center;height: 50px;font-size: 35px\">\r\n");
      out.write("                        <th style=\"width:5px;\">Query-Id</th>\r\n");
      out.write("                        <th style=\"width:15px;\">Customer</th>\r\n");
      out.write("                        <th style=\"width:15px;\">Email</th>\r\n");
      out.write("                        <th style=\"width:35px;\">Query</th>\r\n");
      out.write("                        <th style=\"width:30px;\">Date</th>\r\n");
      out.write("                    </tr>\r\n");
      out.write("                    ");

                        List<Query_bean> q = Read_values.getValueOfQuery();
                        for (Query_bean qb : q) {
                    
      out.write("\r\n");
      out.write("                    <tr style=\"text-align:center;height:30px;font-size:25px\">\r\n");
      out.write("                        <td style = \"width:\">");
      out.print(qb.getQ_id());
      out.write("</td>\r\n");
      out.write("                        <td style = \"width:\">");
      out.print(qb.getName());
      out.write("</td>\r\n");
      out.write("                        <td style = \"width:\">");
      out.print(qb.getEmail());
      out.write("</td>\r\n");
      out.write("                        <td style = \"width:\">");
      out.print(qb.getMsg());
      out.write("</td>\r\n");
      out.write("                        <td style = \"width:\">");
      out.print(qb.getDate());
      out.write("</td>\r\n");
      out.write("                    </tr>\r\n");
      out.write("                    ");

                        }
                    
      out.write("\r\n");
      out.write("                </table>\r\n");
      out.write("            </center>\r\n");
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
