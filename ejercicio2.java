package ejercicios;
import java.util.Scanner; 

public class ejercicio2 {
	public static void main(String[] args) { 
		int num;
		int [] a= new int [10];
		
		Scanner scanner=new Scanner(System.in);  
				
		for (int i=0;i<10;i++) { 
			System.out.println("ingrese un numero: ");    // solicitar al usuario ingresar 10 numeros 
			num= scanner.nextInt();  
			if(i!=0) { 									  // // Verificar que el número ingresado sea mayor que el anterior			
				while(num<=a[i-1]) { 
					System.out.println("volver a ingresar un numero mayor al anterior"); 
					num=scanner.nextInt();
				} 				
			}
			a[i]=num;  									//  Almacenar el número en el arreglo		
			}
		System.out.print("[");							// Imprimir el arreglo en formato de lista
        for (int i = 0; i < 10; i++) { 
            System.out.print(a[i]);
            if (i < 9) {								//Imprimir una coma y un espacio después de cada número, excepto el último
                System.out.print(", ");
            }
        }
        System.out.println("]");
	} 
}
		
	
	