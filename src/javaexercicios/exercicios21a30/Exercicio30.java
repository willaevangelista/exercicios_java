/*
 * Warmup-1 > front3
 *
 * Given a string, we'll say that the front is the first 3 chars of the string.
 * If the string length is less than 3, the front is whatever is there.
 * Return a new string which is 3 copies of the front.
 *
 * - front3("Java") → "JavJavJav"
 * - front3("Chocolate") → "ChoChoCho"
 * - front3("abc") → "abcabcabc"
 */

package javaexercicios.exercicios21a30;

public class Exercicio30 {

    public static void main(String[] args){
        Exercicio30 exercicio = new Exercicio30();
        String resultado = exercicio.front3("Ae");
        System.out.println(resultado);
    }

    public String front3(String str) {
        if (str.length() > 3) {

            String firstThreeChars = str.substring(0, 3);

            return firstThreeChars + firstThreeChars + firstThreeChars;
        }

        return str + str + str;
    }
}
