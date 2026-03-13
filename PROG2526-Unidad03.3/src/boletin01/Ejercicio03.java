package boletin01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Ejercicio03 {

	public static void main(String[] args) {
		Random rnd = new Random();

		// CREACIÓN DE LA LISTA
		ArrayList<Integer> numeros = new ArrayList<>();

		// ASIGNACIÓN DE VALORES ALEATORIOS
		for (int i = 0; i < 30; i++) {
			numeros.add(rnd.nextInt(1, 11));
		}

		// ORDENAR LISTA
		Collections.sort(numeros);

		// IMPRIME LA LISTA
		System.out.println("Colección de 30 números ordenada:");
		System.out.println(numeros);
	}

}
