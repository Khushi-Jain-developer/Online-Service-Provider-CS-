package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import CRUD.Read_values;
import Common.Category_bean;
import java.util.List;

public final class Info_005fadmin_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/category_action.jsp");
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

      out.write("<body>\n");
      out.write("    ");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <title>Drop down menu design</title>\r\n");
      out.write("        <meta charset=\"utf-8\" />\r\n");
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
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css\">\r\n");
      out.write("    </head>\r\n");
      out.write("    <body style =\"background-image: url(img/portfolio/3.jpg); background-repeat: no-repeat; background-size: cover\">\r\n");
      out.write("        ");
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
      out.write("\r\n");
      out.write("        <div id =\"category\">\r\n");
      out.write("            <h1>Categories</h1>\r\n");
      out.write("            <div id = \"menu-bar\">\r\n");
      out.write("                <ul>\r\n");
      out.write("                    <li class=\"active\"><a href=\"#\"><i class=\"fa fa-clone\"></i>View Category</a>\r\n");
      out.write("                        <div id=\"sub-menu\">\r\n");
      out.write("                            <ul>\r\n");
      out.write("                                ");

                                    List<Category_bean> al = Read_values.fetchAllCategory();
                                    for (Category_bean u : al) {
                                
      out.write("\r\n");
      out.write("                                <li><a href=\"");
      out.print(u.getCategory_id());
      out.write('"');
      out.write('>');
      out.print(u.getCategory_name());
      out.write("</a><i class=\"fa fa-angle-right\"></i></li>\r\n");
      out.write("                                        ");
}
      out.write("\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li><a href=\"category_form.jsp\"><i class=\"fa fa-user\"></i>Add New</a></li>\r\n");
      out.write("                    <li><a href=\"Info_admin.jsp\"><i class=\"fa fa-info\"></i>Information</a></li>\r\n");
      out.write("                </ul>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    </body>\r\n");
      out.write("</html>");
      out.write("\n");
      out.write("    <div style=\"width:100%;\">\n");
      out.write("        <h1 align =\"center\">Added Categories Info</h1>\n");
      out.write("        <table align =\"center\" border=\"1\" style=\"color:#fff\">\n");
      out.write("            <tr style=\"color:black\">\n");
      out.write("                <th>Category-Id</th>\n");
      out.write("                <th>Name of Category</th>\n");
      out.write("                <th>Description</th>\n");
      out.write("                <th>Image</th>\n");
      out.write("            </tr>\n");
      out.write("            ");

                List<Category_bean> a1 = Read_values.fetchAllCategory();
                for (Category_bean s2 : a1) {
            
      out.write("\n");
      out.write("            <tr>\n");
      out.write("                <td>");
      out.print( s2.getCategory_id());
      out.write("</td>\n");
      out.write("                <td>");
      out.print( s2.getCategory_name());
      out.write("</td>\n");
      out.write("                <td>");
      out.print( s2.getCategory_desc());
      out.write("</td>\n");
      out.write("                <td><img src=UploadedData/");
      out.print(s2.getCategory_img());
      out.write(" height=\"100\" width=\"100\"></td>\n");
      out.write("                <td><a href=\"RegDeleteServ?id=");
      out.print(s2.getCategory_id());
      out.write("\" style=\"background-color:#505050 ;color:#fff\">Delete</a></td>\n");
      out.write("                <td><a href=\"edit.jsp?id=");
      out.print(s2.getCategory_id());
      out.write("\" style=\"background-color:#505050 ;color:#fff\">Update</a></td>\n");
      out.write("            </tr>\n");
      out.write("            <tr></tr>\n");
      out.write("            <tr></tr>\n");
      out.write("            ");

                }
            
      out.write("\n");
      out.write("        </table>\n");
      out.write("    </div>\n");
      out.write("</body>\n");
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
