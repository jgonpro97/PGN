<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html>
	<head>
    	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    	<title>Ejercicio 10</title>
  	</head>
	<body>

      <%
      try {
        int puntos = 0;
        
       	puntos += Integer.parseInt(request.getParameter("1"));
       	puntos += Integer.parseInt(request.getParameter("2"));
       	puntos += Integer.parseInt(request.getParameter("3"));
       	puntos += Integer.parseInt(request.getParameter("4"));
       	puntos += Integer.parseInt(request.getParameter("5"));
       	puntos += Integer.parseInt(request.getParameter("6"));
       	puntos += Integer.parseInt(request.getParameter("7"));
       	puntos += Integer.parseInt(request.getParameter("8"));
       	puntos += Integer.parseInt(request.getParameter("9"));
       	puntos += Integer.parseInt(request.getParameter("10"));
       	
        out.print("Puntuacion: " + puntos);
       
      } catch(NumberFormatException nfe) {
      	out.println("Los datos recibidos no son números enteros");
      }
 
      %>
		
	</body>
</html>