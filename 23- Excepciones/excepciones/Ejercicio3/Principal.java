package Ejercicio3;

import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		try {
	System.out.println("Ejemplo 1 solucion");
		Ecucacion2Grado ecu1 = new Ecucacion2Grado(0, 8, 4);
		ecu1.solucion();
		System.out.println("Ejemplo Degenerada");
		Ecucacion2Grado ecu2 = new Ecucacion2Grado(0, 0, 4);
		ecu2.solucion();
		System.out.println("Ejemplo Normal");
		Ecucacion2Grado ecu3 = new Ecucacion2Grado(2, 8, 4);
		ecu3.solucion();
		System.out.println("ejemplo raices complejas");
		Ecucacion2Grado ecu4 = new Ecucacion2Grado(1, 8, 4);
		ecu4.solucion();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
	}
}
