<%@page import="Common.SP_bean"%>
<%@page import="Common.Category_bean"%>
<%@page import="CRUD.Read_values"%>
<%@page import="Common.Service_Bean"%>
<%@page import="CRUD.insert_values"%>
<%@page import="Common.Admin_Bean"%>
<%@page import="java.util.List"%>
<html>
    <head>
        <title>Insert title here</title>
        <link rel="stylesheet" href="css/header.css" />
    </head>\
    <body>
        <%@include file="ques_action.jsp" %>
        <div id ="form">
            <center>
                <h1 style ="margin-top: 30px;text-decoration-line: underline;font-size: 45px">ADD NEW QUESTIONS</h1>
                <form action="Controller/insert_question_controller.jsp" method="post">
                    <table style = "color:#fff;background-image: url(img/background/bg.jpg); background-repeat: no-repeat; background-size: cover;margin-top: 30px">   
                        <tr style = "font-weight: bold;font-size: 24px;"><td style="height:30px;width:20%">Question</td>
                            <td font-size="50px"><input type="text" name="q1"></td></tr>
                        <tr style = "font-weight: bold;font-size: 24px;"><td style="height:30px;width:20%">Option 1 :</td>
                            <td font-size="50px"><input type="text" name="o1"></td>
                        </tr>
                        <tr style = "font-weight: bold;font-size: 24px;"><td style="height:30px;width:20%">Price 1 :</td>
                            <td font-size="20px"><input type="text" name="p1"></td>
                        </tr>
                        <tr style = "font-weight: bold;font-size: 24px;"><td style="height:30px;width:20%">Option 2 :</td>
                            <td font-size="50px"><input type="text" name="o2"></td></tr>
                        <tr style = "font-weight: bold;font-size: 24px;"><td style="height:30px;width:20%">Price 2 :</td>
                            <td font-size="20px"><input type="text" name="p2"></td>
                        </tr>
                        <tr style = "font-weight: bold;font-size: 24px;"><td style="height:30px;width:20%">Option 3 :</td>
                            <td font-size="50px"><input type="text" name="o3"></td></tr>
                        <tr style = "font-weight: bold;font-size: 24px;"><td style="height:30px;width:20%">Price 3 :</td>
                            <td font-size="20px"><input type="text" name="p3"></td>
                        </tr>
                        <tr style = "font-weight: bold;font-size: 24px;"><td style="height:30px;width:20%">Option 4 :</td>
                            <td font-size="50px"><input type="text" name="o4"></td></tr>
                        <tr style = "font-weight: bold;font-size: 24px;"><td style="height:30px;width:20%">Price 4 :</td>
                            <td font-size="20px"><input type="text" name="p4"></td>
                        </tr>
                        <tr style = "font-weight: bold;font-size: 24px;"><%
                            List<Category_bean> al = Read_values.fetchAllCategory();
                            %>
                            <td style="height:30px;width:20%">Choose Category:</td>
                            <td font-size="50px">
                                <select name="cate">
                                    <%
                                        for (Category_bean u : al) {
                                    %>
                                    <option value="<%=u.getCategory_id()%>"><%=u.getCategory_name()%></option>
                                    <%
                                        }
                                    %>
                                </select></td>
                        </tr>
                        <tr style = "font-weight: bold;font-size: 24px;">
                            <td style="height:40px;width:50%">Add Service-Provider:</td>
                            <%
                                SP_bean sp = (SP_bean) session.getAttribute("SP");
                            %>
                            <td font-size="50px"><input type="text" name = "sp" value="<%=sp.getSp_id()%>"></td>
                        </tr>
                        <tr style = "font-weight: bold;font-size: 24px;">
                            <%
                                List<Service_Bean> ssl = Read_values.get_value_of_SP_Services();
                            %>
                            <td style="height:30px;width:20%">Add Service:</td>
                            <td font-size="50px">
                                <select name="ser">
                                    <%
                                        for (Service_Bean ss : ssl) {
                                    %>
                                    <option value="<%=ss.getService_id()%>"><%=ss.getService_name()%></option>
                                    <%
                                        }
                                    %>
                                </select></td></tr>
                        <tr style = "font-weight: bold;font-size: 24px;">
                            <td style="height:30px;width:20%"colspan="2" align="center"><input type="submit" value="submit"></td></tr>
                    </table>
                </form>
            </center>
        </div>
    </body>
</html>


