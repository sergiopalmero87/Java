
public class ControlFlujoBasico {

	public static void main(String[] args) {
		int number1 = 15;
        int number2 = 25;

        if(number1 > number2) {
            System.out.println("El numero 1: " + number1 + " es mayor que el numero 2: " + number2) ;
        } else{
            System.out.println("El numero 2: " + number2 + " es mayor que el numero 1: " + number1);
        }
        
        String num_string = String.valueOf(number1);
        System.out.println(num_string +" "+ num_string.getClass());
        

	}

}
