/*
 * Desenvolva um algoritmo que solicite ao usuário a entrada de um número inteiro.
Em seguida, o programa deverá calcular e exibir na tela a tabuada completa desse número, apresentando os resultados das multiplicações de 1 até 10.

Requisitos:
O programa deve solicitar a entrada de um número inteiro.

O programa deve exibir, de forma organizada, a multiplicação do número inserido pelos valores de 1 a 10.

Cada linha do resultado deve seguir o formato:
[número] x [fator] = [resultado]

O programa deve encerrar após apresentar a tabuada completa.

Exemplo de execução:

Tabuada do 7:
7 x 1 = 7
7 x 2 = 14
7 x 3 = 21
7 x 4 = 28
7 x 5 = 35
7 x 6 = 42
7 x 7 = 49
7 x 8 = 56
7 x 9 = 63
7 x 10 = 70

 */


package javaexercicios.exercicios01a10;

import java.util.Scanner;

public class Exercicio04 {
	
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Informe o número inteiro o qual será gerada a tabuada: ");
		
		int numeroInformado = leia.nextInt();
		
		gerarTabuada(numeroInformado);
		
		leia.close();
	}
	
	public static void gerarTabuada(int numeroInformado) {
		
		System.out.println();
		System.out.println("Tabuada do " + numeroInformado);
			
			for (int j = 1; j <= 10; j++) {
				System.out.println(numeroInformado + " x " + j + " = " + (numeroInformado * j));
			}

	};

}
