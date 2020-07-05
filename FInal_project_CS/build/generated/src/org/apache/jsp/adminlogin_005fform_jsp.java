package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class adminlogin_005fform_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <title>Log In Page</title>\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/Userlogin.css\">\r\n");
      out.write("    </head>\r\n");
      out.write("        <script language=\"javascript\">\r\n");
      out.write("        function validatedd()\r\n");
      out.write("        {\r\n");
      out.write("\r\n");
      out.write("            if (f3.email.value == \"\" || f3.email.value == null)\r\n");
      out.write("            {\r\n");
      out.write("                alert(\"Please fill your email !!\")\r\n");
      out.write("                f3.email.focus();\r\n");
      out.write("                return false;\r\n");
      out.write("            }\r\n");
      out.write("            if (!/^\\w+([\\.-]?\\w+)*@\\w+([\\.-]?\\w+)*(\\.\\w{2,3})+$/.test(f3.email.value))\r\n");
      out.write("            {\r\n");
      out.write("                alert(\"Please fill your email in correct format !!\")\r\n");
      out.write("                f3.email.focus();\r\n");
      out.write("                return false;\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            if (f3.password.value == \"\" || f3.password.value == null)\r\n");
      out.write("            {\r\n");
      out.write("                alert(\"Please fill your password !!\")\r\n");
      out.write("                f3.password.focus();\r\n");
      out.write("                return false;\r\n");
      out.write("            }\r\n");
      out.write("            if (f3.password.value.length < 2 || f3.password.value.length > 11)\r\n");
      out.write("            {\r\n");
      out.write("                alert(\"Password must be of 4 to 8 characters long!!\")\r\n");
      out.write("                f3.password.focus();\r\n");
      out.write("                return false;\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("        }\r\n");
      out.write("    </script>\r\n");
      out.write("    <body>\r\n");
      out.write("        <form name=\"f3\" onsubmit=\"return validatedd();\" action=\"Controller/login_admin_controller.jsp\" method=\"get\">\r\n");
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
