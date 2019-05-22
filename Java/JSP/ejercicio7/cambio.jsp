<%@page import="java.text.DecimalFormat"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  	<head>
    	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    	<title>Ejercicio 7</title>
  	</head>
	<body>

		<h2>
	    	<%
	        
	         	Double c = Double.parseDouble(request.getParameter("cantidad"));
	          	DecimalFormat formatoEuros = new DecimalFormat("0.00");
	          
	          	if (request.getParameter("cambio").equals("eurosAPesetas")) {
	            	out.print(formatoEuros.format(c) + " euros = " + Math.round(c * 166.386) + " pesetas.");
	          	} 
	          
	          	else {
	            	out.print(Math.round(c) + " pesetas = " + formatoEuros.format(c / 166.386) + " euros.");
	          	}
	          
	       %>
	      </h2>
</body>
</html>