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


        <title>Student Management - Create New Student</title>
    </head>
    <body>

        <jsp:directive.include file="part/header.jsp"/>
        <div class="container-fluid" align = "center">
            <h1>Create New User </h1>

            <hr width = "24%" >

            <h2> <a href="<c:url value="/userList"/> "> User List</a></h2>


        </div>

        <br>



        <div class="container-fluid col-3">

            <form action="addUser" method="post" >

                <fieldset class="form-group">
                    <label>User Name</label> <input type="text" class="form-control" name="name" required="required">
                </fieldset>

                <fieldset class="form-group">
                    <label>User Email</label> <input type="text"  class="form-control" name="email">
                </fieldset>

                <fieldset class="form-group">
                    <label>User Country</label> <input type="text" class="form-control" name="country">
                </fieldset>
                <button type="submit" class="btn btn-success"> <i class="bi bi-box-arrow-down"></i>
                    Save </button>


            </form>

        </div>


        <br><br><br>

        <jsp:directive.include file="part/footer.jsp"/>


    </body>

</html>
