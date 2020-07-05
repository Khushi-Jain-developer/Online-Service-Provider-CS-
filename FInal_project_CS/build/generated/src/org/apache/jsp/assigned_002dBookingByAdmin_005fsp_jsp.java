package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import CRUD.Read_values;
import Common.SP_bean;
import Common.Assign_SP_Bean;
import java.util.List;
import CRUD.insert_values;

public final class assigned_002dBookingByAdmin_005fsp_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <a href=\"../../CitySermon_CS2/web/index_sp.jsp\"></a>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1 align =\"center\"></h1>\n");
      out.write("        <table align = \"center\" border=\"1\">\n");
      out.write("            <tr>\n");
      out.write("                <th>Assign-Id</th>\n");
      out.write("                <th>Booking-Id</th>\n");
      out.write("                <th>Customer-Id</th>\n");
      out.write("                <th>SP-Id</th>\n");
      out.write("                <th>Status</th>\n");
      out.write("                <th>Assign-Date</th>\n");
      out.write("\n");
      out.write("            </tr>\n");
      out.write("            ");

                SP_bean sp = (SP_bean) session.getAttribute("SP");
                List<Assign_SP_Bean> a1 = Read_values.get_AllAssignSP_BySpId(sp.getSp_id());
                for (Assign_SP_Bean s2 : a1) {

            
      out.write("\n");
      out.write("            <tr id =\"row\">\n");
      out.write("                <td id =\"td\">");
      out.print( s2.getAssign_id());
      out.write("</td>\n");
      out.write("                <td id =\"td\">");
      out.print(s2.getBook_id());
      out.write("</td>\n");
      out.write("                <td id =\"td\">");
      out.print( s2.getCust_id());
      out.write("</td>\n");
      out.write("                <td id =\"td\">");
      out.print( s2.getSp_id());
      out.write("</td>   \n");
      out.write("                <td id =\"td\">\n");
      out.write("                    ");

                        if(s2.getStatus()==0)
                        {
                            
      out.write("<a href=\"Controller/sp_confirm_booking_controller.jsp?assign_id=");
      out.print(s2.getAssign_id());
      out.write("\">Confirm Booking</a>");

                        }
                        else
                        {
                            
      out.write("Booking Confirmed");

                        }
                    
      out.write("\n");
      out.write("                </td>\n");
      out.write("                <td id =\"td\">");
      out.print( s2.getAssign_date());
      out.write("</td>\n");
      out.write("\n");
      out.write("            </tr>\n");
      out.write("            ");

                }

            
      out.write("\n");
      out.write("        </table>\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
