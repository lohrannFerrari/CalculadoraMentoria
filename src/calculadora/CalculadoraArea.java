package calculadora;

public class CalculadoraArea {

	public CalculadoraArea() {	
	}
	
	double AreaCírculo(double raio) {
		
		double AreaCírculo;
		AreaCírculo = Math.PI * raio * raio;
		return AreaCírculo;
		
		
		
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
