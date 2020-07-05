<html>
    <head>
        <title>Log In Page</title>
        <link rel="stylesheet" href="css/Userlogin.css">
    </head>
    <body>
        <form action="Controller/login_Sp_controller.jsp" method="post">
            <h1 style="color:#fff"> Log in</h1>
            <div class="inset">
                <p>
                    <label for="email">EMAIL ADDRESS</label>
                    <input type="text" name="email" id="email" style="color:#fff">
                </p>
                <p>
                    <label for="password">PASSWORD</label>
                    <input type="password" name="password" id="password" style="color:#fff">
                </p>
                <p>
                    <input type="checkbox" name="remember" id="remember">
                    <label for="remember">Remember me</label>
                </p>
            </div>
            <p class="p-container">
                <span>Forgot password ?</span>
                <input type="submit" name="go" id="go" value="Log in">
            </p>
            <p class="p-container"> <span class="right"><a href="sp_login_reg.jsp"><strong>Back to page</strong> </a>
                </span>
            </p>
        </form>
    </body>

</html>