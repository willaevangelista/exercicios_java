/*
 * Warmup-1 > delDel
 *
 * Given a string, if the string "del" appears starting at index 1, return a string where that "del" has been deleted.
 * Otherwise, return the string unchanged.
 *
 * - delDel("adelbc") → "abc"
 * - delDel("adelHello") → "aHello"
 * - delDel("adedbc") → "adedbc"
 */

package javaexercicios.exercicios31a40;

public class Exercicio39 {

    public static void main(String[] args){
        Exercicio39 exercicio = new Exercicio39();
        String resultado = exercicio.delDel("Adelle");
        System.out.println(resultado);
    }

    public String delDel(String str) {

        if (str.length() > 3 && str.substring(1, 4).equals("del")) {

            String beforeDel = str.substring(0, 1);
            String afterDel = str.substring(4);

            return beforeDel + afterDel;
        }
        return str;
    }

}
