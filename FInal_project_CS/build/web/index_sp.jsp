<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Insert title here</title>
        <link href="https://fonts.googleapis.com/css?family=Poppins:300,400,500,600,700,800,900" rel="stylesheet">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
        <link rel="stylesheet" href="css/style.css">

        <link rel="stylesheet" href="css/header.css" />
        <link rel="stylesheet" href="css/style_1.css" />
    </head>
    <body style ="background-image: url(img/blog/6.jpg); background-repeat: no-repeat; background-size: cover">
        <%@include file="SP_header.jsp" %>
        <div class="wrapper d-flex align-items-stretch" >
            <nav id="sidebar">
                <div class="custom-menu"><button type="button" id="sidebarCollapse" class="btn btn-primary">
                        <i class="fa fa-bars"></i>
                        <span class="sr-only">Toggle Menu</span>
                    </button></div><h1 style="font-style:san-serif;text-align:center;margin-top:30px;color:#fff;font-size:15px">SP-Panel</h1>
                <h1 style="text-align:center"><a href="index.html" class="logo">Dashboard</a></h1>
                <ul class="list-unstyled components mb-5">
                    <li class="active"><a href="#"><span class="fa fa-paper-plane mr-3"></span>Home Page</a></li>
                    <li><a href="service_action.jsp"><span class="fa fa-paper-plane mr-3"></span>Services</a></li>
                    <li><a href="ques_action.jsp"><span class="fa fa-paper-plane mr-3"></span>Questions</a></li>
                    <li><a href="payment_sp.jsp"><span class="fa fa-paper-plane mr-3"></span>Payment</a></li>
                    <li><a href="query_sp.jsp"><span class="fa fa-paper-plane mr-3"></span>Query</a></li>
                    <li><a href="reviews_sp.jsp"><span class="fa fa-paper-plane mr-3"></span>Review</a></li>
                </ul>
            </nav>
            <!-- Page Content  -->
            <div id="content" class="p-4 p-md-5 pt-5" ><h2 class="mb-4" style="background-color: black;margin-right: 100px;font-size:45px;color:#fff;margin-top:50px">Welcome in City-Sermon</h2>
                <p style="color:red;font-size:25px;line-height:33px">It is an online platform that connect users with the professionals service provider in their near by area.</p>
                <p style="color:blue;font-size:25px;line-height:40px">These are all On-demand sevice provide application who provide the services to the local clients and making good revenue for the business.This type of app supports the online transactions,GPS location and provide call/SMS notification to service providers.It also maintains the history of service provider offered by local vendors.With on-demand services,local vendors easily get work and client get good services on the spot.</p>
            </div>
        </div>

        <script src="js/jquery.min.js"></script>
        <script src="js/popper.js"></script>
        <script src="js/bootstrap.min.js"></script>
        <script src="js/main.js"></script>
    </body>
</html>