/*
 * Você vai fazer uma viagem de carro e quer saber quantos litros de combustível serão gastos.

Problema:
Escreva uma função que receba o tempo de viagem (em horas) e a velocidade média (em km/h).

Com base nesses valores, calcule:
- A distância total percorrida.
- A quantidade de litros de combustível gastos, sabendo que o carro faz 12 km por litro.

A função deve exibir:
- O tempo da viagem.
- A velocidade média.
- A distância total percorrida.
- A quantidade de litros consumidos na viagem.

Fórmulas:
- Distância = tempo × velocidade
- Litros usados = distância ÷ 12

Exemplo:

Entrada:
- tempo = 2 horas
- velocidade = 60 km/h

Processo:
- Distância = 2 × 60 = 120 km
- Litros usados = 120 ÷ 12 = 10 litros

Saída esperada:
- Tempo: 2 horas
- Velocidade média: 60 km/h
- Distância percorrida: 120 km
- Litros consumidos: 10 litros

Descrição da função:
Complete a função calcularConsumo, que deve:
- Receber dois parâmetros: o tempo de viagem (float ou int) e a velocidade média (float ou int).
- Exibir as quatro informações solicitadas.

Parâmetros:
- tempo: número representando o tempo da viagem em horas.
- velocidade: número representando a velocidade média em km/h.
 */

package javaexercicios;

import java.util.Scanner;

public class Exercicio02 {

    public static void main (String[] args) {

        Scanner leia = new Scanner(System.in);

        System.out.println("Por favor, informe o tempo de viagem (em horas):");

        float tempoViagem = leia.nextFloat();

        System.out.println("Por favor, informe a velocidade média do veículo (em km/h):");

        float velocidadeMedia = leia.nextFloat();

        float distancia = calcularDistancia(tempoViagem, velocidadeMedia);

        float litros = calcularConsumo(distancia);

        System.out.println(
            "Tempo: " + tempoViagem + " horas \n" +
            "Velocidade média: " + velocidadeMedia + " km/h \n" +
            "Distância percorrida: " + distancia + " km \n" +
            "Litros consumidos: " + litros + " litros"
       );

       leia.close();

    }

    public static float calcularDistancia (float tempoViagem, float velocidadeMedia) {

        float distanciaPercorrida = tempoViagem * velocidadeMedia;

        return distanciaPercorrida;

    }

    public static float calcularConsumo (float distanciaPercorrida) {

        float litrosConsumidos = distanciaPercorrida / 12;

        return litrosConsumidos;
        
    }

}