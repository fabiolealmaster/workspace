//Atividade 01
//Como usu�rio gostaria de uma funcionalidade que valide se uma frase ou palavra �
//pal�ndromo.
//Crit�rios de aceite:

//Verdadeiro:
//� �Rotator�
//� �bob�
//� �madam�
//� �mAlAyAlam�
//� �1�
//� �Able was I, ere I saw Elba�
//� �Madam I'm Adam�
//� �Step on no pets.�
//� �Top spot!�
//� �02/02/2020�

//Falso:
//� �xyz�
//� �elephant�
//� �Country�
//� �Top . post!�
//� �Wonderful-fool�
//� �Wild imagination!�

//O componente deve receber os exemplos acima e retornar verdadeiro ou falso, conforme a
//regra. Fazer o componente usando a metodologia TDD.
//Enviar a URL do Github com todo o c�digo fonte.

import javax.swing.*;

public class Palindrome{  

public static void main(String[] args) {
       
       String palavra, palavraInvertida="";
       int tamanho,i;


       // Armazena a palavra numa String
       palavra = JOptionPane.showInputDialog(null,"Digite uma palavra/frase"); 
       
       //Remove espa�os, pontua��o e caracteres especiais
       String palavrafiltrada = palavra.toUpperCase().replace(" ", "").replace("-", "").replace("/", "").replace(".", "").replace(",", "").replace("\'", "").replace("!", "");

       //tamanho recebe o qtd de letras q possui a palavra
       tamanho=palavrafiltrada.length(); 
       
       
       //pega a ultima letra da variavel palavra, e inseri na primeira de palavraInvertida, depois pega penultima e inseri na 2�, e assim em diante, at� pegar a primeira, e colocar na ultima.
       for(i=tamanho-1;i>=0;i--){  
           palavraInvertida += palavrafiltrada.charAt(i);
        }
        

       //Compara as Duas Strings e Exibe o Resultado
       if(palavrafiltrada.equals(palavraInvertida)) 
            JOptionPane.showMessageDialog(null,palavra + " � uma palavra/frase palindroma"); 
       else 
            JOptionPane.showMessageDialog(null,palavra + " N�o � uma palavra/frase palindroma"); 

       
}
    
}
