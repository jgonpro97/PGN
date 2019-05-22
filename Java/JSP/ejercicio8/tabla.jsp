<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Ejercicio 8</title>
  </head>
  <body>
    <% int num = Integer.parseInt(request.getParameter("numero")); %>
    <table border cellpadding=10 cellspacing=0>
    	<caption>Tabla del <%=num + ":"%> </caption>
      	<%
      		for(int i = 0; i < 11; i++) {
      			out.println("<tr>");
        		out.println("<td>" + num + " x " + i + "</td>");
        		out.println("<td> = </td>"); 
        		out.println("<td>" + (i * num) + "</td>");
        		out.println("</tr>");
      		}
      	%> 
    </table>
  </body>
</html>