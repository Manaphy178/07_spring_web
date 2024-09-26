package mappers;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import modelo.Sombrero;

/**
 * Con spring jdbc tenemos que definir a parte como formar un objeto de Sombrero
 * cuando pidamos sombreros a la base de datos
 */

public class SombrerosMapper implements RowMapper<Sombrero> {

	@Override
	public Sombrero mapRow(ResultSet rs, int arg1) throws SQLException {
		Sombrero s = new Sombrero();
		s.setNombre(rs.getString("nombre"));
		s.setDesc(rs.getString("description"));
		s.setPrecio(rs.getDouble("precio"));
		s.setId(rs.getLong("id"));
		return s;
	}

}
