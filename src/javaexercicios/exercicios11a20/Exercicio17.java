/*
 *
 * Desafio Técnico: Avaliação de Solicitações de Crédito
 *
 * Contexto:
 * Um sistema interno de uma empresa precisa analisar solicitações de crédito
 * feitas por clientes. Os dados chegam de forma manual, com possíveis erros,
 * inconsistências e informações incompletas.
 *
 * Antes de qualquer processamento financeiro real, o sistema precisa decidir
 * se uma solicitação deve ser APROVADA, REJEITADA ou ENVIADA PARA ANÁLISE MANUAL.
 *
 * O foco deste desafio NÃO é código, e sim raciocínio lógico, regras de negócio
 * e tomada de decisão.
 *
 * Conceitos trabalhados:
 * Condições
 * Fluxo de decisão
 * Regras de negócio
 * Validação de entrada
 * Priorização de regras
 *
 * Dados de entrada conceituais:
 * Cada solicitação possui:
 * - Id do cliente
 * - Idade
 * - Renda mensal
 * - Possui restrição no nome (true ou false)
 * - Valor solicitado
 *
 * Regras de validação inicial:
 * Uma solicitação é considerada INVÁLIDA se:
 * - Idade for menor ou igual a zero
 * - Renda mensal for menor ou igual a zero
 * - Valor solicitado for menor ou igual a zero
 *
 * Solicitações inválidas devem ser REJEITADAS imediatamente,
 * sem avaliar nenhuma outra regra.
 *
 * Regras de decisão de crédito:
 * Após passar na validação inicial:
 *
 * 1. REJEITAR automaticamente se:
 *    - Possui restrição no nome igual a true
 *
 * 2. APROVAR automaticamente se TODAS as condições forem atendidas:
 *    - Idade maior ou igual a 21
 *    - Renda mensal maior ou igual a 3000
 *    - Valor solicitado menor ou igual a 10 vezes a renda mensal
 *    - Não possui restrição no nome
 *
 * 3. ENVIAR PARA ANÁLISE MANUAL se:
 *    - Não foi rejeitada
 *    - Não atende completamente os critérios de aprovação automática
 *
 * Tarefa obrigatória:
 *
 * Antes de qualquer código, você DEVE:
 *
 * 1. Reescrever o problema em passos claros, como se estivesse explicando
 *    para uma pessoa não técnica.
 *
 * 2. Listar todas as decisões possíveis que o sistema pode tomar
 *    e em qual ordem elas devem ser avaliadas.
 *
 * 3. Explicar, em texto, como o sistema decide entre:
 *    APROVAR
 *    REJEITAR
 *    ANÁLISE MANUAL
 *
 * 4. Justificar a ordem das regras.
 *    Exemplo: por que validar antes de analisar crédito.
 *
 * Proibido nesta fase:
 * - Escrever código
 * - Pensar em if, else, switch ou stream
 * - Pensar em Java, sintaxe ou estrutura de classes
 *
 * Critérios de avaliação:
 * - Clareza de raciocínio
 * - Capacidade de transformar regras em decisões lógicas
 * - Não misturar validação com regra de negócio
 * - Não pular casos extremos
 *
 * Objetivo final:
 * Se você conseguir explicar a solução de forma clara,
 * o código vira apenas consequência.
 */

package javaexercicios.exercicios11a20;

import java.util.List;
import java.util.Map;

public class Exercicio17 {

    public static void main(String []args){
        imprimirResultado();
    }

    public static List<Map<String, Object>> solicitacoes() {
        return List.of(

                Map.of(
                        "id", 1,
                        "idade", 0,
                        "renda", 3000.0,
                        "possuiRestricao", false,
                        "valorSolicitado", 5000.0
                ),

                Map.of(
                        "id", 2,
                        "idade", 30,
                        "renda", -1000.0,
                        "possuiRestricao", false,
                        "valorSolicitado", 2000.0
                ),

                Map.of(
                        "id", 3,
                        "idade", 40,
                        "renda", 8000.0,
                        "possuiRestricao", true,
                        "valorSolicitado", 10000.0
                ),

                Map.of(
                        "id", 4,
                        "idade", 10,
                        "renda", 9000.0,
                        "valorSolicitado", 91000.0
                ),

                Map.of(
                        "id", 5,
                        "idade", 28,
                        "renda", 5000.0,
                        "possuiRestricao", false,
                        "valorSolicitado", 30000.0
                ),

                Map.of(
                        "id", 6,
                        "idade", 19,
                        "renda", 6000.0,
                        "possuiRestricao", false,
                        "valorSolicitado", 10000.0
                ),

                Map.of(
                        "id", 7,
                        "idade", 35,
                        "renda", 2500.0,
                        "possuiRestricao", false,
                        "valorSolicitado", 8000.0
                ),

                Map.of(
                        "id", 8,
                        "idade", 45,
                        "renda", 4000.0,
                        "possuiRestricao", false,
                        "valorSolicitado", 60000.0
                ),

                Map.of(
                        "id", 9,
                        "idade", 21,
                        "renda", 3000.0,
                        "possuiRestricao", false,
                        "valorSolicitado", 30000.0
                ),

                Map.of(
                        "id", 10,
                        "idade", 38,
                        "possuiRestricao", false,
                        "valorSolicitado", 10000.0
                )
        );
    }

    public static boolean validacaoDeEntrada(Map<String, Object> solicitacao) {

        // Se campo vazio, retorne falso
        if (!solicitacao.containsKey("id")) return false;
        if (!solicitacao.containsKey("idade")) return false;
        if (!solicitacao.containsKey("renda")) return false;
        if (!solicitacao.containsKey("possuiRestricao")) return false;
        if (!solicitacao.containsKey("valorSolicitado")) return false;

        // Se campo nulo, retorne falso
        if (solicitacao.get("id") == null) return false;
        if (solicitacao.get("idade") == null) return false;
        if (solicitacao.get("renda") == null) return false;
        if (solicitacao.get("possuiRestricao") == null) return false;
        if (solicitacao.get("valorSolicitado") == null) return false;

        return true;
    }

    public static boolean solicitacaoInvalida(Map<String, Object> solicitacao) {

        Integer idade = (Integer) solicitacao.get("idade");
        Double renda = (Double) solicitacao.get("renda");
        Double valorSolicitado = (Double) solicitacao.get("valorSolicitado");

        return idade <= 0 || renda <= 0 || valorSolicitado <=0;

    }

    public static boolean solicitacaoRejeitada(Map<String, Object> solicitacao) {

        Boolean possuiRestricao = (Boolean) solicitacao.get("possuiRestricao");

        return possuiRestricao;
    }

    public static boolean solicitacaoAprovada(Map<String, Object> solicitacao) {

        Integer idade = (Integer) solicitacao.get("idade");
        Double renda = (Double) solicitacao.get("renda");
        Double valorSolicitado = (Double) solicitacao.get("valorSolicitado");

        return idade >= 21 && renda >= 3000 && valorSolicitado <= (renda * 10);

    }

    public static boolean solicitacaoAnaliseManual(Map<String, Object> solicitacao) {

        return (!solicitacaoRejeitada(solicitacao)) && (!solicitacaoAprovada(solicitacao));
    }

    public static void imprimirResultado() {

        for (Map<String, Object> solicitacao : solicitacoes()) {

            if (!validacaoDeEntrada(solicitacao)) {
                System.out.println("\nResultado: SOLICITAÇÃO INVÁLIDA (dados ausentes)");
                imprimirSolicitacao(solicitacao);
                continue;
            }

            if (solicitacaoInvalida(solicitacao)) {
                System.out.println("\nResultado: REJEITADA (valores inválidos)");
                imprimirSolicitacao(solicitacao);
                continue;
            }

            if (solicitacaoRejeitada(solicitacao)) {
                System.out.println("\nResultado: REJEITADA (possui restrição)");
                imprimirSolicitacao(solicitacao);
                continue;
            }

            if (solicitacaoAprovada(solicitacao)) {
                System.out.println("\nResultado: APROVADA AUTOMATICAMENTE");
                imprimirSolicitacao(solicitacao);
                continue;
            }

            if (solicitacaoAnaliseManual(solicitacao)) {
                System.out.println("\nResultado: ENVIADA PARA ANÁLISE MANUAL");
                imprimirSolicitacao(solicitacao);
            }
        }
    }


    public static String imprimirSolicitacao(Map<String, Object> solicitacao) {
        Integer id = (Integer) solicitacao.get("id");
        Integer idade = (Integer) solicitacao.get("idade");
        Double renda = (Double) solicitacao.get("renda");
        Boolean possuiRestricao = (Boolean) solicitacao.get("possuiRestricao");
        Double valorSolicitado = (Double) solicitacao.get("valorSolicitado");

        String resultado =
                        "Id: " + id +
                        ", Idade: " + idade +
                        ", Renda: " + renda +
                        ", Restrição: " + possuiRestricao +
                        ", Valor solicitado: " + valorSolicitado;

        System.out.println(resultado);
        return resultado;
    }


}
