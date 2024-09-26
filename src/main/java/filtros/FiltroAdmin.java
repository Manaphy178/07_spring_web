package filtros;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FiltroAdmin implements Filter {

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		// aqui decimos cuando permitimos al usuario acceder a una ruta o no

		/**
		 * el request y response que nos dan para trabajar, no son exactamente los que
		 * hemos usado en servlets, para poder usarlos normalmente tenemos que
		 * castearlos
		 */
		HttpServletRequest hsr = (HttpServletRequest) request;
		HttpServletResponse res = (HttpServletResponse) response;
		if (hsr.getSession().getAttribute("admin") != null) {
//			entendemos que el usuario se identifico correctamente
			chain.doFilter(request, response);// asi decimos que el filtro no haga nada
		}else {
			res.sendRedirect(
					
					"../login_admin.html");
		}
	}

}
