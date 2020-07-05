<%-- 
    Document   : category_info
    Created on : 10 Apr, 2020, 1:43:52 PM
    Author     : Khushi
--%>


<%@include file = "category_action.jsp" %>
<center>
    <h3 style = "margin-top: 20px;text-decoration-line: underline;">CATEGORY - INFO</h3>
    <table align = "center" border="1" style="margin-top: 30px; width:70%;background-image: url(img/background/bg1.jpg); background-repeat: no-repeat; background-size: cover">
        <tr style = "font-weight: bold;font-size: 24px;text-align: center">
            <th style ="width:5%;">S.No</th>
            <th style ="width:20%;">Category Name</th>
            <th style ="width:45%;">Description</th>
            <th style ="width:25%;">Image</th>
            <th colspan ='5' style ="width:45%;">Edit buttons</th>
        </tr>
        <%
            List<Category_bean> a1 = Read_values.fetchAllCategory();
            for (Category_bean s2 : a1) {
        %>
        <tr style = "color:blue;text-align: center;font-size: 20px">
            <td><%= s2.getCategory_id()%></td>
            <td style="height:30px;width:5%"><%= s2.getCategory_name()%></td>
            <td style="height:30px;width:40%"><%= s2.getCategory_desc()%></td>

            <td style="height:30px;width:20%"><img src=UploadedData/<%=s2.getCategory_img()%> height="100" width="100"></td>


            <td><a href="RegDeleteServ?id=<%=s2.getCategory_id()%>">Delete</a></td>
            <td><a href="edit.jsp?id=<%=s2.getCategory_id()%>">Update</a></td>
        </tr>
        <tr></tr>
        <tr></tr>
        <%
            }

        %>
    </table>
</center>