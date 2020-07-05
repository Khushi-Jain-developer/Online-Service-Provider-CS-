<!DOCTYPE html>
<html>
    <head>
        <meta charset="ISO-8859-1">
        <title>Insert title here</title>
        <link rel="stylesheet" href="css/Splogin.css">
    </head>
    <body>
        <div class="cotn_principal">
            <div class="cont_centrar">

                <div class="cont_login">
                    <div class="cont_info_log_sign_up">
                        <form action = "sp_login.jsp" method = "post">
                            <div class="col_md_login">
                                <div class="cont_ba_opcitiy">
                                    <h2>LOGIN</h2>  
                                    <p>City-Sermon is your one-stop shop for all your home services needs and much, much more..</p> 
                                    <p>To avail host of miscellaneous services login with registered id and password.
                                        <button class="btn_login" onclick="cambiar_login()">LOGIN</button>
                                </div>
                            </div>
                        </form>
                        <form action = "sp_reg.jsp" method = "post">
                            <div class="col_md_sign_up">
                                <div class="cont_ba_opcitiy">
                                    <h2>SIGN UP</h2>
                                    <p> With City-Sermon, fulfil any and every urgent or day to day need, easily and conveniently.</p>
                                    <br><p>To avail host of miscellaneous services signup with valid details.
                                        <button class="btn_sign_up" onclick="cambiar_sign_up()">SIGN UP</button>
                                </div>
                            </div>
                        </form>
                    </div>
                    <div class="cont_back_info">
                        <div class="cont_img_back_grey">
                            <img src="https://images.unsplash.com/42/U7Fc1sy5SCUDIu4tlJY3_NY_by_PhilippHenzler_philmotion.de.jpg?ixlib=rb-0.3.5&q=50&fm=jpg&crop=entropy&s=7686972873678f32efaf2cd79671673d" alt="" />
                        </div>
                    </div>
                    <div class="cont_forms" >
                        <div class="cont_img_back_">
                            <img src="https://images.unsplash.com/42/U7Fc1sy5SCUDIu4tlJY3_NY_by_PhilippHenzler_philmotion.de.jpg?ixlib=rb-0.3.5&q=50&fm=jpg&crop=entropy&s=7686972873678f32efaf2cd79671673d" alt="" />
                        </div>
                        <div class="cont_form_login">
                            <a href="#" onclick="ocultar_login_sign_up()" ><i class="material-icons">&#xE5C4;</i></a>
                            <h2>LOGIN</h2>
                            <input type="text" placeholder="Email" />
                            <input type="password" placeholder="Password" />
                            <button class="btn_login" onclick="cambiar_login()">LOGIN</button>
                        </div>
                        <div class="cont_form_sign_up">
                            <a href="#" onclick="ocultar_login_sign_up()"><i class="material-icons">&#xE5C4;</i></a>
                            <h2>SIGN UP</h2>
                            <input type="text" placeholder="Email" />
                            <input type="text" placeholder="User" />
                            <input type="password" placeholder="Password" />
                            <input type="password" placeholder="Confirm Password" />
                            <button class="btn_sign_up" onclick="cambiar_sign_up()">SIGN UP</button>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </body>
</html>