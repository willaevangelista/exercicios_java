/*
 * Warmup-1 > front22
 *
 * Given a string, take the first 2 chars and return the string with the 2 chars added at both the front and back, so "kitten" yields"kikittenki".
 * If the string length is less than 2, use whatever chars are there.
 *
 * - front22("kitten") → "kikittenki"
 * - front22("Ha") → "HaHaHa"
 * - front22("abc") → "ababcab"
 */

package javaexercicios.exercicios31a40;

public class Exercicio33 {

    public static void main(String[] args){
        Exercicio33 exercicio = new Exercicio33();
        String resultado = exercicio.front22("Willa");
        System.out.println(resultado);
    }

    public String front22(String str) {
        if (str.length() > 2){
            String fisrtTwoChars = str.substring(0, 2);

            return fisrtTwoChars + str + fisrtTwoChars;
        }
        return str + str + str;
    }
}
