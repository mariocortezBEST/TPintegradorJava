package cinemar;

import java.util.Scanner;

public class Administrador {
	public void cargarpelicula() {
		BD bd = new BD();
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
		bd.ejecutar(sql);
	}
}
