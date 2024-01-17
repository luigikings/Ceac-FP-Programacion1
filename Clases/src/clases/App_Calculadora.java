package clases;

public class App_Calculadora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculadora calculadora = new Calculadora(0);
		
		calculadora.sumar(2);
		calculadora.sumar(2);
		//dfgdfgdfg
		System.out.println(calculadora.getResultado());
		
		calculadora.dividir(0);
		
		System.out.println(calculadora.getResultado());
		
		calculadora.multiplicar(3);
		calculadora.restar(3);
		
		System.out.println(calculadora.getResultado());
		
	}

}
