<%-- 
 	10. Realiza un cuestionario con 10 preguntas tipo test sobre las asignaturas
	que se imparten en el curso. Cada pregunta acertada sumará un punto. El
	programa mostrará al final la calificación obtenida. Pásale el cuestionario
	a tus compañeros y pídeles que lo hagan para ver qué tal andan de
	conocimientos en las diferentes asignaturas del curso. Utiliza radio
	buttons en las preguntas del cuestionario.
  
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>Ejercicio 10</title>
	</head>
	<body>

		<h1>Cuestionario:</h1>

		<form method="post" action="puntuacion.jsp">
			1. ¿Java es un lenguaje de programacion?</br>
			<input type="radio" name="1" value="1"> Si</input></br> 
			<input type="radio" name="1" value="0"> No</input></br></br>
			
			2. ¿Es Eclipse un IDE para desarrollar aplicaciones?</br>
			<input type="radio" name="2" value="1"> Si</input></br> 
			<input type="radio" name="2" value="0"> No</input></br></br>
			
			3. ¿Para heredar en Java se hace uso de la palabra implements?</br>
			<input type="radio" name="3" value="0"> Si</input></br> 
			<input type="radio" name="3" value="1"> No</input></br></br>
			
			4. ¿En Python hay herencia multiple?</br>
			<input type="radio" name="4" value="1"> Si</input></br> 
			<input type="radio" name="4" value="0"> No</input></br></br>
			
			5. ¿Se usa SQL para hacer consultas en un base de datos?</br>
			<input type="radio" name="5" value="1"> Si</input></br> 
			<input type="radio" name="5" value="0"> No</input></br></br>
			
			6. ¿En Java el nombre del paquete debe ir en mayusculas?</br>
			<input type="radio" name="6" value="0"> Si</input></br> 
			<input type="radio" name="6" value="1" > No</input></br></br>
			
			7. ¿Su utiliza DELETE TABLE "nombre_tabla"; para borrar una tabla con SQL?</br>
			<input type="radio" name="7" value="0"> Si</input></br> 
			<input type="radio" name="7" value="1"> No</input></br></br>
			
			8. ¿En Java no hace falta declarar las variables?</br>
			<input type="radio" name="8" value="0"> Si</input></br> 
			<input type="radio" name="8" value="1"> No</input></br></br>
			
			9. ¿Se utiliza SELECT paracer consultas SQL?</br>
			<input type="radio" name="9" value="1"> Si</input></br> 
			<input type="radio" name="9" value="0"> No</input></br></br>
			
			10. ¿En Python hay sobrecarga de operadores?</br>
			<input type="radio" name="10" value="1"> Si</input></br> 
			<input type="radio" name="10" value="0"> No</input></br></br>
			
		 	<input type="submit" value="Enviar">
		 	
		</form>
	</body>
</html>