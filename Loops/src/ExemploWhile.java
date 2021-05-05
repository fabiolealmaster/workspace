
public class ExemploWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int contador = 1;
		while (contador < 11) {
			
			if (contador ==5 ) {
				contador = 6;
				continue;
			}
			System.out.println("Contador = " + contador);
			contador++;
		}
		
	}

}
