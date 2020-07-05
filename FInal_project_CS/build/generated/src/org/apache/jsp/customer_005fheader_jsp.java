package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Common.Customer_bean;

public final class customer_005fheader_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\n");
      out.write("<div id=\"preloader\"></div>\n");
      out.write("<header>\n");
      out.write("    <!-- header-area start -->\n");
      out.write("    <div id=\"sticker\" class=\"header-area\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-md-12 col-sm-12\">\n");
      out.write("                    <!-- Navigation -->\n");
      out.write("                    <nav class=\"navbar navbar-default\">\n");
      out.write("                            <!-- Brand -->\n");
      out.write("                            <a class=\"navbar-brand page-scroll sticky-logo\" href=\"index.html\">\n");
      out.write("                                <h1><span>City</span>-Sermon</h1>\n");
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
      out.write("                                    <a class=\"page-scroll\" href=\"blog_review.jsp\">Reviews</a>\n");
      out.write("                                </li>\n");
      out.write("                            </ul>\n");
      out.write("                        </div>\n");
      out.write("                       \n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("   \n");
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
