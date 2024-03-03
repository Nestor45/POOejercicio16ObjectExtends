package Dominio;

public class Empleado {
	private int numEmpleado;
	private String nombre;
	private String app;
	private String correo;
	private long numCel;
	
	public Empleado() {}
	
	public Empleado(int numEmpleado, String nombre, String app, String correo, long numCel) {
		this.numEmpleado = numEmpleado;
		this.nombre = nombre;
		this.app = app;
		this.correo = correo;
		this.numCel = numCel;
	}

	public int getNumEmpleado() {
		return numEmpleado;
	}

	public void setNumEmpleado(int numEmpleado) {
		this.numEmpleado = numEmpleado;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApp() {
		return app;
	}

	public void setApp(String app) {
		this.app = app;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public long getNumCel() {
		return numCel;
	}

	public void setNumCel(long numCel) {
		this.numCel = numCel;
	}

	@Override
	public String toString() {
		return "Empleado [numEmpleado=" + numEmpleado + ", nombre=" + nombre + ", app=" + app + ", correo=" + correo
				+ ", numCel=" + numCel + "]\n";
	}
	
	
}
