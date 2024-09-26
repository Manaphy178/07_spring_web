package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ServletIdentificacionAdmin")
public class ServletIdentificacionAdmin extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// comprobar si la contraseña de admin es correcta
		String passInsertado = request.getParameter("pass");
		if (passInsertado.equals("123")) {
			// si el pass es correcto, meto una variable en sesion
			// para identificar al usuario como admin
			request.getSession().setAttribute("admin", "ok");
			response.sendRedirect("admin/index.jsp");
		} else {
			response.sendRedirect("login_admin.html");
		}
	}

}
