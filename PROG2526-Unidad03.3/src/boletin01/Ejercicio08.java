package boletin01;

import java.util.HashMap;
import java.util.Scanner;

public class Ejercicio08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// CREACIÓN DE MAPA
		HashMap<String, String> usuarios = new HashMap<>();

		// VARIABLES AUXILIARES
		int opcion = 0;
		int intentos = 0;
		boolean accesoConcedido = false;
		String nuevoUsuario;
		String password;
		String user;
		String pass;

		// SE SIGUE EJECUTANDO HASTA QUE EL USUARIO DECIDA SALIR DEL PROGRAMA
		do {
			System.out.println("\n--- CONTROL DE ACCESO ---");
			System.out.println("1. Registro");
			System.out.println("2. Login");
			System.out.println("3. Salir");
			System.out.print("Seleccione una opción: ");
			try {
				opcion = Integer.parseInt(sc.nextLine());
			} catch (NumberFormatException e) {
				System.out.println("Por favor, introduzca un número.");
				continue;
			}

			switch (opcion) {
			// REGISTRAR USUARIO + CONTRASEÑA
			case 1:
				System.out.print("Nuevo usuario: ");
				nuevoUsuario = sc.nextLine();
				if (usuarios.containsKey(nuevoUsuario)) {
					System.out.println("Error: El usuario ya existe.");
				} else {
					System.out.print("Contraseña: ");
					password = sc.nextLine();
					usuarios.put(nuevoUsuario, password);
					System.out.println("Usuario registrado con éxito.");
				}
				break;
			// INICIAR SESIÓN + 3 INTENTOS
			case 2:
				while (intentos < 3 && !accesoConcedido) {
					System.out.print("Usuario: ");
					user = sc.nextLine();
					System.out.print("Contraseña: ");
					pass = sc.nextLine();

					if (usuarios.containsKey(user) && usuarios.get(user).equals(pass)) {
						accesoConcedido = true;
					} else {
						intentos++;
						if (intentos < 3) {
							System.out.println("Datos incorrectos. Le quedan " + (3 - intentos) + " intentos.");
						}
					}
				}
				if (accesoConcedido) {
					System.out.println("--- HA ACCEDIDO AL ÁREA RESTRINGIDA ---");
				} else {
					System.out.println("Lo siento, no tiene acceso al área restringida.");
				}
				break;
			// SALIR DEL PROGRAMA
			case 3:
				System.out.println("Cerrando sistema...");
				break;
			default:
				System.out.println("Opción no válida.");
			}

		} while (opcion != 3);

		sc.close();
	}

}
