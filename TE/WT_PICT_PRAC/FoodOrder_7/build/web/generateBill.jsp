<%-- 
    Document   : generateBill
    Created on : 7 Apr, 2018, 4:28:36 PM
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
        
        <%
            String quantity[]=request.getParameterValues("itemCount");
            String total[]=request.getParameterValues("itemTotal");
            String name[]=request.getParameterValues("itemName");
            //out.print(request.getParameter("itemTotal"));
            String finalTotal=request.getParameter("total");
            String username=request.getParameter("uname");
            String email=request.getParameter("email_id");
            
            %>
            <h1>Bill</h1>
            <table border="1" style="border-spacing: 0px;">
                <tr><th>Sr.No</th><th>Item Name</th><th>Item Price</th><th>Item Count</th><th>Total</th></tr>
            
            <%
                try
                {
                 
                for(int i=0;i<total.length;i++)
                {
                    String parts[]=name[i].split("-");
                out.print("<tr><td>"+(i+1)+"</td><td>"+parts[0]+"</td><td> "+parts[1]+"</td><td>"+quantity[i]+"</td><td>"+total[i]+"</td></tr>\n");
                }
                }
               catch(Exception e)
               {
                   
               }
                out.println("<h2>Total ==> "+finalTotal+"</h2>");
                %>
            </table>
            <h3>Thank You placing order. :)</h3>
    </body>
</html>
