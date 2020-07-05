<!DOCTYPE html>
<html>
    <head>
        <title>Insert title here</title>
    </head>
    <body background="img/portfolio/3.jpg">

        <jsp:include page="category_action.jsp" />
        <div>
            <center>

                <h2>Add New Category</h2>
                <br>
                <form action="Controller/insert_category_controller.jsp" method="post" enctype="multipart/form-data">
                    <table style="background-color: blue">
                        <tr>
                        <div class="col-sm-6">
                            <td><label>Category Name:</label></td>
                            <td><input type="text" name="c1" class="form-control"></td></tr>
                        </div>
                        <tr><td>Category_Id:</td>
                            <td font-size="50px"><input type="text" name="cat1" class="form-control"></td></tr>
                        <tr><td>Description:</td>
                            <td font-size="50px"><input type="textarea" name="cD1" class="form-control"></td></tr>
                        <tr><td>Image:</td>
                            <td font-size="50px">
                                <input type="file" name="img" placeholder="Choose File" class="form-control"></td>
                        </tr>
                        <tr>
                        </tr>
                        <tr>
                            <td></td><td><input type="submit" value="Add"><td></td></tr>
                    </table>
                </form>
            </center>
        </div>
    </body>
</html>