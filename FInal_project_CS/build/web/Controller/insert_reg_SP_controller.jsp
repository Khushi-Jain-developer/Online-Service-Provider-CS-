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

            String email = request.getParameter("eid");
            String pwd = request.getParameter("pwd");
            String name = request.getParameter("nm");
            String address = request.getParameter("address");
            String city = request.getParameter("city");
            String country = request.getParameter("country");
            String cat_id = request.getParameter("snm");
            String gender = request.getParameter("gender");
            String nationality = request.getParameter("nationality");
            double phn_no = Double.parseDouble(request.getParameter("contact"));
            String DOB = request.getParameter("date");
            insert_values.insert_SP_Reg_Details(name, email, address, pwd, DOB, phn_no, city, country, cat_id, gender, nationality);
            response.sendRedirect("../sp_login.jsp");
        %>
    </body>
</html>
