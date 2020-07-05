<%@page import="CRUD.insert_values"%>
<%@page import="Common.Assign_SP_Bean"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.Date"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            int book_id = Integer.parseInt(request.getParameter("book_id"));
            int sp_id = Integer.parseInt(request.getParameter("sps"));
            int cust_id = Integer.parseInt(request.getParameter("cust_id"));
            int status = 0;
            Date d = new Date();
            SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd");
            String curDate = sd.format(d);
            String serv_date = request.getParameter("service_date");
            Assign_SP_Bean ab = new Assign_SP_Bean(book_id, cust_id, sp_id, status, curDate, serv_date);
            insert_values.assignSP(ab);
            response.sendRedirect("../index_admin.jsp");
        %>
    </body>
</html>
