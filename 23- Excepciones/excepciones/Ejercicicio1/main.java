package Ejercicicio1;

public class main {

	public static void main(String[] args) {

			
		int[] arrayEnteros = new int[5];
		int num=20;
		int divisor=0;
		double cociente;
		
		//rellenar
		for (int i = 0; i < arrayEnteros.length; i++) {//
			if (i!=0) {
				arrayEnteros[i]=1;
				divisor=arrayEnteros[i];
				
			}else {
			arrayEnteros[0]=0;
			divisor=arrayEnteros[0];
			}
			
		
					
			
		}
		//div
	try {
		

		for (int i = 0; i < arrayEnteros.length; i++) {
			cociente = num/arrayEnteros[i];	 //Exc1
		}
		
		//fuera de rango
		System.out.println("Intentamos entrar en una posicion fuera del array");
					System.out.println(arrayEnteros[5]); //Exc2
					
	} catch (Exception e) {
		System.out.println("Excepcion generica");
	}
				
////////////////////////////////////////////////////////////////////////////////////////////////////////////
	/*} catch (ArithmeticException e) {
		System.out.println("no se puede dividir por cero");
		
		
	} catch (ArrayIndexOutOfBoundsException e1) {
		System.out.println("fuera de rango");
	}*/
////////////////////////////////////////////////////////////////////////////////////////////////////////////
		//visualizar
	
		for (int i = 0; i < arrayEnteros.length; i++) {
			System.out.println("Posicion"+i+" contiene "+arrayEnteros[i]);
		}
		
		
		


	}


	}
	
