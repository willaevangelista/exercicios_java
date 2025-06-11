/*
 * Desafio Técnico – Cálculo de Reajuste Percentual
 * 
 * Objetivo:
 * Desenvolver uma aplicação que simule uma operação de reajuste percentual em um sistema financeiro ou comercial.
 * 
 * Descrição do desafio:
 * Implemente um algoritmo que receba como entrada um valor numérico decimal (por exemplo, o preço de um produto ou o valor de um salário). A aplicação deve calcular um reajuste positivo de 5% sobre esse valor e, ao final, imprimir o valor original e o valor reajustado.
 * 
 * Critérios de avaliação:
 * - Clareza e organização do código
 * - Correta implementação da lógica de reajuste
 * - Nomeação apropriada de variáveis
 * - Boas práticas de entrada e saída de dados
 * - Legibilidade e boas práticas gerais
 * 
 * Exemplo de entrada:
 * - Valor informado: 200.00
 * 
 * Saída esperada:
 * - Valor original: 200.00
 * - Valor com reajuste de 5%: 210.00
 * */

package javaexercicios;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercicio11 {
	
	public static void main (String[] args) {
		
		Scanner leia = new Scanner (System.in);
		
		boolean entradaValida = false;
		
		while(!entradaValida) {
			try {
				
				System.out.println("Por favor, informe um número: ");
				
				float numeroInformado = leia.nextFloat();
				
				System.out.printf("Valor original: %.2f\nValor com reajuste de 5%%: %.2f%n", numeroInformado, acrescimoPercentual(numeroInformado));
				
				entradaValida = true;
				
			} catch (InputMismatchException e) {
				
				System.out.println("Por favor, informe somente números!\n");
				leia.nextLine();
				
			}
		}
		
		leia.close();
		
	};
	
	public static double acrescimoPercentual(float numeroInformado) {
		
		double numeroAcrescido = numeroInformado * 1.05;
		
		return numeroAcrescido;
		
	};

}
