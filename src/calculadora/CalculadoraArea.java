package calculadora;

public class CalculadoraArea {

	public CalculadoraArea() {	
	}
	
	double AreaC�rculo(double raio) {
		
		double AreaC�rculo;
		AreaC�rculo = Math.PI * raio * raio;
		return AreaC�rculo;
		
		
		
	}
	
    double AreaQuadrado(double lado) {
		
		double AreaQuadrado;
		AreaQuadrado = lado * lado;
		return AreaQuadrado;	
		
	}
    
   double AreaRetangulo(double base, double altura) {
		
		double AreaRetangulo;
		AreaRetangulo = base * altura;
		return AreaRetangulo;	
		
	}
	

}
