package servlets.admin;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import daos.SombrerosDAO;
import daosImpl.SombrerosDAOImpl;
import modelo.Sombrero;
import utilidadesSpring.ContenedorSpring;

@WebServlet("/admin/ServletEditarSombrero")
public class ServletEditarSombrero extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String id = request.getParameter("id");
		SombrerosDAO sombrerosDAO = ContenedorSpring.obtenerContenedor(getServletContext())
				.getBean(SombrerosDAOImpl.class);
		Sombrero s = sombrerosDAO.obtenerSombreroPorId(Long.parseLong(id));
		request.setAttribute("sombrero", s);
		RequestDispatcher rd = request.getRequestDispatcher("sombreros-editar.jsp");
		rd.forward(request, response);
	}

}
