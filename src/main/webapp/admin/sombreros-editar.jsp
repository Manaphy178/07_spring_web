<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<jsp:include page="menu.jsp"></jsp:include>
	Editar datos del registro:
	<br>
	<!-- aunque el formulario de edicion sea casi igual al de registro
	lo suyo es que esten en archivos distintos para que nos sea mas facil
	tratar cualquier diferencia -->
	  <form action="ServletGuardarCambiosSombrero" method="post">
      Nombre: <input type="text" name="nombre" id="nombre" value="${sombrero.nombre }"/> <br />
      Descripcion:
      <textarea
        rows="3"
        cols="12"
        name="description"
        id="description"
        
      >${sombrero.description }</textarea> <br />
      Precio: <input type="number" name="precio" id="precio" step="any" value="${sombrero.precio }" />
      <br />
      <input type="hidden" name="id" value="${sombrero.id }">
      <input
        type="submit"
        value="GUARDAR CAMBIOS"
        style="margin-top: 1rem"
      />
    </form>
</body>
</html>