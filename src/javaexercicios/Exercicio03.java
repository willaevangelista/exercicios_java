/*
 * Desafio Técnico - Lógica de Programação
 * 
 * Problema: Tabuada Completa
 * 
 * Descrição:
 * 
 * Sua tarefa é desenvolver um algoritmo que imprima na tela a tabuada completa dos números de 1 a 10. A saída deve apresentar, para cada número de 1 a 10, a multiplicação deste número por todos os valores de 1 a 10, no seguinte formato:
 * 
 * Tabuada do 1
 * 1 x 1 = 1  
 * 1 x 2 = 2  
 * ...  
 * 1 x 10 = 10  
 * 
 * Tabuada do 2  
 * 2 x 1 = 2  
 * 2 x 2 = 4  
 * ...  
 * 2 x 10 = 20  
 * 
 * ...  
 * Tabuada do 10  
 * 10 x 1 = 10  
 * 10 x 2 = 20  
 * ...  
 * 10 x 10 = 100
 * 
 * Requisitos:
 * 
 * O algoritmo deve utilizar estruturas de repetição.
 * 
 * A tabuada deve ser exibida de forma organizada e legível, conforme o exemplo acima.
 * 
 * O código deve ser escrito em uma das seguintes linguagens: Python, Java ou JavaScript (escolha a que preferir).
 * 
 * Não é permitido o uso de bibliotecas externas para gerar a tabuada.
 * 
 * 
 * Critérios de Avaliação:
 * 
 * Correção da lógica e do resultado apresentado.
 * 
 * Clareza e organização do código.
 * 
 * Uso adequado das estruturas de repetição.
 * 
 * Boas práticas de programação (nomes de variáveis, indentação, comentários se necessário).
 * 
 * Dica: Pense em como estruturar dois laços de repetição aninhados para resolver o problema de forma eficiente.
 * 
 * Nível de dificuldade: Fácil para quem domina estruturas de repetição.
 * 
 * Boa sorte!
 */


package javaexercicios;

public class Exercicio03 {
	
	public static void main (String[] args) {
		
		gerarTabuada();
		
	}
	
	public static void gerarTabuada() {
		
		for (int i = 1; i <= 10; i++) {
			
			System.out.println();
			System.out.println("Tabuada do " + i);
			
			for (int j = 1; j <= 10; j++) {
				
				System.out.println(i + " x " + j + " = " + (i * j));
				
			}
			
		}
		
	}

}
