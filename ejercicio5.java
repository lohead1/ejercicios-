package ejercicios;
import  java.util.Scanner; 

public class ejercicio5 {
			public static void main(String[ ] args) { 
				double h; 
				Scanner scanner=new Scanner(System.in); 
				System.out.println("ingresar el numero de horas deseadas al usar ");  		// Solicitar la cantidad de horas al usuario
				h=scanner.nextDouble(); 
				 if (h <= 0) {																// Validar que el número de horas no sea cero
			            System.out.println("El número de horas debe ser mayor que cero.");
			        } else {
			            calcularHora(h);
			        }
			    }
			public static void calcularHora(double h) { 									// funcion para calcular la hora 
				double hr; 
				double cargo=0; 
				
				if(h==1) { 																	//Si el usuario utiliza solo 1 hora, el cargo es fijo de S/3.00
					System.out.println("su cargo de estacionamiento es de 3 soles "); 
				
				}
				else { 
					hr=h-1; 																// Restar la primera hora y calcular el costo adicional por las horas restantes
					cargo=(hr*0.5)+3; 
				}
				if (h>19) { 																	
					System.out.println("Se excedio de horas, solo se pueden 19"); 			// Verificar si se excede el máximo de horas
						
				}
				else { 
					System.out.println("Su cargo del estacionamiento es de S/ " + cargo);
				}
			}
}
	