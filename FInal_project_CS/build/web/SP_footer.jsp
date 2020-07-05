<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
        <title>Insert title here</title>
        <style>
            footer {
                position:fixed;
                width:100%;
                height:60px;
                background:#505050;
                bottom:0;
                text-align:center;
            }
            .copyright p {
                margin:0;
                padding:0;
                line-height:60px;
                color:#fff;
            }
        </style>	
    </head>
    <body>
        <!-- Footer -->
    <footer>
        <div class="copyright"><p>&copy; 2019 Copyright, All Rights Reserved</p></div></footer>
    <!-- footer -->
    Last Updated : <%= new java.util.Date()%>
</body>
</html>