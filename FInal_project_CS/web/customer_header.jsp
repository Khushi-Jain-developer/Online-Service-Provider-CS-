<%@page import="Common.Customer_bean"%>
<div id="preloader"></div>
<header>
    <!-- header-area start -->
    <div id="sticker" class="header-area">
        <div class="container">
            <div class="row">
                <div class="col-md-12 col-sm-12">
                    <!-- Navigation -->
                    <nav class="navbar navbar-default">
                            <!-- Brand -->
                            <a class="navbar-brand page-scroll sticky-logo" href="index.html">
                                <h1><span>City</span>-Sermon</h1>
                            </a>
                        </div>
                        <!-- Collect the nav links, forms, and other content for toggling -->
                        <div class="collapse navbar-collapse main-menu bs-example-navbar-collapse-1" id="navbar-example">
                            <ul class="nav navbar-nav navbar-right">
                                <li class="active">
                                    <a class="page-scroll" href="#home">Home</a>
                                </li>
                                <li>
                                    <a class="page-scroll" href="#about">AboutUs</a>
                                </li>
                                <li>
                                    <a class="page-scroll" href="#services">Services</a>
                                </li>
                                <li>
                                    <a class="page-scroll" href="#team">Category</a>
                                </li>
                                <%
                                    if (session.getAttribute("Customer_nm") != null) {
                                        //customer is logged in
                                        Customer_bean up = (Customer_bean) session.getAttribute("Customer_nm");
                                %>
                                <li><a href="#">Welcome <%=up.getName()%></a></li>
                                <li><a href="customer_logout.jsp">Logout</a></li>
                                    <%
                                    } else {
                                    //customer is not logged in
                                    %>
                             
                                <li class="dropdown"><a href="#" class="dropdown-toggle" data-toggle="dropdown">Login/SignUp<span class="caret"></span></a>
                                    <ul class="dropdown-menu" role="menu">
                                        <li><a href="customer_login.jsp">Login</a></li>
                                        <li><a href="customer_reg.jsp">SignUp</a></li>
                                    </ul> 
                                </li>
                                    <%
                                        }
                                    %>

                                <li>
                                    <a class="page-scroll" href="#contact">Privacy Policy</a>
                                </li>
                                 <li>
                                    <a class="page-scroll" href="#blog">Professional</a>
                                </li>
                                <li>
                                    <a class="page-scroll" href="mycart_cust.jsp">My Cart</a>
                                </li>
                                <li>
                                    <a class="page-scroll" href="blog_review.jsp">Reviews</a>
                                </li>
                            </ul>
                        </div>
                       
                </div>
            </div>
        </div>
   
    <!-- header-area end -->
</header>
<!-- header end -->
<!-- Start Slider Area -->
<div id="home" class="slider-area">
    <div class="bend niceties preview-2">
        <div id="ensign-nivoslider" class="slides">
            <img src="img/slider/technology.jpg" alt="" title="#slider-direction-1" />
            <img src="img/slider/home.jpg" alt="" title="#slider-direction-2" />
            <img src="img/slider/laptop1.jpg" alt="" title="#slider-direction-3" />
        </div>
        <!-- direction 1 -->
        <div id="slider-direction-1" class="slider-direction slider-one">
            <div class="container">
                <div class="row">
                    <div class="col-md-12 col-sm-12 col-xs-12">
                        <div class="slider-content">
                            <!-- layer 1 -->
                            <div class="layer-1-1 hidden-xs wow slideInDown" data-wow-duration="2s" data-wow-delay=".2s">
                                <h2 class="title1">City-Sermon Online Service Provider Web App</h2>
                            </div>
                            <!-- layer 2 -->
                            <div class="layer-1-2 wow slideInUp" data-wow-duration="2s" data-wow-delay=".1s">
                                <h1 class="title2">We understand customer problems & provide efficient solution</h1>
                            </div>
                            <!-- layer 3 -->
                            <div class="layer-1-3 hidden-xs wow slideInUp" data-wow-duration="2s" data-wow-delay=".2s">
                                <a class="ready-btn right-btn page-scroll" href="#services">See Services</a>
                                <a class="ready-btn page-scroll" href="#about">Learn More</a>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <!-- direction 2 -->
        <div id="slider-direction-2" class="slider-direction slider-two">
            <div class="container">
                <div class="row">
                    <div class="col-md-12 col-sm-12 col-xs-12">
                        <div class="slider-content text-center">
                            <!-- layer 1 -->
                            <div class="layer-1-1 hidden-xs wow slideInUp" data-wow-duration="2s" data-wow-delay=".2s">
                                <h2 class="title1">The Best Service Provider</h2>
                            </div>
                            <!-- layer 2 -->
                            <div class="layer-1-2 wow slideInUp" data-wow-duration="2s" data-wow-delay=".1s">
                                <h1 class="title2">Clean-Smart-Fast</h1>
                            </div>
                            <!-- layer 3 -->
                            <div class="layer-1-3 hidden-xs wow slideInUp" data-wow-duration="2s" data-wow-delay=".2s">
                                <a class="ready-btn right-btn page-scroll" href="#services">See Services</a>
                                <a class="ready-btn page-scroll" href="#about">Learn More</a>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <!-- direction 3 -->
        <div id="slider-direction-3" class="slider-direction slider-two">
            <div class="container">
                <div class="row">
                    <div class="col-md-12 col-sm-12 col-xs-12">
                        <div class="slider-content">
                            <!-- layer 1 -->
                            <div class="layer-1-1 hidden-xs wow slideInUp" data-wow-duration="2s" data-wow-delay=".2s">
                                <h2 class="title1">Easy to Manage</h2>
                            </div>
                            <!-- layer 2 -->
                            <div class="layer-1-2 wow slideInUp" data-wow-duration="2s" data-wow-delay=".1s">
                                <h1 class="title2">City-Sermon is your one-stop shop for all your home services needs and much, much more..</h1>
                            </div>
                            <!-- layer 3 -->
                            <div class="layer-1-3 hidden-xs wow slideInUp" data-wow-duration="2s" data-wow-delay=".2s">
                                <a class="ready-btn right-btn page-scroll" href="#services">See Services</a>
                                <a class="ready-btn page-scroll" href="#about">Learn More</a>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>
<!-- End Slider Area -->