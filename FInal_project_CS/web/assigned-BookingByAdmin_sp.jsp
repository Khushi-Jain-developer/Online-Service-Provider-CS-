<%@page import="Common.Customer_bean"%>
<%@page import="Common.Booking_service_bean"%>
<%@page import="CRUD.Read_values"%>
<%@page import="Common.SP_bean"%>
<%@page import="Common.Assign_SP_Bean"%>
<%@page import="java.util.List"%>
<%@page import="CRUD.insert_values"%>

<%@include file="service_action.jsp" %>
<h1 align ="center" style = "margin-top: 50px;text-decoration-line: underline;">Services Alloted By Admin For Registered Customer</h1>
<center>
    <table align = "center" border="1" style="margin-top: 50px;background-image: url(img/background/grren.jfif); background-repeat: no-repeat; background-size: cover">
        <tr style="font-weight: bold;font-size: 24px;text-align: center">
            <th>Assign-Id</th>
            <th>Booking-Id</th>
            <th>Customer</th>
            <th>SP</th>
            <th>Status</th>
            <th>Assign-Date</th>
            <th>Service Date</th>
        </tr>
        <%
            SP_bean sp = (SP_bean) session.getAttribute("SP");
            List<Assign_SP_Bean> a1 = Read_values.get_AllAssignSP_BySpId(sp.getSp_id());
            for (Assign_SP_Bean s2 : a1) {
                System.out.println("service date is :" + s2.getService_date());

        %>
        <tr style = "text-align: center;">
            <td style="height:40px"><%= s2.getAssign_id()%></td>
            <td style="height:40px">
                <%
                    Booking_service_bean b = Read_values.get_totalPrice_ByBookId(s2.getBook_id());
                %>
                <%=s2.getBook_id()%>
            </td>
            <td style="height:40px">
                <%
                    Customer_bean cb = Read_values.get_value_of_cust(s2.getCust_id());
                %>
                <%= cb.getName()%></td>
            <td style="height:40px">
                <%
                    SP_bean sp1 = Read_values.getValue_SP_BySP_Id(s2.getSp_id());
                %>
                <%= sp1.getName()%></td>
            <!-- start drop down box-->
            <td style="height:40px" class = "select"> 
                <%
                    if (s2.getStatus() == 0) {
                                        // sp not accepted service alloted by admin
                %>
                <form action ="Controller/assign_status_sp.jsp" method ="post" >
                    <input type="hidden" name="statuss" value="<%=s2.getStatus()%>">
                    <select name = "cbc">   
                        <option disabled selected>Choose any one</option>
                        <option value="1">Confirm Booking</option>
                        <option value="2">Re-schedule</option>
                        <option value="3">Cancel Booking</option>
                    </select>
                    <input type="submit" value="submit" />
                </form>

                <%
                } else {
                    // sp accepted service alloted by admin
                %>
                <a href="Controller/sp_confirm_booking_controller.jsp?assign_id=
                   <%=s2.getAssign_id()%>"> Booking Confirmed</a>


                <%
                    }
                %>

            </td>
            <td style="height:40px"><%= s2.getAssign_date()%></td>
            <td style="height:40px">

                <%=s2.getService_date()%></td>
        </tr>
        <%
            }

        %>
    </table>
</center>


