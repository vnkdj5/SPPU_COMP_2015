<%-- 
    Document   : form
    Created on : 7 Apr, 2018, 7:30:44 PM
    Author     : root
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Find Square :)</h1>
        <form action="Display" method="POST">
            <p>
                <label> Input Number</label>
                <input type="number" name="num1" id="num1">
            </p>
            <p>
                <input type="submit" value="Submit" name="submit">
            </p>
        </form>
    </body>
</html>
