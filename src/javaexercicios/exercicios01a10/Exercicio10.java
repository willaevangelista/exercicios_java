/*
 * Contexto:
 * Você está participando de um processo seletivo para uma vaga de Desenvolvedor(a) Júnior em uma fintech voltada à educação financeira da população brasileira. Um dos objetivos da equipe é desenvolver ferramentas simples que ajudem os usuários a entender melhor sua condição financeira.
 * 
 * Desafio:
 * Implemente um algoritmo que receba como entrada apenas o valor do salário de um usuário. Considere o salário mínimo vigente fixo no valor de R$ 1.518,00. Seu programa deve calcular e exibir quantos salários mínimos essa pessoa recebe.
 * 
 * Requisitos:
 * - O salário mínimo deve ser armazenado em uma variável constante.
 * - O valor do salário do usuário deve ser informado via entrada do programa.
 * - O resultado deve ser apresentado com duas casas decimais e de forma clara para o usuário final.
 * Utilize boas práticas de codificação e, se possível, trate entradas inválidas.
 * 
 * Exemplo de saída esperada:
 * Com um salário de R$ 3.036,00, você recebe 2,00 salários mínimos.
 */

package javaexercicios.exercicios01a10;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercicio10 {
	
	public static void main(String[] main) {
		
		Scanner leia = new Scanner (System.in);
		
		boolean entradaValida = false;
		
		while(!entradaValida) {
			try {
				
				System.out.println("Informe o seu salário: ");
				float salarioInformado = leia.nextFloat();
				
				System.out.printf("Com um salário de R$ %.2f, você recebe %.2f salários mínimos.%n", salarioInformado, calcularSalario(salarioInformado));
				
			} catch (InputMismatchException e) {
				
				System.out.println("Por favor, informe um número!");
				leia.nextLine();
				
			}
		}
		
		leia.close();
		
	};
	
	public static float calcularSalario(float salarioInformado) {
		
		float quantidadeSalarios = salarioInformado / 1518;
		
		return quantidadeSalarios;
		
	};

}
