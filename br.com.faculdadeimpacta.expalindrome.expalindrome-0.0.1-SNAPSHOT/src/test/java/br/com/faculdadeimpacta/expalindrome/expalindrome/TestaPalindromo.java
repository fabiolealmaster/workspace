package test.java.br.com.faculdadeimpacta.expalindrome.expalindrome;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import main.java.br.com.faculdadeimpacta.expalindrome.expalindrome.verificapalindrome;

public class TestaPalindromo {

    @Test
    public void testaEhPalindromo(){

        verificapalindrome palindromo = new verificapalindrome();
        
        System.out.println("Palavras/Frases Palindromas:");
        Assertions.assertTrue(palindromo.ehPalindromo("Rotator"));
        System.out.println("Rotator");
        Assertions.assertTrue(palindromo.ehPalindromo("bob"));
        System.out.println("bob");
        Assertions.assertTrue(palindromo.ehPalindromo("madam"));
        System.out.println("madam");
        Assertions.assertTrue(palindromo.ehPalindromo("mAlAyAlam"));
        System.out.println("mAlAyAlam");
        Assertions.assertTrue(palindromo.ehPalindromo("1"));
        System.out.println("1");
        Assertions.assertTrue(palindromo.ehPalindromo("Able was I, ere I saw Elba"));
        System.out.println("Able was I, ere I saw Elba");
        Assertions.assertTrue(palindromo.ehPalindromo("Madam I'm Adam"));
        System.out.println("Madam I'm Adam");
        Assertions.assertTrue(palindromo.ehPalindromo("Step on no pets."));
        System.out.println("Step on no pets.");
        Assertions.assertTrue(palindromo.ehPalindromo("Top spot!"));
        System.out.println("Top spot!");
        Assertions.assertTrue(palindromo.ehPalindromo("02/02/2020"));
        System.out.println("02/02/2020");
    }

    
    
    @Test
    public void testaNaoEhPalindromo(){

    	verificapalindrome palindromo = new verificapalindrome();


    	System.out.println(" " + "\n" + "Palavras/frases Não Palindromas:");
    	Assertions.assertFalse(palindromo.ehPalindromo("xyz"));
    	System.out.println("xyz");
    	Assertions.assertFalse(palindromo.ehPalindromo("elephant"));
    	System.out.println("elephant");
    	Assertions.assertFalse(palindromo.ehPalindromo("Country"));
    	System.out.println("Country");
    	Assertions.assertFalse(palindromo.ehPalindromo("Top . post!"));
    	System.out.println("Top . post!");
    	Assertions.assertFalse(palindromo.ehPalindromo("Wonderful-fool"));
    	System.out.println("Wonderful-fool");
    	Assertions.assertFalse(palindromo.ehPalindromo("Wild imagination!"));
    	System.out.println("Wild imagination!");
    }

}