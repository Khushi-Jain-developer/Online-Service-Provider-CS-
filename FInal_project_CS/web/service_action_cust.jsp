<%@page import="CRUD.Read_values"%>
<%@page import="CRUD.insert_values"%>
<%@page import="Common.Ques_Bean"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
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
                                <br>
                                <form action="Controller/feedback_controller.jsp" method="post">
                                    <table style="margin-top:-4%">
                                        <tr>
                                            <td>Customer-Id:</td>
                                            <%  Customer_bean c = (Customer_bean) session.getAttribute("Customer_nm");%>
                                            <td><input type="text" name="cid" value="<%=c.getCust_id()%>"></td>
                                        </tr>
                                        <tr>
                                            <td>Feedback:</td>
                                            <td> <textarea rows="8" cols="20" placeholder="Enter feedback" name="Feedback" ></textarea>
                                            </td>
                                        </tr>
                                        <tr>
                                            <td>Service-Id:</td>
                                            <td><input type="text" name="sid" value="<%=request.getParameter("service_id")%>" readonly=""></td>
                                        </tr>
                                        <tr>
                                            <td></td>
                                            <td><input type="submit" value="Submit"></td>
                                        </tr>
                                    </table>
                                </form>
                            </div>
                        </div>
                    </div>
                    <!-- single-well end-->
                    <div class="col-md-6 col-sm-6 col-xs-12">
                        <div class="well-middle">
                            <div class="single-well">
                                <a href="#">
                                    <h4 class="sec-head">Service Questions</h4>
                                </a>
                                <form action="Controller/answer_controller.jsp" method ="post">

                                    <%                                            int x = 1, y = 1;
                                        int service_id = Integer.parseInt(request.getParameter("service_id"));
                                        List<Ques_Bean> list11 = Read_values.fetchAllQuestion(service_id);
                                    %><input type="hidden" name="service_id" value="<%=service_id%>" /><%
                                        if (list11.isEmpty()) {
                                            out.println("No record");
                                        } else {
                                            for (Ques_Bean sb : list11) {
                                                String op = "r" + x;
                                                String q = "ques" + x;
                                    %>

                                    <p>
                                        <br><br>Question : <%=sb.getQuestion()%>
                                        <input type="hidden" name=<%=q%> value="<%=sb.getQuestion_Id()%>" />
                                    </p>
                                    <ul>
                                        <li>
                                            <input type="radio" name="<%=op%>" value="<%=sb.getOption_1()%>"><%=sb.getOption_1()%> (Rs. <%=sb.getPrice_1()%>)
                                            <br><input type="radio" name="<%=op%>" value="<%=sb.getOption_2()%>"><%=sb.getOption_2()%> (Rs. <%=sb.getPrice_2()%>)                                       
                                            <br><input type="radio" name="<%=op%>" value="<%=sb.getOption_3()%>"><%=sb.getOption_3()%>  (Rs. <%=sb.getPrice_3()%>)
                                            <br><input type="radio" name="<%=op%>" value="<%=sb.getOption_4()%>"><%=sb.getOption_4()%>   (Rs. <%=sb.getPrice_4()%>)
                                        </li>
                                    </ul>

                                    <% x++;
                                            }
                                        }%>
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
