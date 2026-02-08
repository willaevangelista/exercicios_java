/*
 *
 * Desafio Técnico: Classificação de Solicitações de Reembolso
 *
 * Contexto:
 * Uma empresa possui um sistema interno para processar solicitações de
 * reembolso feitas por funcionários.
 *
 * As solicitações são cadastradas manualmente e frequentemente apresentam
 * erros, informações inconsistentes ou incompletas.
 *
 * Antes de qualquer pagamento, o sistema precisa decidir se uma solicitação
 * deve ser:
 * APROVADA
 * REJEITADA
 * ou ENVIADA PARA CONFERÊNCIA MANUAL
 *
 * O foco deste desafio NÃO é código.
 * O foco é raciocínio lógico, leitura cuidadosa de regras
 * e tomada de decisão consciente.
 *
 * Conceitos trabalhados:
 * - Condições
 * - Fluxo de decisão
 * - Regras de negócio
 * - Validação de entrada
 * - Ordem de avaliação
 *
 * Dados de entrada conceituais:
 *
 * Cada solicitação possui:
 * - Id do funcionário
 * - Valor solicitado
 * - Tipo de despesa
 * - Possui comprovante (true ou false)
 * - Quantidade de dias desde a despesa
 *
 * Tipos de despesa possíveis:
 * - ALIMENTACAO
 * - TRANSPORTE
 * - HOSPEDAGEM
 * - OUTROS
 *
 * Regras de validação inicial:
 *
 * Uma solicitação é considerada INVÁLIDA se qualquer uma das condições for verdadeira:
 * - Valor solicitado menor ou igual a zero
 * - Quantidade de dias desde a despesa menor que zero
 * - Tipo de despesa não informado
 *
 * Solicitações inválidas devem ser REJEITADAS imediatamente,
 * sem avaliar nenhuma outra regra.
 *
 * Regras de decisão de reembolso:
 * Após passar pela validação inicial:
 *
 * 1. REJEITAR automaticamente se:
 *    Quantidade de dias desde a despesa for maior que 90
 *
 * 2. APROVAR automaticamente se TODAS as condições forem atendidas:
 *    Possui comprovante igual a true
 *    Quantidade de dias desde a despesa menor ou igual a 30
 *    E uma das regras abaixo for verdadeira:
 *
 *    a) Tipo de despesa ALIMENTACAO e valor solicitado menor ou igual a 100
 *    b) Tipo de despesa TRANSPORTE e valor solicitado menor ou igual a 200
 *    c) Tipo de despesa HOSPEDAGEM e valor solicitado menor ou equal a 500
 *
 * 3. ENVIAR PARA CONFERÊNCIA MANUAL se:
 *    Não foi rejeitada
 *    Não atende completamente os critérios de aprovação automática
 *
 * Tarefa obrigatória:
 *
 * Antes de qualquer código, você DEVE:
 *
 * 1. Reescrever o problema em passos simples,
 *    como se estivesse explicando para alguém que não é da área de tecnologia.
 *
 * 2. Listar todas as decisões possíveis que o sistema pode tomar,
 *    deixando clara a ordem em que elas precisam acontecer.
 *
 * 3. Explicar em texto como o sistema decide entre:
 *    APROVAR
 *    REJEITAR
 *    CONFERÊNCIA MANUAL
 *
 * 4. Justificar a ordem das regras.
 *    Por exemplo:
 *    Por que validar dados antes de olhar tipo de despesa.
 *    Por que rejeitar antes de tentar aprovar.
 *
 * Proibido nesta fase:
 * Escrever código
 * Pensar em if, else, switch ou stream
 * Pensar em Java, sintaxe ou estrutura de classes
 *
 * Critérios de avaliação:
 * Clareza de raciocínio
 * Separação entre validação e regra de negócio
 * Capacidade de lidar com casos extremos
 * Ordem correta das decisões
 *
 * Objetivo final:
 * Se você consegue explicar isso claramente em texto,
 * o código vira apenas tradução da lógica.
 *
 */

package javaexercicios.exercicios11a20;

import java.util.List;
import java.util.Map;

public class Exercicio18 {

    public static void main(String []args) {
        imprimirResultado();
    }

    public static List<Map<String, Object>> solicitacoesReembolso(){
        return List.of(

                Map.of(
                        "id", 101,
                        "valorSolicitado", 80,
                        "tipoDespesa", "ALIMENTACAO",
                        "possuiComprovante", true,
                        "diasDesdeDespesa", 10
                ),

                Map.of(
                        "id", 102,
                        "valorSolicitado", 150,
                        "tipoDespesa", "ALIMENTACAO",
                        "possuiComprovante", true,
                        "diasDesdeDespesa", 20
                ),

                Map.of(
                        "id", 103,
                        "valorSolicitado", 180,
                        "tipoDespesa", "TRANSPORTE",
                        "possuiComprovante", false,
                        "diasDesdeDespesa", -15
                ),

                Map.of(
                        "id", 104,
                        "valorSolicitado", 300,
                        "tipoDespesa", "HOSPEDAGEM",
                        "possuiComprovante", true
                ),

                Map.of(
                        "id", 105,
                        "valorSolicitado", 600,
                        "tipoDespesa", "HOSPEDAGEM",
                        "possuiComprovante", false,
                        "diasDesdeDespesa", 20
                ),

                Map.of(
                        "id", 106,
                        "valorSolicitado", 50,
                        "tipoDespesa", "OUTROS",
                        "possuiComprovante", true,
                        "diasDesdeDespesa", 5
                ),

                Map.of(
                        "id", 107,
                        "valorSolicitado", 200,
                        "tipoDespesa", "TRANSPORTE",
                        "possuiComprovante", true,
                        "diasDesdeDespesa", 120
                ),

                Map.of(
                        "id", 108,
                        "valorSolicitado", -30,
                        "tipoDespesa", "ALIMENTACAO",
                        "possuiComprovante", true,
                        "diasDesdeDespesa", 3
                ),

                Map.of(
                        "id", 109,
                        "valorSolicitado", 100,
                        "possuiComprovante", true,
                        "diasDesdeDespesa", 10
                ),

                Map.of(
                        "id", 110,
                        "valorSolicitado", 200,
                        "tipoDespesa", "TRANSPORTE",
                        "possuiComprovante", true,
                        "diasDesdeDespesa", 30
                )
        );
    }

    public static boolean validacaoEntrada(Map<String, Object> solicitacaoReembolso){

        // Validação para Campos Vazios
        if (!solicitacaoReembolso.containsKey("id")) return false;
        if (!solicitacaoReembolso.containsKey("valorSolicitado")) return false;
        if (!solicitacaoReembolso.containsKey("tipoDespesa")) return false;
        if (!solicitacaoReembolso.containsKey("possuiComprovante")) return false;
        if (!solicitacaoReembolso.containsKey("diasDesdeDespesa")) return false;

        // Validação para Campos Nulos
        if (solicitacaoReembolso.get("id") == null) return false;
        if (solicitacaoReembolso.get("valorSolicitado") == null) return false;
        if (solicitacaoReembolso.get("tipoDespesa") == null) return false;
        if (solicitacaoReembolso.get("possuiComprovante") == null) return false;
        if (solicitacaoReembolso.get("diasDesdeDespesa") == null) return false;

        return true;
    }

    public static boolean solicitacoesInvalidas(Map<String, Object> solicitacaoReembolso){

        Integer valorSolicitado = (Integer) solicitacaoReembolso.get("valorSolicitado");
        String tipoDespesa = (String) solicitacaoReembolso.get("tipoDespesa");
        Integer diasDesdeDespesa = (Integer) solicitacaoReembolso.get("diasDesdeDespesa");

        return valorSolicitado <= 0 || diasDesdeDespesa < 0 || tipoDespesa == null;
    }

    public static boolean solicitacoesRejeitadas(Map<String, Object> solicitacaoReembolso){

        Integer diasDesdeDespesa = (Integer) solicitacaoReembolso.get("diasDesdeDespesa");

        return diasDesdeDespesa > 90;
    }

    public static boolean solicitacoesAprovadas(Map<String, Object> solicitacaoReembolso){
        Integer valorSolicitado = (Integer) solicitacaoReembolso.get("valorSolicitado");
        String tipoDespesa = (String) solicitacaoReembolso.get("tipoDespesa");
        Boolean possuiComprovante = (Boolean) solicitacaoReembolso.get("possuiComprovante");
        Integer diasDesdeDespesa = (Integer) solicitacaoReembolso.get("diasDesdeDespesa");

        return ((possuiComprovante && diasDesdeDespesa <= 30) &&
                ((("ALIMENTACAO".equals(tipoDespesa)) && (valorSolicitado <= 100)) ||
                (("TRANSPORTE".equals(tipoDespesa)) && (valorSolicitado <= 200))  ||
                (("HOSPEDAGEM".equals(tipoDespesa)) && (valorSolicitado <= 500))));
    }

    public static boolean solicitacoesAnaliseManual(Map<String, Object> solicitacaoReembolso){

        return (!solicitacoesRejeitadas(solicitacaoReembolso) && !solicitacoesAprovadas(solicitacaoReembolso));
    }

    public static void imprimirResultado(){

        for (Map<String, Object> solicitacaoReembolso : solicitacoesReembolso()) {

            if(!validacaoEntrada(solicitacaoReembolso)){
                System.out.println("\nResultado: SOLICITAÇÃO INVÁLIDA (dados ausentes)");
                imprimirSolicitacao(solicitacaoReembolso);
                continue;
            }

            if(solicitacoesInvalidas(solicitacaoReembolso)){
                System.out.println("\nResultado: SOLICITAÇÃO INVÁLIDA E REJEITADA AUTOMATICAMENTE");
                imprimirSolicitacao(solicitacaoReembolso);
                continue;
            }

            if(solicitacoesRejeitadas(solicitacaoReembolso)){
                System.out.println("\nResultado: SOLICITAÇÃO REJEITADA (quantidade de dias desde a despesa é maior que 90)");
                imprimirSolicitacao(solicitacaoReembolso);
                continue;
            }

            if(solicitacoesAprovadas(solicitacaoReembolso)){
                System.out.println("\nResultado: SOLICITAÇÃO APROVADA AUTOMATICAMENTE");
                imprimirSolicitacao(solicitacaoReembolso);
                continue;
            }

            if(solicitacoesAnaliseManual(solicitacaoReembolso)){
                System.out.println("\nResultado: SOLICITAÇÃO ENVIADA PARA ANÁLISE MANUAL");
                imprimirSolicitacao(solicitacaoReembolso);
            }
        }
    }

    public static String imprimirSolicitacao(Map<String, Object> solicitacaoReembolso) {
        Integer id = (Integer) solicitacaoReembolso.get("id");
        Integer valorSolicitado = (Integer) solicitacaoReembolso.get("valorSolicitado");
        String tipoDespesa = (String) solicitacaoReembolso.get("tipoDespesa");
        Boolean possuiComprovante = (Boolean) solicitacaoReembolso.get("possuiComprovante");
        Integer diasDesdeDespesa = (Integer) solicitacaoReembolso.get("diasDesdeDespesa");

        String resultado =
                "id: " + id +
                ", valodSolicitado: " + valorSolicitado +
                ", tipoDespesa: " + tipoDespesa +
                ", possuiComprovante: " + possuiComprovante +
                ", diasDesdeDespesa: " + diasDesdeDespesa;

        System.out.println(resultado);
        return resultado;
    }
}
