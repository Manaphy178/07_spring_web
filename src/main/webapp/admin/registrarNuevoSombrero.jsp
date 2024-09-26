<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta charset="UTF-8" />
    <title>Registrar</title>
  </head>
  <body>
    <h1>Introduce los datos del nuevo libro</h1>

<jsp:include page="menu.jsp"></jsp:include>

    <form action="ServletRegistroSombrero" method="post">
      Nombre: <input type="text" name="nombre" id="nombre" /> <br />
      Descripcion:
      <textarea
        rows="3"
        cols="12"
        name="description"
        id="description"
      ></textarea> <br />
      Precio: <input type="number" name="precio" id="precio" step="any" />
      <br />
      <input
        type="submit"
        value="REGISTRAR NUEVO LIBRO PARA LA TIENDA"
        style="margin-top: 1rem"
      />
    </form>
  </body>
</html>
