package cinemar;

import java.util.Scanner;

public class Login {
	private static Scanner entrada = new Scanner(System.in);
	
	public static byte menu() {	
		while (true){
			System.out.println("1. Ingresar\r\n"
					+ "2. Registrar\r\n"
					+ "3. Salir");
			byte opcion = entrada.nextByte();
			switch(opcion) {
			case 1:
				return 1;
			case 2:
				return 2;				
			case 3:
				return 3;
			default:
				System.out.println("Ingrese una opcion valida");
				continue;
			}
			
		}
		
	}

	public static void main(String[] args) {
		String user,pass,nombre;
		byte opt = menu();
		System.out.println("Ingrese el nombre");
		nombre = entrada.next();
		System.out.println("Ingrese el usuario");
		user = entrada.next().toLowerCase();
		System.out.println("Ingrese la clave");
		pass = entrada.next().toLowerCase();
	}

}
