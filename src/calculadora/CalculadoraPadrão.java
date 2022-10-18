package calculadora;

public class CalculadoraPadrão {

	public CalculadoraPadrão() {

	}

	public int somar(int valor1, int valor2) {

		int soma;
		soma = valor1 + valor2;
		return soma;

	}

	public int subtração(int valor1, int valor2) {

		int subtração;
		subtração = valor1 - valor2;
		return subtração;
	}

	public int divisão(int valor1, int valor2) {

		int divisão;
		divisão = valor1 / valor2;
		return divisão;
	}
	public int multiplicação(int valor1, int valor2) {

		int multiplicação;
		multiplicação = valor1 + valor2;
		return multiplicação;
	}
	public int potenciação(int valor1, int valor2) {

		int potenciação;
		potenciação = (int) Math.pow(valor1, valor2);
		return potenciação;
	}
	
	
	

}
