
public class parcelas {

	public static double getTaxaDuasParcelas() {
		return 0.3;
	}

	public static double getTaxatresParcelas() {
		return 0.45;
	}

	public static void calcular(double valor, int parcelas) {

		if (parcelas == 2) {
			
			double valorFinal = valor + (valor * getTaxaDuasParcelas());
			
			System.out.println("Valor final para dos parcelas e : " + valorFinal);
			
		} else if (parcelas == 3) {
			
			double valorFinal = valor + (valor * getTaxatresParcelas());
			
			System.out.println("Valor final para tres parcelas e :" + valorFinal);
		}else {
			System.out.println("Número  de parcelas nao aceita");
		}
	}

}
