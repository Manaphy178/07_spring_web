package daos;

import java.util.*;
import modelo.Usuario;
public interface UsuariosDAO {
	void registrarUsuario(Usuario u);
	List<Usuario> obtenerUsuarios();
	void borrarUsuario(long id);
	
	
}
