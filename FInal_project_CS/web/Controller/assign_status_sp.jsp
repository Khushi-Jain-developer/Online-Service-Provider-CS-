 <%@page import="CRUD.Read_values"%>
<%@page import="Common.Assign_SP_Bean"%>
<%@page import="java.util.List"%>
<%@page import="Common.SP_bean"%>

<% 
          int status = Integer.parseInt(request.getParameter("statuss"));
          int assign_id = Integer.parseInt(request.getParameter("assign_id"));
          System.out.println("value of ID is :" +assign_id);
          int a = Integer.parseInt(request.getParameter("cbc"));
           System.out.println("value of a is " +a);
 %>
 
           <% 
             SP_bean sp = (SP_bean) session.getAttribute("SP");
            List<Assign_SP_Bean> a1 = Read_values.get_AllAssignSP_BySpId(sp.getSp_id());
            for (Assign_SP_Bean s2 : a1) {
                %>
                <%
                if(a == 1)
                {%>
<a href="Controller/sp_confirm_booking_controller.jsp?assign_id=
                   <%=s2.getAssign_id()%>">Confirm Booking</a>
      <% }
       else if(a == 2)
       {
           %>
           <a href="Controller/sp_reSchedule_controller.jsp?assign_id=
                   <%=s2.getAssign_id()%>">Request for re-schedule Booking</a>
      <% }
       else{
           %>
           <a href="Controller/sp_cancel_booking_controller.jsp?assign_id=
                   <%=s2.getAssign_id()%>">Cancel Booking</a>
                   <%
       }   }
                   %>