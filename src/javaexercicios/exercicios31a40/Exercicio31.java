/*
 * Warmup-1 > backAround
 *
 * Given a string, take the last char and return a new string with the last char added at the front and back, so "cat" yields "tcatt".
 * The original string will be length 1 or more.
 *
 * - backAround("cat") → "tcatt"
 * - backAround("Hello") → "oHelloo"
 * - backAround("a") → "aaa"
 */

package javaexercicios.exercicios31a40;

public class Exercicio31 {

    public static void main(String[] args){
        Exercicio31 exercicio = new Exercicio31();
        String resultado = exercicio.backAround("Willa");
        System.out.println(resultado);
    }

    public String backAround(String str) {
        if (str.length() >= 1) {
            String lastChar = str.substring(str.length()-1);

            return lastChar + str + lastChar;
        }
        return str;
    }

}
