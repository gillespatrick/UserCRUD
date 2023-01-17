
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





        <title>User List</title>
    </head>
    <body>

        <jsp:directive.include file="part/header.jsp"/>
        <div class="container-fluid" align = "center">
            <h1>User List</h1>
            <hr width = "24%" >
            <br><br>
            <h2><a  href="addUser">Create New User</a> </h2>   <br>   <br>   


            <c:if test = "${message != null}">

                <div class="alert alert-dismissible alert-success col-8 ">
                    <button type="button" data-bs-dismiss="alert"></button>
                    <strong>${message}</strong>
                </div>

            </c:if>


        </div>

        <br><br>


        <div class="container-fluid col-8">

            <table  class="table table-hover" >
                <thead>
                    <tr  class="table-info">
                        <th scope="col"> Name</th>
                        <th scope="col">Email</th>
                        <th scope="col">Country</th>
                        <th scope="col">Action</th>

                    </tr>
                </thead>
                <tbody>
                    <c:forEach var = "usersList" items = "${users}"  >

                        <tr class="table-light">

                            <td> ${usersList.name}</td>
                            <td> ${usersList.email}</td>
                            <td> ${usersList.country}</td>
                            <td>

                                <a href="editUser?id=<c:out value="${usersList.id}"/> ">Edit</a> &nbsp;
                                <!-- Delete the user -->
                                <a href="deleteUser?id=<c:out value="${usersList.id}"/> ">Delete</a>

                            </td>
                        </tr>

                    </c:forEach>



                </tbody>
            </table>



        </div>

        <br><br><br>

        <jsp:directive.include file="part/footer.jsp"/>

        <script>
            function confirmDelete(userId) {
                confirm('Are you sure, you want to delete the user  with Id ' + userId + ' ?');
            }







        </script>
    </body>
</html>

