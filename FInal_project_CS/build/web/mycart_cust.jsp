<%@page import="CRUD.Read_values"%>
<%@page import="java.util.List"%>
<%@page import="Common.Assign_SP_Bean"%>
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
    <center>
         <h1 align ="center" style="margin-top: 50px;color:black;text-decoration-line: underline;font-size: 40px">ADD TO CART</h1>
        <table border="2">
            <tr>
                <th>Assign-Id</th>
                <th>Booking-Id</th>
                <th>Customer-Id</th>
                <th>SP-Id</th>
                <th>Status</th>
                <th>Service-Date</th>
                <th>Assign-Date</th>
                <th>Payment</th>
            </tr>
            <%                 Customer_bean sb = (Customer_bean) session.getAttribute("Customer_nm");
                List<Assign_SP_Bean> a1 = Read_values.fetchAllCustBookings_ByCustomerId(sb.getCust_id());
                for (Assign_SP_Bean s2 : a1) {


            %>
            <tr id ="row">
                <td id ="td"><%= s2.getAssign_id()%></td>
                <td id ="td"><%=s2.getBook_id()%></td>
                <td id ="td"><%= s2.getCust_id()%></td>
                <td id ="td"><%= s2.getSp_id()%></td>
                <td id ="td">
                    <%
                        if (s2.getStatus() == 0) {
                    %>Booking awaited 

                    <%
                    } else {
                    %>Booking Confirmed<%
                        }
                    %>
                </td> 
                <td id = "id"><%=s2.getService_date()%></td>
                <td id ="td"><%= s2.getAssign_date()%></td>
                <td>
                    <%
                        if (s2.getStatus() == 0) {
                        } else {
                    %><a href="pay_customer.jsp?assign_id=<%=s2.getAssign_id()%>&sp_id=<%=s2.getSp_id()%>&book_id=<%=s2.getBook_id()%>">Proceed to Payment</a><%
                                }
                    %>
                </td>
            </tr>
            <%
                }
            %>
        </table>
    </center>
    <%@include file="customer_footer.jsp" %>
</body>
</html>
