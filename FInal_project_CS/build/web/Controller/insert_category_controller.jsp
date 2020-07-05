<%@page import="CRUD.insert_values"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@page import="com.oreilly.servlet.MultipartRequest"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
        <title>Insert title here</title>
    </head>
    <body>

        <%
            String path = getServletContext().getRealPath("UploadedData");
            MultipartRequest mr = new MultipartRequest(request, path, 5 * 1024 * 1024);
            System.out.println("Uploaded");

            String category_name = mr.getParameter("c1");
            String category_id = mr.getParameter("cat1");
            String category_desc = mr.getParameter("cD1");
            String category_img = mr.getOriginalFileName("img");

            insert_values.insert_values_of(category_name, category_id, category_desc, category_img);
            response.sendRedirect("../category_form.jsp");
        %>


    </body>
</html>