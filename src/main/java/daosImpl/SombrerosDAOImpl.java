package daosImpl;

import java.util.*;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;

import constantesSQL.ConstantesSQL;
import daos.SombrerosDAO;
import mappers.SombrerosMapper;
import modelo.Sombrero;

/**
 * DAO= estandar en java, Data Access Object Un DAO es el elemento desde el que
 * se haecn operaciones tipo CRUD del tipo de dato indicado
 * 
 * SombrerosDAO = registrarSombrero,obtenerSombrero,etc...
 * 
 * PedidosDAO = registrarPedido, etc...
 * 
 * clase Sombrero: indicara que tiene un libro: titulo, desc etc...
 */
public class SombrerosDAOImpl implements SombrerosDAO {

	private DataSource ds;
	private SimpleJdbcInsert simpleInsert;
	private JdbcTemplate jdbcTemplate;

//necesario para que por el xml de spring le demos
//	el datasource configurado en el mismo archivo
	public void setDs(DataSource ds) {
		this.ds = ds;
		System.out.println("Configurando simple insert");
		this.simpleInsert = new SimpleJdbcInsert(ds);
		this.simpleInsert.withTableName("tabla_sombreros");
		this.jdbcTemplate = new JdbcTemplate(ds);
	}

	public List<Sombrero> obtenerSombrero() {
		List<Sombrero> sombreros = this.jdbcTemplate.query(ConstantesSQL.SQL_OBTENER_SOMBREROS, new SombrerosMapper());

		return sombreros;
	}

	@Override
	public void registrarSombrero(Sombrero s) {

		this.jdbcTemplate.update(ConstantesSQL.SQL_REGISTRAR_SOMBRERO, s.getNombre(), s.getDesc(), s.getPrecio());

	}// end registrar libro

	@Override
	public void borrarSombrero(int id) {
		this.jdbcTemplate.update(ConstantesSQL.SQL_BORRAR_SOMBRERO, id);
	}

	@Override
	public void editarSombrero(Sombrero s) {
		// TODO Auto-generated method stub

	}

	@Override
	public Sombrero obtenerSombreroPorId(long id) {
		Sombrero s = this.jdbcTemplate.queryForObject(ConstantesSQL.SQL_OBTENER_SOMBRERO_POR_ID, new SombrerosMapper(),
				id);
		return s;

	}

	@Override
	public void actualizarLibro(Sombrero s) {
		this.jdbcTemplate.update(ConstantesSQL.SQL_ACTUALIZAR_SOMBRERO, s.getNombre(), s.getDesc(), s.getPrecio(),
				s.getId());
	}
}
