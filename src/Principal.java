import java.util.Scanner;

import Dominio.Departamento;
import Dominio.Empleado;
import Dominio.Sucursal;
import Implements.GeneralImplement;
import Implements.SucursalImplement;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numSuc;
		String nombreSuc;
		int anioInaguracion;
		
		int numDep;
		String nombreDep;
		int numEmpleadosDep;
		
		int numEmpleado;
		String nombreEmp;
		String apellidoEmp;
		String correo;
		long numCel;
		
		Scanner leer = null;
		Sucursal sucursal = null;
		Departamento departamento = null;
		Empleado empleado= null;
		
		SucursalImplement suImp = new SucursalImplement();
		GeneralImplement geImp = new GeneralImplement();
		
		int menuPrincipal, menuSucursal, menuDepartamento, menuEmpleado, menuSubSucursal, menuSubDepatamento, menuSubEmpleado;
		int indice;
		do {
			System.out.println("Menu principal");
			System.out.println("1.- Crear Sucursal");
			System.out.println("2.- Crear Departamento");
			System.out.println("3.- Crear Empleado");
			System.out.println("4.- Salir");
			leer = new Scanner(System.in);
			menuPrincipal = leer.nextInt();
			switch(menuPrincipal) {
			case 1:
				do {
					System.out.println("Menu Sucursal");
					System.out.println("1.- Crear");
					System.out.println("2.- Listar");
					System.out.println("3.- Editar");
					System.out.println("4.- Buscar");
					System.out.println("5.- Eliminar");
					System.out.println("6.- Salir");
					leer = new Scanner(System.in);
					menuSucursal = leer.nextInt();
					switch(menuSucursal) {
					case 1:
							System.out.println("Agregar numero de sucursal");
							leer = new Scanner(System.in);
							numSuc = leer.nextInt();
							System.out.println("Agregar nombre de sucursal");
							leer = new Scanner(System.in);
							nombreSuc = leer.nextLine();
							System.out.println("Agregar año de inaguracion");
							leer = new Scanner(System.in);
							anioInaguracion = leer.nextInt();
							sucursal = new Sucursal(numSuc,nombreSuc,anioInaguracion);
							suImp.crearObjeto(sucursal);
						break;
					case 2:
						suImp.mostrar();
						break;
					case 3:
						suImp.mostrarXIndice();
						System.out.println("Ingrese el indice a buscar");
						leer = new Scanner(System.in);
						indice = leer.nextInt();
						sucursal = (Sucursal) suImp.buscar(indice);
						do {
							System.out.println("Ingrese la opcion a editar");
							System.out.println("1.- Editar nombre");
							System.out.println("2.- Editar año de inaguracion");
							System.out.println("3.- Salir");
							leer = new Scanner(System.in);
							menuSubSucursal = leer.nextInt();
							switch(menuSubSucursal) {
							case 1:
								System.out.println("Agregar nuevo nombre de sucursal");
								leer = new Scanner(System.in);
								nombreSuc = leer.nextLine();
								sucursal.setNombreSuc(nombreSuc);
								break;
							case 2:
								System.out.println("Agregar nuevo año de inaguracion");
								leer = new Scanner(System.in);
								anioInaguracion = leer.nextInt();
								sucursal.setAnioInaguracion(anioInaguracion);
								break;
							case 3:
								System.out.println("Saliendo...");
								break;
							}
						}while(menuSubSucursal<3);
						break;
					case 4:
						suImp.mostrarXIndice();
						System.out.println("Ingrese el indice a buscar");
						leer = new Scanner(System.in);
						indice = leer.nextInt();
						System.out.println(suImp.buscar(indice));
						break;
					case 5:
						suImp.mostrarXIndice();
						System.out.println("Ingrese el indice a eliminar");
						leer = new Scanner(System.in);
						indice = leer.nextInt();
						sucursal = (Sucursal) suImp.buscar(indice);
						suImp.eliminar(sucursal);
						break;
					case 6:
						break;
					}
				}while(menuSucursal<6);
				break;
			case 2:
				do {
					System.out.println("Menu Departemento");
					System.out.println("1.- Crear");
					System.out.println("2.- Listar");
					System.out.println("3.- Editar");
					System.out.println("4.- Buscar");
					System.out.println("5.- Eliminar");
					System.out.println("6.- Salir");
					leer = new Scanner(System.in);
					menuDepartamento = leer.nextInt();
					switch(menuDepartamento) {
					case 1:
						System.out.println("Agregar numero de departamento");
						leer = new Scanner(System.in);
						numDep = leer.nextInt();
						System.out.println("Agregar nombre de departamento");
						leer = new Scanner(System.in);
						nombreDep = leer.nextLine();
						System.out.println("Agregar numero de empleados");
						leer = new Scanner(System.in);
						numEmpleadosDep = leer.nextInt();
						departamento = new Departamento(numDep,nombreDep,numEmpleadosDep);
						geImp.crearObjeto(departamento);
						break;
					case 2:
						geImp.mostrar();
						break;
					case 3:
						geImp.mostrarXIndice();
						System.out.println("Ingrese el indice a buscar");
						leer = new Scanner(System.in);
						indice = leer.nextInt();
						System.out.println(geImp.buscar(indice));
						departamento = (Departamento) geImp.buscar(indice);
						do {
							System.out.println("Ingrese la opcion a editar");
							System.out.println("1.- Editar nombre");
							System.out.println("2.- Numero de departamento");
							System.out.println("3.- Salir");
							leer = new Scanner(System.in);
							menuSubDepatamento = leer.nextInt();
							switch(menuSubDepatamento) {
							case 1:
								System.out.println("Agregar nuevo nombre de departamento");
								leer = new Scanner(System.in);
								nombreDep = leer.nextLine();
								departamento.setNombre(nombreDep);
								break;
							case 2:
								System.out.println("Agregar nuevo numero de empleados");
								leer = new Scanner(System.in);
								numEmpleadosDep = leer.nextInt();
								departamento.setNumEmpleados(numEmpleadosDep);
								break;
							case 3:
								System.out.println("Saliendo...");
								break;
							}
						}while(menuSubDepatamento<3);
						break;
					case 4:
						geImp.mostrarXIndice();
						System.out.println("Ingrese el indice a buscar");
						leer = new Scanner(System.in);
						indice = leer.nextInt();
						System.out.println(geImp.buscar(indice));
						break;
					case 5:
						geImp.mostrarXIndice();
						System.out.println("Ingrese el indice a eliminar");
						leer = new Scanner(System.in);
						indice = leer.nextInt();
						departamento = (Departamento) geImp.buscar(indice);
						geImp.eliminar(departamento);
						break;
					case 6:
						System.out.println("Saliendo...");
						break;
					}
				}while(menuDepartamento<6);
				break;
			case 3:
				do {
					System.out.println("Menu Empleados");
					System.out.println("1.- Crear");
					System.out.println("2.- Listar");
					System.out.println("3.- Editar");
					System.out.println("4.- Buscar");
					System.out.println("5.- Eliminar");
					System.out.println("6.- Salir");
					leer = new Scanner(System.in);
					menuEmpleado = leer.nextInt();
				
					switch(menuEmpleado) {
					case 1:
						System.out.println("Agregar numero de empleado");
						leer = new Scanner(System.in);
						numEmpleado = leer.nextInt();
						System.out.println("Agregar nombre de empleado");
						leer = new Scanner(System.in);
						nombreEmp = leer.nextLine();
						System.out.println("Agregar apellido paterno de empleado");
						leer = new Scanner(System.in);
						apellidoEmp = leer.nextLine();
						System.out.println("Agregar correo de empleados");
						leer = new Scanner(System.in);
						correo = leer.nextLine();
						System.out.println("Agregar numero de celular de empleado");
						leer = new Scanner(System.in);
						numCel = leer.nextLong();
						empleado = new Empleado(numEmpleado,nombreEmp,apellidoEmp,correo,numCel);
						geImp.crearObjeto(empleado);
						System.out.println("Agregando empleado...");
						break;
					case 2:
						geImp.mostrar();
						break;
					case 3:
						geImp.mostrarXIndice();
						System.out.println("Ingrese el indice a Editar");
						leer = new Scanner(System.in);
						indice = leer.nextInt();
						empleado = (Empleado) geImp.buscar(indice);
						do {
							System.out.println("Ingrese la opcion a editar");
							System.out.println("1.- Editar nombre empleado");
							System.out.println("2.- Editar apellido de empleado");
							System.out.println("3.- Salir");
							leer = new Scanner(System.in);
							menuSubEmpleado = leer.nextInt();
							switch(menuSubEmpleado) {
							case 1:
								System.out.println("Agregar nuevo nombre de empleado");
								leer = new Scanner(System.in);
								nombreEmp = leer.nextLine();
								empleado.setNombre(nombreEmp);
								break;
							case 2:
								System.out.println("Agregar nuevo apellido paterno de empleado");
								leer = new Scanner(System.in);
								apellidoEmp = leer.nextLine();
								empleado.setApp(apellidoEmp);
								break;
							case 3:
								System.out.println("Saliendo...");
								break;
							}
						}while(menuSubEmpleado<3);
						break;
					case 4:
						geImp.mostrarXIndice();
						System.out.println("Ingrese el indice a buscar");
						leer = new Scanner(System.in);
						indice = leer.nextInt();
						System.out.println(geImp.buscar(indice));
						break;
					case 5:
						geImp.mostrarXIndice();
						System.out.println("Ingrese el indice a eliminar");
						leer = new Scanner(System.in);
						indice = leer.nextInt();
						empleado = (Empleado) geImp.buscar(indice);
						geImp.eliminar(empleado);
						break;
					case 6:
						System.out.println("Saliendo...");
						break;
					}
				}while(menuEmpleado<6);
				break;
			case 4:
				System.out.println("Saliendo...");
				break;
			}
		}while(menuPrincipal<4);
	}

}
