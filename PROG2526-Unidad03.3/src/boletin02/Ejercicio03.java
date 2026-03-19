package boletin02;

import java.util.Map;
import java.util.TreeMap;

public class Ejercicio03 {

	public static void main(String[] args) {

		Map<Character, Integer> frecuencias = new TreeMap<>();

		String texto = "En un agujero en el suelo, vivia un hobbit. No un agujero humedo, sucio, repugnante, con restos de gusanos y olor a fango, ni tampoco un agujero, seco, desnudo y arenoso, sin nada en que sentarse o que comer: era un agujero-hobbit, y eso significa comodidad";

		for (char c : texto.toLowerCase().toCharArray()) {
			if (Character.isLetter(c)) {
				frecuencias.put(c, frecuencias.getOrDefault(c, 0) + 1);
			}
		}

		System.out.println("Frecuencia de aparición de cada letra:");

		for (Map.Entry<Character, Integer> entrada : frecuencias.entrySet()) {
			System.out.println("Letra '" + entrada.getKey() + "': " + entrada.getValue());
		}
	}

}
