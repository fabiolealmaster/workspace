import java.util.Scanner;

public class ExemploIfElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
//		System.out.println("Digite sua idade: ");
//		int idade = scanner.nextInt();

//		if(idade <18) {
//			System.out.println("Idade " + idade + " - menor de idade");
//		} else {
//			System.out.println("Idade " + idade + " - maior de idade");
//		}
		
//		System.out.println("Fim do c�digo");
		
		System.out.println("Digite a primeira nota: ");
		int n1 = scanner.nextInt();
		if(n1 < 0 || n1 > 10) {
			System.out.println("Nota Inv�lida!");
			return;
		}
		
		System.out.println("Digite a segunda nota: ");
		int n2 = scanner.nextInt();
		if(n2 < 0 || n2 > 10) {
			System.out.println("Nota Inv�lida!");
			return;
		}
		
		int media = (n1 + n2)/ 2;
		if (media < 4) {
			System.out.println("M�dia = " + media + " voc� est� REPROVADO");
		} else if( media >= 4 && media < 6) {
			System.out.println("M�dia = " + media + " voc� est� RECUPERA��O");
		}else if( media >= 6) {
			System.out.println("M�dia = " + media + " voc� est� APROVADO");
		}
	}

}
