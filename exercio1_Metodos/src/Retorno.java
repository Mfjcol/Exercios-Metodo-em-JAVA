
public class Retorno {

	public static double area(double lado) {
		double area = lado * lado;
		return area;
		
	}
		public static double area ( double lado1, double lado2) {
			double area = lado1 * lado2;
			return area;
		}
		
		public static double area ( double baseMaior, double baseMenor, double altura) {
			double area = (baseMaior + baseMenor) * altura / 2;
			return area;
		}

}
