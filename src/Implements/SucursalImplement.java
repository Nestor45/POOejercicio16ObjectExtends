package Implements;

import java.util.ArrayList;
import java.util.List;

import Dominio.Sucursal;
import Interface.CRUDInterface;

public class SucursalImplement implements CRUDInterface{

	List<Object> listSucursal = new ArrayList<>();
	
	@Override
	public void crearObjeto(Object obje) {
		// TODO Auto-generated method stub
		listSucursal.add(obje);
	}

	@Override
	public void mostrar() {
		// TODO Auto-generated method stub
		System.out.println(listSucursal);
	}

	@Override
	public Object buscar(int indice) {
		// TODO Auto-generated method stub
		return listSucursal.get(indice);
	}

	@Override
	public void editar(Object obje, int indice) {
		// TODO Auto-generated method stub
		listSucursal.set(indice,obje);
	}

	@Override
	public void eliminar(Object obje) {
		// TODO Auto-generated method stub
		listSucursal.remove(obje);
	}
	
	public void mostrarXIndice() {
		for (int i=0; i<listSucursal.size(); i++) {
			System.out.printf("\nindice:[%d]--> " + listSucursal.get(i), i);
		}
	}

}
