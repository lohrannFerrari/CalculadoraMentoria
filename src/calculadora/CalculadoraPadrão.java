package calculadora;

public class CalculadoraPadr�o {

	public CalculadoraPadr�o() {

	}

	public int somar(int valor1, int valor2) {

		int soma;
		soma = valor1 + valor2;
		return soma;

	}

	public int subtra��o(int valor1, int valor2) {

		int subtra��o;
		subtra��o = valor1 - valor2;
		return subtra��o;
	}

	public int divis�o(int valor1, int valor2) {

		int divis�o;
		divis�o = valor1 / valor2;
		return divis�o;
	}
	public int multiplica��o(int valor1, int valor2) {

		int multiplica��o;
		multiplica��o = valor1 + valor2;
		return multiplica��o;
	}
	public int potencia��o(int valor1, int valor2) {

		int potencia��o;
		potencia��o = (int) Math.pow(valor1, valor2);
		return potencia��o;
	}
	
	
	

}
