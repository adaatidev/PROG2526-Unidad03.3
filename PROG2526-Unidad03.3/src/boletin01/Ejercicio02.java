package boletin01;

import java.util.ArrayList;
import java.util.Random;

public class Ejercicio02 {

	public static void main(String[] args) {
		Random rnd = new Random();

		// CREACIÓN DE LISTA
		ArrayList<Integer> valoresAleatorios = new ArrayList<>();

		int tamano = rnd.nextInt(5, 11);
		int numero;
		int suma = 0;
		double media = 0;

		// VARIABLES AUXILIARES PARA CALCULAR EL MÍNIMO Y MÁXIMO
		int maximo = Integer.MIN_VALUE;
		int minimo = Integer.MAX_VALUE;

		// ASIGNACIÓN DE VALORES ALEATORIOS EN LA LISTA
		for (int i = 0; i < tamano; i++) {
			numero = rnd.nextInt(0, 101);
			valoresAleatorios.add(numero);
			// SUMA TOTAL
			suma += numero;

			// COMPROBACIÓN DE MÍNIMO Y MÁXIMO
			if (numero > maximo) {
				maximo = numero;
			}
			if (numero < minimo) {
				minimo = numero;
			}
		}

		media = (double) suma / tamano;

		// IMPRIME RESULTADOS
		System.out.println(valoresAleatorios);
		System.out.println("Suma total: " + suma);
		System.out.println("Media: " + media);
		System.out.println("Máximo: " + maximo);
		System.out.println("Mínimo: " + minimo);
	}

}
