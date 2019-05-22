<%--7. Combina las dos aplicaciones anteriores en una sola de tal forma que en la
página principal se pueda elegir pasar de euros a pesetas o de pesetas a euros.
Adorna la página con alguna foto o dibujo.--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html>
	<head>
    	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    	<title>Ejercicio 7</title>
  	</head>
	<body>
	
		<h1>Conversor de moneda</h1>
	    <form class="dinero" method="post" action="cambio.jsp">
	    
	      Cantidad</br><input type="number" min="0" step="0.01" name="cantidad"></br></br>
	      
	      <input type="radio" name="cambio" value="eurosAPesetas"> Euros a Pesetas</br></br>
	      <input type="radio" name="cambio" value="pesetasAEuros"> Pesetas a Euros</br></br>
	      <input type="submit" value="Convertir">
	      
	    </form>
	</body>
</html>