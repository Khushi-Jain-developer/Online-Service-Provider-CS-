package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import CRUD.Read_values;
import java.util.List;
import Common.Assign_SP_Bean;
import Common.Customer_bean;

public final class mycart_005fcust_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/customer_header.jsp");
    _jspx_dependants.add("/customer_footer.jsp");
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <title>City-Sermon</title>\n");
      out.write("        <meta content=\"width=device-width, initial-scale=1.0\" name=\"viewport\">\n");
      out.write("        <meta content=\"\" name=\"keywords\">\n");
      out.write("        <meta content=\"\" name=\"description\">\n");
      out.write("\n");
      out.write("        <!-- Favicons -->\n");
      out.write("        <link href=\"img/favicon.png\" rel=\"icon\">\n");
      out.write("        <link href=\"img/apple-touch-icon.png\" rel=\"apple-touch-icon\">\n");
      out.write("\n");
      out.write("        <!-- Google Fonts -->\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css?family=Open+Sans:300,400,400i,600,700|Raleway:300,400,400i,500,500i,700,800,900\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("        <!-- Bootstrap CSS File -->\n");
      out.write("        <link href=\"lib/bootstrap/css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("        <!-- Libraries CSS Files -->\n");
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
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
      out.write("\n");
      out.write("\n");
      out.write("<div id=\"preloader\"></div>\n");
      out.write("\n");
      out.write("<header>\n");
      out.write("    <!-- header-area start -->\n");
      out.write("    <div id=\"sticker\" class=\"header-area\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-md-12 col-sm-12\">\n");
      out.write("\n");
      out.write("                    <!-- Navigation -->\n");
      out.write("                    <nav class=\"navbar navbar-default\">\n");
      out.write("                        \n");
      out.write("                            <!-- Brand -->\n");
      out.write("                            <a class=\"navbar-brand page-scroll sticky-logo\" href=\"index.html\">\n");
      out.write("                                <h1><span>City</span>-Sermon</h1>\n");
      out.write("                                <!-- Uncomment below if you prefer to use an image logo -->\n");
      out.write("                                <!-- <img src=\"img/logo.png\" alt=\"\" title=\"\"> -->\n");
      out.write("                            </a>\n");
      out.write("                        </div>\n");
      out.write("                        <!-- Collect the nav links, forms, and other content for toggling -->\n");
      out.write("                        <div class=\"collapse navbar-collapse main-menu bs-example-navbar-collapse-1\" id=\"navbar-example\">\n");
      out.write("                            <ul class=\"nav navbar-nav navbar-right\">\n");
      out.write("                                <li class=\"active\">\n");
      out.write("                                    <a class=\"page-scroll\" href=\"#home\">Home</a>\n");
      out.write("                                </li>\n");
      out.write("                                <li>\n");
      out.write("                                    <a class=\"page-scroll\" href=\"#about\">AboutUs</a>\n");
      out.write("                                </li>\n");
      out.write("                                <li>\n");
      out.write("                                    <a class=\"page-scroll\" href=\"#services\">Services</a>\n");
      out.write("                                </li>\n");
      out.write("                                <li>\n");
      out.write("                                    <a class=\"page-scroll\" href=\"#team\">Category</a>\n");
      out.write("                                </li>\n");
      out.write("                                ");

                                    if (session.getAttribute("Customer_nm") != null) {
                                        //customer is logged in
                                        Customer_bean up = (Customer_bean) session.getAttribute("Customer_nm");
                                
      out.write("\n");
      out.write("                                <li><a href=\"#\">Welcome ");
      out.print(up.getName());
      out.write("</a></li>\n");
      out.write("                                <li><a href=\"customer_logout.jsp\">Logout</a></li>\n");
      out.write("                                    ");

                                    } else {
                                    //customer is not logged in
                                    
      out.write("\n");
      out.write("                             \n");
      out.write("                                <li class=\"dropdown\"><a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\">Login/SignUp<span class=\"caret\"></span></a>\n");
      out.write("                                    <ul class=\"dropdown-menu\" role=\"menu\">\n");
      out.write("                                        <li><a href=\"customer_login.jsp\">Login</a></li>\n");
      out.write("                                        <li><a href=\"customer_reg.jsp\">SignUp</a></li>\n");
      out.write("                                    </ul> \n");
      out.write("                                </li>\n");
      out.write("                                    ");

                                        }
                                    
      out.write("\n");
      out.write("\n");
      out.write("                                <li>\n");
      out.write("                                    <a class=\"page-scroll\" href=\"#contact\">Privacy Policy</a>\n");
      out.write("                                </li>\n");
      out.write("                                 <li>\n");
      out.write("                                    <a class=\"page-scroll\" href=\"#blog\">Professional</a>\n");
      out.write("                                </li>\n");
      out.write("                                <li>\n");
      out.write("                                    <a class=\"page-scroll\" href=\"mycart_cust.jsp\">My Cart</a>\n");
      out.write("                                </li>\n");
      out.write("                                <li>\n");
      out.write("                                    <a class=\"page-scroll\" href=\"/blog_review.jsp\">Reviews</a>\n");
      out.write("                                </li>\n");
      out.write("                            </ul>\n");
      out.write("                        </div>\n");
      out.write("                        <!-- navbar-collapse -->\n");
      out.write("                    </nav>\n");
      out.write("                    <!-- END: Navigation -->\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("    <!-- header-area end -->\n");
      out.write("</header>\n");
      out.write("<!-- header end -->\n");
      out.write("<!-- Start Slider Area -->\n");
      out.write("<div id=\"home\" class=\"slider-area\">\n");
      out.write("    <div class=\"bend niceties preview-2\">\n");
      out.write("        <div id=\"ensign-nivoslider\" class=\"slides\">\n");
      out.write("            <img src=\"img/slider/technology.jpg\" alt=\"\" title=\"#slider-direction-1\" />\n");
      out.write("            <img src=\"img/slider/home.jpg\" alt=\"\" title=\"#slider-direction-2\" />\n");
      out.write("            <img src=\"img/slider/laptop1.jpg\" alt=\"\" title=\"#slider-direction-3\" />\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <!-- direction 1 -->\n");
      out.write("        <div id=\"slider-direction-1\" class=\"slider-direction slider-one\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-md-12 col-sm-12 col-xs-12\">\n");
      out.write("                        <div class=\"slider-content\">\n");
      out.write("                            <!-- layer 1 -->\n");
      out.write("                            <div class=\"layer-1-1 hidden-xs wow slideInDown\" data-wow-duration=\"2s\" data-wow-delay=\".2s\">\n");
      out.write("                                <h2 class=\"title1\">City-Sermon Online Service Provider Web App</h2>\n");
      out.write("                            </div>\n");
      out.write("                            <!-- layer 2 -->\n");
      out.write("                            <div class=\"layer-1-2 wow slideInUp\" data-wow-duration=\"2s\" data-wow-delay=\".1s\">\n");
      out.write("                                <h1 class=\"title2\">We understand customer problems & provide efficient solution</h1>\n");
      out.write("                            </div>\n");
      out.write("                            <!-- layer 3 -->\n");
      out.write("                            <div class=\"layer-1-3 hidden-xs wow slideInUp\" data-wow-duration=\"2s\" data-wow-delay=\".2s\">\n");
      out.write("                                <a class=\"ready-btn right-btn page-scroll\" href=\"#services\">See Services</a>\n");
      out.write("                                <a class=\"ready-btn page-scroll\" href=\"#about\">Learn More</a>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <!-- direction 2 -->\n");
      out.write("        <div id=\"slider-direction-2\" class=\"slider-direction slider-two\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-md-12 col-sm-12 col-xs-12\">\n");
      out.write("                        <div class=\"slider-content text-center\">\n");
      out.write("                            <!-- layer 1 -->\n");
      out.write("                            <div class=\"layer-1-1 hidden-xs wow slideInUp\" data-wow-duration=\"2s\" data-wow-delay=\".2s\">\n");
      out.write("                                <h2 class=\"title1\">The Best Service Provider</h2>\n");
      out.write("                            </div>\n");
      out.write("                            <!-- layer 2 -->\n");
      out.write("                            <div class=\"layer-1-2 wow slideInUp\" data-wow-duration=\"2s\" data-wow-delay=\".1s\">\n");
      out.write("                                <h1 class=\"title2\">Clean-Smart-Fast</h1>\n");
      out.write("                            </div>\n");
      out.write("                            <!-- layer 3 -->\n");
      out.write("                            <div class=\"layer-1-3 hidden-xs wow slideInUp\" data-wow-duration=\"2s\" data-wow-delay=\".2s\">\n");
      out.write("                                <a class=\"ready-btn right-btn page-scroll\" href=\"#services\">See Services</a>\n");
      out.write("                                <a class=\"ready-btn page-scroll\" href=\"#about\">Learn More</a>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <!-- direction 3 -->\n");
      out.write("        <div id=\"slider-direction-3\" class=\"slider-direction slider-two\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-md-12 col-sm-12 col-xs-12\">\n");
      out.write("                        <div class=\"slider-content\">\n");
      out.write("                            <!-- layer 1 -->\n");
      out.write("                            <div class=\"layer-1-1 hidden-xs wow slideInUp\" data-wow-duration=\"2s\" data-wow-delay=\".2s\">\n");
      out.write("                                <h2 class=\"title1\">Easy to Manage</h2>\n");
      out.write("                            </div>\n");
      out.write("                            <!-- layer 2 -->\n");
      out.write("                            <div class=\"layer-1-2 wow slideInUp\" data-wow-duration=\"2s\" data-wow-delay=\".1s\">\n");
      out.write("                                <h1 class=\"title2\">City-Sermon is your one-stop shop for all your home services needs and much, much more..</h1>\n");
      out.write("                            </div>\n");
      out.write("                            <!-- layer 3 -->\n");
      out.write("                            <div class=\"layer-1-3 hidden-xs wow slideInUp\" data-wow-duration=\"2s\" data-wow-delay=\".2s\">\n");
      out.write("                                <a class=\"ready-btn right-btn page-scroll\" href=\"#services\">See Services</a>\n");
      out.write("                                <a class=\"ready-btn page-scroll\" href=\"#about\">Learn More</a>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("<!-- End Slider Area -->");
      out.write("\n");
      out.write("    <center>\n");
      out.write("        <table border=\"2\">\n");
      out.write("            <tr>\n");
      out.write("                <th>Assign-Id</th>\n");
      out.write("                <th>Booking-Id</th>\n");
      out.write("                <th>Customer-Id</th>\n");
      out.write("                <th>SP-Id</th>\n");
      out.write("                <th>Status</th>\n");
      out.write("                <th>Assign-Date</th>\n");
      out.write("                <th>Payment</th>\n");
      out.write("            </tr>\n");
      out.write("            ");
                 Customer_bean sb = (Customer_bean) session.getAttribute("Customer_nm");
                List<Assign_SP_Bean> a1 = Read_values.fetchAllCustBookings_ByCustomerId(sb.getCust_id());
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
      out.write("</td>\n");
      out.write("                <td id =\"td\">\n");
      out.write("                    ");

                        if (s2.getStatus() == 0) {
                    
      out.write("Booking awaited \n");
      out.write("\n");
      out.write("                    ");

                    } else {
                    
      out.write("Booking Confirmed");

                        }
                    
      out.write("\n");
      out.write("                </td>   \n");
      out.write("                <td id =\"td\">");
      out.print( s2.getAssign_date());
      out.write("</td>\n");
      out.write("                <td>\n");
      out.write("                    ");

                        if (s2.getStatus() == 0) {
                        } else {
                    
      out.write("<a href=\"pay_customer.jsp?assign_id=");
      out.print(s2.getAssign_id());
      out.write("&sp_id=");
      out.print(s2.getSp_id());
      out.write("&book_id=");
      out.print(s2.getBook_id());
      out.write("\">Proceed to Payment</a>");

                                }
                    
      out.write("\n");
      out.write("                </td>\n");
      out.write("            </tr>\n");
      out.write("            ");

                }
            
      out.write("\n");
      out.write("        </table>\n");
      out.write("    </center>\n");
      out.write("    ");
      out.write("<!-- Start Footer bottom Area -->\n");
      out.write("<footer>\n");
      out.write("    <div class=\"footer-area\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-md-4 col-sm-4 col-xs-12\">\n");
      out.write("                    <div class=\"footer-content\">\n");
      out.write("                        <div class=\"footer-head\">\n");
      out.write("                            <div class=\"footer-logo\">\n");
      out.write("                                <h2><span>CM</span>eBusiness</h2>\n");
      out.write("                            </div>\n");
      out.write("                            <p>Various Services one Destination.</p>\n");
      out.write("                            <p>Pest control : Painting : Home cleaning : Salon : Appliance Repair : Home-Decor : Fitness Trainer.\n");
      out.write("                            <div class=\"footer-icons\">\n");
      out.write("                                <ul>\n");
      out.write("                                    <li>\n");
      out.write("                                        <a href=\"#\"><i class=\"fa fa-facebook\"></i></a>\n");
      out.write("                                    </li>\n");
      out.write("                                    <li>\n");
      out.write("                                        <a href=\"#\"><i class=\"fa fa-twitter\"></i></a>\n");
      out.write("                                    </li>\n");
      out.write("                                    <li>\n");
      out.write("                                        <a href=\"#\"><i class=\"fa fa-google\"></i></a>\n");
      out.write("                                    </li>\n");
      out.write("                                    <li>\n");
      out.write("                                        <a href=\"#\"><i class=\"fa fa-pinterest\"></i></a>\n");
      out.write("                                    </li>\n");
      out.write("                                </ul>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <!-- end single footer -->\n");
      out.write("                <div class=\"col-md-4 col-sm-4 col-xs-12\">\n");
      out.write("                    <div class=\"footer-content\">\n");
      out.write("                        <div class=\"footer-head\">\n");
      out.write("                            <h4>Information</h4>\n");
      out.write("\n");
      out.write("                            <div class=\"footer-contacts\">\n");
      out.write("                                <p><span>Tel:</span> +91 8077644352</p>\n");
      out.write("                                <p><span>Email:</span> CitySermon@cs.com</p>\n");
      out.write("                                <p><span>Working Hours:</span> 9am-5pm</p>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <!-- end single footer -->\n");
      out.write("                <div class=\"col-md-4 col-sm-4 col-xs-12\">\n");
      out.write("                    <div class=\"footer-content\">\n");
      out.write("                        <div class=\"footer-head\">\n");
      out.write("                            <h4>Gallery</h4>\n");
      out.write("                            <div class=\"flicker-img\">\n");
      out.write("                                <a href=\"#\"><img src=\"img/portfolio/1.jpg\" alt=\"\"></a>\n");
      out.write("                                <a href=\"#\"><img src=\"img/portfolio/2.jpg\" alt=\"\"></a>\n");
      out.write("                                <a href=\"#\"><img src=\"img/portfolio/3.jpg\" alt=\"\"></a>\n");
      out.write("                                <a href=\"#\"><img src=\"img/portfolio/4.jpg\" alt=\"\"></a>\n");
      out.write("                                <a href=\"#\"><img src=\"img/portfolio/5.jpg\" alt=\"\"></a>\n");
      out.write("                                <a href=\"#\"><img src=\"img/portfolio/6.jpg\" alt=\"\"></a>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"footer-area-bottom\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-md-12 col-sm-12 col-xs-12\">\n");
      out.write("                    <div class=\"copyright text-center\">\n");
      out.write("                        <p>\n");
      out.write("                            &copy; Copyright <strong>City-Sermon(CM)</strong>. All Rights Reserved\n");
      out.write("                        </p>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"credits\">\n");
      out.write("                        Designed by <a href=\"index_admin_login.jsp\">Khushi Jain</a>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</footer>\n");
      out.write("\n");
      out.write("<a href=\"#\" class=\"back-to-top\"><i class=\"fa fa-chevron-up\"></i></a>\n");
      out.write("\n");
      out.write("<!-- JavaScript Libraries -->\n");
      out.write("<script src=\"lib/jquery/jquery.min.js\"></script>\n");
      out.write("<script src=\"lib/bootstrap/js/bootstrap.min.js\"></script>\n");
      out.write("<script src=\"lib/owlcarousel/owl.carousel.min.js\"></script>\n");
      out.write("<script src=\"lib/venobox/venobox.min.js\"></script>\n");
      out.write("<script src=\"lib/knob/jquery.knob.js\"></script>\n");
      out.write("<script src=\"lib/wow/wow.min.js\"></script>\n");
      out.write("<script src=\"lib/parallax/parallax.js\"></script>\n");
      out.write("<script src=\"lib/easing/easing.min.js\"></script>\n");
      out.write("<script src=\"lib/nivo-slider/js/jquery.nivo.slider.js\" type=\"text/javascript\"></script>\n");
      out.write("<script src=\"lib/appear/jquery.appear.js\"></script>\n");
      out.write("<script src=\"lib/isotope/isotope.pkgd.min.js\"></script>\n");
      out.write("\n");
      out.write("<!-- Contact Form JavaScript File -->\n");
      out.write("<script src=\"contactform/contactform.js\"></script>\n");
      out.write("\n");
      out.write("<script src=\"js/main_1.js\"></script>");
      out.write("\n");
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
