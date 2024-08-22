package ejercicios;
import java.util.Scanner;
public class ejercicio4 {
	public static void main(String[] args) {
		double num1; 										//definimos las variables que vamos a usar	
		double num2; 
		double num3; 
		Scanner scanner=new Scanner(System.in); 			// Crear un objeto Scanner para leer la entrada del usuario.
		System.out.println("ingresar el primer valor "); 	//Solicitar ingresar el primer valor el cual sera almacenado en num1
		num1=scanner.nextDouble(); 
		System.out.println("ingresar el segundo valor "); 	//Solicitar ingresar el segundo valor el cual sera almacenado en num2
		num2=scanner.nextDouble(); 
		System.out.println("ingresar el primer valor "); 	//Solicitar ingresar el tercer valor el cual sera almacenado en num3
		num3=scanner.nextDouble(); 
		double menor= menorNumero(num1,num2,num3); 			// Llama al método 'menorNumero' para encontrar el menor de los tres numeros.
		System.out.println("el menor numero de los 3 es: " + menor);  //imprime  el menor numero de los 3 

	}
	public static double menorNumero(double num1, double num2, double num3) { 	//metodo que compara los 3 numeros y te dice el menor 	
		double menor=num1; 							// Inicializa "menor" con el valor del primer numero
		if(num2<menor) { 							//compara el segundo numero con el menor y busca actualizar el menor  si se da el caso
			menor= num2; 	
		}
		
		if(num3<menor) { 							//compara el tercer numero con el menor y busca actualizar el menor si se da el caso 	
			menor=num3; 
		}
		if (num1 == num2 && num2 == num3) {				// si los tres numeros iguales te muestra el mensaje 
            System.out.println("los tres numeros son iguales."); 
		} 
		return menor; 							//retorna el menor 
	}			
	
}
