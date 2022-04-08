import java.util.Scanner;

public class Clase {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String Nombre;
		System.out.println("Cual es tu nombre?");
		
		Nombre = scan.nextLine();
		
		System.out.println("Hola " + Nombre);
		
		System.out.println("Introduzca el numero1");
		Integer numeroLectura1 = scan.nextInt();
		
		System.out.println("Introduzca el numero 2");
		Integer numeroLectura2 = scan.nextInt();
		Integer suma2 = numeroLectura1 + numeroLectura2;
		System.out.println("La suma de los numeros es " + suma2);
		
		System.out.println("Adios " + Nombre);

		System.out.println("HOLA MUNDOOOOOO");
		System.out.println("mi proyectooooO");
		System.out.println("mi ");
	}

}
