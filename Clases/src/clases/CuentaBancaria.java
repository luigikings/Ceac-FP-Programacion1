package clases;

public class CuentaBancaria {
	private String titular;
	private double saldo;
	
	//constructor:
	public CuentaBancaria(String titular,double saldo) {
		this.titular = titular;
		this.saldo = saldo;
	}
	
	//metodos:
	
	public double depositar(double monto) {
		if(monto > 0) {
			return this.saldo += monto;
		}else {
			return this.saldo;
		}
	}
	
	public double retirar(double monto) {
		if(monto > 0) {
			return this.saldo -= monto;
		}else {
			return this.saldo;
		}
	}
	
	
	//getters and setters
	public String getTitular() {
		return titular;
	}
	public double getSaldo() {
		return saldo;
	}

	
}
