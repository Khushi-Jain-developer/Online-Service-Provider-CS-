<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.Date"%>
<%@page import="Common.Payment_bean"%>
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
            System.out.println(assign_id);
            int cust_id = Integer.parseInt(request.getParameter("customer_id"));
            System.out.println(cust_id);
            int total_price = Integer.parseInt(request.getParameter("total_price"));
            System.out.println(total_price);
            int sp_id = Integer.parseInt(request.getParameter("sp_id"));
            System.out.println(sp_id);
            String pay_mode = request.getParameter("pay");
            System.out.println(pay_mode);
            String bank_name = request.getParameter("bank_name");
            System.out.println(bank_name);
            long card_no = Long.parseLong(request.getParameter("card_no"));
            System.out.println(card_no);
            String cardholder_name = request.getParameter("nm");
            System.out.println(cardholder_name);
            String exp_date = request.getParameter("date");
            System.out.println(exp_date);
            int cvv = Integer.parseInt(request.getParameter("cvv"));
            System.out.println(cvv);
            Date d = new Date();
            SimpleDateFormat sd = new SimpleDateFormat("YYYY-MM-dd");
            String curDate = sd.format(d);
            String pay_date = curDate;
            System.out.println(pay_date);
            Payment_bean pb = new Payment_bean(assign_id, cust_id, total_price, pay_date, sp_id, pay_mode, bank_name, card_no, cardholder_name, exp_date, cvv);
            insert_values.insert_Pay_Details(pb);
            response.sendRedirect("../index_cust.jsp");
        %>
    </body>
</html>
