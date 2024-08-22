package ejercicios;
import java.util.Scanner; 

public class ejercicio6 {
	public static void main(String [] args) {
		System.out.println("****Convertidor***");
		System.out.println("primero ingresa la hora ");
		System.out.println("ingresar la hora"); 			// Solicitar al usuario que ingrese la hora
		Scanner scanner=new Scanner(System.in); 
		int  h=scanner.nextInt(); 
		System.out.println("ingresar los minutos "); 		// Solicitar al usuario que ingrese los minutos 
		int m=scanner.nextInt(); 
		System.out.println("ingresar los segundo ");		// Solicitar al usuario que ingrese los segundos 
		int s=scanner.nextInt(); 
		System.out.println("su tiempo  ingresado es " + h +" horas " +  m + " minutos " + s + " segundos" ); 	// Mostrar el tiempo ingresado en formato de horas, minutos y segundos
		System.out.println("****ahora a convertirlo***");
		int horaConvertida=(h*3600)+(m*60)+s; 				// Convertir el tiempo ingresado a segundos 
		System.out.println("la hora convertidad a segundos es " + horaConvertida);	//mostrar el tiempo 
		}
	}	

