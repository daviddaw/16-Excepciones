package ejercicio4;/*4)	Clases de excepciones creadas por el programador: Algoritmo que verifique si el NIF es correcto:

La letra del NIF se obtiene a partir de un algoritmo conocido como módulo 23: resto de la división entera del número del DNI entre 23. En base a la siguiente tabla, se asigna la letra: 
0	1	2	3	4	5	6	7	8	9	10	11	12	13	14	15	16	17	18	19	20	21	22
T	R	W	A	G	M	Y	F	P	D	X	B	N	J	Z	S	Q	V	H	L	C	K	E

No se utilizan las letras: I, Ñ, O, U (para evitar confusiones con 1, 0, etc)

Realizar un programa que pida por teclado un String que será un NIF de tamaño 9 (con 8 números y una letra, conviene pasar la letra a mayúsculas)  y compruebe si es correcto. Para ello se deben extraer los 8 primeros caracteres del NIF, que deben ser numéricos, generar un entero con dichos caracteres (dniCifras) y obtener la letra por el algoritmo siguiente:
String letras = "TRWAGMYFPDXBNJZSQVHLCKE";
	dniLetra = letras.charAt(dniCifras % 23);


Se debe validar cualquier tipo de error:

	Que la longitud del dni sea incorrecta. El programador debe crear una clase excepción hija de Exception llamada LongitudIncorrectaException 
que incluya el mensaje “El nif debe tener 9 caracteres” y lanzarla.  
	Datos no numéricos en los 8 primeros caracteres, que lanzará una excepción de tipo NumberFormatException con el mensaje “Los 8 primeros caracteres no son numéricos”. (Esta excepción no la crea el programador, porque ya existe en Java).
	Que la letra introducida no esté en la lista de letras válidas. El programador debe crear una clase excepción hija de Exception llamada LetraNoValidaException, con el mensaje “El último carácter no está en la categoría de letras válidas para el NIF” y lanzarla (para ello se comprueba que el último carácter no está en el String letras).
	Que la letra calculada no coincide con la introducida en el NIF. El programador  debe crear una clase excepción hija de Exception llamada DniIncorrectoException que incluya el mensaje “Letra del dni incorrecta” y lanzarla.  
*/
import java.util.Scanner;


public class AlgoritmoDNI {

	public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	System.out.println("Escribe el dni");
	String dni;
	char[] dniC,letrasC;
	String letras = "TRWAGMYFPDXBNJZSQVHLCKE";
	String CaracteresNoDeseados = "IÑOU";
	//dni="04848583";
	 try {
	do {
		
		 dni = in.nextLine();

		 if (dni.length()!=9 && dni.length()!=8) {
			//System.out.println("dni incorrecto,escribe de nuevo el dni ");
				throw new LongitudIncorrectaException("El nif debe tener 9 caracteres");
				
		}
	} while (dni.length()!=9 && dni.length()!=8);//
	

	dni=dni.toUpperCase();
	dniC=new char[dni.length()];
	
	for (int i = 0; i < dni.length(); i++) {
		dniC[i] = dni.charAt(i);
		
	}
	letrasC=new char[letras.length()];
	for (int i = 0; i < letras.length(); i++) {
		letrasC[i] = letras.charAt(i);
		
	}
	
	System.out.println("Ha introducido "+dni+" ...");
	String auxDni = new String(dniC, 0, 8);
	String auxDni2 = new String(dniC, 8,1);
	

	int dniE=Integer.parseInt(auxDni);
	  int restoLetra = (dniE%23);
	System.out.println("Su letra de DNI deberia ser: "+ letras.charAt(restoLetra));


	String letraDni= new String(letrasC, restoLetra,1);
	
	if (auxDni2.equalsIgnoreCase(letraDni)) {
		System.out.println("la letra es correcta para ese dni");
	} else if(CaracteresNoDeseados.indexOf(auxDni2) >= 0){//
		throw new LetraNoValidaException("El último carácter no está en la categoría de letras válidas para el NIF");	
	}else {
		throw new DniIncorrectoException("Letra del dni incorrecta");
	}
	
		} catch (LongitudIncorrectaException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		} catch (DniIncorrectoException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		} catch (LetraNoValidaException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
	in.close();
	
	}

}
