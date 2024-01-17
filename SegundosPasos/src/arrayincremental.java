
public class arrayincremental {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a = new int[5];
		
		a =rellenararray(a, 14,300);
		
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
			
		}
		System.out.println();
		System.out.println("La array tiene "+a.length+" espacios");
	}
	
	public static int[] rellenararray(int[]array,int numero1,int pos) {
		while (pos > array.length-1) {
			int [] array2= array;
			array = new int[array2.length*2];
			for (int i=0;i<array2.length;i++) {
				array[i]=array2[i];
			}
		}
		array[pos]=numero1;
		return array;
		
	}
}
