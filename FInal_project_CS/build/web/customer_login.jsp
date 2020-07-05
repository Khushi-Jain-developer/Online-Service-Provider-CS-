<html>
    <head>
        <title>Insert title here</title>
        <link rel="stylesheet" href="css/Adminlogin.css">
    </head>
    <script language="javascript">
        function validated()
        {

            if (f2.name.value == "" || f2.name.value == null)
            {
                alert("Please fill your username !!")
                f2.name.focus();
                return false;
            }
            if (!/^\w+([\.-]?\w+)*@\w+([\.-]?\w+)*(\.\w{2,3})+$/.test(f2.name.value))
            {
                alert("Please fill your username in correct format !!")
                f2.name.focus();
                return false;
            }

            if (f2.password.value == "" || f2.password.value == null)
            {
                alert("Please fill your password !!")
                f2.password.focus();
                return false;
            }
            if (f2.password.value.length < 2 || f2.password.value.length > 11)
            {
                alert("Password must be of 4 to 11 characters long!!")
                f2.password.focus();
                return false;
            }

        }
    </script>

    <body>
        <div class="login-wrap">
            <div class="login-html">
                <input id="tab-1" type="radio" name="tab" class="sign-in" checked><label for="tab-1" class="tab">Sign In</label>
                <input id="tab-2" type="radio" name="tab" class="sign-up"><label for="tab-2" class="tab"><a href="customer_reg.jsp">Sign Up</a></label>
                <div class="login-form">

                    <div class="sign-in-htm">
                        <form name="f2" onsubmit="return validated();" action ="Controller/login_cust_controller.jsp" method ="post">
                            <div class="group">
                                <label for="user" class="label">Username</label>
                                <input id="user" type="text" name="name" class="input">
                            </div>
                            <div class="group">
                                <label for="pass" class="label">Password</label>
                                <input id="pass" type="password" name="password" class="input" data-type="password">
                            </div>
                            <div class="group">
                                <input id="check" type="checkbox" class="check" checked>
                                <label for="check"><span class="icon"></span> Keep me Signed in</label>
                            </div>
                            <div class="group">
                                <input type="submit" class="button" value="Sign In">
                            </div>
                            <div class="hr"></div>
                            <div class="foot-lnk">
                                <a href="#forgot">Forgot Password?</a>
                            </div>
                        </form>
                    </div>




                </div>
            </div>
        </div>
    </body>
</html>