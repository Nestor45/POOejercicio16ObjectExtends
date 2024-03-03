package Implements;
import java.util.ArrayList;
import java.util.List;

import Dominio.Departamento;
import Interface.CRUDInterface;

public class DepartemetoImplement implements CRUDInterface{

	List<Departamento> listDepartamentos = new ArrayList<>();
	
	@Override
	public void crearObjeto(Object obje) {
		// TODO Auto-generated method stub
		listDepartamentos.add((Departamento) obje);
	}

	@Override
	public void mostrar() {
		// TODO Auto-generated method stub
		System.out.println(listDepartamentos);
	}

	@Override
	public Object buscar(int indice) {
		// TODO Auto-generated method stub
		return listDepartamentos.get(indice);
	}

	@Override
	public void editar(Object obje, int indice) {
		// TODO Auto-generated method stub
		listDepartamentos.set(indice, (Departamento) obje);
	}

	@Override
	public void eliminar(Object obje) {
		// TODO Auto-generated method stub
		listDepartamentos.remove(obje);
	}

}
