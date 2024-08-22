package ejercicios;
import java.util.*;
public class ejercicio3 {
		public static void main(String[] args) {	
			int[] arr = { 0, 0, 0, 0, 0, 0 };		 // Declaración e inicialización de un arreglo de enteros con 6 elementos, todos inicializados a 0.
		 for (int j = 0; j <= 12; j++) {			// Bucle for que se ejecuta 13 veces (de 0 a 12 inclusive).
		
		int tiro_dado = (int) (Math.random() * 6) + 1;	// Genera un número aleatorio entre 1 y 6, simulando el lanzamiento de un dado. 
		 
		 System.out.println("Resultado del tiro:" + tiro_dado);	// Imprime el resultado del lanzamiento del dado.
		 											 	
		 arr[tiro_dado - 1] += 1;						// Incrementa el contador en la posición correspondiente del arreglo.
		 												// El número obtenido en el tiro de dado determina la posición del arreglo a incrementar.

		 }
		// Imprime la cantidad de veces que se generó cada nú	ero (de 1 a 6)				
		 System.out.println("1: " + arr[0]); // Cantidad de veces que salió el número 1.
		 System.out.println("2: " + arr[1]); // Cantidad de veces que salió el número 2.
		 System.out.println("3: " + arr[2]); // Cantidad de veces que salió el número 3.
		 System.out.println("4: " + arr[3]); // Cantidad de veces que salió el número 4.
		 System.out.println("5: " + arr[4]); // Cantidad de veces que salió el número 5.
		 System.out.println("6: " + arr[5]); // Cantidad de veces que salió el número 6.
		 }
		} 



