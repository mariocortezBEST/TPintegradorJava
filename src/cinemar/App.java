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
	}
}