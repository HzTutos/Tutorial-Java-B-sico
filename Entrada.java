import java.util.Scanner;

public class Entrada{
	public static void main(String[] args){
		Scanner entrada = new Scanner(System.in);

		System.out.print("Hola, Escoge una opción: ");

		int opcion = entrada.nextInt();

		switch(opcion){
			case 1:
				System.out.println("Escogiste el 1");
			break;
			case 2:
				System.out.println("Escogiste el 2");
			break;
			case 3:
				System.out.println("Escogiste el 3");
			break;
			default:
				System.out.println("Caso invalido.");
			break;
		}
	}
}