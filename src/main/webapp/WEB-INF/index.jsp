<%-- 
    Document   : index
    Created on : Oct 21, 2022, 9:37:14 PM
    Author     : gilles

--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

       <link  rel="stylesheet" href="../public/css/style.css" type="text/css">



        <title>User Management</title>
    </head>
    <body>

        <jsp:directive.include file="part/header.jsp"/>
        <div class="container-fluid" align = "center">
            <h1>Home Page</h1>
            <hr width = "24%" >
            <br><br>
            <h2>Quick Action </h2>

            <b><a  href="<c:url value="/addUser"/>">New User</a> &nbsp;
                <a  href= "<c:url value="/userList"/>" >User List</a> &nbsp;

                <hr width = "30%" >
            </b>
        </div>

        <br><br><br>


        <jsp:directive.include file="part/footer.jsp"/>
    </body>
</html>
