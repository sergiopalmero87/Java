import java.util.Scanner;

public class NumPrimo {
	
	// Pedir un número, comprobar si es primo y preguntar si quiere introducir más y salir si introduce 0.



	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		
		int num;
		int suma = 0;
		do {
			System.out.println("Averiguemos si tu número es impar y vamos a sumarlos. Para salir del programa introduce 0.\nIntroduce tú número: ");
			
			num = leer.nextInt();
			
			if(num % 3 == 0) {
				System.out.println("El número: " +num+ " es primo.");
				suma += num;
				
				
			} else {
				System.out.println("Número par");
			} 
		}while (num != 0);
		
		System.out.println("La suma de tus números primos introducidos es: " + suma);
		
		
		
		
		
		

	}

}
