<%-- 
    Document   : error
    Created on : Jan 17, 2023, 2:38:45 PM
    Author     : gilles
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Error</title>
    </head>
    <body>
    <center>
        
        <h1>ERROR</h1>
        <h2><%= exception.getMessage() %></h2>
        
    </center>
    </body>
</html>
