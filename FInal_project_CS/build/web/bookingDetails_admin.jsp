<%@page import="Common.Assign_SP_Bean"%>
<%@page import="CRUD.Read_values"%>
<%@page import="Common.SP_bean"%>
<%@page import="Common.Service_Bean"%>
<%@page import="Common.Booking_service_bean"%>
<%@page import="java.util.List"%>
<%@page import="CRUD.insert_values"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <style>
            #book1{

                margin-top:150px;
                font-family:san-serif;
                text-align:center;
                font-size:20px;
                width:100%;
            }
        </style>
    </head>
    <body style ="background-image: url(img/background/des.jpg); background-repeat: no-repeat; background-size: cover">
        <%@include file="admin_header.jsp" %>
        <div id="book1">
            <h1 align ="center">Bookings-Info</h1>
            <table align ="center" border="1" style="background-image: url(img/background/light.jpg); background-repeat: no-repeat; background-size: cover;color:black;border:collapse">               
                <tr>
                    <th>Booking-Id</th>
                    <th>Category-Id</th>
                    <th>Service-Id</th>
                    <th>Service-Name</th>
                    <th>Customer-Id</th>
                    <th>Total-Price</th>
                    <th>Booking-Date</th>
                    <th>Service-Location</th>
                    <th>Service-Date</th>
                    <th>Service-Time</th>
                    <th>Contact-No</th>
                    <th>Service-Provider</th>
                    <th></th>
                </tr>
                <%
                    List<Booking_service_bean> a1 = Read_values.get_value_of_Booking_services();
                    for (Booking_service_bean s2 : a1) {
                        Service_Bean sb = Read_values.get_value_of_Services_by_serviceId(s2.getService_id());
                %>
                <tr id ="row">
                    <td id ="td"><%=s2.getBooking_id()%></td>
                    <td id ="id"><%=sb.getCategory()%></td>         <!-- category id -->
                    <td id ="td"><%= s2.getService_id()%></td>
                    <td id ="td"><%=sb.getService_name()%></td>        <!-- service name -->
                    <td id ="td"><%= s2.getCust_id()%></td>
                    <td id ="td"><%= s2.getTotal_price()%></td>
                    <td id ="td"><%= s2.getBooking_date()%></td>   <!-- booking date -->
                    <td id ="td"><%= s2.getService_place()%></td>
                    <td id ="td"><%= s2.getService_date()%></td>
                    <td id ="td"><%= s2.getService_time()%></td>
                    <td id ="td"><%= s2.getContact_no()%></td>
                    <%
                        Assign_SP_Bean as = Read_values.checkBookingAssignedOrNot(s2.getBooking_id());
                        if (as.getSp_id() != 0) {//booking is assigned
%><td id="td" colspan="2"><%=as.getSp_id()%></td>
                    <%
                    } else {
                    %>
                <form action="Controller/assign_sp_booking_controller.jsp" method="post" >
                    <td id="td">
                        <input type="hidden" name="book_id" value="<%=s2.getBooking_id()%>">
                        <input type="hidden" name="cust_id" value="<%=s2.getCust_id()%>">
                        <select name="sps">                       
                            <option disabled selected>Choose any one</option>     
                            <%
                                List<SP_bean> a2 = Read_values.fetchAllSP_ByCat_Id(Integer.parseInt(sb.getCategory()));
                                for (SP_bean u : a2) {
                            %>
                            <option value="<%= u.getSp_id()%>"><%= u.getName()%></option>

                            <%
                                }
                            %>
                        </select>
                    </td>
                    <td id ="td"><input type="submit" value="Assign"</td></form></tr>
                </form>
                <%
                        }
                    }
                %>
            </table>
        </div>
    </body>
</html>
