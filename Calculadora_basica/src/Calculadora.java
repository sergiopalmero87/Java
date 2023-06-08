import java.util.Scanner;

public class Calculadora {
	
	// Calculadora básica.

	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		
		// Pedimos los números por consola al usuario y los leemos con Scanner.
		
		System.out.println("Escribe el primer numero: ");
		int num1 = leer.nextInt();
		
		System.out.println("Escribe el segundo numero: ");
		int num2 = leer.nextInt();
		
		// Pedimos las opciones y las leemos con Scanner.
		
		System.out.println("Ahora que operación quieres hacer: ");
		System.out.println("1. Sumar: ");
		System.out.println("2. Restar: ");
		System.out.println("3. Dividir: ");
		System.out.println("4. Multiplicar: ");
		System.out.println("0. Salir del programa");
		
		Scanner operar = new Scanner(System.in);
		int operacion = operar.nextInt();
		
		
		// Si la opción que ingresa el usuario es disitinta de 0, entonces entramos en el Switch y operamos.
		
		if(operacion != 0) {
			
			switch(operacion) { // Switch para elegir lo que pida el usuario y llamamos a los métodos creados abajo.
			
			case 1: System.out.println("Sumando... El resultado de la suma es: " + sumar(num1, num2));
			break;
					
			case 2: System.out.println("Restando... El resultado de la resta es: " + restar(num1, num2));
			break;
					
			case 3: System.out.println("Dividiendo... El resultado de la división es: " + dividir(num1, num2));
			break;
					
			case 4: System.out.println("Multiplicando... El resultado de la multiplicación es: " + multiplicar(num1, num2));
			break;
			
			}
			
			} else { // Como la opción que ha elegido el usuario es 0 salimos del programa.
				
				System.out.println("Saliendo del programa... Hasta la vista :)");
			}
		
		}
	
	
			
		
	// Métodos para realizar las distintas operaciones.
	
	public static int sumar (int num1, int num2) {
		int resultado = num1 + num2;
		return resultado;
	}
	
	public static int restar (int num1, int num2) {
		int resultado = num1 - num2;
		return resultado;
	}
	
	public static int dividir (int num1, int num2) {
		int resultado = num1 / num2;
		return resultado;
		
	}
	
	public static int multiplicar (int num1, int num2) {
		int resultado = num1 * num2;
		return resultado;
	}

	}


