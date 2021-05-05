
public class ExemploVariaveis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n1;
		int n2;
		
		n1 = 10;
		n2 = 20;
		
		int operacao = n1 + n2;
		
		System.out.println("Soma = " + operacao);
		
		operacao = n1 * n2;
		System.out.println("Multiplicação = " + operacao);
		
		operacao = n2 / n1;
		System.out.println("Divisao = " + operacao);
		
		System.out.println("Subtração = " + String.valueOf(n2 - n1));
		
		double nota1, nota2, nota3, nota4;
		
		nota1 = 5.3;
		nota2 = 6.4;
		nota3 = 7.3;
		nota4 = 3.2;
		
		double media = (nota1 + nota2 + nota3 + nota4) / 4;
		
		System.out.println("Média = " + media);
		
		char letra = 'A';
		System.out.println("Letra = " + letra);
		letra = 'F';
		System.out.println("Letra = " + letra);
		
		boolean verdade = true;
		boolean mentira = false;
		System.out.println("Verdade = " + verdade);
		System.out.println("Mentira = " + mentira);
		
		System.out.println("Verdade == Mentira = " + String.valueOf(mentira == mentira));
		System.out.println("Verdade != Mentira = " + String.valueOf(verdade != mentira));
		
		System.out.println("20 <= 20 = " + String.valueOf(20<=20));
		System.out.println("20 >= 20 = " + String.valueOf(20>=20));
		
		
		
		
		
	}

}
