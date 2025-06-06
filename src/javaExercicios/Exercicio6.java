/*
 * Implemente um algoritmo que leia três valores inteiros: A, B e C. O programa deve calcular a soma entre A e B e, em seguida, verificar se o resultado é menor que o valor de C.
 * 
 * Entrada:
 * 
 * Três números inteiros, representando os valores de A, B e C. Cada valor será informado em uma linha separada.
 * 
 * Saída: 
 * 
 * Imprima duas linhas:
 * 
 * - A primeira linha deve exibir a soma de A e B, no formato:
 * - Soma: X
 * - (onde X é o valor da soma).
 * 
 * A segunda linha deve informar se a soma é menor que C, no seguinte formato:
 * 
 * - A soma de A e B é menor que C
 * - ou
 * - A soma de A e B não é menor que C
 * 
 * Exemplo de Entrada:
 * 
 * - A = 5  
 * - B = 3  
 * - C = 10
 * 
 * Exemplo de saída:
 * 
 * - Soma: 8  
 * - A soma de A e B é menor que C
 * 
 * */

package javaexercicios;

import java.util.Scanner;

public class Exercicio6 {
	
	public static void main (String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Bem vindo(a) ao Comparador de 3 números!\n");
		
		System.out.println("Informe o número A: ");
		int numeroA = leia.nextInt();
		
		System.out.println("Informe o número B: ");
		int numeroB = leia.nextInt();
		
		System.out.println("Informe o número C: ");
		int numeroC = leia.nextInt();
		
		compararNumeros(numeroA, numeroB, numeroC);
		
		leia.close();
		
	};
	
	public static void compararNumeros(int numeroA, int numeroB, int numeroC) {
		
		int soma = numeroA + numeroB;
		
		
		System.out.println("\nSoma: " + soma);
		
		if (soma < numeroC) {
			
			System.out.println("A soma de A e B é menor que C");
			
		} else {
			
			System.out.println("A soma de A e B não é menor que C");
			
		}
		
	};

}
