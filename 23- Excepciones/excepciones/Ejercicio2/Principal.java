	package Ejercicio2;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
	    int n = 0;
	    
		try {
			n=sumaPositivos(in);
		} catch (Exception e) {
			System.out.println(e);
			
		}
		
		if (n!=0) {
			System.out.println("La suma es "+n);
		}else {
			System.out.println(" Hasta luego");
		}
		
	    
		in.close();
	}

	private static int sumaPositivos(Scanner in) throws Exception    {
		int variable;
		int suma = 0;
		do {	
			System.out.println("Escribe un numero para acabar mete un cero, los numeros negativos no se admiten");
				variable=in.nextInt();
				if (variable<0) {
					Exception e = new Exception("Has introducido un numero negativo");
					throw e;
				}
				suma = suma + variable;
					
		} while (variable!=0);
		return suma;	
				
	}
}
