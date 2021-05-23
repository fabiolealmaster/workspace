//Fábio Oliveira Leal - RA: 1900244 - Exercício 2 Rest Assured e Junit
//Acesse o seguinte endereço: 
//https://github.com/public-apis/public-apis 
// 
//- Escolha uma API para consumir, caso queira usar outra que não está na lista, pode mudar, desde que seja uma API pública  
//- Crie um projeto com RestAssured e JUnit  
//- Crie um teste de sucesso validando o http status code e o conteúdo retornado pela API com Assert  
//- Crie um teste de falha validando o http status code com Assert  
//- Subir o código no Github e enviar no classroom (atividade individual ou em grupo)

package br.com.faculdadeimpacta.exercicio02.TesteAPI;

 
import org.junit.jupiter.api.Test;

import io.restassured.response.Response;

import static io.restassured.RestAssured.*;
import static io.restassured.RestAssured.given;



public class TesteAPICat {
	
	@Test
	public void cadastroSucesso() {
		String url = "https://api.thecatapi.com/v1/user/passwordlesssignup";
		String corpo = "{\"email\": \"yugioh.parte3@gmail.com\", \"appDescription\": \"Exercicio de pos graduação\"}";
		
		Response response = given()
                .relaxedHTTPSValidation()
                .body(corpo)
                .with()
                .contentType("application/json")
                .when()
                .post(url);
		
		response.then().statusCode(200);
			
		System.out.println("RETORNO => " + response.body().asString());
	
		
	}
	
	@Test
	public void cadastroFalha() {
		String url = "https://api.thecatapi.com/v1/user/passwordlesssignup";
		String corpo = "{\"email\": \"fabioleal@msn.com\", \"appDescription\": \"Exercicio de pos graduação\"}";
		
		Response response = given()
                .relaxedHTTPSValidation()
                .body(corpo)
                .with()
                .contentType("application/json")
                .when()
                .post(url);
		
		response.then().statusCode(400);
			
		System.out.println("RETORNO => " + response.body().asString());
	
		
	}

	
	
}
