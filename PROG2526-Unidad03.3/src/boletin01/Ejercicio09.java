package boletin01;

import java.util.Scanner;
import java.util.TreeMap;

public class Ejercicio09 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// CREACIÓN DE MAPAS
		TreeMap<Integer, Integer> frecuenciasNumeros = new TreeMap<>();
		TreeMap<Integer, Integer> frecuenciasEstrellas = new TreeMap<>();

		// VARIABLES AUXILIARES
		String continuar;
		int num;
		int estrella;

		// SE SIGUE EJECUTANDO MIENTRAS QUE EL USUARIO DECIDA CONTINUAR
		do {
			System.out.println("\n--- REGISTRO DE NUEVO SORTEO ---");
			System.out.println("Introduce los 5 números principales:");

			// ALMACENA LA FRECUENCIA NUMÉRICA EN SU MAPA
			for (int i = 1; i <= 5; i++) {
				System.out.print("Número " + i + ": ");
				num = Integer.parseInt(sc.nextLine());
				registrarFrecuencia(frecuenciasNumeros, num);
			}

			System.out.println("Introduce las 2 estrellas:");

			// ALMACENA LAS ESTRELLAS EN SU MAPA
			for (int i = 1; i <= 2; i++) {
				System.out.print("Estrella " + i + ": ");
				estrella = Integer.parseInt(sc.nextLine());
				registrarFrecuencia(frecuenciasEstrellas, estrella);
			}

			// IMPRIME LAS ESTADÍSTICAS
			mostrarEstadisticas(frecuenciasNumeros, frecuenciasEstrellas);

			System.out.print("\n¿Deseas introducir otro sorteo? (s/n): ");
			continuar = sc.nextLine();

		} while (continuar.equalsIgnoreCase("s"));

		System.out.println("Programa finalizado.");
		sc.close();
	}

	/**
	 * FUNCIÓN QUE COMPRUEBA Y ALMACENA LA CLAVE INTRODUCIDA POR EL USUARIO
	 * 
	 * @param mapa  MAPA NUMÉRICO
	 * @param clave INTRODUCIDA POR EL USUARIO
	 */
	private static void registrarFrecuencia(TreeMap<Integer, Integer> mapa, int clave) {
		if (mapa.containsKey(clave)) {
			mapa.put(clave, mapa.get(clave) + 1);
		} else {
			mapa.put(clave, 1);
		}
	}

	/**
	 * FUNCIÓN QUE IMPRIME LAS ESTADÍSTICAS POR PANTALLA
	 * 
	 * @param nums FRECUENCIA DE NÚMEROS
	 * @param ests ESTRELLAS
	 */
	private static void mostrarEstadisticas(TreeMap<Integer, Integer> nums, TreeMap<Integer, Integer> ests) {
		System.out.println("\n--- ESTADÍSTICAS ACTUALES (Ordenadas) ---");
		System.out.println("Números (Número=Apariciones): " + nums);
		System.out.println("Estrellas (Número=Apariciones): " + ests);
	}

}
