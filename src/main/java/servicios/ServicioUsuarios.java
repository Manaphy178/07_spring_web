package servicios;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.ApplicationContext;

import daos.UsuariosDAO;
import daosImpl.UsuariosDAOImpl;
import modelo.Usuario;
import utilidadesSpring.ContenedorSpring;

@WebServlet("/ServicioUsuarios")
public class ServicioUsuarios extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		/**
		 * recoger la informacion que nos ha mandado el usuario para vadilarla mas
		 * adelante y registrarla en base de datos
		 */
		String nombre = request.getParameter("nombre");
		String email = request.getParameter("email");
		String pass = request.getParameter("pass");
		Usuario nuevoUsuario = new Usuario(nombre,email,pass);
		ApplicationContext contenedorSpring = ContenedorSpring.obtenerContenedor(getServletContext());
		UsuariosDAO usuariosDAO = contenedorSpring.getBean(UsuariosDAOImpl.class);
		usuariosDAO.registrarUsuario(nuevoUsuario);
		response.getWriter().print("usuario registrado correctamente");
	}

}
