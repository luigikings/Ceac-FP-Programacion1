package p001;

public class Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arrayNums= {1,2,3,8,15,50};
		
		int sumaTotalPar=0;
		
		for (int i=0;i<arrayNums.length;i++) {
			
			if (arrayNums[i]%2==0) {
				sumaTotalPar=sumaTotalPar+arrayNums[i];
				System.out.println(sumaTotalPar);
			}
			
		}
		
		int numPrimo = 1;
		if (primo(numPrimo)==true) {
			System.out.println("ES PRIMO");
		} else {
			System.out.println("NO ES PRIMO");
		}

		
		
		//Sacar cantidad de espacios en un String
		String txt="Hola como estas hace tiempo no se de ti";
		String espacio= " ";
		int numeroespacios=0;
		for (int i=0;i<txt.length();i++) {
			if (txt.charAt(i)==espacio.charAt(0)) {
				numeroespacios=numeroespacios+1;
			}
		}
		System.out.println(numeroespacios);

	}
	
	public static boolean primo(int numeroPrimo) {
		boolean primo= true;
		for (int i=2; i<numeroPrimo;i++) {
			if(numeroPrimo%i==0) {
				primo= false;
			}
		}
		return primo;
	}

}
