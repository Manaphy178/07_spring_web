package constantesSQL;

public class ConstantesSQL {

	public final static String SQL_OBTENER_SOMBREROS = 
			"SELECT * FROM tabla_sombreros;";
	public final static String SQL_REGISTRAR_SOMBRERO = 
			"INSERT INTO `tabla_sombreros` (`nombre`, `description`, `precio`) VALUES (?, ?, ?)";
	public final static String SQL_BORRAR_SOMBRERO = 
			"DELETE FROM `tabla_sombreros` WHERE `tabla_sombreros`.`id` = ?";
	public static final String SQL_OBTENER_SOMBRERO_POR_ID = 
			"SELECT * FROM tabla_sombreros WHERE `tabla_sombreros`.`id` = ?;";
	public static final String SQL_ACTUALIZAR_SOMBRERO =
			"UPDATE `tabla_sombreros` SET `nombre` = ?, `description` = ?, `precio` = ? WHERE `tabla_sombreros`.`id` = ?";
}