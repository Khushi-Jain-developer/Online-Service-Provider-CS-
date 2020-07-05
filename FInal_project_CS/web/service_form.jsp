<%@page import="Common.Category_bean"%>
<%@page import="CRUD.Read_values"%>
<%@page import="Common.Admin_Bean"%>
<%@page import="CRUD.insert_values"%>
<%@page import="java.util.List"%>
<%@page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<html>
    <head>
        <title>Insert title here</title>
        <link rel="stylesheet" href="css/header.css" />
    </head>
    <body>
        <%@include file="service_action.jsp" %>
        <div id ="form">
            <center>
                <h1 style ="margin-top: 30px;text-decoration-line: underline;font-size: 45px"> ADD NEW SERVICES </h1>
                <form action="Controller/insert_services_controller.jsp" method="post">
                    <table style = "background-image: url(img/background/grren.jfif); background-repeat: no-repeat; background-size: cover;margin-top: 40px">
                        <tr style = "font-weight: bold;font-size: 24px;text-align: center">
                            <%
                                List<Category_bean> al = Read_values.fetchAllCategory();
                            %>
                            <td style="height:40px;width:30%">Choose Category:</td>
                            <td>
                                <select name="cate" style = "height:32px;width:70%;color:#fff;background-color:#800080;">
                                    <%
                                        for (Category_bean u : al) {
                                    %>
                                    <option value="<%=u.getCategory_id()%>"><%=u.getCategory_name()%></option>
                                    <%
                                        }
                                    %>
                                </select>
                            </td>
                        </tr>
                        <tr style = "font-weight: bold;font-size: 24px;text-align: center"><td style="height:40px;width:40%">Add Service:</td>
                            <td><input type="text" name="s1"></td></tr>
                        <tr style = "font-weight: bold;font-size: 24px;text-align: center"><td style="height:40px;width:30%">Sub-Service:</td>
                            <td><input type="text" name="s2"></td></tr>
                        <tr style = "font-weight: bold;font-size: 24px;text-align: center"><td style="height:40px;width:30%">Price:</td>
                            <td><input type="text" name="s3"></td></tr>
                        <tr style = "font-weight: bold;font-size: 24px;text-align: center"><td style="height:40px;width:30%">Pincode:</td>
                            <td><input type="text" name="s5"></td></tr>
                        <tr style = "font-weight: bold;font-size: 24px;text-align: center"><td style="height:40px;width:30%">Date/Time:</td>
                            <td><input type="text" name="s6"></td></tr>
                        <tr style = "font-weight: bold;font-size: 24px;"><td  rowspan="1" style="height:40px;width:30%"></td>
                            <td><input type="submit" value="submit"></td></tr>
                    </table>
                </form>
            </center>
        </div>
    </body>
</html>