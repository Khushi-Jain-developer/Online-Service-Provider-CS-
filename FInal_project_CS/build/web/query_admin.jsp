<%@page import="Common.Query_bean"%>
<%@page import="java.util.List"%>
<%@page import="CRUD.Read_values"%>
<%@page import="Common.Feedback_bean"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <title>Records Of Customer-Speaks</title>
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
    <body style ="background-image: url(img/portfolio/1.jpg); background-repeat: no-repeat; background-size: cover">
        <%@include file="admin_header_menu.jsp"%>
        <div style ="margin-top:160px"> <center>
                <h1 align ="center" style="margin-top:200px;color:black;text-decoration-line:underline;font-size:50px;">QUERY - DETAILS</h1>

                <table align ="center" border="1" style="margin-top:70px;background-image: url(img/background/grren.jfif); background-repeat: no-repeat; background-size: cover;">
                    <tr style="font-weight: bold;text-align: center;height: 50px;font-size: 35px">
                        <th style="width:5px;">Query-Id</th>
                        <th style="width:15px;">Customer</th>
                        <th style="width:15px;">Email</th>
                        <th style="width:35px;">Query</th>
                        <th style="width:30px;">Date</th>
                    </tr>
                    <%
                        List<Query_bean> q = Read_values.getValueOfQuery();
                        for (Query_bean qb : q) {
                    %>
                    <tr style="text-align:center;height:30px;font-size:25px">
                        <td style = "width:"><%=qb.getQ_id()%></td>
                        <td style = "width:"><%=qb.getName()%></td>
                        <td style = "width:"><%=qb.getEmail()%></td>
                        <td style = "width:"><%=qb.getMsg()%></td>
                        <td style = "width:"><%=qb.getDate()%></td>
                    </tr>
                    <%
                        }
                    %>
                </table>
            </center>
        </div>
    </body>
</html>