package servicios;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.ApplicationContext;

import com.google.gson.Gson;

import java.util.*;
import daos.*;
import daosImpl.*;
import modelo.*;
import utilidadesSpring.ContenedorSpring;

/**
 * Servlet implementation class ServicioProducto
 */
@WebServlet("/ServicioProductos")
public class ServicioProductos extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public ServicioProductos() {
		super();

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		/**
		 * Ya no vamos a crear nosotros el objeto para usar un DAO, sino que se lo
		 * pediremos al contenedor de spring
		 */

//		SombrerosDAO dao = new SombrerosDAOImpl();
		ApplicationContext contenedorSpring = ContenedorSpring.obtenerContenedor(super.getServletContext());
		/**
		 * asi le digo al contenedor que devuelva el unico objeto que debe tener de la
		 * clase indicada
		 */
		SombrerosDAO dao = contenedorSpring.getBean(SombrerosDAOImpl.class);

		List<Sombrero> sombrero = dao.obtenerSombrero();
//		Ahora tengo que transformar los libros a json para darselos al cliente

		Gson gson = new Gson();
		String json = gson.toJson(sombrero);

		response.getWriter().print(json);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}

}
