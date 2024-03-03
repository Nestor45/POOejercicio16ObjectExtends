package Dominio;

public class Departamento {
	private int numDep;
	private String nombre;
	private int numEmpleados;
	
	public Departamento() {}

	public Departamento(int numDep, String nombre, int numEmpleados) {
		this.numDep = numDep;
		this.nombre = nombre;
		this.numEmpleados = numEmpleados;
	}

	public int getNumDep() {
		return numDep;
	}

	public void setNumDep(int numDep) {
		this.numDep = numDep;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getNumEmpleados() {
		return numEmpleados;
	}

	public void setNumEmpleados(int numEmpleados) {
		this.numEmpleados = numEmpleados;
	}

	@Override
	public String toString() {
		return "Departamento [numDep=" + numDep + ", nombre=" + nombre + ", numEmpleados=" + numEmpleados + "]\n";
	}

	
}
