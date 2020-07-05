<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.Date"%>
<%@page import="Common.Booking_service_bean"%>
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
            int cust = Integer.parseInt(request.getParameter("cust_id"));

            int service_id = Integer.parseInt(request.getParameter("service_id"));
            int total_price = Integer.parseInt(request.getParameter("total_price"));
            String service_date = request.getParameter("service_date");
            String service_place = request.getParameter("service_place");
            String service_time = request.getParameter("service_time");
            long contact_no = Long.parseLong(request.getParameter("contact_no"));
            Booking_service_bean bsb = new Booking_service_bean();

            Date d = new Date();
            SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd");
            String curDate = sd.format(d);

            bsb.setBooking_date(curDate);
            bsb.setContact_no(contact_no);
            bsb.setCust_id(cust);
            bsb.setService_date(service_date);
            bsb.setService_id(service_id);
            bsb.setService_place(service_place);
            bsb.setService_time(service_time);
            bsb.setTotal_price(total_price);

            insert_values.insert_booking_details(bsb);
            // System.out.println(bsb.getCust_id()+":"+bsb.getService_id()+":"+bsb.getTotal_price()+":"+bsb.getBooking_date()+":"+bsb.getService_date()+":"+bsb.getService_place()+":"+bsb.getService_time()+":"+bsb.getContact_no());
            response.sendRedirect("../mycart_cust.jsp");
        %>
    </body>
</html>
