
<%@page import="Common.Category_bean"%>
<%@page import="CRUD.Read_values"%>
<%@page import="Common.Service_Bean"%>
<%@page import="CRUD.insert_values"%>
<%@page import="Common.Admin_Bean"%>
<%@page import="java.util.List"%>
<!doctype html>
<html lang="en">
    <head>
        <meta charset="utf-8">
        <title>City-Sermon</title>
        <meta content="width=device-width, initial-scale=1.0" name="viewport">
        <meta content="" name="keywords">
        <meta content="" name="description">

        <!-- Favicons -->
        <link href="img/favicon.png" rel="icon">
        <link href="img/apple-touch-icon.png" rel="apple-touch-icon">

        <!-- Google Fonts -->
        <link href="https://fonts.googleapis.com/css?family=Open+Sans:300,400,400i,600,700|Raleway:300,400,400i,500,500i,700,800,900" rel="stylesheet">

        <!-- Bootstrap CSS File -->
        <link href="lib/bootstrap/css/bootstrap.min.css" rel="stylesheet">

        <!-- Libraries CSS Files -->
        <link href="lib/nivo-slider/css/nivo-slider.css" rel="stylesheet">
        <link href="lib/owlcarousel/owl.carousel.css" rel="stylesheet">
        <link href="lib/owlcarousel/owl.transitions.css" rel="stylesheet">
        <link href="lib/font-awesome/css/font-awesome.min.css" rel="stylesheet">
        <link href="lib/animate/animate.min.css" rel="stylesheet">
        <link href="lib/venobox/venobox.css" rel="stylesheet">

        <!-- Nivo Slider Theme -->
        <link href="css/nivo-slider-theme.css" rel="stylesheet">

        <!-- Main Stylesheet File -->
        <link href="css/style.css" rel="stylesheet">

        <!-- Responsive Stylesheet File -->
        <link href="css/responsive.css" rel="stylesheet">
    </head>

    <body data-spy="scroll" data-target="#navbar-example">
        <%@include file="customer_header.jsp" %>

        <!-- Start About area -->
        <div id="about" class="about-area area-padding">
            <div class="container">
                <div class="row">
                    <div class="col-md-12 col-sm-12 col-xs-12">
                        <div class="section-headline text-center">
                            <h2>About City-Sermon</h2>
                        </div>
                    </div>
                </div>
                <div class="row">
                    <!-- single-well start-->
                    <div class="col-md-6 col-sm-6 col-xs-12">
                        <div class="well-left">
                            <div class="single-well">
                                <a href="#">
                                    <img src="img/about/1.jpg" alt="">
                                </a>
                            </div>
                        </div>
                    </div>
                    <!-- single-well end-->
                    <div class="col-md-6 col-sm-6 col-xs-12">
                        <div class="well-middle">
                            <div class="single-well">
                                <a href="#">
                                    <h4 class="sec-head">Service-Render Maintenance</h4>
                                </a>
                                <p>
                                    With City-Sermon, fulfil any and every urgent or day to day need, easily and conveniently.
                                </p>
                                <ul>
                                    <li>
                                        <i class="fa fa-check"></i> Home Cleaning
                                    </li>
                                    <li>
                                        <i class="fa fa-check"></i> Salon At Home
                                    </li>
                                    <li>
                                        <i class="fa fa-check"></i> Home Repair
                                    </li>
                                    <li>
                                        <i class="fa fa-check"></i> Pest Control
                                    </li>
                                    <li>
                                        <i class="fa fa-check"></i> Yoga And Fitness
                                    </li>
                                </ul>
                            </div>
                        </div>
                    </div>
                    <!-- End col-->
                </div>
            </div>
        </div>
        <!-- End About area -->

        <!-- Start Service area -->
        <div id="services" class="services-area area-padding">
            <div class="container">
                <div class="row">
                    <div class="col-md-12 col-sm-12 col-xs-12">
                        <div class="section-headline services-head text-center">
                            <h2>Our Services</h2>
                        </div>
                    </div>
                </div>
                <div class="row text-center">
                    <div class="services-contents">
                        <%                            List<Service_Bean> ser = Read_values.get_name_of_all_services();
                            for (Service_Bean s : ser) {
                                String ser_nm = s.getService_name();
                                List<String> al = Read_values.get_name_of_all_services_by_ser_name(ser_nm);
                        %>
                        <!-- Start Left services -->
                        <div class="col-md-4 col-sm-4 col-xs-12">
                            <div class="about-move">
                                <div class="services-details">
                                    <div class="single-services">
                                        <a class="services-icon" href="#">
                                            <i class="fa fa-code"></i>
                                        </a>
                                        <h4><%=s.getService_name()%></h4>
                                        <p>
                                            Services Offered :
                                            <%
                                                for (String st : al) {
                                            %><%=st%>&nbsp;&nbsp;&nbsp;&nbsp;<%
                                                }
                                            %>
                                        </p>
                                    </div>
                                </div>
                                <!-- end about-details -->
                            </div>
                        </div>
                        <% } %>
                    </div>
                </div>
            </div>
        </div>
        <!-- End Service area -->



        <!-- Faq area start -->
        <div class="faq-area area-padding">
            <div class="container">
                <div class="row">
                    <div class="col-md-12 col-sm-12 col-xs-12">
                        <div class="section-headline text-center">
                            <h2>Faq Question</h2>
                        </div>
                    </div>
                </div>
                <div class="row">
                    <div class="col-md-6 col-sm-6 col-xs-12">
                        <div class="faq-details">
                            <div class="panel-group" id="accordion">
                                <!-- Panel Default -->
                                <div class="panel panel-default">
                                    <div class="panel-heading">
                                        <h4 class="check-title">
                                            <a data-toggle="collapse" class="active" data-parent="#accordion" href="#check1">
                                                <span class="acc-icons"></span>What about the new materials that may require?.
                                            </a>
                                        </h4>
                                    </div>
                                    <div id="check1" class="panel-collapse collapse in">
                                        <div class="panel-body">
                                            <p>
                                                It depends upon the client requirement where client can get the material by their choice or ask professional to procure the same.The time will be included in the working hours if professional would bring.
                                            </p>
                                        </div>
                                    </div>
                                </div>
                                <!-- End Panel Default -->
                                <!-- Panel Default -->
                                <div class="panel panel-default">
                                    <div class="panel-heading">
                                        <h4 class="check-title">
                                            <a data-toggle="collapse" data-parent="#accordion" href="#check2">
                                                <span class="acc-icons"></span> Do I need to be on home when cleaning process going on?
                                            </a>
                                        </h4>
                                    </div>
                                    <div id="check2" class="panel-collapse collapse">
                                        <div class="panel-body">
                                            <p>
                                                Ideally,thats a better option as you can easily communicate with professional on a particular area where you want to focus more.
                                            </p>
                                        </div>
                                    </div>
                                </div>
                                <!-- End Panel Default -->

                                <!-- Panel Default -->
                                <div class="panel panel-default">
                                    <div class="panel-heading">
                                        <h4 class="check-title">
                                            <a data-toggle="collapse" data-parent="#accordion" href="#check4">
                                                <span class="acc-icons"></span>What about filter of RO change?
                                            </a>
                                        </h4>
                                    </div>
                                    <div id="check4" class="panel-collapse collapse">
                                        <div class="panel-body">
                                            <p>
                                                Changing of pre-filter to be done in every 3 months and value of TDS should also manage so that the taste of water will be fine .
                                            </p>
                                        </div>
                                    </div>
                                </div>
                                <!-- End Panel Default -->
                            </div>
                        </div>
                    </div>
                    <div class="col-md-6 col-sm-6 col-xs-12">
                        <div class="tab-menu">
                            <!-- Nav tabs -->
                            <ul class="nav nav-tabs" role="tablist">
                                <li class="active">
                                    <a href="#p-view-1" role="tab" data-toggle="tab">Blog</a>
                                </li>
                                <li>
                                    <a href="#p-view-2" role="tab" data-toggle="tab">Planning</a>
                                </li>
                                <li>
                                    <a href="#p-view-3" role="tab" data-toggle="tab">Success</a>
                                </li>
                            </ul>
                        </div>
                        <div class="tab-content">
                            <div class="tab-pane active" id="p-view-1">
                                <div class="tab-inner">
                                    <div class="event-content head-team">
                                        <h4>Blog</h4>
                                        <p>
                                            Vitamin C is a powerhouse for skin due to its various benefits. The high amount of antioxidants present in it helps reduce fine lines, battles signs of aging and boosts collagen production.?
                                        </p>
                                        <p>
                                            With so many designs in front door and styles to choose from, the search for the perfect entrance to your home can get confusing. And so, we decided to make your work easier
                                        </p>
                                    </div>
                                </div>
                            </div>
                            <div class="tab-pane" id="p-view-2">
                                <div class="tab-inner">
                                    <div class="event-content head-team">
                                        <h4>Planning</h4>
                                        <p>
                                            Solve world peace or plot world dominion, within City-Sermon of course,We pick you up from a common pickup location to our office.Bunch of dreamers & realists changing the world, one happy customer at a time.
                                        </p>

                                    </div>
                                </div>
                            </div>
                            <div class="tab-pane" id="p-view-3">
                                <div class="tab-inner">
                                    <div class="event-content head-team">
                                        <h4>Success</h4>
                                        <p>
                                            Try not to become a man of success. Rather become a man of value.by this idea we provide smart services so that customers's happiness and satisfaction gives us more pleasure.
                                        </p>
                                        <p>
                                            Successful people do what unsuccessful people are not willing to do. Don't wish it were easier; wish you were better.
                                        </p>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
                <!-- end Row -->
            </div>
        </div>
        <!-- End Faq Area -->
        <!-- Start team Area -->
        <div id="team" class="our-team-area area-padding">
            <div class="container">
                <div class="row">
                    <div class="col-md-12 col-sm-12 col-xs-12">
                        <div class="section-headline text-center">
                            <h2>Categories Of City-Sermon</h2>
                        </div>
                    </div>
                </div>

                <div class="row">
                    <div class="team-top">

                        <%
                            List<Category_bean> al = Read_values.fetchAllCategory();
                            for (Category_bean u : al) {
                        %>
                        <div class="col-md-3 col-sm-3 col-xs-12">
                            <div class="single-team-member">
                                <div class="team-img">
                                    <a href="view_services_cust.jsp?cat_id=<%=u.getCategory_id()%>">
                                        <img src="UploadedData/<%=u.getCategory_img()%>" alt="">
                                    </a>
                                    <div class="team-social-icon text-center">
                                        <ul>
                                            <li>
                                                <a href="#">
                                                    <i class="fa fa-facebook"></i>
                                                </a>
                                            </li>
                                            <li>
                                                <a href="#">
                                                    <i class="fa fa-twitter"></i>
                                                </a>
                                            </li>
                                            <li>
                                                <a href="#">
                                                    <i class="fa fa-instagram"></i>
                                                </a>
                                            </li>
                                        </ul>
                                    </div>
                                </div>
                                <div class="team-content text-center">
                                    <h4>
                                    </h4>
                                    <p><a href="view_services_cust.jsp?cat_id=<%=u.getCategory_id()%>"><%=u.getCategory_name()%></a></p>
                                </div>
                            </div>
                        </div>
                        <% }%>        

                        <!-- End column -->
                    </div>
                </div>
            </div>
        </div>
        <!-- End Team Area -->

        <!-- Start reviews Area -->
        <div class="reviews-area hidden-xs">
            <div class="work-us">
                <div class="work-left-text">
                    <a href="#">
                        <img src="img/about/2.jpg" alt="">
                    </a>
                </div>
                <div class="work-right-text text-center">
                    <h2>Expand your Services with City-Sermon</h2>
                    <h5>Salon , Yoga and Fitness , Pest-Control,Home repair ,Appliances and services,Home-cleaning</h5>
                    <a href="index_sp.jsp" class="ready-btn">Contact us</a>
                </div>
            </div>
        </div>
        <!-- End reviews Area -->

        <!-- Start portfolio Area -->
        <div id="portfolio" class="portfolio-area area-padding fix">
            <div class="container">
                <div class="row">
                    <div class="col-lg-12 col-md-12 col-sm-12 col-xs-12">
                        <div class="section-headline text-center">
                            <h2>Images</h2>
                        </div>
                    </div>
                </div>
                <div class="row">
                    <!-- Start Portfolio -page -->
                    <div class="awesome-project-1 fix">
                        <div class="col-lg-12 col-md-12 col-sm-12 col-xs-12">
                            <div class="awesome-menu ">
                                <ul class="project-menu">
                                    <li>
                                        <a href="#" class="active" data-filter="*">All</a>
                                    </li>
                                    <li>
                                        <a href="#" data-filter=".development">Salon</a>
                                    </li>
                                    <li>
                                        <a href="#" data-filter=".design">Home Services</a>
                                    </li>
                                    <li>
                                        <a href="#" data-filter=".photo">Yoga</a>
                                    </li>
                                </ul>
                            </div>
                        </div>
                    </div>
                    <div class="awesome-project-content">
                        <!-- single-awesome-project start -->
                        <div class="col-md-4 col-sm-4 col-xs-12 design development">
                            <div class="single-awesome-project">
                                <div class="awesome-img">
                                    <a href="#"><img src="img/team/ee.jpg" alt="" /></a>
                                    <div class="add-actions text-center">
                                        <div class="project-dec">
                                            <a class="venobox" data-gall="myGallery" href="img/team/nailart.jpg">
                                                <h4>Home cleaning</h4>
                                                <span>Floor scrubbing and polishing</span>
                                            </a>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <!-- single-awesome-project end -->
                        <!-- single-awesome-project start -->
                        <div class="col-md-4 col-sm-4 col-xs-12 photo">
                            <div class="single-awesome-project">
                                <div class="awesome-img">
                                    <a href="#"><img src="img/team/dd.jpg" alt="" /></a>
                                    <div class="add-actions text-center">
                                        <div class="project-dec">
                                            <a class="venobox" data-gall="myGallery" href="img/team/87.jpg">
                                                <h4>Home Services</h4>
                                                <span>Appliances repair</span>
                                            </a>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <!-- single-awesome-project end -->
                        <!-- single-awesome-project start -->
                        <div class="col-md-4 col-sm-4 col-xs-12 design">
                            <div class="single-awesome-project">
                                <div class="awesome-img">
                                    <a href="#"><img src="img/team/23.jpg" alt="" /></a>
                                    <div class="add-actions text-center">
                                        <div class="project-dec">
                                            <a class="venobox" data-gall="myGallery" href="img/team/aa.jpg">
                                                <h4>Fitness life</h4>
                                                <span>happier life.</span>
                                            </a>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <!-- single-awesome-project end -->
                        <!-- single-awesome-project start -->
                        <div class="col-md-4 col-sm-4 col-xs-12 photo development">
                            <div class="single-awesome-project">
                                <div class="awesome-img">
                                    <a href="#"><img src="img/team/44.jpg" alt="" /></a>
                                    <div class="add-actions text-center">
                                        <div class="project-dec">
                                            <a class="venobox" data-gall="myGallery" href="img/team/7.jpg">
                                                <h4>Yoga</h4>
                                                <span>Pranayam,asaan</span>
                                            </a>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <!-- single-awesome-project end -->
                        <!-- single-awesome-project start -->
                        <div class="col-md-4 col-sm-4 col-xs-12 development">
                            <div class="single-awesome-project">
                                <div class="awesome-img">
                                    <a href="#"><img src="img/team/5.jpg" alt="" /></a>
                                    <div class="add-actions text-center text-center">
                                        <div class="project-dec">
                                            <a class="venobox" data-gall="myGallery" href="img/team/15.jpg">
                                                <h4>Make-Up</h4>
                                                <span>Eye-specialist</span>
                                            </a>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <!-- single-awesome-project end -->
                        <!-- single-awesome-project start -->
                        <div class="col-md-4 col-sm-4 col-xs-12 design photo">
                            <div class="single-awesome-project">
                                <div class="awesome-img">
                                    <a href="#"><img src="img/team/66.jpg" alt="" /></a>
                                    <div class="add-actions text-center">
                                        <div class="project-dec">
                                            <a class="venobox" data-gall="myGallery" href="img/team/ee.jpg">
                                                <h4>Fitness</h4>
                                                <span>Meditation</span>
                                            </a>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <!-- single-awesome-project end -->
                    </div>
                </div>
            </div>
        </div>

        <!-- Start Blog Area -->
        <div id="blog" class="blog-area">
            <div class="blog-inner area-padding">
                <div class="blog-overly"></div>
                <div class="container ">
                    <div class="row">
                        <div class="col-md-12 col-sm-12 col-xs-12">
                            <div class="section-headline text-center">
                                <h2>Latest News</h2>
                            </div>
                        </div>
                    </div>
                    <div class="row">
                        <!-- Start Left Blog -->
                        <div class="col-md-4 col-sm-4 col-xs-12">
                            <div class="single-blog">
                                <div class="single-blog-img">
                                    <a href="blog_review.jsp">
                                        <img src="img/blog/11.jpg" alt="">
                                    </a>
                                </div>
                                <div class="blog-meta">
                                    <span class="comments-type">
                                        <i class="fa fa-comment-o"></i>
                                        <a href="#">13 comments</a>
                                    </span>
                                    <span class="date-type">
                                        <i class="fa fa-calendar"></i>2019-12-28 / 09:10:16
                                    </span>
                                </div>
                                <div class="blog-text">
                                    <h4>
                                        <a href="blog_review.jsp">Verified Professionals</a>
                                    </h4>
                                    <p>
                                        All our service providers are screened, background verified and rated by customers like you. Every service provider goes through strict rounds of skill assessment, police verification & background checks before they are on-boarded onto our platform.


                                    </p>
                                </div>
                                <span>
                                    <a href="blog_review.jsp" class="ready-btn">Read more</a>
                                </span>
                            </div>
                            <!-- Start single blog -->
                        </div>
                        <!-- End Left Blog-->
                        <!-- Start Left Blog -->
                        <div class="col-md-4 col-sm-4 col-xs-12">
                            <div class="single-blog">
                                <div class="single-blog-img">
                                    <a href="blog.html">
                                        <img src="img/blog/5.jpg" alt="">
                                    </a>
                                </div>
                                <div class="blog-meta">
                                    <span class="comments-type">
                                        <i class="fa fa-comment-o"></i>
                                        <a href="#">130 comments</a>
                                    </span>
                                    <span class="date-type">
                                        <i class="fa fa-calendar"></i>2019-12-29 / 09:10:16
                                    </span>
                                </div>
                                <div class="blog-text">
                                    <h4>
                                        <a href="blog.html">Professional Support.</a>
                                    </h4>
                                    <p>
                                        Want to get in touch with us directly to express a concern or have some queries that need immediate responses? Chat with us, write us an email or even call us to get through to our round-the-clock support team that's already ready to go that extra mile for your happiness.
                                    </p>
                                </div>
                                <span>
                                    <a href="blog.html" class="ready-btn">Read more</a>
                                </span>
                            </div>
                            <!-- Start single blog -->
                        </div>
                        <!-- End Left Blog-->
                        <!-- Start Right Blog-->
                        <div class="col-md-4 col-sm-4 col-xs-12">
                            <div class="single-blog">
                                <div class="single-blog-img">
                                    <a href="blog.html">
                                        <img src="img/blog/tap11.jpg" alt="">
                                    </a>
                                </div>
                                <div class="blog-meta">
                                    <span class="comments-type">
                                        <i class="fa fa-comment-o"></i>
                                        <a href="#">10 comments</a>
                                    </span>
                                    <span class="date-type">
                                        <i class="fa fa-calendar"></i>2019-12-25 / 09:10:16
                                    </span>
                                </div>
                                <div class="blog-text">
                                    <h4>
                                        <a href="blog.html">Re-work Assurance</a>
                                    </h4>
                                    <p>
                                        City-Sermon strives to offer top quality services for you and your home every time. If you're not satisfied with the quality of the service, we'll get a rework done to your satisfaction at no extra charge.
                                    </p>
                                </div>
                                <span>
                                    <a href="blog_review.jsp" class="ready-btn">Read more</a>
                                </span>
                            </div>
                        </div>
                        <!-- End Right Blog-->
                    </div>
                </div>
            </div>
        </div>
        <!-- End Blog -->
        <!-- Start Suscrive Area -->
        <div class="suscribe-area">
            <div class="container">
                <div class="row">
                    <div class="col-lg-12 col-md-12 col-sm-12 col-xs-12">
                        <div class="suscribe-text text-center">
                            <h3>Welcome to our CS ebusiness</h3>
                            <a class="sus-btn" href="customer_reg.jsp">Sign-Up</a>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <!-- End Suscrive Area -->
        <!-- Start contact Area -->
        <div id="contact" class="contact-area">
            <div class="contact-inner area-padding">
                <div class="contact-overly"></div>
                <div class="container ">
                    <div class="row">
                        <div class="col-md-12 col-sm-12 col-xs-12">
                            <div class="section-headline text-center">
                                <h2>Contact us</h2>
                            </div>
                        </div>
                    </div>
                    <div class="row">
                        <!-- Start contact icon column -->
                        <div class="col-md-4 col-sm-4 col-xs-12">
                            <div class="contact-icon text-center">
                                <div class="single-icon">
                                    <i class="fa fa-mobile"></i>
                                    <p>
                                        Call: +91 7055291092<br>
                                        <span>Monday-Friday (9am-5pm)</span>
                                    </p>
                                </div>
                            </div>
                        </div>
                        <!-- Start contact icon column -->
                        <div class="col-md-4 col-sm-4 col-xs-12">
                            <div class="contact-icon text-center">
                                <div class="single-icon">
                                    <i class="fa fa-envelope-o"></i>
                                    <p>
                                        Email: City-Sermon@cs.com<br>
                                        <span>Web: www.citysermon.com</span>
                                    </p>
                                </div>
                            </div>
                        </div>
                        <!-- Start contact icon column -->
                        <div class="col-md-4 col-sm-4 col-xs-12">
                            <div class="contact-icon text-center">
                                <div class="single-icon">
                                    <i class="fa fa-map-marker"></i>
                                    <p>
                                        Location: WZ-158/A3 UTTAMNAGAR<br>
                                        <span>New-Delhi 535022, INDIA</span>
                                    </p>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="row">

                        <!-- Start Google Map -->
                        <div class="col-md-6 col-sm-6 col-xs-12">
                            <!-- Start Map -->
                            <iframe src="https://maps.google.com/maps?q=new%20delhi&t=&z=13&ie=UTF8&iwloc=&output=embed" width="100%" height="380" frameborder="0" style="border:0" allowfullscreen></iframe>
                            <!-- End Map -->
                        </div>
                        <!-- End Google Map -->

                        <!-- Start  contact -->
                        <div class="col-md-6 col-sm-6 col-xs-12">
                            <div class="form contact-form">
                                <div id="sendmessage">Your message has been sent. Thank you!</div>
                                <div id="errormessage"></div>
                                <form action="Controller/query_controller.jsp" method="post" role="form" class="contactForm">
                                    <div class="form-group">


                                        <input type="text" name="name" class="form-control" id="name" placeholder="Your Name" data-rule="minlen:4" data-msg="Please enter at least 4 chars" />
                                        <div class="validation"></div>
                                    </div>
                                    <div class="form-group">
                                        <input type="email" class="form-control" name="email" id="email" placeholder="Your Email" data-rule="email" data-msg="Please enter a valid email" />
                                        <div class="validation"></div>
                                    </div>
                                    <div class="form-group">
                                        <input type="text" class="form-control" name="subject" id="message" placeholder="Subject" data-rule="minlen:4" data-msg="Please enter at least 8 chars of subject" />
                                        <div class="validation"></div>
                                    </div>

                                    <div class="text-center"><button type="submit">Send Message</button></div>
                                </form>
                            </div>
                        </div>
                        <!-- End Left contact -->
                    </div>
                </div>
            </div>
        </div>
        <!-- End Contact Area -->
        <%@include file="customer_footer.jsp" %>
    </body>

</html>
