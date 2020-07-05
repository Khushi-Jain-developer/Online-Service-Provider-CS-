<body>
    <%@include file="category_action.jsp" %>
    <div style="width:100%;">
        <h1 align ="center">Added Categories Info</h1>
        <table align ="center" border="1" style="color:#fff">
            <tr style="color:black">
                <th>Category-Id</th>
                <th>Name of Category</th>
                <th>Description</th>
                <th>Image</th>
            </tr>
            <%
                List<Category_bean> a1 = Read_values.fetchAllCategory();
                for (Category_bean s2 : a1) {
            %>
            <tr>
                <td><%= s2.getCategory_id()%></td>
                <td><%= s2.getCategory_name()%></td>
                <td><%= s2.getCategory_desc()%></td>
                <td><img src=UploadedData/<%=s2.getCategory_img()%> height="100" width="100"></td>
                <td><a href="RegDeleteServ?id=<%=s2.getCategory_id()%>" style="background-color:#505050 ;color:#fff">Delete</a></td>
                <td><a href="edit.jsp?id=<%=s2.getCategory_id()%>" style="background-color:#505050 ;color:#fff">Update</a></td>
            </tr>
            <tr></tr>
            <tr></tr>
            <%
                }
            %>
        </table>
    </div>
</body>

