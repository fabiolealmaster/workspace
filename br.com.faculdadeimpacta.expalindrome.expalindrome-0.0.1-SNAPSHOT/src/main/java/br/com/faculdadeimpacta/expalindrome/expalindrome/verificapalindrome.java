//Atividade 01  - Fábio Oliveira Leal - RA: 1900244
//Como usuário gostaria de uma funcionalidade que valide se uma frase ou palavra é
//palíndromo.
//Critérios de aceite:

//Verdadeiro:
//• “Rotator”
//• “bob”
//• “madam”
//• “mAlAyAlam”
//• “1”
//• “Able was I, ere I saw Elba”
//• “Madam I'm Adam”
//• “Step on no pets.”
//• “Top spot!”
//• “02/02/2020”

//Falso:
//• “xyz”
//• “elephant”
//• “Country”
//• “Top . post!”
//• “Wonderful-fool”
//• “Wild imagination!”

//O componente deve receber os exemplos acima e retornar verdadeiro ou falso, conforme a
//regra. Fazer o componente usando a metodologia TDD.
//Enviar a URL do Github com todo o código fonte.

package main.java.br.com.faculdadeimpacta.expalindrome.expalindrome;

public class verificapalindrome {

    public boolean ehPalindromo(String frase) {

        String fraseFiltrada = frase.toUpperCase().replace(" ", "").replace("-", "").replace("/", "").replace(".", "").replace(",", "").replace("\'", "").replace("!", "");
        for(int i = 0; i < fraseFiltrada.length(); i++) {
            if(fraseFiltrada.charAt(i) != 
                    fraseFiltrada.charAt(fraseFiltrada.length() -(i+1))) {
                return false;
            }
        }

        return true;
    }
}
