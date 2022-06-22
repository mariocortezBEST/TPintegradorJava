package cinemar;

import java.util.ArrayList;


public class App {	
	
	public static void main(String[] args) {	
		Sala sala1 = new Sala(5,7);
		sala1.generarsala();
		sala1.mostrar();
		System.out.println();	
		sala1.ocupar(4, 2);
		sala1.ocupar(1, 2);
		sala1.ocupar(2, 2);
		System.out.println("----------------------------------------------------------------------------------------");
		sala1.mostrar();
		System.out.println("----------------------------------------------------------------------------------------");
		BD bd = new BD();
		ArrayList<String> peliculas = bd.consultar("select * from pelicula where estado=1");
		for (int i = 0; i < peliculas.size(); i+=3) {
			System.out.println("Nombre: "+peliculas.get(i));
			System.out.println("Genero: "+peliculas.get(i+1));
			System.out.println("Sinopsis: "+peliculas.get(i+2));
			System.out.println("----------------------------------------------------------------------------------------");
		}
	}
}