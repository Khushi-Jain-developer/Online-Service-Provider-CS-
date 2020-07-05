<%@page import="Common.Booking_service_bean"%>
<%@page import="CRUD.Read_values"%>
<%@page import="Common.Assign_SP_Bean"%>
<%@page import="Common.Customer_bean"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
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
    <body style ="background-image: url(img/slider/phone.jpg); background-repeat: no-repeat; background-size: cover">
        <header>
            <!-- header-area start -->
            <div id="sticker" class="header-area">
                <div class="container">
                    <div class="row">
                        <div class="col-md-12 col-sm-12">

                            <!-- Navigation -->
                            <nav class="navbar navbar-default">
                                <!-- Brand and toggle get grouped for better mobile display -->
                                <div class="navbar-header">
                                    <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target=".bs-example-navbar-collapse-1" aria-expanded="false">
                                        <span class="sr-only">Toggle navigation</span>
                                        <span class="icon-bar"></span>
                                        <span class="icon-bar"></span>
                                        <span class="icon-bar"></span>
                                    </button>
                                    <!-- Brand -->
                                    <a class="navbar-brand page-scroll sticky-logo" href="index.html">
                                        <h1><span>City</span>-Sermon</h1>
                                        <!-- Uncomment below if you prefer to use an image logo -->
                                        <!-- <img src="img/logo.png" alt="" title=""> -->
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
                                        <span class="caret"></span>
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
                                            <a class="page-scroll" href="#contact">Query</a>
                                        </li>
                                    </ul>
                                </div>
                                <!-- navbar-collapse -->
                            </nav>
                            <!-- END: Navigation -->
                        </div>
                    </div>
                </div>
            </div>
            <!-- header-area end -->
        </header>
        <h1 style="margin-top: 150px ;text-align:center;text-decoration-line: underline;font-size: 45px;color:black;">SELECT PAYMENT METHOD</h1></br>
    <center>
        <form action ="Controller/insertBookDetails_pay_controller.jsp" method="post" >
            <table style = "color:#fff; background-repeat: no-repeat; background-size: cover;margin-top: 30px">

                <tr style = "font-weight: bold;font-size: 24px;"><td style="height:30px;width:20%">
                    <td>Assign-Id:-</td>
                    <td><input type="text" name ="assign_id" value="<%=request.getParameter("assign_id")%>"></td>
                </tr>
                <tr style = "font-weight: bold;font-size: 24px;"><td style="height:30px;width:20%">
                    <td>Customer-Id:-</td>

                    <%
                        Customer_bean c = (Customer_bean) session.getAttribute("Customer_nm");
                    %>
                    <td><input type="text" name ="customer_id" value="<%=c.getCust_id()%>" />
                    </td>
                </tr>
                <tr style = "font-weight: bold;font-size: 24px;"><td style="height:30px;width:20%">
                    <td>Total Price:-</td>
                    <%

                        Booking_service_bean bb = new Booking_service_bean();
                        bb = Read_values.get_totalPrice_ByBookId(Integer.parseInt(request.getParameter("book_id")));
                    %>
                    <td><input type="text" name ="total_price" value="<%=bb.getTotal_price()%>"></td>
                </tr>
                <tr style = "font-weight: bold;font-size: 24px;"><td style="height:30px;width:20%">
                    <td>SP_Id:-</td>
                    <%
                        Assign_SP_Bean as = new Assign_SP_Bean();
                        as = Read_values.get_AllPaymentDetails_ByAssignId(Integer.parseInt(request.getParameter("assign_id")));

                    %>
                    <td><input type="text" name ="sp_id" value="<%=as.getSp_id()%>"></td>
                </tr>
                <tr style = "font-weight: bold;font-size: 24px;"><td style="height:30px;width:20%">

                    <td>Payment Method:-</td>

                    <td> Credit card<input type="radio" name="pay" ></td></tr>
                <tr style = "font-weight: bold;font-size: 24px;"><td style="height:30px;width:20%">
                    <td></td>
                    <td> Net Banking<input type="radio" name="pay"></td></tr>
                <tr style = "font-weight: bold;font-size: 24px;"><td style="height:30px;width:20%">
                    <td></td>
                    <td> Debit Card<input type="radio" name="pay"></td>
                </tr>

                <tr style = "font-weight: bold;font-size: 24px;"><td style="height:30px;width:20%"> <td></td><td>Choose any one:<select name="bank_name">
                            <optgroup label="Select Your Bank">
                                <option value="Allahabad Bank">Allahabad Bank</option> 
                                <option value="Canara Bank">Canara Bank</option> 
                                <option value="Axis Bank">Axis Bank</option> 
                                <option value="ICICI Bank">ICICI Bank</option> 
                                <option value="Dena Bank">Dena Bank</option> 
                                <option value="Kotak Mahindra Bank">Kotak Mahindra Bank</option> 
                                <option value="Bank Of Baroda">Bank Of Baroda</option> 
                                <option value="HDFC bank">HDFC bank</option> 
                                <option value="State Bank Of India">State Bank Of India</option>   
                            </optgroup>
                        </select></td></tr>
                <tr style = "font-weight: bold;font-size: 24px;"><td style="height:30px;width:20%">
                    <td>Name on the card:-</td>
                    <td><input type="text" name="nm" placeholder="Name on Card"></td>
                </tr>
                <tr style = "font-weight: bold;font-size: 24px;"><td style="height:30px;width:20%">
                    <td>Card No.:-</td>
                    <td><input type="text" name="card_no" placeholder="16 Digit Card No."></td>
                <tr style = "font-weight: bold;font-size: 24px;"><td style="height:30px;width:20%">
                    <td>Expiration Date:-</td>
                    <td><input type="month" name="date"></td>
                </tr>
                <tr style = "font-weight: bold;font-size: 24px;"><td style="height:30px;width:20%">
                    <td>CVV:-</td>
                    <td><input type="text" name="cvv" placeholder="3 digits on back side"></td>
                </tr>
                <tr style = "font-weight: bold;font-size: 24px;"><td style="height:30px;width:20%">
                    <td></td>
                    <td><input type="submit" value="submit"></td>
                </tr></table>
        </form>
    </center>
    <!-- End About area -->
</body>
</html>
