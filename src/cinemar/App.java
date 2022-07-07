package cinemar;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Sala sala1 = new Sala(5, 7);
		sala1.generarsala();
		sala1.mostrar();
		System.out.println();
		sala1.ocupar(4, 2);
		sala1.ocupar(1, 2);
		sala1.ocupar(2, 2);
		System.out.println("----------------------------------------------------------------------------------------");
		sala1.mostrar();
		System.out.println("----------------------------------------------------------------------------------------");
		Reservas reserva = new Reservas();		
		Administrador admin = new Administrador();
		byte opcion;
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("Ingrese la opcion deseada \r\n1- Cargar pelicula\r\n"
					+ "2- Ver peliculas disponibles\r\n" + "3-Salir ");			
			opcion = sc.nextByte();			
			if (opcion==1) {
				admin.cargarpelicula();
			}
			else if (opcion==2) {
				reserva.disponibles();
			}
			else if(opcion==3) {
				break;
			}
			else continue;
		}
	}
}