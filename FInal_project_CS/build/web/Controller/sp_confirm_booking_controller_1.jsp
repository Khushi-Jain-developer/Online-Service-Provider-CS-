<%-- 
    Document   : sp_confirm_booking
    Created on : 12 Mar, 2020, 12:20:56 AM
    Author     : Khushi
--%>

<%@page import="CRUD.Edit_values"%>
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
            int assign_id = Integer.parseInt(request.getParameter("assign_id"));
            System.out.println("value of assign-id is :" +assign_id);
            Edit_values.updateBookingStatusBySP(assign_id);
            response.sendRedirect("../assigned-BookingByAdmin_sp.jsp");
            
        %>
    </body>
</html>
