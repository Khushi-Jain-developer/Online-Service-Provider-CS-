<%@page import="Common.Customer_bean"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
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
    <body>
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
                                    <h4 class="sec-head">Confirm Booking</h4>
                                </a>
                                <form action="Controller/booking_services_controller.jsp" method ="post">
                                    <%
                                        Customer_bean cust = (Customer_bean)session.getAttribute("Customer_nm");
                                        int cust_id = cust.getCust_id();
                                    %>
                                    Customer-Id : <input type="text" name="cust_id" value="<%=cust_id%>" />
                                    Service-Id : <input type="text" name="service_id" value="<%=request.getParameter("service_id")%>" />
                                    <br><br>Total-Price : <input type="text" name="total_price" value="<%=request.getParameter("total")%>" />
                                   
                                    <br><br>Service-Date : <input type="date" name="service_date" />
                                    Service-Place : <textarea name="service_place" rows="4" cols="20"></textarea>
                                    <br><br>Service-Time : <input type="time" name="service_time" />
                                    Contact-Number : <input type="text" name="contact_no" />
                                    <br><br><input type="submit" value="Submit" />
                                    </form>
                            </div>
                        </div>
                    </div>
                    <!-- End col-->
                </div>
            </div>
        </div>
        <!-- End About area -->
        <%@include file="customer_footer.jsp" %>
    </body>
</html>
