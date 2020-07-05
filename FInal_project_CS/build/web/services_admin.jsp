<%@page import="Common.Category_bean"%>
<%@page import="CRUD.Read_values"%>
<%@page import="Common.Service_Bean"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<style>
    #ser2{
        margin-top:150px;
        font-family:san-serif;
        text-align:center;
        font-size:20px;
        background:linear-gradient(#7b4397,#dc2430);
        width:100%;
        color:white;
    } 
</style>
<body>
    <%@include file="admin_header.jsp"%>
    <div id="ser2">
        <h1 align ="center">Service-Details</h1>
        <table align = "center" style="border:collapse;border:1px solid black;">
            <tr>
                <th>Service-id</th>
                <th>Service-Name</th>
                <th>Sub-Service Name</th>
                <th>Price</th>
               <!-- <th>Date-Time(requested)</th>-->
                <th>Pincode</th>
                <th>Date/Time</th>
                <!--<th>Status</th>-->
                <th>Category</th>
            </tr>
            <%
                List<Service_Bean> a1 = Read_values.get_value_of_SP_Services();
                for (Service_Bean s2 : a1) {
            %>
            <tr id ="row">
                <td id ="td"><%= s2.getService_id()%></td>
                <td id ="td"><%= s2.getService_name()%></td>
                <td id ="td"><%= s2.getSub_service_name()%></td>
                <td id ="td"><%= s2.getPrice()%></td>
                <!--<td id ="td"><%//= s2.getDate_time_requested()%></td>-->
                <td id ="td"><%= s2.getPincode()%></td>
                <td id ="td"><%= s2.getDate_time()%></td>
               <!-- <td id ="td"><%//= s2.getStatus()%></td>-->
                <td id ="td">
                    <%
                        Category_bean cat = Read_values.fetchAllCategoryByCategoryId(s2.getCategory());
                    %>
                    <%= cat.getCategory_name()%>
                </td>
            </tr>
            <%
                }
            %>
        </table>
    </div>
</body>
</html>
