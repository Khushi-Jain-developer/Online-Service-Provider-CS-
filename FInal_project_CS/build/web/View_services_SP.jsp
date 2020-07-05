<%@page import="Common.Category_bean"%>
<%@page import="java.util.Iterator"%>
<%@page import="CRUD.Read_values"%>
<%@page import="Common.Service_Bean"%>
<%@page import="java.util.List"%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%@include file="service_action.jsp" %>
    <center>
        <h1 style =" text-decoration-line: underline;margin-top: 30px;font-size: 45px">View All Services</h1>
        <table border='1' style = "background-image: url(img/background/grren.jfif); background-repeat: no-repeat; background-size: cover;margin-top: 70px">
            <tr style = "font-weight: bold;font-size: 24px;text-align: center">
                <td>Service-Id</td>
                <td>Service-Name</td>
                <td>Sub-Service Name</td>
                <td>Price</td>
                <td>Pincode</td>
                <td>Date/Time</td>
                <td>Category</td>
            </tr>
            <%
                SP_bean sp = (SP_bean) session.getAttribute("SP");
                List<Service_Bean> list1 = Read_values.get_value_of_SP_Services_by_SP_id(sp.getSp_id());
                Iterator<Service_Bean> itr = list1.iterator();
                while (itr.hasNext()) {
                    Service_Bean sb = new Service_Bean();
                    sb = itr.next();
            %>
            <tr style = "text-align: center;">
                <td style="height:40px"><%=sb.getService_id()%></td>
                <td style="height:40px"><%=sb.getService_name()%></td>
                <td style="height:40px"><%=sb.getSub_service_name()%></td>
                <td style="height:40px"><%=sb.getPrice()%></td>
                <td style="height:40px"><%=sb.getPincode()%></td>
                <td style="height:40px"><%=sb.getDate_time()%></td>
                <td style="height:40px;width:20%">
                    <%
                        Category_bean cat = Read_values.fetchAllCategoryByCategoryId(sb.getCategory());
                    %>
                    <%= cat.getCategory_name()%></td>
            </tr>
            <%}%>
        </table>
    </center>
</body>
</html>
