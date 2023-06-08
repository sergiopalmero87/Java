
public class Ternarias {

	public static void main(String[] args) {
		// Ternarias
		
		int calificacion = 75;
		
		// Si la variable calificacion es igual o mayor a 60 entonces la variable resultado es aprobado y sino es reprobado.
		String resultado = (calificacion >= 60) 
			? "Aprobado" 
			: "Reprobado";
		
		
		System.out.println("Estado: " + resultado +"\n");

		
		int calificacion2 = 49;
		
		String newResult = (calificacion2 >= 50) ? "Aprobado" : "Suspendido";
		
		System.out.println("El resultado es: " + newResult);
		
		

	}
	


}
