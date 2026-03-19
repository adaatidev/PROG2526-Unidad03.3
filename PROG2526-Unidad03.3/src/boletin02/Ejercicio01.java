package boletin02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Ejercicio01 {

	public static void main(String[] args) {

		List<Integer> lista = new ArrayList<>();

		for (int i = 1; i <= 10; i++) {
			lista.add(i);
		}

		System.out.println("Lista original: " + lista);

		Collections.shuffle(lista);

		System.out.println("Lista mezclada: " + lista);

	}

}
