<%@page import="CRUD.Read_values"%>
<%@page import="java.util.List"%>
<%@page import="Common.Service_Bean"%>
<%@page import="CRUD.insert_values"%>
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

    <body data-spy="scroll" data-target="#navbar-example">

        <%@include file="customer_header.jsp" %>

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
                        <%                            List<Service_Bean> ser1 = Read_values.get_value_of_SP_Services(Integer.parseInt(request.getParameter("cat_id")));
                            for (Service_Bean s1 : ser1) {
                        %>
                        <!-- Start Left services -->
                        <div class="col-md-4 col-sm-4 col-xs-12">
                            <div class="about-move">
                                <div class="services-details">
                                    <div class="single-services">
                                        <a class="services-icon" href="service_action_cust.jsp?service_id=<%=s1.getService_id()%>">
                                            <i class="fa fa-code"></i>
                                        </a>
                                        <h4><%=s1.getService_name()%></h4>
                                        <p>
                                            Services Offered : <%=s1.getSub_service_name()%>
                                        </p>
                                    </div>
                                </div>
                                <!-- end about-details -->
                            </div>
                        </div>
                        <% }%>
                    </div>
                </div>
            </div>
        </div>
        <%@include file = "customer_footer.jsp" %>
    </body>
</html>
