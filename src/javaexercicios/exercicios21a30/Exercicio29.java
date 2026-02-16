/*
 * Warmup-1 > frontBack
 *
 * Given a string, return a new string where the first and last chars have been exchanged.
 *
 * - frontBack("code") → "eodc"
 * - frontBack("a") → "a"
 * - frontBack("ab") → "ba"
 */

package javaexercicios.exercicios21a30;

public class Exercicio29 {

    public static void main(String[] args){
        Exercicio29 exercicio = new Exercicio29();
        String resultado = exercicio.frontBack("Willa");
        System.out.println(resultado);
    }

    public String frontBack(String str) {

        if (str.length() > 1) {

            String firstChar = str.substring(0, 1);
            String middle = str.substring(1, str.length()-1);
            String lastChar = str.substring(str.length()-1);

            return lastChar + middle + firstChar;
        }

        return str;
    }
}
