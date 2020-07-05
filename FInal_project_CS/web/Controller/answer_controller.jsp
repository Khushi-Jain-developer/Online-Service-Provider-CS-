<%@page import="CRUD.Read_values"%>
<%@page import="CRUD.Count_values"%>
<%@page import="Common.Customer_bean"%>
<%@page import="Common.Ques_Bean"%>
<%@page import="Common.Ans_Bean"%>
<%@page import="CRUD.insert_values"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html>
    <head>
        <title>JSP Page</title>
    </head>
    <body>
       <%
           Customer_bean cust = (Customer_bean)session.getAttribute("Customer_nm");
           int cust_id = cust.getCust_id();
           int service_id = Integer.parseInt(request.getParameter("service_id"));
           int qnsCount = Count_values.countQns(service_id);
           System.out.println(qnsCount);
           int x=1;
           int total_price=0;
           for(int i=1; i<=qnsCount; i++)
           {
               int qns_id = Integer.parseInt(request.getParameter("ques"+x));               
               String ans = request.getParameter("r"+x);
               System.out.println(qns_id+" : "+ans);
               int price=0;
               Ques_Bean qb = Read_values.get_ques_by_id(qns_id);
               if(ans.equals(qb.getOption_1()))
                   price = qb.getPrice_1();
               else if(ans.equals(qb.getOption_2()))
                   price = qb.getPrice_2();
               else if(ans.equals(qb.getOption_3()))
                   price = qb.getPrice_3();
               else if(ans.equals(qb.getOption_4()))
                   price = qb.getPrice_4();
               
               total_price = total_price+price;
               
               Ans_Bean ab = new Ans_Bean();
               ab.setAnswer_option(ans);
               ab.setCust_id(cust_id);
               ab.setQ_id(qns_id);
               ab.setService_id(service_id);
               ab.setOption_price(price);
               insert_values.insert_Answer(ab);
               x++;
           }
           response.sendRedirect("../book_service.jsp?service_id="+service_id+"&total="+total_price);
       %> 
    </body>
</html>