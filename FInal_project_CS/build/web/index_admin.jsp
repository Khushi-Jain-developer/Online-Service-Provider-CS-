<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Insert title here</title>
        <link href="https://fonts.googleapis.com/css?family=Poppins:300,400,500,600,700,800,900" rel="stylesheet">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
        <link rel="stylesheet" href="css/style_1.css">

    </head>
    <body style ="background-image: url(img/background/des.jpg); background-repeat: no-repeat; background-size: cover">
        <%@include file="admin_header.jsp" %>
        <div class="wrapper d-flex align-items-stretch" >

            <nav id="sidebar">
                <!--button of 3 lines-->
                <div class="custom-menu">
                    <button type="button" id="sidebarCollapse" class="btn btn-primary">
                        <i class="fa fa-bars"></i>
                        <span class="sr-only">Toggle Menu</span>
                    </button>
                </div>
                <!--end of btn-->
                <h1 style="font-style:san-serif;text-align:center;margin-top:12px;font-size:15px"></h1>
                <h1 style="text-align:center"><a href="#" class="logo">Dashboard</a></h1>
                <ul class="list-unstyled components mb-5">
                    <li class="active"><a href="index_admin.jsp"><span class="fa fa-paper-plane mr-3"></span>Home Page</a></li>
                    <li><a href="category_action.jsp"><span class="fa fa-paper-plane mr-3"></span>Category</a></li>
                    <li><a href="services_admin.jsp"><span class="fa fa-paper-plane mr-3"></span>Services</a></li>
                    <li><a href="bookingDetails_admin.jsp"><span class="fa fa-paper-plane mr-3"></span>Booking-Details</a></li>
                    <li><a href="reviews_admin.jsp"><span class="fa fa-paper-plane mr-3"></span>Reviews</a></li>
                    <li><a href="query_admin.jsp"><span class="fa fa-paper-plane mr-3"></span>Customer-Speaks</a></li>
                    <li><a href="report_action.jsp"><span class="fa fa-paper-plane mr-3"></span>Report</a></li>
                </ul>
            </nav>
            <!-- Page Content  -->
            <div id="content" class="p-4 p-md-5 pt-5"><h2 class="mb-4" style="margin-top: 100px">Welcome in City-Sermon</h2>
                <p style="color:#fff;font-size:15px;">It is an online platform that connect users with the professionals service provider in their near by area.</p>
                <p style="color:#fff;font-size:15px;">These are all On-demand sevice provide application who provide the services to the local clients and making good revenue for the business.This type of app supports the online transactions,GPS location and provide call/SMS notification to service providers.It also maintains the history of service provider offered by local vendors.With on-demand services,local vendors easily get work and client get good services on the spot.</p>
            </div>
            <script src="js/jquery.min.js"></script>
            <script src="js/popper.js"></script>
            <script src="js/bootstrap.min.js"></script>
            <script src="js/main.js"></script>
        </div>
    </body>
</html>