/*
 * Problema: Conversor de Temperatura

Sua tarefa é implementar um programa que realize a conversão de temperatura entre Fahrenheit e Celsius.

Requisitos:
O programa deve solicitar ao usuário a entrada de uma temperatura em Fahrenheit.

O programa deve converter a temperatura para Celsius utilizando a seguinte fórmula:
C = (5 * (F - 32)) / 9

O programa deve exibir ambas as temperaturas com duas casas decimais, utilizando o seguinte formato:
"Fahrenheit: <valor>°F | Celsius: <valor>°C"

Caso a entrada seja inválida (não numérica), o programa deve exibir uma mensagem de erro e solicitar a entrada novamente.

A lógica de conversão deve ser implementada em um método separado, que receba como parâmetro a temperatura em Fahrenheit e retorne a temperatura correspondente em Celsius.

Não é permitido usar bibliotecas externas para a conversão.

O código deve ser legível, modular e seguir boas práticas de desenvolvimento.
 */

package javaexercicios;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercicio5 {
	
	public static void main (String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Bem-vindo(a) ao Conversor de Temperatura de Fahrenheit para Celcius!\n");	
		System.out.println("Por favor, informe a temperatura em Fahrenheit a ser convertida:");
		
		boolean entradaValida = false;
		
		while (!entradaValida) {
			
			try {
				
				float temperaturaFahrenheit = leia.nextFloat();
				
				converterTemperatura(temperaturaFahrenheit);
				
				entradaValida = true;
				
			} catch (InputMismatchException e) {
				
				System.out.println("Por favor, informe somente números. Informe novamente temperatura em Fahrenheit a ser convertida:");
				leia.nextLine(); // Descarta a linha no buffer após entrada inválida (não numérica), que gerou exceção no nextInt, para evitar leitura repetida do mesmo dado incorreto.
				
			};
			
		}
		
		leia.close();
		
	}
	
	public static void converterTemperatura(float temperaturaFahrenheit) {
		
		float temperaturaCelsius = (5 * (temperaturaFahrenheit - 32))/ 9;
		
		System.out.println();
		System.out.println("Resultado");
		System.out.printf("Fahrenheit = %.2f °F\n", temperaturaFahrenheit);
		System.out.printf("Celsius = %.2f °C\n", temperaturaCelsius);
		
	}

}
