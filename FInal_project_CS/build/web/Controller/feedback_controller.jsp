<%@page import="Common.Feedback_bean"%>
<%@page import="CRUD.insert_values"%>
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
            int cust_id = Integer.parseInt(request.getParameter("cid"));
            String feedback = request.getParameter("Feedback");
            int service_id = Integer.parseInt(request.getParameter("sid"));
            Date d = new Date();
            SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd");
            String curDate = sd.format(d);
            String date = curDate;
            Feedback_bean fb = new Feedback_bean(feedback, service_id, cust_id, date);
            insert_values.insert_feedback(fb);
            response.sendRedirect("../index_cust.jsp");
        %>
    </body>
</html>
