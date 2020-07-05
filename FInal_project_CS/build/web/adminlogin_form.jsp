<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<html>
    <head>
        <title>Log In Page</title>
        <link rel="stylesheet" href="css/Userlogin.css">
    </head>
        <script language="javascript">
        function validatedd()
        {

            if (f3.email.value == "" || f3.email.value == null)
            {
                alert("Please fill your email !!")
                f3.email.focus();
                return false;
            }
            if (!/^\w+([\.-]?\w+)*@\w+([\.-]?\w+)*(\.\w{2,3})+$/.test(f3.email.value))
            {
                alert("Please fill your email in correct format !!")
                f3.email.focus();
                return false;
            }

            if (f3.password.value == "" || f3.password.value == null)
            {
                alert("Please fill your password !!")
                f3.password.focus();
                return false;
            }
            if (f3.password.value.length < 2 || f3.password.value.length > 11)
            {
                alert("Password must be of 4 to 8 characters long!!")
                f3.password.focus();
                return false;
            }

        }
    </script>
    <body>
        <form name="f3" onsubmit="return validatedd();" action="Controller/login_admin_controller.jsp" method="get">
            <h1 style="color:#fff"> Log in</h1>
            <div class="inset">
                <p>
                    <label for="email">EMAIL ADDRESS</label>
                    <input type="text" name="email" id="email">
                </p>
                <p>
                    <label for="password">PASSWORD</label>
                    <input type="password" name="password" id="password">
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
            <p class="p-container"> <span class="right"><a href="index_admin_login.jsp"><strong>Back to page</strong> </a>
                </span>
            </p>
        </form>
    </body>

</html>