<%-- 
    Document   : process
    Created on : 7 Apr, 2018, 8:20:18 AM
    Author     : root
--%>

<%@page contentType="text/html" pageEncoding="UTF-8" import="java.sql.*"%>

<%
    response.setHeader("Cache-Control", "no-cache");
            response.setHeader("Cache-Control", "no-store");
            response.setHeader("Pragma", "no-cache");
             response.setDateHeader("Expires", 0);
    //------------------LOGOUT FUNCTION
    String logoutCheck=request.getParameter("logout");
    if(logoutCheck!=null)
    {	
        session.removeAttribute("loggenIn");
        session.setAttribute("loggedIn", null);
      //  request.getSession(false).invalidate();
        %>
        <script>
    	alert("logout Successful.");        
    	location.href="index.jsp";
        </script>
        <%
    }
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            if(session.getAttribute("loggedIn")!=null)
            {   out.print("Login Status:"+session.getAttribute("loggedIn"));
            %>
            <form action="process.jsp" method="POST">
                    <input type="submit" value="logout" name="logout">
                </form>
            <%
            
            }
            else if(logoutCheck==null)
            {
            String username=request.getParameter("username");
            String password=request.getParameter("password");
           /* 
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/tnp_db", "root", "");
            Statement st=con.createStatement();
            String query="Select *,count(*) as cnt from student_info where studentEmail='"+username+"' and studentPassword='"+password+"'";
            
            ResultSet rs=st.executeQuery(query);
            rs.next();
            if(rs.getInt("cnt")==1){
                out.print("<h1>Login Successful.</h1>");
*/
 if(username.equals("vaibhav") && password.equals("vaibhav"))
{
                %>
                <form action="process.jsp" method="POST">
                    <input type="submit" value="logout" name="logout">
                </form>
                
                <%
                session.setAttribute("loggedIn", "true");
                session.setAttribute("username", username);
                out.print("Login Status:"+session.getAttribute("loggedIn"));
            }
            else
            {
                if(session.isNew())
{
                out.print("Login Status:"+session.getAttribute("loggedIn"));
}
                out.print("<h1>login Failed.</h1>\n<h2>Invalid Credentials.</h2>");
            }
            
//rs.close();
//con.close();
//t.close();
}
            %>
       
    </body>
</html>
