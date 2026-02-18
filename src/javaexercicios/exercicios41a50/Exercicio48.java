/*
 * Warmup-1 > endUp
 *
 * Given a string, return a new string where the last 3 chars are now in upper case.
 * If the string has less than 3 chars, uppercase whatever is there.
 * Note that str.toUpperCase() returns the uppercase version of a string.
 *
 * - endUp("Hello") → "HeLLO"
 * - endUp("hi there") → "hi thERE"
 * - endUp("hi") → "HI"
 */

package javaexercicios.exercicios41a50;

public class Exercicio48 {

    public static void main(String[] args){
        Exercicio48 exercicio = new Exercicio48();
        String resultado = exercicio.endUp("Willa");
        System.out.println(resultado);
    }

    public String endUp(String str) {
        if (str.length() >= 3){

            String firstChars = str.substring(0, str.length()-3);
            String lastThreeChars = str.substring(str.length()-3).toUpperCase();

            return firstChars + lastThreeChars;
        }

        return str.toUpperCase();
    }
}
