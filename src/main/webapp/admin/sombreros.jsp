<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
  <head>
    <meta charset="UTF-8" />
    <title>Listado</title>
  </head>
  <body>
    <jsp:include page="menu.jsp"></jsp:include>

	<div><a href="registrarNuevoSombrero.jsp">Registrar nuevo sombrero</a></div>

    <div>Listado de libros de la tienda:</div>
    	<c:forEach items="${info_listado}" var="elemento">
		<div style="margin: 5px">
			Tipo: ${elemento.nombre} <br> 
			Descripcion: ${elemento.desc } <br>
			Precio: ${elemento.precio } euros <br>
			ID: ${elemento.id} <br>
			<a href="ServletBorrarSombrero?id=${elemento.id }" onclick="return confirm('¿seguro?')">Borrar</a>
			<hr>
		</div>
	</c:forEach>
  </body>
</html>
