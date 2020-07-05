<%@page import="CRUD.insert_values"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%

            String name = request.getParameter("c1");
            String email = request.getParameter("c2");
            String address = request.getParameter("c3");
            String password = request.getParameter("c4");
            String DOB = request.getParameter("date");
            String gender = request.getParameter("c9");
            Long contact = Long.parseLong(request.getParameter("c10"));
            insert_values.insert_Cust_Reg_Details(name, email, address, password, DOB, contact, gender);
            response.sendRedirect("../customer_login.jsp");
        %>
    </body>
</html>
