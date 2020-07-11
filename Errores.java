public class Errores{
	public static void main(String[] args) {
		int num1 = 4;
		int num2 = 2;
		int resultado;
		
		try{
			resultado = num1 / num2;
			System.out.println(resultado);
		}catch(Exception err){
			System.out.println(err.getMessage());
		}finally{
			System.out.println("Adios");
		}

	}
}