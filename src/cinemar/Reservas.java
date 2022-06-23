package cinemar;

import java.util.ArrayList;

public class Reservas {
	public void disponibles() {
		BD bd = new BD();
		ArrayList<String> peliculas = bd.consultar("select * from pelicula where estado=1");
		for (int i = 0; i < peliculas.size(); i += 3) {
			System.out.println("Nombre: " + peliculas.get(i));
			System.out.println("Genero: " + peliculas.get(i + 1));
			System.out.println("Sinopsis: " + peliculas.get(i + 2));
			System.out.println(
					"----------------------------------------------------------------------------------------");
		}
	}
}
