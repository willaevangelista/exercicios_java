/*
 * Implemente uma solução em sua linguagem de preferência que atenda ao seguinte requisito de negócio:
 * 
 * Desenvolva um algoritmo que receba um número inteiro fornecido pelo usuário. A aplicação deve exibir como resultado o valor imediatamente anterior (antecessor) e o valor imediatamente seguinte (sucessor) ao número informado.
 * 
 * Critérios de avaliação:
 * - Clareza e organização do código
 * - Nomeação adequada de variáveis
 * - Uso correto de entrada e saída de dados
 * - Correta implementação da lógica solicitada
 * - Boas práticas gerais de programação
 * 
 * Exemplo de entrada:
 * - Número informado: 10
 * 
 * Saída esperada:
 * - Antecessor: 9
 * - Sucessor: 11
 * */

package javaexercicios;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercicio09 {
	
	public static void main (String[] args) {
		
		Scanner leia = new Scanner (System.in);
		
		System.out.println("Bem vindo(a) ao Calculador de Antecessores e Sucessores!\n");
		
		boolean entradaValida = false;
		
		while(!entradaValida) {
			try {
				
				System.out.println("Por favor, informe um número inteiro: ");
				int numeroInformado = leia.nextInt();
				
				System.out.println("Antecessor: " + calcularAntecessor(numeroInformado));
				System.out.println("Sucessor: " + calcularSucessor(numeroInformado));
				
				entradaValida = true;
				
			} catch (InputMismatchException e) {
				
				System.out.println("Informe somente números inteiros!\n");
				leia.nextLine();
				
			}
		}
		
		leia.close();
	};
	
	public static int calcularAntecessor(int numeroInformado) {
		int antecessor = numeroInformado - 1;
		return antecessor;
	};
	
	public static int calcularSucessor(int numeroInformado) {
		int sucessor = numeroInformado + 1;
		return sucessor;
	};

}
