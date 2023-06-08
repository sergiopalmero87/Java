import java.util.Scanner;

public class Par_Impar {

	public static void main(String[] args) {
		 // Suma los números pares y los impares. 
		 // Vamos "recorriendolo" hasta que llegamos al número pedido por teclado.
		 // Por ejemplo: 3. -> 1 + 2 + 3 = 6 porque la suma de esos 3 números es 6.
		
		Scanner leer = new Scanner(System.in);
		int num; 
		int sum_par=0;
		int sum_impar=0;
		
		System.out.println("Hola. Escribe un número por teclado: ");
		num = leer.nextInt();
		
		for(int i = 1; i<= num; i++) {
			
			if(num % 2 == 0) {
				sum_par+= i;
				
			} else {
				sum_impar+= i;
			}
		}
		
		
		
		System.out.println("El número introducido por el usuario es: " + num);
		System.out.println("La suma del número es: " +sum_par+ " porque es par");
		System.out.println("La suma del número es: " +sum_impar+ " porque es impar"); 
		
	}
}
	

