<%@page import="CRUD.Read_values"%>
<%@page import="Common.Category_bean"%>

<%@page import="java.util.List"%>
<head>
    <title>CSS Registration Form</title>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <link rel="stylesheet" type="text/css" href="css/default.css"/>
    <script language="javascript">
        function validate()
        {

            if (f1.emailid.value == "" || f1.emailid.value == null)
            {
                alert("Please fill your email id !!")
                f1.emailid.focus();
                return false;
            }
            if (!/^\w+([\.-]?\w+)*@\w+([\.-]?\w+)*(\.\w{2,3})+$/.test(f1.emailid.value))
            {
                alert("Please fill your email id in correct format !!")
                f1.emailid.focus();
                return false;
            }
            if (f1.eid.value == "" || f1.eid.value == null)
            {
                alert("Please fill your repeat email id !!")
                f1.eid.focus();
                return false;
            }

            if (f1.pwd.value == "" || f1.pwd.value == null)
            {
                alert("Please fill your password !!")
                f1.pwd.focus();
                return false;
            }
            if (f1.pwd.value.length < 4 || f1.pwd.value.length > 8)
            {
                alert("Password must be of 4 to 8 characters long!!")
                f1.pwd.focus();
                return false;
            }
            if (f1.cpwd.value == "" || f1.cpwd.value == null)
            {
                alert("Please fill confirm password field !!")
                f1.cpwd.focus();
                return false;
            }
            if (f1.pwd.value != f1.cpwd.value)
            {
                alert("Confirm Password must be same as Password !!")
                f1.cpwd.focus();
                return false;
            }
            if (f1.nm.value == "" || f1.nm.value == null)
            {
                alert("Please fill your name !!")
                f1.nm.focus();
                return false;
            }

            if (f1.gender[0].checked == false && f1.gender[1].checked == false)
            {
                alert("Please select your gender !!")
                return false;
            }
            if (f1.contact.value == "" || f1.contact.value == null)
            {
                alert("Please fill your contact no !!")
                f1.contact.focus();
                return false;
            }
            if (isNaN(f1.contact.value))
            {
                alert("Please fill your contact no in numeric only!!")
                f1.contact.focus();
                return false;
            }
            if (f1.contact.value.length != 10)
            {
                alert("Contact no must be of 10 digits long!!")
                f1.contact.focus();
                return false;
            }
            if (f1.address.value == "" || f1.address.value == null)
            {
                alert("Please fill your address !!")
                f1.address.focus();
                return false;
            }
        }
    </script>
</head>
<body>    
    <form name="f1" onsubmit="return validate();" action="Controller/insert_reg_SP_controller.jsp" method="post" class="register">
        <h1>Registration</h1>
        <fieldset class="row1">
            <legend>Account Details
            </legend>
            <p>
                <label>Email-Id *
                </label>
                <input type="text" name="emailid" />
                <label>Repeat email-Id *
                </label>
                <input type="text" name="eid"/>
            </p>
            <p>
                <label>Password*
                </label>
                <input type="text" name="pwd"/>
                <label>Repeat Password*
                </label>
                <input type="text" name="cpwd"/>
                <label class="obinfo">* obligatory fields</label>

            </p>
        </fieldset>
        <fieldset class="row2">
            <legend>Personal Details
            </legend>
            <p>
                <label>Name *
                </label>
                <input type="text" class="long" name="nm"/>
            </p>
            <p>
                <label>Contact No. *
                </label>
                <input type="text" maxlength="10" name="contact"/>
            </p>
            <p>
                <label class="optional">Address
                </label>
                <input type="text" class="long" name="address"/>
            </p>
            <p>
                <label>City *
                </label>
                <input type="text" class="long" name="city"/>
            </p>
            <p>
                <label>Country *
                </label>
                <select name="country">
                    <option>
                    </option>
                    <option value="India">India
                    </option>
                </select>
            </p>
            <p>
                <label >Category-Name *
                </label>
                <select name="snm">
                    <option disabled selected>Choose any one</option>
                    <%
                        List<Category_bean> a2 = Read_values.fetchAllCategory_sp_reg();
                        for (Category_bean u : a2) {
                    %>
                    <option value="<%=u.getCategory_name()%>"><%=u.getCategory_id()%></option><%
                        }
                    %>

                </select>

            </p>
        </fieldset>
        <fieldset class="row3">
            <legend>Further Information
            </legend>
            <p>
                <label>Gender *</label>
                <input type="radio" value="Male" name="gender"/>
                <label class="gender">Male</label>
                <input type="radio" value="Female" name="gender"/>
                <label class="gender">Female</label>
            </p>
            <p>
                <label>DOB *</label><input type="date" name="date" />
            </p>
            <p>
                <label>Nationality *
                </label>
                <select name="nationality">
                    <option value="0" >
                    </option>
                    <option value="1">Indian
                    </option>
                </select> 
            </p>
            <p>
                <label>Guranteed-Service *
                </label>
                <input type="checkbox" value=""  name=""/>
            </p>
            <div class="infobox"><h4>Helpful Information</h4>
                <p>Enter all valid information , fill all asteric boxes</p>
            </div>
        </fieldset>
        <fieldset class="row4">
            <legend>Terms and Mailing
            </legend>
            <p class="agreement">
                <input type="checkbox" value=""/>
                <label>*  I accept the <a href="#">Terms and Conditions</a></label>
            </p>
            <p class="agreement">
                <input type="checkbox" value=""/>
                <label>I want to receive personalized offers by your site</label>
            </p>
            <p class="agreement">
                <input type="checkbox" value=""/>
                <label>Allow partners to send me personalized offers and related services</label>
            </p>
        </fieldset>
        <div><input type="submit" value="Register" class="button"></div>
    </form>
</body>
</html>





