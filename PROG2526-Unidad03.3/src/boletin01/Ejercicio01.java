package boletin01;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// CREACIÓN DE DOS LISTAS PARA ALMACENAR LOS NÚMEROS
		ArrayList<Integer> enterosPositivos = new ArrayList<>();
		ArrayList<Integer> indicesPares = new ArrayList<>();

		// VARIABLE AUXILIAR
		int numero;

		System.out.println("Introduzca números (negativo para terminar):");

		// MIENTRAS QUE EL NÚMERO INTRODUCIDO SEA MAYOR QUE 0 SE SEGUIRÁ ALMACENANDO
		while (true) {
			numero = sc.nextInt();
			if (numero < 0) {
				break;
			}
			enterosPositivos.add(numero);
			if (numero % 2 == 0) {
				indicesPares.add(enterosPositivos.size());
			}
		}

		// IMPRIME LAS LISTAS
		System.out.println("Lista completa: " + enterosPositivos);
		System.out.println("Índices de los números pares: " + indicesPares);

		sc.close();
	}

}
