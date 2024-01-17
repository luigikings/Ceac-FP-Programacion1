
public class trycatch1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/*
		 *  La estructura basica de este bloque será try catch y finally y sirve para recoger posibles fallos del codigo
		 *   y que este se siga ejecutando a pesar del fallo. aquí se puede ver el listado de excepciones:
		 *    https://programming.guide/java/list-of-java-exceptions.html
		 *    Esquema exception:
		 *    https://condor.depaul.edu/ntomuro/courses/224/notes/lecture7.html
		 */
		
		int [] num = new int [5];
		int num1 = 5;
		
		try {
			System.out.println(num [2]);
			System.out.println(num1/2);
			num1=Integer.parseInt("1.5");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.err.println("algo no ha ido del todo bien (array) "+e);			
		}catch (ArithmeticException e) {
			System.err.println("algo no ha ido del todo bien al dividir/0 "+e);		
		}catch (Exception e) {
			System.err.println("Excepcion generica "+e);			
		}finally {
			System.out.println("Este es el bloque finally");	
		}
		System.out.println("El codigo se sigue ejecutando");
		
		
		/*
		 * Intenta crear una excepción de tipo:
		 * 
		 * NullPointerException
		 * NumberFormatException
		 * StringIndexOutOfBoundsException
		 * NegativeArraySizeException
		 */
		
		String txt1="123";
		int num2= 123;
		String txt2="texto";
		
		try {
			
			System.out.println(txt1.charAt(1));
			int [] arrayneg = new int [2];
			System.out.println(txt2.length());
			Integer.parseInt(txt2);
			
		} catch (NullPointerException e) {
			System.err.println("algo no ha ido del todo bien (array) TEXTO NULL NO SE PUEDE .LENGHT "+e);
		} catch (NumberFormatException e) {
			System.err.println("algo no ha ido del todo bien (String) STRING NO SE PUEDE CONVERTIR A NUMERO"+e);
		} catch (StringIndexOutOfBoundsException e) {
			System.err.println("algo no ha ido del todo bien (STRING) FUERA DE RANGO"+e);
		} catch (NegativeArraySizeException e) {
			System.err.println("algo no ha ido del todo bien (array) NO PUEDE SER NEGATIVA "+e);
		} finally {
			System.out.println("FINALLY");
		}
		
		try {
			dividirNum(5,0);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public static void dividirNum (int num1, int num2) throws Exception {
		try {
			System.out.println("La division es: "+num1/num2);
		} catch (Exception e) {
			System.err.println(e);
			throw new Exception("HAS INTENTADO DIVIDIR ENTRE 0");
		}
	}

}
