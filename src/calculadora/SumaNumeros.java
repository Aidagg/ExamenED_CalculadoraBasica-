package calculadora;
import java.util.Scanner;
public class SumaNumeros {
	/**
	 * @author ciclesgs
	 * @version
	 * @param args
	 */
	public static void main(String[] args) {  
		/**
		 * El programa es una calculadora, solicita dos números
		 * y esos dos números se suman.
		 */
		//El programa es una calculadora y hace la suma de dos números.
		Scanner scanner = new Scanner(System.in);  
		/**
		 * Solicita un número
		 */
		System.out.print("Ingresa el primer número: ");
		/**
		 * Lee el valor
		 */
		int numero1 = scanner.nextInt();  
		/**
		 * Solicita otro número.
		 */
		System.out.print("Ingresa el segundo número: ");  
		/**
		 * Lee el valor.
		 */
		int numero2 = scanner.nextInt();  
		/**
		 * Crea una variable para sumar los dos números introducidos.
		 */
		int suma = numero1 + numero2;  
		System.out.println("La suma de " + numero1 + " y " + numero2 + " es: " + suma);  
		}  
	//Rama hecha
	//Comentario después de realizar fusión  entre ramas

}
