import java.util.Scanner;

public class SumaNumUsuario {

	public static void main(String[] args) {
		
		SumaNumUsuario prueba = new SumaNumUsuario();
		
		Scanner leer = new Scanner(System.in);
		int num1, num2;
		
		System.out.println("Introduce tu primer número: ");
		num1 = leer.nextInt();
		
		System.out.println("Introduce ahora tu segundo número: ");
		num2 = leer.nextInt();
		
		leer.close();
		
		
		System.out.println("La suma de tus dos números es... " +prueba.devolver_suma(num1, num2));
		

	}
	
	private int devolver_suma(int num1, int num2) {
		int result = num1 + num2;
		return result;

}
	
}	
