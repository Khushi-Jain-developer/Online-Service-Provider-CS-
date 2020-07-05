package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class sp_005flogin_005freg_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<meta charset=\"ISO-8859-1\">\n");
      out.write("<title>Insert title here</title>\n");
      out.write("<link rel=\"stylesheet\" href=\"css/Splogin.css\">\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("<div class=\"cotn_principal\">\n");
      out.write("<div class=\"cont_centrar\">\n");
      out.write("\n");
      out.write("  <div class=\"cont_login\">\n");
      out.write("<div class=\"cont_info_log_sign_up\">\n");
      out.write("<form action = \"sp_login.jsp\" method = \"post\">\n");
      out.write("      <div class=\"col_md_login\">\n");
      out.write("<div class=\"cont_ba_opcitiy\">\n");
      out.write("        \n");
      out.write("        <h2>LOGIN</h2>  \n");
      out.write("  <p>City-Sermon is your one-stop shop for all your home services needs and much, much more..</p> \n");
      out.write("<p>To avail host of miscellaneous services login with registered id and password.\n");
      out.write("  <button class=\"btn_login\" onclick=\"cambiar_login()\">LOGIN</button>\n");
      out.write("  </div>\n");
      out.write("  </div>\n");
      out.write("  </form>\n");
      out.write("  \n");
      out.write("  <form action = \"sp_reg.jsp\" method = \"post\">\n");
      out.write("<div class=\"col_md_sign_up\">\n");
      out.write("<div class=\"cont_ba_opcitiy\">\n");
      out.write("  <h2>SIGN UP</h2>\n");
      out.write("\n");
      out.write("  \n");
      out.write("  <p> With City-Sermon, fulfil any and every urgent or day to day need, easily and conveniently.</p>\n");
      out.write("  <br><p>To avail host of miscellaneous services signup with valid details.\n");
      out.write("  <button class=\"btn_sign_up\" onclick=\"cambiar_sign_up()\">SIGN UP</button>\n");
      out.write("</div>\n");
      out.write("  </div>\n");
      out.write("  </form>\n");
      out.write("       </div>\n");
      out.write("\n");
      out.write("    \n");
      out.write("    <div class=\"cont_back_info\">\n");
      out.write("       <div class=\"cont_img_back_grey\">\n");
      out.write("       <img src=\"https://images.unsplash.com/42/U7Fc1sy5SCUDIu4tlJY3_NY_by_PhilippHenzler_philmotion.de.jpg?ixlib=rb-0.3.5&q=50&fm=jpg&crop=entropy&s=7686972873678f32efaf2cd79671673d\" alt=\"\" />\n");
      out.write("       </div>\n");
      out.write("       \n");
      out.write("    </div>\n");
      out.write("<div class=\"cont_forms\" >\n");
      out.write("    <div class=\"cont_img_back_\">\n");
      out.write("       <img src=\"https://images.unsplash.com/42/U7Fc1sy5SCUDIu4tlJY3_NY_by_PhilippHenzler_philmotion.de.jpg?ixlib=rb-0.3.5&q=50&fm=jpg&crop=entropy&s=7686972873678f32efaf2cd79671673d\" alt=\"\" />\n");
      out.write("       </div>\n");
      out.write(" <div class=\"cont_form_login\">\n");
      out.write("<a href=\"#\" onclick=\"ocultar_login_sign_up()\" ><i class=\"material-icons\">&#xE5C4;</i></a>\n");
      out.write("   <h2>LOGIN</h2>\n");
      out.write(" <input type=\"text\" placeholder=\"Email\" />\n");
      out.write("<input type=\"password\" placeholder=\"Password\" />\n");
      out.write("<button class=\"btn_login\" onclick=\"cambiar_login()\">LOGIN</button>\n");
      out.write("  </div>\n");
      out.write("  \n");
      out.write("   <div class=\"cont_form_sign_up\">\n");
      out.write("<a href=\"#\" onclick=\"ocultar_login_sign_up()\"><i class=\"material-icons\">&#xE5C4;</i></a>\n");
      out.write("     <h2>SIGN UP</h2>\n");
      out.write("<input type=\"text\" placeholder=\"Email\" />\n");
      out.write("<input type=\"text\" placeholder=\"User\" />\n");
      out.write("<input type=\"password\" placeholder=\"Password\" />\n");
      out.write("<input type=\"password\" placeholder=\"Confirm Password\" />\n");
      out.write("<button class=\"btn_sign_up\" onclick=\"cambiar_sign_up()\">SIGN UP</button>\n");
      out.write("\n");
      out.write("  </div>\n");
      out.write("\n");
      out.write("    </div>\n");
      out.write("    \n");
      out.write("  </div>\n");
      out.write(" </div>\n");
      out.write("</div>\n");
      out.write("</body>\n");
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
