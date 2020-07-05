<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <title>Drop down menu design</title>
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
    <body style ="background-image: url(img/blog/building.jpg); background-repeat: no-repeat; background-size: cover">
        <%@include file="SP_header.jsp" %>
        <div id ="category">
            <h1>Service-Details</h1>
            <div id = "menu-bar">
                <ul>
                    <li class="active"><a href="service_form.jsp"><i class="fa fa-clone"></i>Add New Services</a></li>
                    <li ><a href="View_services_SP.jsp"><i class="fa fa-user"></i>View Services</a></li>
                    <li class="active"><a href="#"><i class="fa fa-clone"></i>Manage-Services-Request</a>
                        <div id="sub-menu">
                            <ul>
                                <li><a href="demo_ststus_Sp.jsp"><i class="fa fa-user"></i>Alloted-Request-Services(BY ADMIN)</a></li>
                                <li><a href="service_record_sp.jsp"><i class="fa fa-info"></i>Services - Record</a></li>
                            </ul>
                </ul>
            </div>
        </div>
    </body>
</html>