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


        <title>User Edition </title>
    </head>
    <body>

        <jsp:directive.include file="part/header.jsp"/>
        <div class="container-fluid" align = "center">
            <h1>Edit User </h1>

            <hr width = "24%" >

            <h2> <a href="<c:url value="/userList"/> "> User List</a></h2>


        </div>

        <br>



        <div class="container-fluid col-3">

            <form method="post" action="editUser">
                
                <div class="form-group">
                   
                    <input type="hidden"  value="<c:out value="${user.id}"/>" name="id" id="id " placeholder="Your  id"   class="form-control" size="100" required="true">

                </div>
                <div class="form-group">
                    <label for="name" class="form-label mt-4"> Name</label>
                    <input type="text"  value="<c:out value="${user.name}"/>"name="name" id="name" placeholder="Your  Name"   class="form-control" size="100" required="true">

                </div>

                <div class="form-group">
                    <label for="email" class="form-label mt-4">Email</label>

                    <input type="email" name="email" value="<c:out value="${user.email}"/>" class="form-control" id="email" size="60" placeholder="Your  Email" required="true">

                </div>
                <div class="form-group">
                    <label for="country" class="form-label mt-4">Country</label>

                    <input type="text" name="country"  value="<c:out value="${user.country}"/>" class="form-control" id="country" size="60" placeholder=" Your Country" required="true">

                </div>
                <br><br>

                <button type="submit" class="btn btn-success"> <i class="bi bi-box-arrow-down"></i>
                    Update </button>




            </form>

        </div>


        <br><br><br>

        <jsp:directive.include file="part/footer.jsp"/>


    </body>

</html>
