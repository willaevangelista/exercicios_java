/*
 * Exercício: Contador de Vogais
 * 
 * Descrição:
 * 
 * Implemente um método em Java que receba uma String e retorne a quantidade total de vogais presentes no texto. Para este exercício, considere apenas as letras a, e, i, o e u, tanto em maiúsculo quanto em minúsculo. Vogais acentuadas não devem ser consideradas.
 * 
 * Regras:
 * 
 * - Espaços em branco, números, símbolos e caracteres especiais devem ser ignorados.
 * - O método deve se chamar contarVogais e receber uma String como parâmetro, retornando um int.
 * - O método deve retornar 0 caso a entrada seja uma String vazia ou null.
 * - Não é permitido o uso de expressões regulares nem de classes utilitárias externas (como Stream ou Pattern).
 * 
 * Exemplos de entrada e saída esperada:
 * 
 * - Entrada: "Olá, mundo!"
 * - Saída: 3  // Vogais válidas: o, a, u
 * 
 * - Entrada: "Java é TOP"
 * - Saída: 3  // Vogais válidas: a, a, o
 * 
 * - Entrada: "123 !@#"
 * - Saída: 0
 * 
 * - Entrada: ""
 * - Saída: 0
 * 
 * - Entrada: null
 * - Saída: 0
 * 
 * Instruções adicionais:
 * 
 * A solução deve priorizar clareza e legibilidade. Comentários explicativos são bem-vindos. Escreva também um pequeno trecho de código demonstrando a chamada do método e a impressão do resultado no console.
 */


package javaexercicios;

import java.util.Scanner;

public class Exercicio12 {
	
	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		
		System.out.println("Bem vindo(a) ao Contador de Vogais!");
		System.out.println("Por favor, informe um texto:");
		String textoInformado = leia.nextLine(); 
		System.out.println("Vogais válidas: " + contadorDeVogais(textoInformado));
		
		leia.close();
		
	}
	
	public static int contadorDeVogais(String textoInformado) {
		

		if (textoInformado == null) return 0;
		
		int contador = 0;
		textoInformado = textoInformado.toLowerCase();
		
		for (int i = 0; i < textoInformado.length(); i++) {
			char contagem = textoInformado.charAt(i);
			if (contagem == 'a' || contagem == 'e' || contagem == 'i' || contagem == 'o' || contagem == 'u') {
				contador++;
			}
			
		}
		
		return contador;
		
	}

}
