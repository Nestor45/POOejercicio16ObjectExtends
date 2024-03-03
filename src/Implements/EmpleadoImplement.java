package Implements;

import java.util.ArrayList;
import java.util.List;

import Dominio.Empleado;
import Interface.CRUDInterface;

public class EmpleadoImplement implements CRUDInterface{
	
	List<Empleado> listEmpleados = new ArrayList<>();
	
	@Override
	public void crearObjeto(Object obje) {
		// TODO Auto-generated method stub
		listEmpleados.add((Empleado) obje);
	}

	@Override
	public void mostrar() {
		// TODO Auto-generated method stub
		System.out.println(listEmpleados);
	}

	@Override
	public Object buscar(int indice) {
		// TODO Auto-generated method stub
		return listEmpleados.get(indice);
	}

	@Override
	public void editar(Object obje, int indice) {
		// TODO Auto-generated method stub
		listEmpleados.set(indice, (Empleado) obje);
	}

	@Override
	public void eliminar(Object obje) {
		// TODO Auto-generated method stub
		listEmpleados.remove((Empleado) obje);
	}

}
