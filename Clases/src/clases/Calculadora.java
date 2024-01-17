package clases;

public class Calculadora {

	public double resultado;
	
	public Calculadora(double resultado) {
		this.resultado = resultado;
	}
	
	//metodos:
	
	public double sumar(double valor) {
		return this.resultado += valor;
	}
	
	public double restar(double valor) {
		return this.resultado -= valor;
	}
	
	public double multiplicar(double valor) {
		return this.resultado *= valor;
	}
	
	public double dividir(double valor) {
		if(valor == 0) {
			System.out.println("NO SE PUEDE DIVIR POR 0");
			return this.resultado;
		}else {
			return this.resultado /= valor;
		}
		
	}

	public double getResultado() {
		return resultado;
	}
	
	
	
}
