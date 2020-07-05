<!DOCTYPE html>
<html>
    <head>
        <title>Registration page</title>
        <meta http-equiv="X-UA-Compatible" content="IE=EmulateIE7; IE=EmulateIE9">
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
        <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1.0, user-scalable=no"/>
        <link rel="stylesheet" type="text/css" href="css/stylereg2.css" media="all" />
        <link rel="stylesheet" type="text/css" href="css/demoreg2.css" media="all" />
    </head>
    <body>
        <div class="container">

            <div class="freshdesignweb-top"><a href="index_cust.jsp">Home</a>
                <span class="right"><a href="customer_login.jsp"><strong>Back to page</strong> </a>
                </span>
                <div class="clr"></div></div>
            <header>
                <h1><span>Registration Page</span> City-Sermon is your one-stop shop for all your home services needs and much, much more.
                    With City-Sermon, fulfil any and every urgent or day to day need, easily and conveniently.
                    To avail host of miscellaneous services signup with valid details</h1>
            </header>       
            <div  class="form">
                <form action="Controller/insert_reg_Cust_controller.jsp" method="get">
                    <p class="contact"><label for="username">Name</label></p> 
                    <input id="username" name="c1" placeholder="First and last name" required="" tabindex="1" type="text"> 

                    <p class="contact"><label for="email">Email</label></p> 
                    <input id="email" name="c2" placeholder="example@domain.com" required="" type="email"> 

                    <p class="contact"><label for="address">Address</label></p> 
                    <input id="address" name="c3" placeholder="address" required="" tabindex="2" type="text"> 

                    <p class="contact"><label for="password">Create a password</label></p> 
                    <input type="password" id="password" name="c4" required="" tabindex="3" type="text"> 

                    <p class="contact"><label for="repassword">Confirm your password</label></p> 
                    <input type="password" id="repassword" name="c5" required=""> 

                    <p class="contact"><label for="repassword">DOB   (Example : YYYY-MM-DD)</label></p> 
                    <input type="text" name="date" placeholder="yyyy-mm-dd">
                    <p class="contact"><label for="email">Gender</label></p>
                    <select class="select-style gender" name="c9">
                        <option value="select">I am..</option>
                        <option value="m">Male</option>
                        <option value="f">Female</option>
                        <option value="others">Other</option>
                    </select><br><br>

                    <p class="contact"><label for="phone">Contact No.</label></p> 
                    <input id="phone" name="c10" placeholder="phone number" required="" type="text"> <br>
                    <input class="button" name="submit" id="submit" tabindex="5" value="Sign me up...!" type="submit"> 	 
                </form> 
            </div>      
        </div>

    </body>
</html>
