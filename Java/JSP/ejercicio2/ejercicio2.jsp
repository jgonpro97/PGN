<%-- 
  1. Crea una aplicación web en Java que muestre tu nombre y tus datos
  personales por pantalla. La página principal debe ser un archivo con la
  extensión jsp. Comprueba que se lanzan bien el servidor y el navegador
  web. Observa los mensajes que da el servidor. Fíjate en la dirección que
  aparece en la barra de direcciones del navegador.
  
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html>
	<head>
    	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    	<title>Ejercicio 2</title>
    	<link rel="stylesheet" type="text/css" href="estilos.css">
  	</head>
	<body>

		<h1>Mis datos:</h1>
		
		Nombre: Juan Manuel Gonzalez Profumo </br>
		Telefono: 957123123 </br>
		Email: juanma@gmail.com </br>
		
	</body>
</html>