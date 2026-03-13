package boletin01;

import java.util.Random;
import java.util.TreeSet;

public class Ejercicio04 {

	public static void main(String[] args) {
		Random rnd = new Random();

		// CREACIÓN DE CONJUNTO
		TreeSet<Integer> numeros = new TreeSet<>();

		// VARIABLE AUXILIAR
		int num;

		// DECLARACIÓN DE VALORES
		while (numeros.size() < 20) {
			num = rnd.nextInt(100);
			numeros.add(num);
		}

		// IMPRIME CONJUNTO
		System.out.println("Colección de 20 números distintos (ordenados automáticamente):");
		System.out.println(numeros);

	}

}