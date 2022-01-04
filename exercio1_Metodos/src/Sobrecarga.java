
public class Sobrecarga {

	public static void area(double lado) {

		double area = lado * lado;
		System.out.println("A area do quadrado e " + area);

	}

	public static void area(double lado1, double lado2) {
		double area = lado1 * lado2;
		System.out.println("A area do rentangulo e " + area);
	}

	public static void area(double baseMaior, double baseMenor, double altura) {
		double area = (baseMaior + baseMenor) * altura / 2;
		System.out.println("A area do trapecio e " + area);
	}

}
