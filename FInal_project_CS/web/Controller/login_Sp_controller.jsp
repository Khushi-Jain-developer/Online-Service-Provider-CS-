<%@page import="Common.SP_bean"%>
<%@page import="CRUD.Read_values"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<html>
    <head>
        <title>JSP Page</title>
        <link rel="stylesheet" href="../css/Userlogin.css">
    </head>
    <body>
        <%
            String email = request.getParameter("email");
            String pwd = request.getParameter("password");
            System.out.println("value of email and pwd is " + email + pwd);
            SP_bean sp = Read_values.get_value_of_spLogin(email, pwd);
            if (sp.getName() == null) {  //invalid login
                System.out.println("invalid login");
        %>
        <script>
            alert('Invalid Login !!');
        </script>
        <%@include file="../sp_login.jsp" %>
        <%
            } else {
                //valid login
                System.out.println("valid login");
                session.setAttribute("SP", sp);
                response.sendRedirect("../index_sp.jsp");
            }
        %>
    </body>
</html>
