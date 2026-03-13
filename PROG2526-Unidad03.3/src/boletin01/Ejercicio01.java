package boletin01;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio01 {

	public static void main(String[] args) {

		/*
		 * -----------------------------------------------------------------------------
		 * Crear una lista de números enteros positivos introducidos por consola hasta
		 * que se introduzca uno negativo. A continuación, recorrer la lista y mostrar
		 * por pantalla los índices de los elementos de valor par.
		 * -----------------------------------------------------------------------------
		 */

		Scanner sc = new Scanner(System.in);

		// Creación de lista para almacenar los números enteros positivos introducidos
		// por el usuario
		ArrayList<Integer> enterosPositivos = new ArrayList<>();

		// Creación de lista para almacenar las posiciones de los números pares de la
		// lista de enteros positivos
		ArrayList<Integer> indicesPares = new ArrayList<>();

		// Variable auxiliar para almacenar el número
		int numero;

		// Bucle do-while que le pide al usuario un número mientras que sea un entero
		// positivo. En el bucle se van almacenando los números que introduce el usuario
		// y con un if se comprueba si es par y se almacena su posición en la lista de
		// las posiciones de los números pares
		do {
			System.out.println("Introduzca un número: ");
			numero = sc.nextInt();
			enterosPositivos.add(numero);
			if (numero % 2 == 0) {
				indicesPares.add(enterosPositivos.indexOf(numero));
			}
		} while (numero >= 0);

		System.out.println(indicesPares);

		sc.close();

	}

}