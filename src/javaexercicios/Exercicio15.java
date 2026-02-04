/*
 * Desafio Técnico: Validação e Normalização de Dados de Produtos
 *
 * Contexto:
 * Durante a implementação de um módulo de importação de dados, o sistema recebe uma lista
 * fixa de nomes de produtos usados apenas para testes locais. Esses dados chegam com
 * inconsistências de capitalização, espaços extras e duplicidades. Antes de seguir para
 * qualquer processamento posterior, é necessário normalizar e validar esses dados.
 *
 * Tarefa:
 * Implemente um metodo chamado normalizarProdutos que:
 * 1. Crie internamente uma lista imutável usando List.of com até 10 nomes de produtos.
 * 2. Utilize Stream API para aplicar as regras de validação e normalização descritas abaixo.
 *
 * Requisitos técnicos:
 * - Implementação obrigatória em Java.
 * - Uso obrigatório de:
 *   - .stream()
 *   - .filter()
 *   - .map()
 * - Uso obrigatório de pelo menos UM dos seguintes:
 *   - distinct()
 *   - sorted()
 *   - limit()
 * - Proibido o uso de loops tradicionais (for, while).
 * - A lista criada com List.of não pode ser modificada.
 *
 * Regras de processamento:
 * - Remover espaços em branco no início e no fim de cada nome.
 * - Ignorar produtos com menos de 3 caracteres após o trim.
 * - Converter todos os nomes para letras minúsculas.
 * - Eliminar produtos duplicados.
 * - Retornar no máximo 5 produtos.
 *
 * Saída esperada:
 * - O metodo deve retornar uma List<String> contendo os produtos já normalizados.
 *
 * Exemplo conceitual:
 * Lista original:
 * ["  Arroz ", "Feijão", "arroz", "Óleo", "Sal", "  ", "OVO"]
 *
 * Resultado final:
 * ["arroz", "feijão", "óleo", "sal", "ovo"]
 *
 * Critérios de avaliação:
 * - Pipeline de Stream bem organizada e coerente.
 * - Uso correto de operações intermediárias.
 * - Código limpo, legível e com boa semântica.
 * - Correto entendimento de imutabilidade e streams.
 */


package javaexercicios;

import java.util.List;

public class Exercicio15 {

    public static void main(String[] args) {

        imprimirResultado();

    }

    public static List<String> listaDeProdutos() {
        List<String> produtos = List.of(
                "  Arroz  ",
                "Feijão",
                "arroz",
                " ÓLEO",
                "Sal",
                "  sal ",
                "OVO",
                "  ",
                "Leite",
                "leite "
        );

        return produtos;
    }

    public static List<String> normalizarProdutos() {

        return listaDeProdutos().stream() // modo difrerente de percorrer uma lista, sem usar o for
                                .map(String::trim) // remove espaços em branco no começo e final da string
                                .filter(nome -> nome.length() >= 3) // filtra todos os nomes de produtos com mais de 3 caracteres
                                .map(String::toLowerCase) // deixa tudo em minúsculo
                                .distinct() // remove duplicatas
                                .sorted() // ordena em ordem alfabética
                                .limit(5) // mostra somente os 5 primeiros itens
                                .toList();
    }

    public static void imprimirResultado() {

        System.out.println("Lista original: \n" + listaDeProdutos());
        System.out.println("\n");
        System.out.println("Resultado Final: \n" + normalizarProdutos());

    }
}
