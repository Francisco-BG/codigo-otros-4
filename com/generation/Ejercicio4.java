package com.generation;

import java.util.Scanner;//faltaba import del scanner

public class Ejercicio4 {
	public static void main(String[] args) { // faltaba método main

		Scanner s = new Scanner(System.in); // faltaba especificar flujo de entrada

		System.out.print("Turno del jugador 1 (introduzca piedra, papel o tijeras): ");
		String j1 = s.nextLine();

		System.out.print("Turno del jugador 2 (introduzca piedra, papel o tijeras): ");// Corrección: jugador 2
		// Scanner s2 = new Scanner(); instanciación de otro scanner innecesaria.
		String j2 = s.nextLine();
		s.close(); // Faltaba cierre de Scanner

		if (j2.equals(j1)) {
			System.out.println("Empate");
		} else {
			// Se cambió el nombre de la variable g por ganador por cuestiones de claridad.
			int ganador = 2;

			switch (j1) {

			case "piedra":

				if (j2.equals("tijeras")) { // no se comparaba el valor
					ganador = 1;
				}
				break; // faltaba un break

			case "papel":

				if (j2.equals("piedra")) { // no se comparaba el valor
					ganador = 1;
				} // faltaba llave de cierre
				break;

			case "tijeras": // faltaba una "s" para concidir con lo pedido al usuario
				if (j2.equals("papel")) {
					ganador = 1;
				}
				break;
			default:
			}
			System.out.println("Gana el jugador " + ganador);
		}

	}
}