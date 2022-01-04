
public class Main {
	public static void main(String[] args) {

		System.out.println(" Calculadora\n");

		Calculadora.soma(3, 4);

		Calculadora.subtracao(8, 4);

		Calculadora.multiplicacao(8, 8);

		Calculadora.divicao(123, 2);

		System.out.println("\n Mensagem\n");

		mensagem.obterMensagem(5);

		mensagem.obterMensagem(14);

		mensagem.obterMensagem(21);

		System.out.println("\nParcelas\n");

		parcelas.calcular(1000, 2);

		parcelas.calcular(1000, 3);

		parcelas.calcular(1000, 5);

		System.out.println("\nSobrecarga\n");

		Sobrecarga.area(3);

		Sobrecarga.area(23, 45);

		Sobrecarga.area(23, 45, 56);

		System.out.println("\n Retorno\n");

		double areaQuadrado = Retorno.area(5);
		
		System.out.println("A area do quadrado e " + areaQuadrado);
		
		double areaRetangulo = Retorno.area(34, 45);
		
		System.out.println("A area do retangulo e " + areaRetangulo);
		
		double areaTrapecio = Retorno.area(23, 34, 5);
		
		System.out.println("A area do trapecio e " + areaTrapecio);

	}

}
