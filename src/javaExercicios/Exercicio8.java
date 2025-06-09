/*
 * Implemente uma solução em sua linguagem de preferência que atenda ao seguinte requisito de negócio:

Desenvolva um algoritmo que receba dois números inteiros, representados pelas variáveis A e B. O comportamento esperado da aplicação é o seguinte:

Caso A e B sejam iguais, realize a soma entre os dois valores.

Caso A e B sejam diferentes, realize a multiplicação entre os dois valores.

Em ambos os casos, o resultado da operação deve ser armazenado na variável C, e ao final da execução, o valor de C deve ser impresso na tela.

Critérios de avaliação:

Clareza e organização do código

Utilização adequada de estruturas de controle

Boas práticas de programação (legibilidade, nomeação de variáveis, etc.)

Correta implementação da lógica descrita

Exemplo de entrada e saída esperada:

Entrada:
A = 5
B = 5

Saída:
C = 10

---

Entrada:
A = 3
B = 4

Saída:
C = 12
 */

package javaexercicios;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercicio8 {
	
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		boolean entradaValida = false;
		
		while (!entradaValida) {
			try {
				
				System.out.println("Informe o 1º número: ");
				int numeroA = leia.nextInt();
				
				System.out.println("Informe o 2º número: ");
				int numeroB = leia.nextInt();
				
				int numeroC = calcularResultado(numeroA, numeroB);
				
				System.out.println("C = " + numeroC);
				
				entradaValida = true;
				
			} catch (InputMismatchException e) {
				
				System.out.println("Por favor, informe somente números inteiros!");
				leia.nextLine();
				
			};
		}
		
		leia.close();
	};
	
	public static int calcularResultado(int numeroA, int numeroB) {
		
		if (numeroA == numeroB) {
			return numeroA + numeroB;
			
		} else {
			return numeroA * numeroB;
		}
		
	};

}
