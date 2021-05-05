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
		
//		System.out.println("Fim do código");
		
		System.out.println("Digite a primeira nota: ");
		int n1 = scanner.nextInt();
		if(n1 < 0 || n1 > 10) {
			System.out.println("Nota Inválida!");
			return;
		}
		
		System.out.println("Digite a segunda nota: ");
		int n2 = scanner.nextInt();
		if(n2 < 0 || n2 > 10) {
			System.out.println("Nota Inválida!");
			return;
		}
		
		int media = (n1 + n2)/ 2;
		if (media < 4) {
			System.out.println("Média = " + media + " você está REPROVADO");
		} else if( media >= 4 && media < 6) {
			System.out.println("Média = " + media + " você está RECUPERAÇÃO");
		}else if( media >= 6) {
			System.out.println("Média = " + media + " você está APROVADO");
		}
	}

}
