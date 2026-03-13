package boletin01;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// CREACIÓN DEL MAPA
		HashMap<String, Double> inventario = new HashMap<>();

		// VARIABLES AUXILIARES
		int opcion = -1;
		String nombreAlta;
		double precio;

		// SE EJECUTA MIENTRAS QUE LA OPCIÓN NO SEA 0
		while (opcion != 0) {
			System.out.println("\n--- GESTIÓN DE PRODUCTOS ---");
			System.out.println("1. Alta de producto");
			System.out.println("2. Baja de producto");
			System.out.println("3. Listar existencias");
			System.out.println("0. Salir");
			System.out.print("Seleccione una opción: ");

			try {
				opcion = Integer.parseInt(sc.nextLine());
			} catch (NumberFormatException e) {
				System.out.println("Error: Introduce un número válido.");
				continue;
			}

			switch (opcion) {
			// REGISTRA UN NUEVO PRODUCTO
			case 1:
				System.out.print("Nombre del producto: ");
				nombreAlta = sc.nextLine().trim();
				System.out.print("Precio: ");
				precio = Double.parseDouble(sc.nextLine());
				inventario.put(nombreAlta, precio); // PUT AÑADE SI NO EXISTE Y SOBREESCRIBE SI YA EXISTE
				System.out.println("Producto registrado.");
				break;
			// ELIMINA UN PRODUCTO
			case 2:
				System.out.print("Nombre del producto a eliminar: ");
				String nombreBaja = sc.nextLine().trim();
				if (inventario.remove(nombreBaja) != null) { // REMOVE DEVUELVE EL VALOR ELIMINADO O NULL SI NO EXISTÍA
					System.out.println("Producto eliminado correctamente.");
				} else {
					System.out.println("El producto no existe.");
				}
				break;
			// IMPRIME TODOS LOS PRODUCTOS CON UN FOR:EACH
			case 3:
				if (inventario.isEmpty()) {
					System.out.println("No hay productos en el inventario.");
				} else {
					System.out.println("\nLISTADO DE EXISTENCIAS:");
					for (Map.Entry<String, Double> producto : inventario.entrySet()) { // ENTRYSET RECORRE EL MAP
						System.out.println("- " + producto.getKey() + ": " + producto.getValue() + "€");
					}
				}
				break;
			case 0:
				System.out.println("Saliendo del programa...");
				break;
			default:
				System.out.println("Opción no válida.");
			}

		}

		sc.close();
	}

}
