<%@page import="Common.SP_bean"%>
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
            String categoryname = request.getParameter("cate");
            System.out.println("Value of cate is :" + categoryname);
            String service = request.getParameter("s1");
            System.out.println("value if s1 is :" + service);
            String sub_service = request.getParameter("s2");
            System.out.println("value of s2 is :" + sub_service);
            String price = request.getParameter("s3");
            System.out.println("value of s3 is :" + price);
            String pincode = request.getParameter("s5");
            System.out.println("value of s5 is :" + pincode);
            String date_time = request.getParameter("s6");
            System.out.println("value of date is :" + date_time);
            SP_bean sp = (SP_bean) session.getAttribute("SP");
            int spid = sp.getSp_id();
            System.out.println("value of sp_id is : " + spid);
            insert_values.insert_services(service, sub_service, price, pincode, date_time, categoryname, spid);
            response.sendRedirect("../service_form.jsp");
        %>
    </body>
</html>