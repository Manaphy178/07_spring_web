package modelo;

public class Sombrero {
	private String nombre;
	private String desc;
	private double precio;
	private long id;

	public Sombrero() {
		// TODO Auto-generated constructor stub
	}

	public Sombrero(String nombre, String desc, double precio) {
		super();
		this.nombre = nombre;
		this.desc = desc;
		this.precio = precio;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

}
