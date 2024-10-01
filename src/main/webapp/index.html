<!DOCTYPE html>
<html>
  <head>
    <meta charset="UTF-8" />
    <title>Insert title here</title>
  </head>
  <body>
    Bienvenido a mi tienda de Sombreros

    <div>
      <a href="admin/">Acceder a la administracion de la tienda</a>
    </div>

    <div style="text-align: center; margin: 10px">
      Bienvenido a la parte publica de la tienda de libros
    </div>

    <div style="margin: 10px">
      <a href="#" id="menu-inicio">Inicio</a>
      <a href="#" id="menu-identificarme">Identificarme</a>
      <a href="#" id="menu-registrarme">Registrarme</a>
      <a href="#" id="menu-carrito">Carrito</a>
      <a href="#" id="menu-mis-pedidos">Mis pedidos</a>
      <a href="#" id="menu-mis-datos">Mis datos personales</a>
    </div>

    <div id="contenedor"></div>
    <script src="mustache.js"></script>
    <script src="jquery.js"></script>

    <script type="text/javascript">
      // Esto es javascript
      // Vamos a pedir informacion a un servicio en el servidor, para recibir
      // un listado de productos

      // mandar informacion o recibirla desde javascript es una tecnica que se llama AJAX
      // para hacer AJAX con js vamos a usar la libreria mas conocida de js: jQuery

      // jquery se usa a traves de la variable $ no confundir con cuando usamos $ en jsp

      // Vamos a comunicarnos con el servicio de producto:
      // cuando se haga click en el boton

      
      
      //Operacion Ajax
      function obtenerProductos() {
        $.ajax("ServicioProductos").done(function (respuesta) {
          // vamos a procesar la respuesta con el json de los libros
          // transformamos el json recibido a array de javascript:
          let sombreros = JSON.parse(respuesta);
          console.log(respuesta);
          console.log(sombreros);
          let texto_html = "";
          texto_html = Mustache.render(html_listado_productos, sombreros);
          $("#contenedor").html(texto_html);
        }); // fin ajax
      } //End obtener productos
      //fin operaciones con ajax

      function enviarInfoUsuarioAlServidor(){
    	  let nombre=$("#nombre").val()
    	  let email=$("#email").val()
    	  let pass=$("pass").val()
    	  //falta validar los datos antes de mandarlos a ServicioUsuarios
    	  $.post("ServicioUsuarios",
    			  {
    		  nombre : nombre,
    		  email : email,
    		  pass : pass
    			  }
    	  ).done(function(res){
    		  
    	  })
    	  
      }//end enviarInfoUsuarioAlServidor
      
      //Operaciones del menu:
      $("#menu-inicio").click(obtenerProductos);
      $("#menu-registrarme").click(mostrarFormularioRegistroUsuario);
      //fin operaciones del menu

      
      
      // Operaciones con plantillas
      function mostrarFormularioRegistroUsuario() {
        $("#contenedor").html(html_formulario_registro_usuario);
        $("#boton_registro_usuario").click(enviarInfoUsuarioAlServidor)
      } //end mostrar formulario resgistro usuario

      
      
      /* Vamos a descargar de primeras todas las plantillas
        para no ir pidiendolas una a una segun lo que quiera
        el usuario*/
      // Estas variables tienen los bloques de html
      // Que iremos mostrando al usuario segun donde haga click
      let html_formulario_registro_usuario = "";
      let html_listado_productos = "";

      // Vamos a descargar todas las plantillas
      $.get("plantillas/formulario-registro-usuario.html").done(function (res) {
        html_formulario_registro_usuario = res;
      });
      $.get("plantillas/listado-productos.html").done(function (res) {
        html_listado_productos = res;
      });

      // Lo que queremos
      // let texto_html = "";
      /*Lo siguiente no queremos hacerlo, porque formar un formulario
        o cualquier cosa con html dentro de js es muy incomodo
        y da pie a errores*/
      // texto_html += "";
      // $("#contenedor").html(texto_html);

      // fin operaciones con plantillas
    </script>
  </body>
</html>
