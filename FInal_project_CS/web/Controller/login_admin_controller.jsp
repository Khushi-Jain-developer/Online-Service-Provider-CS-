<%@page import="CRUD.Read_values"%>
<%@page import="Common.Admin_Bean"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            String email = request.getParameter("email");
            String pwd = request.getParameter("password");
            Admin_Bean ad = Read_values.get_value_of_adminLogin(email, pwd);
            response.sendRedirect("../index_admin.jsp");
        %>
    </body>
</html>
