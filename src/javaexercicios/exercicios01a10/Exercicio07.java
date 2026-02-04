/*
 * Desenvolva um programa em Java que receba um número inteiro e realize as seguintes verificações:
 * 
 * Função 1: Verificar Par ou Ímpar
 * Crie uma função chamada verificarParImpar que:
 * 
 * Receba um número inteiro como parâmetro.
 * 
 * Imprima diretamente:
 * 
 * "O número X é Par!" se o número for divisível por 2.
 * "O número X é Ímpar!" caso contrário.
 * 
 * Função 2: Verificar Positivo ou Negativo
 * Crie uma função chamada verificarPositivoNegativo que:
 * 
 * Receba um número inteiro como parâmetro.
 * 
 * Imprima diretamente:
 * 
 * "O número X é Positivo!" se o número for maior que zero.
 * 
 * "O número X é Negativo!" se o número for menor que zero.
 * 
 * "O número X é Zero!" se o número for igual a zero.
 * 
 * Entrada:
 * O programa deve receber um número inteiro (numero) como entrada.
 * 
 * Saída:
 * As funções devem imprimir os resultados diretamente, no formato:
 * 
 * text
 * O número [X] é [Par/Ímpar]!
 * O número [X] é [Positivo/Negativo/Zero]!
 * 
 * Exemplos:
 * Para numero = 5:
 * 
 * text
 * O número 5 é Ímpar!
 * O número 5 é Positivo!
 * Para numero = -2:
 * 
 * text
 * O número -2 é Par!
 * O número -2 é Negativo!
 * 
 */


package javaexercicios.exercicios01a10;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercicio07 {
	
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Bem-vindo(a) ao verificador de números pares, ímpares, positivos e negativos!\n");
		
		System.out.println("Por favor, informe um número: ");
		
		boolean entradaValida = false;
		
		while (!entradaValida) {
			
			try {
				
				int numeroInformado = leia.nextInt();
				
				verificarParImpar(numeroInformado);
				
				verificarPositivoNegativo(numeroInformado);
				
				entradaValida = true;
				
			} catch (InputMismatchException e) {
				
				System.out.println();
				
				System.out.println("Você não informou um número válido.");
				
				System.out.println("Por favor, informe um número novamente: ");
				leia.nextLine();
				
			};
			
		};
	
		
		leia.close();
		
	};
	
	public static void verificarParImpar(int numeroInformado) {
		
		if (numeroInformado % 2 == 0) {
			
			System.out.println("O número " + numeroInformado + " é par!");
			
		} else {
			
			System.out.println("O número " + numeroInformado + " é ímpar!");
			
		}
		
	};
	
	public static void verificarPositivoNegativo(int numeroInformado) {
		if (numeroInformado > 0) {
			
			System.out.println("O número " + numeroInformado + " é positivo!");
			
		
		} else if (numeroInformado < 0) {
				
				System.out.println("O número " + numeroInformado + " é negativo!");
			
		} else {
			
			System.out.println("O número " + numeroInformado + " é zero!");
			
		};
	};

}
