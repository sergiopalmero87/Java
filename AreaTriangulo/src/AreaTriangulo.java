import java.util.Scanner;

public class AreaTriangulo {

	public static void main(String[] args) {
		/*
		 * Calcular el área de un triángulo:
		 * Escribe un programa que solicite al usuario la base y la altura de un triángulo, y luego calcule y muestre el área del triángulo.
		 * El área de un triángulo es igual a base por altura partido por 2.
		*/

		int base;
		int altura;
		int resultado;
		Scanner leer = new Scanner(System.in);
		
		System.out.println("Escribe la base de un triangulo en cm: ");
		base = leer.nextInt();
		
		System.out.println("Escribe ahora la altura en cm: ");
		altura = leer.nextInt();
		
		AreaTriangulo area = new AreaTriangulo();
		
		
		resultado = area.area_triangulo(base, altura);
		
		System.out.println("El área de tu triangulo es: " + resultado);
		
		
	}

	private int area_triangulo(int base, int altura) {
		int area = (base * altura) / 2;
		return area;
	}
}
