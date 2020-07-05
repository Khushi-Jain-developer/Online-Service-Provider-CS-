<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.Date"%>
<%@page import="CRUD.Read_values"%>
<%@page import="java.util.List"%>
<%@page import="Common.Customer_bean"%>
<%@page import="Common.Query_bean"%>
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
            String name = request.getParameter("name");
            System.out.println("value of name is:" + name);
            String email = request.getParameter("email");
            System.out.println("value of email is:" + email);
            String message = request.getParameter("subject");
            System.out.println("value of meassage is:" + message);
            Query_bean qb = new Query_bean();
            Date d = new Date();
            SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd");
            String curDate = sd.format(d);
            System.out.println("value of date is:" + curDate);
            qb.setDate(curDate);
            qb.setName(name);
            qb.setEmail(email);
            qb.setMsg(message);
            System.out.println("current date is " + (qb.getDate()));// to print on console screen to check date
            insert_values.Insert_Query(qb);
            System.out.println("Successful inserted");
            response.sendRedirect("../customer_login.jsp");
        %>
    </body>
</html>
