package clases;

public class Coche {
	
	
	//Atributos:
	public String marca;
	public String modelo;
	public int anioFabricacion;
	public String color;
	public double velocidadActual;
	public boolean encendido;
	public double consumoPorKilometro;
	
	//Contructor:
	
	public Coche(String marca,String modelo,int anioFabricacion,String color,double consumoPorKilometro) {
		this.marca = marca;
		this.modelo = modelo;
		this.anioFabricacion = anioFabricacion;
		this.color = color;
		this.velocidadActual = 0;
		this.encendido = false;
		this.consumoPorKilometro = consumoPorKilometro;	
	}
	
	//metodos:
	public void encenderMotor() {
		this.encendido = true;
	}
	
	public void apagarMotor() {
		this.encendido = false;
	}
	
	public void acelerar(double cantidad) {
		if(encendido) {
			velocidadActual=cantidad;
			System.out.println(velocidadActual);
		}else {
			System.out.println("El coche esta apagado!!");
		}
	}
	
	public void frenar(double cantidad) {
		if(encendido && velocidadActual>cantidad) {
			velocidadActual=cantidad;
			System.out.println(velocidadActual);
		}else {
			System.out.println("El coche esta apagado!! o la velocidad es mayor que la actual");
		}
	}
	
	public double calcularConsumo(double distancia) {
		return consumoPorKilometro/distancia;
	}
	
	public void mostrarInformacion() {
		System.out.println("Marca: "+marca+" Modelo: "+modelo+" Año de Fabricion: "+anioFabricacion+" Color:"+color+" VelocidadActual: "+velocidadActual+" Encendido: "+encendido+" ConsumoPorKilometro: "+consumoPorKilometro);
	}
	
}
