
/*
 * Você comprou um novo laptop gamer e gosta de jogar nele o dia todo. Devido ao alto uso de gráficos, ele precisa ser carregado frequentemente. Agora, você quer saber quanta bateria restará após uma sequência de eventos de uso e carregamento.

Problema:

Escreva uma função que receba n registros representando o consumo de bateria e os eventos de carregamento.

Um valor positivo indica minutos carregando o laptop.
Um valor negativo indica minutos jogando (o laptop consome 1% de bateria por minuto).
A bateria não pode ultrapassar 100%.
A carga inicial da bateria é 50%.
A função deve retornar a porcentagem final da bateria após todos os eventos.

Exemplo:

Entrada:
n = 4
eventos = [10, -20, 61, -15]

Processo:

Carga inicial: 50%
Evento [0] → 10 minutos carregando → 50% + 10% = 60%
Evento [1] → 20 minutos jogando → 60% - 20% = 40%
Evento [2] → 61 minutos carregando → 40% + 61% = 100% (limite máximo)
Evento [3] → 15 minutos jogando → 100% - 15% = 85%
Saída esperada:
85

Descrição da função:

Complete a função getBattery, que deve retornar um número inteiro representando a porcentagem final da bateria.

Parâmetro:

eventos: uma lista de n números inteiros, onde cada elemento representa um evento de carregamento (+) ou consumo de bateria (-). Exemplo: eventos [eventos [0],..., eventos [n-1]]: uma matriz de números inteiros
 * */


// CODIGO INICIAL 

/*package javaExercicios;

import java.util.Scanner;

public class Exercicio1 {
	
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		// VARIAVEIS
		int numeroEventos = 0;
		int numeroInformado; // variavel de apoio
		int bateriaAtual = 50; // bateria inicial em 50%
		int consumo = 0;
		int carregamento = 0;
		
			
			// SOLICITAR INFORMACOES DO USUARIO
			System.out.println("Por favor, informe o número de eventos que você deseja registrar nesse sistema");
			numeroEventos = leia.nextInt();
			System.out.println("Informe quanto tempo você jogou/carregou o laptop. Considere que números negativos serão interpretados como tempo jogando no laptop enquanto números positivos serão interpretados como tempo de carregamento do laptop.");
		
		// SE BATERIA ENTRE 0 E 100
		if (bateriaAtual >= 0 && bateriaAtual <= 100) {
		
			// LOOP NAS N VEZES INFORMADAS PELO USUARIO
			for (int i = 0; i < numeroEventos; i++) {
				
				numeroInformado = leia.nextInt(); // registro dos dados passados pelo usuario
				
				if (numeroInformado > 0) {
					
					carregamento += numeroInformado; // se numero positivo, soma o valor na variavel de carregamento
					
				} else {			
					consumo += numeroInformado; // se numero negativo, soma o valor na variavel de consumo	
				}
				
				int bateriaTotal = bateriaAtual + carregamento + consumo; 
				
				if (bateriaTotal > 100) {
					
					bateriaTotal = 100;
					
				} else if (bateriaTotal < 0) {
					
					bateriaTotal = 0;
				}
				
				System.out.println("Bateria Total: " + bateriaTotal + "%");
			}				
			
		} else {
			
			System.out.println("Erro");
		}
		
		leia.close();
}
 * */


// CODIGO REFATORADO 

/*package javaExercicios;

import java.util.Scanner;

public class Exercicio1 {
	
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		// VARIAVEIS
		int numeroEventos = 0;
		int numeroInformado; // variavel de apoio
		int bateriaAtual = 50; // bateria inicial em 50%
		
			// SOLICITAR INFORMACOES DO USUARIO
			System.out.println("Por favor, informe o número de eventos que você deseja registrar nesse sistema");
			
			numeroEventos = leia.nextInt();
			
			System.out.println("Informe quanto tempo você jogou/carregou o laptop. Considere que números negativos serão interpretados como tempo jogando no laptop enquanto números positivos serão interpretados como tempo de carregamento do laptop.");
		
		// SE BATERIA ENTRE 0 E 100
			// LOOP NAS N VEZES INFORMADAS PELO USUARIO
			
			for (int i = 0; i < numeroEventos; i++) {
				
				numeroInformado = leia.nextInt(); // registro dos dados passados pelo usuario
				
				bateriaAtual += numeroInformado; // atualizacao da bateria atual conforme dados passados
				
				if (bateriaAtual > 100) {
					
					bateriaAtual = 100;
					
				} else if (bateriaAtual < 0) {
					
					bateriaAtual = 0;
				}
			
				System.out.println("Bateria Total: " + bateriaAtual + "%");	
			}
			
		leia.close();

	}
}
*/

//CODIGO DO EXERCICIO

package javaexercicios.exercicios01a10;

import java.util.Scanner;

public class Exercicio01 {

    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        System.out.println("Por favor, informe o número de eventos que você deseja registrar nesse sistema:");
        int numeroEventos = leia.nextInt();

        int bateriaAtual = 50; // bateria inicial em 50%

        bateriaAtual = getBattery(leia, bateriaAtual, numeroEventos);

        System.out.println("\nBateria Total: " + bateriaAtual + "%");

        leia.close();
    }

    public static int getBattery(Scanner leia, int bateriaAtual, int numeroEventos) {

        int numeroInformado;

        System.out.println("Informe quanto tempo você jogou/carregou o laptop. Considere que números negativos serão interpretados como tempo jogando no laptop enquanto números positivos serão interpretados como tempo de carregamento do laptop.");

        // LOOP NAS N VEZES INFORMADAS PELO USUARIO
        for (int i = 0; i < numeroEventos; i++) {

            numeroInformado = leia.nextInt(); // registro dos dados passados pelo usuario

            bateriaAtual += numeroInformado; // atualizacao da bateria atual conforme dados passados

            if (bateriaAtual > 100) {
                bateriaAtual = 100;
            } else if (bateriaAtual < 0) {
                bateriaAtual = 0;
            }

            System.out.println("Bateria atual: " + bateriaAtual + "%");
        }

        return bateriaAtual;
    }
}
