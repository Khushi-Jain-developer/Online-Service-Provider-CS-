<%@page import="Common.Category_bean"%>
<%@page import="Common.Customer_bean"%>
<%@page import="Common.Service_Bean"%>
<%@page import="CRUD.Read_values"%>
<%@page import="Common.Ques_Bean"%>
<%@page import="java.util.List"%>
<%@page import="CRUD.insert_values"%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%@include file="ques_action.jsp" %>
    <center>
        <h1 style ="margin-top: 30px;text-decoration-line: underline;font-size: 45px">VIEW QUESTIONS</h1>
        <table border="1px" style = "color:#fff;background-image: url(img/background/bg.jpg); background-repeat: no-repeat; background-size: cover;margin-top: 30px">
            <tr>
                <td>Question-Id</td>
                <td>Question</td>
                <td>Option-1</td>
                <td>Option-2</td>
                <td>Option-3</td>
                <td>Option-4</td>
                <td>Category</td>
                <td>Service</td>
                <td>SP</td>
            </tr>
            <%
                SP_bean sbb = (SP_bean) session.getAttribute("SP");
                List<Ques_Bean> list11 = Read_values.fetchAllQuestions(sbb.getSp_id());
                for (Ques_Bean sb : list11) {
            %>
            <tr>
                <td><%=sb.getQuestion_Id()%></td>
                <td><%=sb.getQuestion()%></td>
                <td><%=sb.getOption_1()%></td>
                <td><%=sb.getOption_2()%></td>
                <td><%=sb.getOption_3()%></td>
                <td><%=sb.getOption_4()%></td>
                <td>
                    <%
                        Category_bean cbobj = Read_values.ReadAllCategoryByCategoryId(sb.getCat_id());
                    %>
                    <%= cbobj.getCategory_name()%></td>
                <td>
                    <%
                        Service_Bean sbobj = Read_values.get_value_of_Services_by_serviceId(sb.getService_id());
                    %>
                    <%=sbobj.getService_name()%></td>
                <td>
                    <%
                        SP_bean spobj = Read_values.getValue_SP_BySP_Id(sb.getSp_id());
                    %>
                    <%=spobj.getName()%></td>
            </tr>
            <%}%>
        </table>
    </center>
</body>
</html>
