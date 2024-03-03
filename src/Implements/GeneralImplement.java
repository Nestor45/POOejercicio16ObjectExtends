package Implements;

import java.util.ArrayList;
import java.util.List;

import Dominio.Departamento;
import Dominio.Empleado;
import Dominio.Sucursal;
import Interface.CRUDInterface;

public class GeneralImplement implements CRUDInterface{

	List<Object> listObjetos = new ArrayList<>();
	
	@Override
	public void crearObjeto(Object obje) {
		// TODO Auto-generated method stub
		listObjetos.add(obje);
	}

	@Override
	public void mostrar() {
		// TODO Auto-generated method stub
		System.out.println(listObjetos);
	}

	@Override
	public Object buscar(int indice) {
		// TODO Auto-generated method stub
		return listObjetos.get(indice);
	}

	@Override
	public void editar(Object obje, int indice) {
		// TODO Auto-generated method stub
		listObjetos.set(indice, obje);
	}

	@Override
	public void eliminar(Object obje) {
		// TODO Auto-generated method stub
		listObjetos.remove(obje);
	}
	
	public void mostrarXIndice() {
		for (int i=0; i<listObjetos.size(); i++) {
			if (listObjetos.get(i).getClass().equals(Sucursal.class)) {
				System.out.printf("\nindice:[%d]--> " + listObjetos.get(i), i);
			} else if (listObjetos.get(i).getClass().equals(Departamento.class)) {
				System.out.printf("\nindice:[%d]--> " + listObjetos.get(i), i);
			} else if (listObjetos.get(i).getClass().equals(Empleado.class)) {
				System.out.printf("\nindice:[%d]--> " + listObjetos.get(i), i);
			}
		}
	}

}
