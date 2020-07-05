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
            String question = request.getParameter("q1");
            String option_1 = request.getParameter("o1");
            Integer price_1 = Integer.parseInt(request.getParameter("p1"));
            String option_2 = request.getParameter("o2");
            Integer price_2 = Integer.parseInt(request.getParameter("p2"));
            String option_3 = request.getParameter("o3");
            Integer price_3 = Integer.parseInt(request.getParameter("p3"));
            String option_4 = request.getParameter("o4");
            Integer price_4 = Integer.parseInt(request.getParameter("p4"));
            Integer cat_id = Integer.parseInt(request.getParameter("cate"));
            Integer service_id = Integer.parseInt(request.getParameter("ser"));
            Integer sp_id = Integer.parseInt(request.getParameter("sp"));
            System.out.println(price_1 + " : " + price_2 + " : " + price_3 + " : " + price_4);
            insert_values.insert_Ques_SP_Details(question, option_1, price_1, option_2, price_2, option_3, price_3, option_4, price_4, cat_id, service_id, sp_id);
            response.sendRedirect("../ques_form.jsp");

        %>
    </body>
</html>