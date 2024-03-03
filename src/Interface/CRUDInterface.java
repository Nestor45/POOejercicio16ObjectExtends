package Interface;

public interface CRUDInterface {
	public void crearObjeto(Object obje);
	public void mostrar();
	public Object buscar(int indice);
	public void editar(Object obje, int indice);
	public void eliminar(Object obje);
}
