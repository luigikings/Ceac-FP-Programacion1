package clases;

public class Naranja extends Fruta{
	private int numGajos;
	
	public Naranja(int numGajos) {
		super(false, 200, "Naranja","Naranja");
		this.numGajos = numGajos;
	}
	
	public void info() {
		System.out.println("La naranja tiene "+numGajos+" Numeros de gajos");
		super.info();
	}
}
