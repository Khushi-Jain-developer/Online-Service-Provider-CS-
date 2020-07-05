package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.DriverManager;

public final class service_005finsert_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\r\n");
      out.write("        <title>Insert title here</title>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("\r\n");
      out.write("        ");

            try {
                Connection con = null;
                PreparedStatement stmt = null;
                String category = request.getParameter("cate");
                String serv_nm = request.getParameter("s1");
                String sub_serv = request.getParameter("s2");
                //System.out.println(c_Id);
                String price = request.getParameter("s3");
                String date_time_req = request.getParameter("s4");
                String pincode = request.getParameter("s5");
                String date_time = request.getParameter("s6");
                String status = request.getParameter("s7");

                Class.forName("com.mysql.jdbc.Driver");
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/citysermon", "root", "root");

                String qry = "insert into service(service_id,ser_nm,sub_serv,price,date,pincode,date_tm,status,category)values(null,'" + serv_nm + "','" + sub_serv + "','" + price + "','" + date_time_req + "','" + pincode + "','" + date_time + "','" + status + "','" + category + "')";
                out.println("record inserted successfully");
                out.println("record inserted successfully" + qry);
                stmt = con.prepareStatement(qry);
                int x = stmt.executeUpdate();
                if (x > 0) {
                    response.sendRedirect("req_form.jsp");
                    out.println("record inserted successfully");
                } else {
                    request.getRequestDispatcher("Request.jsp").include(request, response);
                    out.println("Invalid password <a href='Request.jsp'>try again</a>");
                }

                out.println("hey.....!");
                con.close();
            } catch (Exception e) {
                out.println(e);
            }
        
      out.write("\r\n");
      out.write("\r\n");
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
