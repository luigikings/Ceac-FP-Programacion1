package clases;

public class Banco {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CuentaBancaria cliente = new CuentaBancaria("Deyby", 3020);
		
		System.out.println(cliente.getSaldo());
		
		cliente.depositar(10000);
		
		System.out.println(cliente.getSaldo());
		
		cliente.retirar(5000);
		
		System.out.println(cliente.getSaldo());
		
		cliente.depositar(5000);
		
		System.out.println(cliente.getSaldo());
		
	}

}
