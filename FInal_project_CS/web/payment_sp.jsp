<%@page import="Common.Payment_bean"%>
<%@page import="Common.Service_Bean"%>
<%@page import="Common.Customer_bean"%>
<%@page import="java.util.List"%>
<%@page import="CRUD.Read_values"%>
<%@page import="Common.Feedback_bean"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <title>Payment Of Customer</title>
        <meta name="viewport" content="width=device-width, initial-scale=1, user-scalable=no" />
        <style>
            * {
                margin:0;
                padding:0;
                box-sizing: border-box;
            }
            #category {
                margin-top:100px;
                font-family:san-serif;
                text-align:center;
                font-size:20px;
                background:#800080;
            }
            #menu-bar {
                background:rgb(0,0,100);
            }
            #menu-bar ul {
                display:inline-flex;
                list-style:none;
                color: #fff;
            }
            #menu-bar ul li {
                width:120px;
                margin:15px;
                padding:15px;
            }
            #menu-bar ul li a {
                text-decoration:none;
                color: #fff;
            }
            .active,#menu-bar ul li:hover {
                background:#2bab0d;
                border-radius: 3px;
            }
            #menu-bar .fa {
                margin-right:10px;
            }
            #sub-menu {
                display:none;
            }
            #menu-bar ul li:hover #sub-menu {
                display:block;
                position:absolute;
                background:rgb(0,120,0);
                margin-top:15px;
                margin-left:-15px;
            }
            #menu-bar ul li:hover #sub-menu ul {
                display:block;
                margin:10px;
            }
            #menu-bar ul li:hover #sub-menu ul li {
                width:150px;
                padding:10px;
                border-bottom:1px dotted #fff;
                background:transparent;
                border-radius:o;
                text-align:left;
            }
            #menu-bar ul li:hover #sub-menu ul li:last-child {
                border-bottom:none;
            }
            #menu-bar ul li:hover #sub-menu ul li a:hover {
                color:#b2ff00;
            }
            .fa-angle-right {
                float:right;
            }
        </style>
        <link rel="stylesheet" href="css/header.css" />
        <link rel="stylesheet" type="text/css" href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
    </head>
    <body style ="background-image: url(img/portfolio/1.jpg);color:#fff; background-repeat: no-repeat; background-size: cover">
        <%@include file="SP_header.jsp" %>
        <div style ="margin-top:160px"> <center>
                <h1 align ="center" style="color:black;text-decoration-line: underline;margin-top: 70px;font-size: 50px">View Payment</h1>
                <table align ="center" border="1" style="margin-top: 50px;background-image: url(img/background/grey.jpeg); background-repeat: no-repeat; background-size: cover">
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
                    <%                        List<Payment_bean> pp = Read_values.fetchAllPayment();
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
            </center>
        </div>
    </body>
</html>