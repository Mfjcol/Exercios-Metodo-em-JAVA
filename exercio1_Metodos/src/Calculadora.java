public class Calculadora {
	
	public static void soma  (double num1, double num2 ) {
		double resultado = num1 + num2;
		System.out.println("A soma de " + num1 + " e de " + num2 + " e de " + resultado);
		
	}
	
	public static void subtracao ( double num1, double num2) {
		double resultado = num1 - num2;
		System.out.println("A subtacao de " + num1 + " e de " + num2 + " e de " + resultado);
	}
	
	public static void divicao ( double num1, double num2) {
		double resultado = num1 / num2;
		System.out.println("A divicao de " + num1 + " e de " + num2 + " e de " + resultado);
		
	}
	
	public static void multiplicacao ( double num1, double num2) {
		double resultado = num1 * num2;
		System.out.println("A Multiplicacao de " + num1 + " e de " + num2 + " e de "+ resultado);
	}
}