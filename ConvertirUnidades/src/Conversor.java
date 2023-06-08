import java.util.Scanner;

public class Conversor {

	public static void main(String[] args) {
		// Conversor de unidades: Desarrolla un programa que convierta unidades de medida, como metros millas.
		// El usuario debe ingresar el valor, y el programa debe realizar la conversión.
		
		
		Scanner leer = new Scanner(System.in);
		int metros;
		Conversor conversor = new Conversor();
		
		
		System.out.println("Escribe los metros que quieres convertir a millas: ");
		
		metros = leer.nextInt();
		

		System.out.println("El resultado de tu consulta es que " + metros+ " metros " + conversor.convertir(metros));
		
	}
	
	private String convertir(int metros) {
		
		int result = metros / 1609;
		return "son " + result + " millas";
	}

}
