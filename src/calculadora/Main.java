package calculadora;

import java.util.Scanner;
import java.text.DecimalFormat;


public class Main {

	public static void main(String[] args) {

		Scanner scr = new Scanner(System.in);

		CalculadoraPadr�o CalculadoraPadr�o = new CalculadoraPadr�o();
		CalculadoraImc CalculadoraImc = new CalculadoraImc();
		CalculadoraArea CalculadoraArea = new CalculadoraArea();

		
		int entrada;
		do {
			System.out.println("Qual calculadora deseja usar?");
			System.out.println("1 - Calculadora Padr�o");
			System.out.println("2 - Calculadora Imc");
			System.out.println("3 - Calculadora de �reas");

			int op��o = scr.nextInt();

			switch (op��o) {

			case 1:

				System.out.println("Voc� escolheu Calculadora Padr�o");
				System.out.println("Qual opera��o gostaria de fazer?");
				System.out.println("1 - Somar");
				System.out.println("2 - Subtra��o");
				System.out.println("3 - Divis�o");
				System.out.println("4 - Multiplica��o");
				System.out.println("5 - Potencia��o");

				int opera��o = scr.nextInt();

				switch (opera��o) {
				case 1:
					System.out.println("Soma");
					System.out.println("Digite os valores: ");
					int valor1 = scr.nextInt();
					int valor2 = scr.nextInt();
					
					System.out.println("Resultado:" + CalculadoraPadr�o.somar(valor1, valor2));
					break;

				case 2:
					System.out.println("Subtra��o");
					System.out.println("Digite os valores: ");
					int valor3 = scr.nextInt();
					int valor4 = scr.nextInt();
					
					System.out.println("Resultado:" + CalculadoraPadr�o.subtra��o(valor3, valor4));
					break;

				case 3:
					System.out.println("Divis�o");
					System.out.println("Digite o dividento: ");
					int valor5 = scr.nextInt();
					System.out.println("Digite o divisor: ");
					int valor6 = scr.nextInt();
					
					System.out.println("Resultado:" + CalculadoraPadr�o.divis�o(valor5, valor6));
					break;

				case 4:
					System.out.println("Multiplica��o");
					System.out.println("Digite os valores: ");
					int valor7 = scr.nextInt();
					int valor8 = scr.nextInt();
					System.out.println("Resultado:" + CalculadoraPadr�o.multiplica��o(valor7, valor8));
					break;

				case 5:
					System.out.println("Potencia��o");
					System.out.println("Digite os valores: ");
					int valor9 = scr.nextInt();
					int valor10 = scr.nextInt();
					System.out.println("Resultado:" + CalculadoraPadr�o.potencia��o(valor9, valor10));
					break;
				}

				break;

			case 2:

				System.out.println("Voc� escolheu Calculadora de Imc");
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
							"Imc: " + new DecimalFormat(".##").format(imc) + "  |" + "Obesidade grau III(m�rbida).");
				}
				break;

			case 3:

				System.out.println("Voc� escolheu a calculadora de �reas");
				System.out.println("�rea de qual forma geomatrica gostaria de calcular?");
				System.out.println("1 - C�rculo");
				System.out.println("2 - Quadrado");
				System.out.println("3 - Retangulo");
				int escolha = scr.nextInt();

				switch (escolha) {
				case 1:
					System.out.println("Calculo da �rea do C�rculo:");
					System.out.println("Digite o raio:");
					double raio = scr.nextDouble();
					double areaC = CalculadoraArea.AreaC�rculo(raio);
							
					System.out.println("�rea do C�rculo: " + new DecimalFormat(".##").format(areaC));
					break;

				case 2:
					System.out.println("Calculo da �rea do Quadrado:");
					System.out.println("Digite o lado:");
					double lado = scr.nextDouble();
					double areaQ = CalculadoraArea.AreaQuadrado(lado);
					System.out.println("�rea do Quadrado: " + new DecimalFormat(".##").format(areaQ));
					break;

				case 3:
					System.out.println("Calculo da �rea do Ret�ngulo:");
					System.out.println("Digite a base:");
					double base = scr.nextDouble();
					System.out.println("Digite a altura:");
					double altura1 = scr.nextDouble();
					double areaR = CalculadoraArea.AreaRetangulo(base, altura1);
					System.out.println("�rea do Ret�ngulo: " + new DecimalFormat(".##").format(areaR) );
					break;
				}

			}
            System.out.println();
			System.out.println("Gostaria de fazer uma nova opera��o?");
			System.out.println("1 - Sim");
			System.out.println("2 - N�o");
			entrada = scr.nextInt();

		}while (entrada == 1);

		scr.close();
	}

}
