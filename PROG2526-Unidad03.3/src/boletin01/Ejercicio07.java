package boletin01;

import java.util.Scanner;
import java.util.TreeMap;

public class Ejercicio07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// CREACIÓN DE CONJUNTO
		TreeMap<String, String> miniDiccionario = new TreeMap<>();

		// VARIABLES AUXILIARES
		int opcion = 0;
		String esp;
		String ing;
		String buscar;

		// ASIGNACIÓN DE CLAVE VALOR
		miniDiccionario.put("perro", "dog");
		miniDiccionario.put("gato", "cat");
		miniDiccionario.put("casa", "house");
		miniDiccionario.put("rojo", "red");
		miniDiccionario.put("azul", "blue");
		miniDiccionario.put("libro", "book");
		miniDiccionario.put("manzana", "apple");
		miniDiccionario.put("agua", "water");
		miniDiccionario.put("sol", "sun");
		miniDiccionario.put("luna", "moon");
		miniDiccionario.put("mesa", "table");
		miniDiccionario.put("silla", "chair");
		miniDiccionario.put("ventana", "window");
		miniDiccionario.put("arbol", "tree");
		miniDiccionario.put("coche", "car");
		miniDiccionario.put("ciudad", "city");
		miniDiccionario.put("tiempo", "time");
		miniDiccionario.put("amigo", "friend");
		miniDiccionario.put("comida", "food");
		miniDiccionario.put("escuela", "school");

		// SE EJECUTA HASTA QUE EL USUARIO ELIJA LA 3 OPCIÓN
		do {
			System.out.println("\n--- DICCIONARIO ESPAÑOL-INGLÉS ---");
			System.out.println("1. Inserta palabra");
			System.out.println("2. Busca palabra");
			System.out.println("3. Salir");
			System.out.print("Elija una opción: ");

			try {
				opcion = Integer.parseInt(sc.nextLine());
			} catch (NumberFormatException e) {
				System.out.println("Por favor, introduzca un número válido.");
				continue;
			}

			switch (opcion) {
			// INSERTA PALABRA NUEVA EN EL MINI-DICCIONARIO
			case 1:
				System.out.print("Palabra en español: ");
				esp = sc.nextLine().toLowerCase();
				System.out.print("Traducción al inglés: ");
				ing = sc.nextLine().toLowerCase();
				miniDiccionario.put(esp, ing);
				System.out.println("¡Palabra añadida con éxito!");
				// BUSCA PALABRA Y DEVUELVE LA TRADUCCIÓN
			case 2:
				System.out.print("¿Qué palabra buscas? ");
				buscar = sc.nextLine().toLowerCase();
				if (miniDiccionario.containsKey(buscar)) {
					System.out.println("Traducción: " + miniDiccionario.get(buscar));
				} else {
					System.out.println("Lo siento, esa palabra no está en el diccionario.");
				}
				break;
			// SALE DEL PROGRAMA
			case 3:
				System.out.println("Saliendo del programa...");
				break;
			default:
				System.out.println("Opción no válida.");
			}

		} while (opcion != 3);

		sc.close();
	}

}
