<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body style="color: white; background-image: url(img/slider/slider2.jpg); background-repeat: no-repeat; background-size: cover">
        <%@include file="admin_header_menu.jsp"%>
        <div style="width:100%; margin-top: 130px;" >
            <div style="width:400px;float: left">
                <br><br><br><br><br><br>
                <h2 align="center" style="background-color: red;width:400px;">Select The Report You Want To Generate</h2>
                <br><br><br>
                <center>
                    <form action="view_report_admin.jsp">
                        <select name="s" style="background-color: chartreuse;height:40px">
                            <option selected disabled>Choose any one</option>
                            <option value="1">List of registered Customers</option>
                            <option value="2">List of registered Service-Providers</option>
                            <option value="3">List of Services registered by different Vendors</option>
                            <option value="4">List of payments given by Customers</option>
                            <option value="5">List of registered feedbacks given by customer</option>
                            <option value="6">List of bookings booked by customer</option>
                            <option value="7">List of offers and packages offered by different Vendors</option>
                            <option value="8">Admin registration Details</option>
                            <option value="9">List of questions asked by vendors</option>
                            <option value="10">Location details</option>
                        </select><br><br><br><br><br><br><br>
                        <input type="submit" value ="submit" style="background-color: red;height:40px;color:#fff;font-size: 20px"/>
                    </form>
                </center>
            </div>
