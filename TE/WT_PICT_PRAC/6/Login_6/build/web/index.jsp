<%-- 
    Document   : index
    Created on : 9 Apr, 2018, 11:16:59 PM
    Author     : root
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    if(session.getAttribute("loggedIn")!=null)
    {
        response.sendRedirect("process.jsp");
    };
    %>
<!DOCTYPE html>
<html>
<head>
	<title>Login Page</title>
        
            <script type = "text/javascript" >
function disableBackButton()
{
window.history.forward();
}
setTimeout("disableBackButton()", 0);
</script>
            </script>
</head>
<body onload="disableBackButton()">
<div width="50%">
<form action="process.jsp" method="POST">
	<p>
	<label>Username:</label>
	<input type="text" name="username" id="username" placeholder="Username" required>
	</p>
	<p>
	<label>Password:</label>
	<input type="password" name="password" id="password" placeholder="Password" required> 
	</p>
	<p>
	<input type="submit" name="submit" id="submit" value="Login">
	</p>
</form>
</div>
</body>
</html>