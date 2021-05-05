import java.lang.reflect.Array;

public class ExemploFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		for(int i = 10; i >= 0; i-- ) {
//			if (i == 5 ) {
//				continue;
//			}
//			if(i==7) {
//				break;
//			}
//			System.out.println(i);
//		}
		
//		String[] meuArray = {"Um", "Dois", "Três"};
//		for ( int i =0; i <= meuArray.length-1; i++) {
//			System.out.println(meuArray[i]);
//		}
		
//		int[] arrayInt = new int[100];
//		for (int i = 0; i < 100; i++) {
//			arrayInt[i] = i;
//		}
//		for ( int i = 0; i < arrayInt.length; i++) {
//			if(i == 10)
//				break;
//			System.out.println(arrayInt[i]);
//		}
		
		String teste = "MeuArray";
		for(int i = 0; i < teste.length(); i++) {
			if(i ==3) {
				System.out.print(" - ");
			}
			System.out.println(teste.charAt(i));
		}
		
	}

}
