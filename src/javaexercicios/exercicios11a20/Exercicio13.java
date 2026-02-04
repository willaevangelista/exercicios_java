/*
 * Desafio Técnico – Etapa 1: Manipulação de Strings
 * 
 * Contexto:
 * Durante o desenvolvimento de um sistema de logging interno, foi identificado que, por segurança e análise reversa, alguns dados textuais precisam ser invertidos antes de serem armazenados temporariamente. Para isso, você foi designada para implementar uma função utilitária que realize essa tarefa de forma eficiente.
 * 
 * Tarefa:
 * Implemente um método chamado invertString, responsável por receber uma string como parâmetro e retornar essa mesma string invertida.
 * 
 * Requisitos técnicos:
 * - O método deve ser implementado preferencialmente em Java, mas outras linguagens também serão aceitas se justificadas.
 * - A solução deve ser clara, legível e com boa nomeação de variáveis.
 * 
 * Exemplo de entrada e saída esperada:
 * - Entrada:  "Generation"
 * - Saída:    "noitareneG"
 * 
 * Critérios de avaliação:
 * - Correção e funcionamento da solução.
 * - Legibilidade do código.
 * - Simplicidade e eficiência da lógica aplicada.
 * - Estruturação e boas práticas de codificação.
 */

package javaexercicios.exercicios11a20;

import java.util.Scanner;

public class Exercicio13 {
	
	public static void main (String[] args) {
		
		Scanner leia = new Scanner (System.in);
		
		System.out.println("Bem vindo(a) ao Inversor de Caracteres!");
		System.out.println("Por favor, digite seu texto: ");
		String textoInformado = leia.nextLine();
		
		System.out.println(inverterString(textoInformado));
		
		leia.close();		
	}
	
	public static String inverterString(String textoInformado) {
	    return new StringBuilder(textoInformado).reverse().toString();
	}

}
