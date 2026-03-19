package boletin02;

import java.util.Random;
import java.util.TreeSet;

public class Ejercicio02 {

	public static void main(String[] args) {
		Random rnd = new Random();

		TreeSet<Integer> numeros = new TreeSet<>();

		for (int i = 0; i <= 10; i++) {
			numeros.add(rnd.nextInt(1, 21));
		}

		System.out.println("Números generados: " + numeros);

	}

}
