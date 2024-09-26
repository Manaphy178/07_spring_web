package utilidadesSpring;

import javax.servlet.ServletContext;

import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

public class ContenedorSpring {
	/*
	 * Un poco mas adelante esta operacion sera mas sencilla pero por ahora vamos a
	 * usar el siguiente metodo:
	 */
	public static WebApplicationContext obtenerContenedor(ServletContext sc) {
		return WebApplicationContextUtils.getRequiredWebApplicationContext(sc);
	}
}
