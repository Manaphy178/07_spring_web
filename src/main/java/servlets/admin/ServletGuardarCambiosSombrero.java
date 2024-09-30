package servlets.admin;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import daos.SombrerosDAO;
import daosImpl.SombrerosDAOImpl;
import modelo.Sombrero;
import utilidadesSpring.ContenedorSpring;

/**
 * Servlet implementation class ServletGuardarCambiosSombrero
 */
@WebServlet("/admin/ServletGuardarCambiosSombrero")
public class ServletGuardarCambiosSombrero extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		Sombrero s = new Sombrero();
		s.setNombre(request.getParameter("nombre"));
		s.setDesc(request.getParameter("description"));
		s.setPrecio(Double.parseDouble(request.getParameter("precio")));
		s.setId(Long.parseLong(request.getParameter("id")));
		SombrerosDAO sombrerosDAO = ContenedorSpring.obtenerContenedor(getServletContext())
				.getBean(SombrerosDAOImpl.class);
		sombrerosDAO.actualizarLibro(s);
		response.sendRedirect("ServletListarSombrero");
	}

}
