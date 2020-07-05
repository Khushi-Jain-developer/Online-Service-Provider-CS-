<%-- 
    Document   : cust_logout
    Created on : 5 Mar, 2020, 5:04:57 PM
    Author     : Khushi
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            session.setAttribute("Customer-nm", null);
            response.sendRedirect("customer_login.jsp");
        %>
    </body>
</html>
