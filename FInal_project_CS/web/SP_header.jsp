<style>

    .menu ul {
        font-size: 25px;
    }
</style>
<%@page import="Common.SP_bean"%>
<header>
    <div class="logo">
        <a href="index_sp.jsp">MENU</a>
    </div>
    <div class="menu">
        <nav>
            <ul>
                <%
                    if (session.getAttribute("SP") != null) {
                        //SP is logged in
                        SP_bean sp = (SP_bean) session.getAttribute("SP");
                %>
                <li><a href="#">Welcome <%=sp.getName()%></a></li>
                <li><a href="sp_logout.jsp">Logout</a></li>
                    <%
                    } else {
                    //SP is not logged in
                    %>
                <li><a href="sp_login.jsp">Login</a></li>
                <li><a href="sp_reg.jsp">Register</a></li>
                    <%
                        }
                    %>
            </ul>
        </nav>
    </div><!-- menu -->
</header><!-- header -->