import javax.swing.*;

public class InputSwing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String input = JOptionPane.showInputDialog("Digite seu nome: ");
		//System.out.println("O nome digitado foi: " + input);
		
		JOptionPane.showMessageDialog(null,"O nome digitado foi: " + input, "Output", JOptionPane.WARNING_MESSAGE );
	}

}
