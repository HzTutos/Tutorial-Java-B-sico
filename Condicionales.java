public class Condicionales{
	public static void main(String[] args) {
		int calificacion = 11;

		if(calificacion < 0) {
			System.out.println("La calificación no puede ser menor a 0");
		}else if(calificacion > 10){
			System.out.println("La Calificación no puede ser mayor a 10");
		}else if(calificacion < 6){
			System.out.println("Reprobaste");
		}else{
			System.out.println("Aprobaste");
		}

		System.out.println("Fin del programa");
	}
}