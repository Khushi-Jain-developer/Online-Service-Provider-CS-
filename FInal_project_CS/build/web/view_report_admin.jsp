
<%@page import="Common.Feedback_bean"%>
<%@page import="Common.Payment_bean"%>
<%@page import="Common.Ques_Bean"%>
<%@page import="Common.Booking_service_bean"%>
<%@page import="Common.Customer_bean"%>
<%@page import="Common.Category_bean"%>
<%@page import="CRUD.Read_values"%>
<%@page import="Common.SP_bean"%>
<%@page import="Common.Admin_Bean"%>
<%@page import="Common.Service_Bean"%>
<%@page import="java.util.List"%>
<%@page import="CRUD.insert_values"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body style="color: white; background-image: url(img/slider/slider2.jpg); background-repeat: no-repeat; background-size: cover">
        <%@include file="admin_header_menu.jsp"%>
        <div style="width:100%; margin-top: 130px;" >
            <div style="width:400px;float: left">
                <br><br><br><br><br><br>
                <h2 align="center" style="background-color: red;width:400px;">Select The Report You Want To Generate</h2>
                <br><br><br>
                <center>
                    <form action="view_report_admin.jsp">
                        <select name="s" style="background-color: chartreuse;height:40px">
                            <option selected disabled>Choose any one</option>
                            <option value="1">List of registered Customers</option>
                            <option value="2">List of registered Service-Providers</option>
                            <option value="3">List of Services registered by different Vendors</option>
                            <option value="4">List of payments given by Customers</option>
                            <option value="5">List of registered feedbacks given by customer</option>
                            <option value="6">List of bookings booked by customer</option>
                            <option value="7">List of offers and packages offered by different Vendors</option>
                            <option value="8">Admin registration Details</option>
                            <option value="9">List of questions asked by vendors</option>
                            <option value="10">Location details</option>
                        </select><br><br><br><br><br><br><br>
                        <input type="submit" value ="submit" style="background-color: red;height:40px;color:#fff;font-size: 20px"/>
                    </form>
                </center>
            </div>


            <div style="width:1100px; height: 100%; float:right;">
                <br>
                <%
                    int val = Integer.parseInt(request.getParameter("s"));
                    if (val == 1) {
                    //list of registered customers
                %>
                <br>
                <h1 align ="center" style="margin-top: 70px;color:black;text-decoration-line: underline;font-size: 60px">List of Registered Customers</h1>
                <table align ="center" border="1" style="background-image: url(img/background/bluee.jpg); background-repeat: no-repeat; background-size: cover">
                    <tr style="font-weight: bold;font-size: 21px;text-align: center">
                        <th>Customer-Id</th>
                        <th>Name</th>
                        <th>E-Mail</th>
                        <th>Address</th>
                        <th>Password</th>
                        <th>DOB</th>
                        <th>Contact-Info</th>
                        <th>Gender</th>
                    </tr>
                    <%
                        List<Customer_bean> a1 = Read_values.getValueOfCustomer();
                        for (Customer_bean s2 : a1) {
                    %>
                    <tr style="text-align: center">
                        <td id ="td"><%= s2.getCust_id()%></td>
                        <td id ="td"><%= s2.getName()%></td>
                        <td id ="td"><%= s2.getEmail()%></td>
                        <td id ="td"><%= s2.getAddress()%></td>
                        <td id ="td"><%= s2.getPassword()%></td>
                        <td id ="td"><%= s2.getDob()%></td>
                        <td id ="id"><%=s2.getContact()%></td>
                        <td id ="id"><%=s2.getGender()%></td>
                    </tr>
                    <%
                        }

                    %>
                </table>
                <%                      } else if (val == 2) {
              //list of registered service-providers
                %>
                <br>
                <h1 align ="center" style="color:black;text-decoration-line: underline;margin-top: 70px;font-size: 50px">Registered  Service  Providers</h1>
                <table align ="center" border="1" style="background-image: url(img/background/green.jfif); background-repeat: no-repeat; background-size: cover">
                    <tr style="font-weight: bold;text-align: center">
                        <!--<th>SP-Id</th>-->  
                        <th>Name</th>
                        <th>E-Mail</th>
                        <th>Address</th>
                        <th>Password</th>
                        <th>DOB</th>
                        <th>City</th>
                        <th>Country</th>
                        <th>Category</th>
                        <th>Gender</th>
                        <th>Nationality</th>
                        <th>Contact-Info</th>
                    </tr>
                    <%
                        List<SP_bean> a1 = Read_values.get_value_of_SP_Reg_Details();
                        for (SP_bean s2 : a1) {
                    %>
                    <tr style="text-align: center">
                        <td id ="td"><%= s2.getName()%></td>
                        <td id ="td"><%= s2.getE_mail()%></td>
                        <td id ="td"><%= s2.getAddress()%></td>
                        <td id ="td"><%= s2.getPassword()%></td>
                        <td id ="td"><%= s2.getDob()%></td>
                        <td id ="td"><%= s2.getCity()%></td>
                        <td id ="td"><%= s2.getCountry()%></td>
                       <%
                                Category_bean cat = Read_values.ReadAllCategoryByCategoryId(s2.getCat_id());
                                System.out.println("value of cat_id is :" +s2.getCat_id());
                            %>
                        <td id ="td"><%=cat.getCategory_name()%></td>
                        <td id ="id"><%=s2.getGender()%></td>
                        <td id ="id"><%=s2.getNationality()%></td>
                        <td id ="id"><%=s2.getPhn_no()%></td>
                    </tr>
                    <%
                        }
                    %>
                </table>

                <%
                } else if (val == 3) {
                            //List of services registered by different vendors
                %>
                <br>
                <h1 align ="center" style="color:black;text-decoration-line: underline;margin-top: 70px;font-size: 50px">List Of Registered Services</h1>
                <table border="1" style="background-image: url(img/background/l.jpg); background-repeat: no-repeat; background-size: cover;color:black">
                    <tr style="font-weight: bold;text-align: center">

                        <th>Service-id</th>
                        <th>Service-Name</th>
                        <th>Sub-Service Name</th>
                        <th>Price</th>
                        <th>Pincode</th>
                        <th>Registered date</th>
                        <th>Category</th>
                        <th>SP</th>
                    </tr>
                    <%
                        List<Service_Bean> a1 = Read_values.get_value_of_SP_Services();
                        for (Service_Bean s2 : a1) {
                    %>
                    <tr style = "text-align: center">   
                        <td id ="td"><%= s2.getService_id()%></td>
                        <td id ="td"><%= s2.getService_name()%></td>
                        <td id ="td"><%= s2.getSub_service_name()%></td>
                        <td id ="td"><%= s2.getPrice()%></td>
                        <td id ="td"><%= s2.getPincode()%></td>
                        <td id ="td"><%= s2.getDate_time()%></td>
                        <td id ="td">
                            <%
                                Category_bean cat = Read_values.fetchAllCategoryByCategoryId(s2.getCategory());
                            %>
                            <%= cat.getCategory_name()%>
                          </td>
                          <%
                          SP_bean spobj = Read_values.getValue_SP_BySP_Id(s2.getSp_id());
                          %>
                          <td><%=spobj.getName()%></td>
                    </tr>
                    <%
                        }
                    %>
                </table>

                <%
                } else if (val == 4) {
                     //List of payments given by customer
                %>
                <br>
                <h1 align ="center" style="color:black;text-decoration-line: underline;margin-top: 70px;font-size: 50px">Payment - Details</h1>
                <table align ="center" border="1" style="background-image: url(img/background/grey.jpeg); background-repeat: no-repeat; background-size: cover">
                                        <tr style="font-weight: bold;text-align: center">

                        <th>Pay-Id</th>
                        <th>Assign_Id</th>
                        <th>Customer</th>
                        <th>Total Price</th>
                        <th>Payment-Date</th>
                        <th>SP</th>
                        <th>Payment-Mode</th>
                        <th>Bank Name</th>
                        <th>Card Number</th>
                        <th>Cardholder Name</th>
                        <th>Expiry-Date</th>
                        <th>CVV</th>
                    </tr>
                    <%
                        List<Payment_bean> pp = Read_values.fetchAllPayment();
                        for (Payment_bean p : pp) {
                    %>
                    <tr style = "text-align: center;">

                        <td><%=p.getPay_id()%></td>
                      
                        <td><%=p.getAssign_id()%></td>
                        <td>
                            <%
                             Customer_bean ad = Read_values.get_value_of_cust(p.getCust_id());
                            %>
                            <%=ad.getName()%></td>
                        <td><%=p.getTotal_price()%></td>
                        <td><%=p.getPay_date()%></td>
                        <td>
                            <%
                          SP_bean spobj1 = Read_values.getValue_SP_BySP_Id(p.getSp_id());
                          %>
                            <%=spobj1.getName()%></td>
                        <td><%=p.getPay_mode()%></td>
                        <td><%=p.getBank_name()%></td>
                        <td><%=p.getCard_no()%></td>
                        <td><%=p.getCardholder_name()%></td>
                        <td><%=p.getExp_date()%></td>
                        <td><%=p.getCvv()%></td>
                    </tr>
                    <%
                        }
                    %>
                </table>
                <%
                } else if (val == 5) {
                    //List of registered feedbacks given by customer
                %>
                <br>
                <h1 align ="center" style="color:black;text-decoration-line: underline;margin-top: 70px;font-size: 50px">Feedback - Info</h1>
                <table align ="center" border="1" style="background-image: url(img/background/light4.jpg); background-repeat: no-repeat; background-size: cover">
                   <tr style="font-weight: bold;text-align: center">
                        <th>Feedback-Id</th>
                        <th>Customer</th>
                        <th>Service</th>
                        <th>Feedback</th>
                        <th>Date</th>
                    </tr>
                    <%
                        List<Feedback_bean> f = Read_values.getValueOfFeedback();
                        for (Feedback_bean ff : f) {
                    %>
                    <tr style ="text-align: center;">
                        <td><%=ff.getF_id()%></td>
                       
                        <td>
                            <%
                            Customer_bean obj = Read_values.get_value_of_cust(ff.getCustomer_id());
                            %>
                            <%=obj.getName()%></td>
                        <td>
                            <%
                            Service_Bean sbobs = Read_values.get_value_of_Services_by_serviceId(ff.getService_id());
                            %>
                            <%= sbobs.getService_name()%></td>
                        <td><%=ff.getFeedback()%></td>
                        <td><%=ff.getDate()%></td>
                    </tr>
                    <%
                        }
                    %>
                </table>

                <%
                } else if (val == 6) {
                        //List of bookings booked by customer
                %>
                <br>
                <h1 align ="center">Bookings - Details</h1>
                <table align ="center" border="1" style="color:black;background-image: url(img/background/light3.jfif); background-repeat: no-repeat; background-size: cover">
                  <tr style="font-weight: bold;text-align: center">
                        <th>Booking-Id</th>
                        <th>Customer</th>
                        <th>Service</th>
                        <th> Total-Price</th>
                        <th>Booking-date</th>
                        <th>Service-Date</th>
                        <th>Service-place</th>
                        <th>Service-time</th>
                        <th>Contact-Info</th>
                    </tr>
                    <%
                        List<Booking_service_bean> a1 = Read_values.get_value_of_Booking_services();
                        for (Booking_service_bean s2 : a1) {
                    %>
                    <tr style = "text-align: center;">
                        <td id ="td"><%= s2.getBooking_id()%></td>
                        <td id ="td">
                            <%
                           
                            Customer_bean cobj = Read_values.get_value_of_cust(s2.getCust_id());
                            
                            %>
                            <%= cobj.getName()%></td>
                        <td id ="td">
                            <%
                            Service_Bean sbob = Read_values.get_value_of_Services_by_serviceId(s2.getService_id());
                            %>
                            <%= sbob.getService_name()%></td>
                        <td id ="td"><%= s2.getTotal_price()%></td>
                        <td id ="td"><%= s2.getBooking_date()%></td>
                        <td id ="td"><%= s2.getService_date()%></td>
                        <td id ="td"><%= s2.getService_place()%></td>
                        <td id ="td"><%=s2.getService_time()%></td>
                        <td id ="id"><%=s2.getContact_no()%></td>

                    </tr>
                    <%
                        }

                    %>
                </table>

                <%                   } else if (val == 7) {

                    //List of offers and packages given by different vendors
                %><br>
                <h1 align = "center">Offers And Packages Information</h1>
                <table align ="center" border="1" style="background-image: url(img/background/bkg.jpg); background-repeat: no-repeat; background-size: cover">
                    <tr style="font-weight: bold;text-align: center">

                    </tr>
                    <%                                  } else if (val == 8) {
       // admin-registration details
                    %>
                    <br>
                    <h1 align ="center">Admin-Details</h1>
                    <table align ="center" border="1" style="background:linear-gradient(#7b4397,#dc2430);">
                        <tr>
                            <th>Admin-Id</th>
                            <th>Admin-Name</th>
                            <th>Email</th>
                            <th>Password</th>
                            <th>DOB</th>
                            <th>Contact-Info</th>
                            <th>Gender</th>
                        </tr>
                        <%
                            List<Admin_Bean> a1 = Read_values.getValueOfAdmin();
                            for (Admin_Bean a11 : a1) {
                        %>
                        <tr>
                            <td><%=a11.getAdmin_id()%></td>
                            <td><%=a11.getAdmin_nm()%></td>
                            <td><%=a11.getEmail()%></td>
                            <td><%=a11.getPassword()%></td>
                            <td><%=a11.getDob()%></td>
                            <td><%=a11.getPhn_no()%></td>
                            <td><%=a11.getGender()%></td>
                        </tr>       
                        <%
                            }
                        %>
                    </table>
                    <%
                    } else if (val == 9) {
                         //List of questions asked by vendors
                    %> <br>
                    <h1 align ="center" style="color:black">Question - Details</h1>
                    <table align ="center" border="1" style="color:black;background-image: url(img/background/light.jpg); background-repeat: no-repeat; background-size: cover;">
                        <tr>
                            <th>Ques-Id</th>
                            <th>Question</th>
                            <th>Option1</th>
                            <th>Option2</th>
                            <th>Option3</th>
                            <th>Option4</th>
                            <th>Category</th>
                            <th>Service</th>
                            <th>SP</th>
                        </tr>
                        <%
                            List<Ques_Bean> qb = Read_values.fetchAllQuestions();
                            for (Ques_Bean q : qb) {%>
                        <tr>
                            <td><%=q.getQuestion_Id()%></td>
                            <td><%=q.getQuestion()%></td>
                            <td><%=q.getOption_1()%>(Rs. <%=q.getPrice_1()%>)</td>
                            <td><%=q.getOption_2()%>(Rs. <%=q.getPrice_2()%>)</td>
                            <td><%=q.getOption_3()%>(Rs. <%=q.getPrice_3()%>)</td>
                            <td><%=q.getOption_4()%>(Rs. <%=q.getPrice_4()%>)</td>
                            <td>
                                <%
                                Category_bean cobj = Read_values.ReadAllCategoryByCategoryId(q.getCat_id());
                                %>
                                <%= cobj.getCategory_name()%></td>
                            <td>
                                <%
                                Service_Bean sbobject = Read_values.get_value_of_Services_by_serviceId(q.getService_id());
                                %>
                                <%= sbobject.getService_name()%></td>
                            <td>
                                <%
                          SP_bean spobj3 = Read_values.getValue_SP_BySP_Id(q.getSp_id());
                          %>
                                <%=spobj3.getName()%></td>
                        </tr> 
                        <%
                            }
                        %>
                    </table>
                    <%
                    } else {
                        // location-details%>
                    <%  }
%>
            </div>
        </div>
    </body>
</html>