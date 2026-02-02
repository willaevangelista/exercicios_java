/*
 * Desafio Técnico – Etapa 2: Processamento de Coleções com Stream API
 *
 * Contexto:
 * Em um módulo de pré-processamento de dados de usuários, o sistema recebe uma lista fixa
 * de nomes cadastrados manualmente para testes internos. Antes de exibir ou persistir esses
 * dados, é necessário aplicar algumas regras de filtragem e transformação utilizando a
 * Stream API do Java, garantindo legibilidade e código funcional.
 *
 * Tarefa:
 * Implemente um metodo chamado processarNomes que:
 * 1. Crie internamente uma lista imutável usando List.of com até 10 nomes (String).
 * 2. Utilize Stream API para filtrar, transformar e coletar os dados conforme os requisitos.
 *
 * Requisitos técnicos:
 * - O metodo deve ser implementado em Java.
 * - É obrigatório o uso de:
 *   - .stream()
 *   - .filter()
 *   - Pelo menos um metodo intermediário adicional (ex: map, sorted, distinct, limit, etc).
 * - Não utilizar loops tradicionais (for, while).
 * - Não modificar a lista original.
 *
 * Regras de processamento:
 * - Considere apenas nomes com mais de 4 caracteres.
 * - Ignore nomes que comecem com a letra "A" (maiúscula ou minúscula).
 * - Converta os nomes restantes para letras maiúsculas.
 * - Ordene o resultado final em ordem alfabética.
 *
 * Saída esperada:
 * - O metodo deve retornar uma List<String> contendo os nomes já processados.
 *
 * Exemplo conceitual:
 * Lista original:
 * ["Ana", "Carlos", "alice", "Bruno", "Fernanda"]
 *
 * Resultado final:
 * ["BRUNO", "CARLOS", "FERNANDA"]
 *
 * Critérios de avaliação:
 * - Uso correto da Stream API.
 * - Clareza na composição da pipeline (ordem correta de filter, map, etc).
 * - Código limpo e legível.
 * - Boa escolha de nomes de métodos e variáveis.
 */

package javaexercicios;

import java.util.List;

public class Exercicio14 {

    public static void main(String[] args) {

        processarNomes();

    }

    public static List<String> processarNomes() {

        List<String> nomes = List.of("Willa", "Ana", "Lia", "Bruna", "Camila", "Fernanda", "Aline", "Juliana", "Verônica", "Amanda");

        System.out.println("Lista original: \n" + nomes);

        List<String> resultado =
                nomes.stream()
                        .filter(nome -> !nome.startsWith("A"))
                        .filter (nome -> nome.length() > 4)
                        .map(String::toUpperCase)
                        .sorted()
                        .toList();

        System.out.println("Resultado Final: \n" + resultado);

        return resultado;

    }

}