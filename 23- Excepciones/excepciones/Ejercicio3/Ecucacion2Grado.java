package Ejercicio3;

import java.util.Scanner;

import javax.sql.rowset.spi.TransactionalWriter;



public class Ecucacion2Grado {
	
	
	//atributos
		private int a,b,c;
	//Constructor
		public Ecucacion2Grado(int a, int b, int c) {
			this.a = a;
			this.b = b;
			this.c = c;
		}
		//getters
		public int getA() {
			return a;
		}

		public int getB() {
			return b;
		}


		public int getC() {
			return c;
		}
		
		public void solucion() throws Exception {
			double discriminante =(Math.pow(this.a, this.b)-(4*this.a*this.c)),x=0;
			System.out.println("El discriminante "+discriminante);
			//ayb=iguales=0
		//	try {
				if (a==0 && b==0) {
					Exception e1 = new Exception("ecuacion degenerada");
					throw e1;
				}
				
				if (discriminante<0) {
			
					Exception e1 = new Exception("Las raices son complejas");
					throw e1;
				}
				
				if (a==0) {
					System.out.println("solo tiene una solucion  ");
					//x=c/B
					x= this.c/(this.b);
					System.out.println(x);
				}
				
				else {
					
					x= (Math.pow(b, 2)-(discriminante))/2;
					System.out.println("resultado"+x);
				}
				
			

/*			} catch (Exception e1) {
				System.out.println(e1);
			}*/
	
			
			
		}

		//ecuación se representará de la forma ax2+bx+c=0
	

}

