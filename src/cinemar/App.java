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
		reserva.disponibles();
		Scanner entrada = new Scanner(System.in);
		String sql = "INSERT INTO `cinema`.`pelicula` (`nombre`, `sinopsis`, `genero`, `estado`) VALUES ('";
		System.out.println("Ingrese el nombre de la pelicula");
		sql += entrada.nextLine();
		while (sql == "") {
			System.out.println("Ingrese un nombre valido");
			sql += entrada.next();
		}
		sql += "','";
		System.out.println("Ingrese la sinopsis");
		sql += entrada.nextLine();
		sql += "','";
		System.out.println("Ingrese el genero"); 
		sql +=entrada.nextLine();
		sql += "','";
		System.out.println("Ingrese el estado (0 o 1)"); 
		sql +=entrada.nextLine();		 
		sql += "')";
		entrada.close();
		System.out.println(sql);
		//bd.ejecutar(sql);
	}
}