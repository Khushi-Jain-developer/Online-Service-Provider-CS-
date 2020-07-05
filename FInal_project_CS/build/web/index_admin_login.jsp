
<html>
    <head>
       
        <title>Insert title here</title>
        <link href="https://fonts.googleapis.com/css?family=Poppins:300,400,500,600,700,800,900" rel="stylesheet">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
        <link rel="stylesheet" href="css/main.css">
        <link rel="stylesheet" href="css/style_1.css">
        <style>
            #admin_form{
                margin-left: 100px;
            }
        </style>
    </head>


    <body>
        <div class="wrapper d-flex align-items-stretch" style="margin-top:-30px;" >
            <%@include file="admin_header.jsp" %>
            <nav id="sidebar">
                <div class="custom-menu"><button type="button" id="sidebarCollapse" class="btn btn-primary">
                        <i class="fa fa-bars"></i>
                        <span class="sr-only">Toggle Menu</span>
                    </button></div>
                <h1 style="font-style:san-serif;text-align:center;margin-top:12px;color:#fff;font-size:15px">
                </h1>
                <h1 style="text-align:center"><a href="#" class="logo">Dashboard</a></h1>
                <ul class="list-unstyled components mb-5">
                    <li class="active"><a href="#"><span class="fa fa-paper-plane mr-3"></span>Home Page</a></li>
                    <li><a href="#"><span class="fa fa-paper-plane mr-3"></span>Category</a></li>
                    <li><a href="#"><span class="fa fa-paper-plane mr-3"></span>Services</a></li>
                    <li><a href="#"><span class="fa fa-paper-plane mr-3"></span>Booking-Details</a></li>
                    <li><a href="#"><span class="fa fa-paper-plane mr-3"></span>Payment Details</a></li>
                    <li><a href="#"><span class="fa fa-paper-plane mr-3"></span>Reviews</a></li>
                    <li><a href="#"><span class="fa fa-paper-plane mr-3"></span>Customer-Speaks</a></li>
                    <li><a href="#"><span class="fa fa-paper-plane mr-3"></span>Report</a></li>
                </ul>
            </nav>
            <!-- Page Content  -->
            <div style="margin-left:500px;">
                <%@include file="adminlogin_form.jsp" %>
                <p></p>
            </div>
        </div>
        <script src="js/jquery.min.js"></script>
        <script src="js/popper.js"></script>
        <script src="js/bootstrap.min.js"></script>
        <script src="js/main.js"></script>
    </body>
</html>