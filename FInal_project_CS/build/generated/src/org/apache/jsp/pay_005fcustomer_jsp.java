package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Common.Booking_service_bean;
import CRUD.Read_values;
import Common.Assign_SP_Bean;
import Common.Customer_bean;

public final class pay_005fcustomer_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <link href=\"lib/nivo-slider/css/nivo-slider.css\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"lib/owlcarousel/owl.carousel.css\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"lib/owlcarousel/owl.transitions.css\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"lib/font-awesome/css/font-awesome.min.css\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"lib/animate/animate.min.css\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"lib/venobox/venobox.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("        <!-- Nivo Slider Theme -->\n");
      out.write("        <link href=\"css/nivo-slider-theme.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("        <!-- Main Stylesheet File -->\n");
      out.write("        <link href=\"css/style.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("        <!-- Responsive Stylesheet File -->\n");
      out.write("        <link href=\"css/responsive.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body style =\"background-image: url(img/slider/phone.jpg); background-repeat: no-repeat; background-size: cover\">\n");
      out.write("        <header>\n");
      out.write("            <!-- header-area start -->\n");
      out.write("            <div id=\"sticker\" class=\"header-area\">\n");
      out.write("                <div class=\"container\">\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"col-md-12 col-sm-12\">\n");
      out.write("\n");
      out.write("                            <!-- Navigation -->\n");
      out.write("                            <nav class=\"navbar navbar-default\">\n");
      out.write("                                <!-- Brand and toggle get grouped for better mobile display -->\n");
      out.write("                                <div class=\"navbar-header\">\n");
      out.write("                                    <button type=\"button\" class=\"navbar-toggle collapsed\" data-toggle=\"collapse\" data-target=\".bs-example-navbar-collapse-1\" aria-expanded=\"false\">\n");
      out.write("                                        <span class=\"sr-only\">Toggle navigation</span>\n");
      out.write("                                        <span class=\"icon-bar\"></span>\n");
      out.write("                                        <span class=\"icon-bar\"></span>\n");
      out.write("                                        <span class=\"icon-bar\"></span>\n");
      out.write("                                    </button>\n");
      out.write("                                    <!-- Brand -->\n");
      out.write("                                    <a class=\"navbar-brand page-scroll sticky-logo\" href=\"index.html\">\n");
      out.write("                                        <h1><span>City</span>-Sermon</h1>\n");
      out.write("                                        <!-- Uncomment below if you prefer to use an image logo -->\n");
      out.write("                                        <!-- <img src=\"img/logo.png\" alt=\"\" title=\"\"> -->\n");
      out.write("                                    </a>\n");
      out.write("                                </div>\n");
      out.write("                                <!-- Collect the nav links, forms, and other content for toggling -->\n");
      out.write("                                <div class=\"collapse navbar-collapse main-menu bs-example-navbar-collapse-1\" id=\"navbar-example\">\n");
      out.write("                                    <ul class=\"nav navbar-nav navbar-right\">\n");
      out.write("                                        <li class=\"active\">\n");
      out.write("                                            <a class=\"page-scroll\" href=\"#home\">Home</a>\n");
      out.write("                                        </li>\n");
      out.write("                                        <li>\n");
      out.write("                                            <a class=\"page-scroll\" href=\"#about\">AboutUs</a>\n");
      out.write("                                        </li>\n");
      out.write("                                        <li>\n");
      out.write("                                            <a class=\"page-scroll\" href=\"#services\">Services</a>\n");
      out.write("                                        </li>\n");
      out.write("                                        <li>\n");
      out.write("                                            <a class=\"page-scroll\" href=\"#team\">Category</a>\n");
      out.write("                                        </li>\n");
      out.write("                                        ");

                                            if (session.getAttribute("Customer_nm") != null) {
                                                //customer is logged in
                                                Customer_bean up = (Customer_bean) session.getAttribute("Customer_nm");
                                        
      out.write("\n");
      out.write("                                        <li><a href=\"#\">Welcome ");
      out.print(up.getName());
      out.write("</a></li>\n");
      out.write("                                        <li><a href=\"customer_logout.jsp\">Logout</a></li>\n");
      out.write("                                            ");

                                            } else {
                                            //customer is not logged in
                                            
      out.write("\n");
      out.write("                                        <span class=\"caret\"></span>\n");
      out.write("                                        <li class=\"dropdown\"><a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\">Login/SignUp<span class=\"caret\"></span></a>\n");
      out.write("                                            <ul class=\"dropdown-menu\" role=\"menu\">\n");
      out.write("                                                <li><a href=\"customer_login.jsp\">Login</a></li>\n");
      out.write("                                                <li><a href=\"customer_reg.jsp\">SignUp</a></li>\n");
      out.write("                                            </ul> \n");
      out.write("                                        </li>\n");
      out.write("                                        ");

                                            }
                                        
      out.write("\n");
      out.write("\n");
      out.write("                                        <li>\n");
      out.write("                                            <a class=\"page-scroll\" href=\"#contact\">Privacy Policy</a>\n");
      out.write("                                        </li>\n");
      out.write("                                        <li>\n");
      out.write("                                            <a class=\"page-scroll\" href=\"#blog\">Professional</a>\n");
      out.write("                                        </li>\n");
      out.write("                                        <li>\n");
      out.write("                                            <a class=\"page-scroll\" href=\"mycart_cust.jsp\">My Cart</a>\n");
      out.write("                                        </li>\n");
      out.write("                                        <li>\n");
      out.write("                                            <a class=\"page-scroll\" href=\"#contact\">Query</a>\n");
      out.write("                                        </li>\n");
      out.write("                                    </ul>\n");
      out.write("                                </div>\n");
      out.write("                                <!-- navbar-collapse -->\n");
      out.write("                            </nav>\n");
      out.write("                            <!-- END: Navigation -->\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <!-- header-area end -->\n");
      out.write("        </header>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        <h1 style=\"margin-top: 150px ;text-align:center;text-decoration-line: underline;font-size: 45px;color:black;\">SELECT PAYMENT METHOD</h1></br>\n");
      out.write("    <center>\n");
      out.write("        <form action =\"Controller/insertBookDetails_pay_controller.jsp\" method=\"post\" >\n");
      out.write("            <table style = \"color:#fff; background-repeat: no-repeat; background-size: cover;margin-top: 30px\">\n");
      out.write("\n");
      out.write("                <tr style = \"font-weight: bold;font-size: 24px;\"><td style=\"height:30px;width:20%\">\n");
      out.write("                    <td>Assign-Id:-</td>\n");
      out.write("                    <td><input type=\"text\" name =\"assign_id\" value=\"");
      out.print(request.getParameter("assign_id"));
      out.write("\"></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr style = \"font-weight: bold;font-size: 24px;\"><td style=\"height:30px;width:20%\">\n");
      out.write("                    <td>Customer-Id:-</td>\n");
      out.write("\n");
      out.write("                    ");

                        Customer_bean c = (Customer_bean) session.getAttribute("Customer_nm");
                    
      out.write("\n");
      out.write("                    <td><input type=\"text\" name =\"customer_id\" value=\"");
      out.print(c.getCust_id());
      out.write("\" />\n");
      out.write("                    </td>\n");
      out.write("                </tr>\n");
      out.write("                <tr style = \"font-weight: bold;font-size: 24px;\"><td style=\"height:30px;width:20%\">\n");
      out.write("                    <td>Total Price:-</td>\n");
      out.write("                    ");


                        Booking_service_bean bb = new Booking_service_bean();
                        bb = Read_values.get_totalPrice_ByBookId(Integer.parseInt(request.getParameter("book_id")));
                    
      out.write("\n");
      out.write("                    <td><input type=\"text\" name =\"total_price\" value=\"");
      out.print(bb.getTotal_price());
      out.write("\"></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr style = \"font-weight: bold;font-size: 24px;\"><td style=\"height:30px;width:20%\">\n");
      out.write("                    <td>SP_Id:-</td>\n");
      out.write("                    ");

                        Assign_SP_Bean as = new Assign_SP_Bean();
                        as = Read_values.get_AllPaymentDetails_ByAssignId(Integer.parseInt(request.getParameter("assign_id")));

                    
      out.write("\n");
      out.write("                    <td><input type=\"text\" name =\"sp_id\" value=\"");
      out.print(as.getSp_id());
      out.write("\"></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr style = \"font-weight: bold;font-size: 24px;\"><td style=\"height:30px;width:20%\">\n");
      out.write("\n");
      out.write("                    <td>Payment Method:-</td>\n");
      out.write("\n");
      out.write("                    <td> Credit card<input type=\"radio\" name=\"pay\" ></td></tr>\n");
      out.write("                <tr style = \"font-weight: bold;font-size: 24px;\"><td style=\"height:30px;width:20%\">\n");
      out.write("                    <td></td>\n");
      out.write("                    <td> Net Banking<input type=\"radio\" name=\"pay\"></td></tr>\n");
      out.write("                <tr style = \"font-weight: bold;font-size: 24px;\"><td style=\"height:30px;width:20%\">\n");
      out.write("                    <td></td>\n");
      out.write("                    <td> Debit Card<input type=\"radio\" name=\"pay\"></td>\n");
      out.write("                </tr>\n");
      out.write("\n");
      out.write("                <tr style = \"font-weight: bold;font-size: 24px;\"><td style=\"height:30px;width:20%\"> <td></td><td>Choose any one:<select name=\"bank_name\">\n");
      out.write("                            <optgroup label=\"Select Your Bank\">\n");
      out.write("                                <option value=\"Allahabad Bank\">Allahabad Bank</option> \n");
      out.write("                                <option value=\"Canara Bank\">Canara Bank</option> \n");
      out.write("                                <option value=\"Axis Bank\">Axis Bank</option> \n");
      out.write("                                <option value=\"ICICI Bank\">ICICI Bank</option> \n");
      out.write("                                <option value=\"Dena Bank\">Dena Bank</option> \n");
      out.write("                                <option value=\"Kotak Mahindra Bank\">Kotak Mahindra Bank</option> \n");
      out.write("                                <option value=\"Bank Of Baroda\">Bank Of Baroda</option> \n");
      out.write("                                <option value=\"HDFC bank\">HDFC bank</option> \n");
      out.write("                                <option value=\"State Bank Of India\">State Bank Of India</option>   \n");
      out.write("                            </optgroup>\n");
      out.write("                        </select></td></tr>\n");
      out.write("                <tr style = \"font-weight: bold;font-size: 24px;\"><td style=\"height:30px;width:20%\">\n");
      out.write("                    <td>Name on the card:-</td>\n");
      out.write("                    <td><input type=\"text\" name=\"nm\" placeholder=\"Name on Card\"></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr style = \"font-weight: bold;font-size: 24px;\"><td style=\"height:30px;width:20%\">\n");
      out.write("                    <td>Card No.:-</td>\n");
      out.write("                    <td><input type=\"text\" name=\"card_no\" placeholder=\"16 Digit Card No.\"></td>\n");
      out.write("                <tr style = \"font-weight: bold;font-size: 24px;\"><td style=\"height:30px;width:20%\">\n");
      out.write("                    <td>Expiration Date:-</td>\n");
      out.write("                    <td><input type=\"month\" name=\"date\"></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr style = \"font-weight: bold;font-size: 24px;\"><td style=\"height:30px;width:20%\">\n");
      out.write("                    <td>CVV:-</td>\n");
      out.write("                    <td><input type=\"text\" name=\"cvv\" placeholder=\"3 digits on back side\"></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr style = \"font-weight: bold;font-size: 24px;\"><td style=\"height:30px;width:20%\">\n");
      out.write("                    <td></td>\n");
      out.write("                    <td><input type=\"submit\" value=\"submit\"></td>\n");
      out.write("                </tr></table>\n");
      out.write("        </form>\n");
      out.write("\n");
      out.write("    </center>\n");
      out.write("</div>\n");
      out.write("</div>\n");
      out.write("</div>\n");
      out.write("</div>\n");
      out.write("<!-- End col-->\n");
      out.write("</div>\n");
      out.write("</div>\n");
      out.write("</div>\n");
      out.write("<!-- End About area -->\n");
      out.write("</body>\n");
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
