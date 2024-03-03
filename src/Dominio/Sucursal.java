package Dominio;

public class Sucursal {
	private int numSuc;
	private String nombreSuc;
	private int anioInaguracion;
	
	public Sucursal() {}
	
	public Sucursal(int numSuc, String nombreSuc, int anioInaguracion) {
		this.numSuc = numSuc;
		this.nombreSuc = nombreSuc;
		this.anioInaguracion = anioInaguracion;
	}

	public int getNumSuc() {
		return numSuc;
	}

	public void setNumSuc(int numSuc) {
		this.numSuc = numSuc;
	}

	public String getNombreSuc() {
		return nombreSuc;
	}

	public void setNombreSuc(String nombreSuc) {
		this.nombreSuc = nombreSuc;
	}

	public int getAnioInaguracion() {
		return anioInaguracion;
	}

	public void setAnioInaguracion(int anioInaguracion) {
		this.anioInaguracion = anioInaguracion;
	}

	@Override
	public String toString() {
		return "Sucursal [numSuc=" + numSuc + ", nombreSuc=" + nombreSuc + ", anioInaguracion=" + anioInaguracion + "] \n";
	}
	
}
