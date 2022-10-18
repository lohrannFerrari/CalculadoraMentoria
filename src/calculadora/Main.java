package calculadora;

import java.util.Scanner;
import java.text.DecimalFormat;


public class Main {

	public static void main(String[] args) {

		Scanner scr = new Scanner(System.in);

		CalculadoraPadrão CalculadoraPadrão = new CalculadoraPadrão();
		CalculadoraImc CalculadoraImc = new CalculadoraImc();
		CalculadoraArea CalculadoraArea = new CalculadoraArea();

		
		int entrada;
		do {
			System.out.println("Qual calculadora deseja usar?");
			System.out.println("1 - Calculadora Padrão");
			System.out.println("2 - Calculadora Imc");
			System.out.println("3 - Calculadora de Áreas");

			int opção = scr.nextInt();

			switch (opção) {

			case 1:

				System.out.println("Você escolheu Calculadora Padrão");
				System.out.println("Qual operação gostaria de fazer?");
				System.out.println("1 - Somar");
				System.out.println("2 - Subtração");
				System.out.println("3 - Divisão");
				System.out.println("4 - Multiplicação");
				System.out.println("5 - Potenciação");

				int operação = scr.nextInt();

				switch (operação) {
				case 1:
					System.out.println("Soma");
					System.out.println("Digite os valores: ");
					int valor1 = scr.nextInt();
					int valor2 = scr.nextInt();
					
					System.out.println("Resultado:" + CalculadoraPadrão.somar(valor1, valor2));
					break;

				case 2:
					System.out.println("Subtração");
					System.out.println("Digite os valores: ");
					int valor3 = scr.nextInt();
					int valor4 = scr.nextInt();
					
					System.out.println("Resultado:" + CalculadoraPadrão.subtração(valor3, valor4));
					break;

				case 3:
					System.out.println("Divisão");
					System.out.println("Digite o dividento: ");
					int valor5 = scr.nextInt();
					System.out.println("Digite o divisor: ");
					int valor6 = scr.nextInt();
					
					System.out.println("Resultado:" + CalculadoraPadrão.divisão(valor5, valor6));
					break;

				case 4:
					System.out.println("Multiplicação");
					System.out.println("Digite os valores: ");
					int valor7 = scr.nextInt();
					int valor8 = scr.nextInt();
					System.out.println("Resultado:" + CalculadoraPadrão.multiplicação(valor7, valor8));
					break;

				case 5:
					System.out.println("Potenciação");
					System.out.println("Digite os valores: ");
					int valor9 = scr.nextInt();
					int valor10 = scr.nextInt();
					System.out.println("Resultado:" + CalculadoraPadrão.potenciação(valor9, valor10));
					break;
				}

				break;

			case 2:

				System.out.println("Você escolheu Calculadora de Imc");
				System.out.println("Digite seu peso: ");
				double peso = scr.nextInt();
				System.out.println("Digite sua altura: ");
				double altura = scr.nextDouble();
				double imc = CalculadoraImc.calculadoraImc(peso, altura);
				if (imc <= 18.5) {

					System.out.println("Imc: " + new DecimalFormat(".##").format(imc) + " |" + " Abaixo do Peso");

				} else if (imc >= 18.6 && imc <= 24.9) {
					System.out.println("Imc: " + new DecimalFormat(".##").format(imc) + " |" + "Peso ideal.");

				} else if (imc >= 25 && imc <= 29.9) {
					System.out.println("Imc: " + new DecimalFormat(".##").format(imc) + " |" + "Acima do peso.");

				} else if (imc >= 30 && imc <= 34.9) {
					System.out.println("Imc: " + new DecimalFormat(".##").format(imc) + " |" + "Obesidade grau I.");

				} else if (imc >= 35 && imc <= 39.9) {
					System.out.println(
							"Imc: " + new DecimalFormat(".##").format(imc) + " |" + "Obesidade grau II(severa).");

				} else if (imc <= 40) {
					System.out.println(
							"Imc: " + new DecimalFormat(".##").format(imc) + "  |" + "Obesidade grau III(mórbida).");
				}
				break;

			case 3:

				System.out.println("Você escolheu a calculadora de Áreas");
				System.out.println("Área de qual forma geomatrica gostaria de calcular?");
				System.out.println("1 - Círculo");
				System.out.println("2 - Quadrado");
				System.out.println("3 - Retangulo");
				int escolha = scr.nextInt();

				switch (escolha) {
				case 1:
					System.out.println("Calculo da Área do Círculo:");
					System.out.println("Digite o raio:");
					double raio = scr.nextDouble();
					double areaC = CalculadoraArea.AreaCírculo(raio);
							
					System.out.println("Área do Círculo: " + new DecimalFormat(".##").format(areaC));
					break;

				case 2:
					System.out.println("Calculo da Área do Quadrado:");
					System.out.println("Digite o lado:");
					double lado = scr.nextDouble();
					double areaQ = CalculadoraArea.AreaQuadrado(lado);
					System.out.println("Área do Quadrado: " + new DecimalFormat(".##").format(areaQ));
					break;

				case 3:
					System.out.println("Calculo da Área do Retângulo:");
					System.out.println("Digite a base:");
					double base = scr.nextDouble();
					System.out.println("Digite a altura:");
					double altura1 = scr.nextDouble();
					double areaR = CalculadoraArea.AreaRetangulo(base, altura1);
					System.out.println("Área do Retângulo: " + new DecimalFormat(".##").format(areaR) );
					break;
				}

			}
            System.out.println();
			System.out.println("Gostaria de fazer uma nova operação?");
			System.out.println("1 - Sim");
			System.out.println("2 - Não");
			entrada = scr.nextInt();

		}while (entrada == 1);

		scr.close();
	}

}
