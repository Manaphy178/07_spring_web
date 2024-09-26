package constantesSQL;

public class ConstantesSQL {

	public final static String SQL_OBTENER_SOMBREROS = "SELECT * FROM tabla_sombreros;";
	public final static String SQL_REGISTRAR_SOMBRERO = "INSERT INTO `tabla_sombreros` (`nombre`, `description`, `precio`) VALUES (?, ?, ?)";
	public final static String SQL_BORRAR_SOMBRERO = "DELETE FROM `tabla_sombreros` WHERE `tabla_sombreros`.`id` = ?";
}