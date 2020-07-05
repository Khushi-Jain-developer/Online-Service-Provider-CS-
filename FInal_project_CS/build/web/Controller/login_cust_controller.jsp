<%@page import="Common.Customer_bean"%>
<%@page import="CRUD.Read_values"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            String name = request.getParameter("name");
            String pwd = request.getParameter("password");

            Customer_bean u = Read_values.get_value_of_custLogin(name, pwd);
            if (u.getName() == null) {
                //invalid login
                out.println("invalid login...try again!");
            } else {
                //valid login
                session.setAttribute("Customer_nm", u);
                response.sendRedirect("../index_cust.jsp");
            }
        %>

    </body>
</html>
