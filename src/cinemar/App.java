package cinemar;

public class App {
	public static void main(String[] args) {	
		Sala sala1 = new Sala(5,7);
		sala1.generarsala();
		sala1.mostrar();
		System.out.println();	
		sala1.ocupar(4, 2);
		sala1.ocupar(1, 2);
		sala1.ocupar(2, 2);
		sala1.mostrar();
		BD bd = new BD();
		String peliculas = bd.consultar("select * from pelicula where estado=1");
		System.out.println(peliculas);
	}
}