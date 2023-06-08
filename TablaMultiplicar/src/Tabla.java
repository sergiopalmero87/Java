import java.util.Scanner;

public class Tabla {

	public static void main(String[] args) {
		/*
		 * Generador de tabla de multiplicar:
		 * Escribe un programa que solicite al usuario un número entero y genere la tabla de multiplicar correspondiente a ese número del 1 al 10.
		 */

		
		// Scanner y variable numero del usuario.
		Scanner leer = new Scanner(System.in);
		int numero;
		
		System.out.println("*********************\nBienvenido al programa de la tabla de multiplicar\n*********************");
		System.out.println("Escribe un numero entero: ");
		
		numero = leer.nextInt();
		
		System.out.println("La tabla de multiplicar del " + numero + " es: \n");
		
		// Creamos objeto de la clase para llamar al método.
		Tabla tablaMultiplicar = new Tabla();
		
		// Creamos varibale result que será igual al resultado del método.
		String result = tablaMultiplicar.tabla(numero);
		
		// imprimimos el resultado.
		System.out.println(result);
		
		
	}

	
	// Método private que realiza la operación que queremos. Recibe un número entero, lo va recorriendo desde 0 hasta llegar a ese número.
	// En cada recorrido se va sumando uno hasta llegar al numero dado por el usuario hasta llegar a 10.
	// La varibale resultado es igual a i multiplicado por el numero del usuario.
	private String tabla(int numero) {
		for(int i = 0; i <= 10; i++) {
			int resultado;
			resultado = i * numero;
			System.out.println(i + "*" + numero + " = " + resultado + "\n");
			
		} 
		
		return "\nFin del programa.";
		
		
	}
	
}
