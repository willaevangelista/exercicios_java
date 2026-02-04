/*
 * Desafio Técnico: Análise e Priorização de Emails de Usuários
 *
 * Contexto:
 * Em um cenário de testes de importação, o sistema recebe uma lista fixa de emails
 * cadastrados manualmente. Além de inconsistências básicas, esses dados precisam ser
 * classificados por prioridade antes de uso.
 *
 * A prioridade de um email é definida pelas seguintes regras:
 * - Emails de domínio corporativo (terminam com "@empresa.com") têm prioridade alta.
 * - Emails de domínio público (gmail.com, outlook.com, yahoo.com) têm prioridade média.
 * - Qualquer outro domínio tem prioridade baixa.
 *
 * Tarefa:
 * Implemente um metodo chamado analisarEmails que:
 * 1. Crie internamente uma lista imutável usando List.of com até 12 emails.
 * 2. Utilize Stream API para validar, normalizar, classificar e limitar os dados.
 *
 * Requisitos técnicos:
 * - Implementação obrigatória em Java.
 * - Uso obrigatório de:
 *   - .stream()
 *   - .filter()
 *   - .map()
 * - Uso obrigatório de pelo menos DOIS dos seguintes:
 *   - distinct()
 *   - sorted()
 *   - limit()
 *   - peek()
 * - Proibido o uso de loops tradicionais (for, while).
 * - A lista criada com List.of não pode ser modificada.
 *
 * Regras de processamento:
 * - Remover espaços em branco no início e no fim de cada email.
 * - Converter todos os emails para letras minúsculas.
 * - Ignorar emails inválidos:
 *     - Não contêm '@'
 *     - Contêm mais de um '@'
 *     - Têm menos de 6 caracteres após o trim
 * - Eliminar emails duplicados APÓS normalização.
 * - Classificar os emails seguindo esta ordem:
 *     1. Prioridade (alta → média → baixa)
 *          Definição de prioridade:
                - Alta prioridade: emails que terminam com "@empresa.com"
                - Média prioridade: emails que terminam com "@gmail.com", "@outlook.com" ou "@yahoo.com"
                - Baixa prioridade: qualquer outro domínio válido
 *     2. Ordem alfabética dentro da mesma prioridade
 * - Retornar no máximo 6 emails.
 *
 * Saída esperada:
 * - O méeodo deve retornar uma List<String> com os emails normalizados e ordenados.
 *
 * Exemplo conceitual:
 * Lista original:
 * [
 *   "  Ana@Empresa.com ",
 *   "joao@gmail.com",
 *   "bia@yahoo.com",
 *   "ana@empresa.com",
 *   "teste@@email.com",
 *   "user@site.org",
 *   "x@y"
 * ]
 *
 * Resultado final:
 * [
 *   "ana@empresa.com",
 *   "bia@yahoo.com",
 *   "joao@gmail.com",
 *   "user@site.org"
 * ]
 *
 * Critérios de avaliação:
 * - Uso correto de Comparator composto.
 * - Entendimento claro de quando usar map vs filter.
 * - Pipeline de Stream legível, sem lógica escondida.
 * - Uso consciente de peek (se usado).
 */

package javaexercicios.exercicios11a20;

import java.util.Comparator;
import java.util.List;

public class Exercicio16 {

    public static void main(String []args) {
        imprimirResultado();
    }

    public static List<String> listarEmails(){

        return List.of(
                "  Ana@Empresa.com ",
                "JOAO@gmail.com",
                "rosaamarela.com",
                "bia@yahoo.com",
                "ana@empresa.com",
                " suporte@empresa.com ",
                "teste@@email.com",
                "user@site.org",
                "USER@site.org ",
                " contato@outlook.com",
                "  x@y  ",
                "financeiro@EMPRESA.COM",
                "dev@empresa.com"
        );
    }

    public static List<String> analisarEmails(){

        return listarEmails().stream()
                            // Normalização
                            .map(String::trim)
                            .map(String::toLowerCase)
                            // Validação
                            .filter(email -> email.split("@").length == 2)
                            .filter(email -> email.length() >= 6)
                            // Remoção de duplicatas
                            .distinct()
                            // Ordenação com definição de prioridades
                            .sorted(
                                    Comparator.comparingInt((String email) -> {
                                        if (email.endsWith("@empresa.com")) return 0;
                                        if (email.endsWith("@gmail.com")
                                                || email.endsWith("@outlook.com")
                                                || email.endsWith("@yahoo.com")) return 1;
                                        return 2;
                                    }).thenComparing(Comparator.naturalOrder())
                            )
                            // Limitação de emails na lista
                            .limit(6)
                            .toList();
    }

    public static void imprimirResultado(){
        System.out.println("Lista Original: \n" + listarEmails());
        System.out.println("\n");
        System.out.println("Resultado Final: \n" + analisarEmails());

    }
}
