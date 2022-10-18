package calculadora;

public class CalculadoraImc {

	public CalculadoraImc() {
			
	}

	public double calculadoraImc(double peso, double altura) {

	    double imc;
	    
		imc = peso / (altura*altura);
		return (double) imc;
	}
	
	
}
