import java.util.Scanner;

public class Input {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite seu nome: ");
		
		String input = scanner.nextLine();
		
		System.out.println("O nome digitado foi: "+input);
		scanner.close();
	}

}
