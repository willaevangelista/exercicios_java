/*
 * Warmup-1 > notString
 *
 * Given a string, return a new string where "not " has been added to the front.
 * However, if the string already begins with "not", return the string unchanged. Note: use .equals() to compare 2 strings.
 *
 * - notString("candy") → "not candy"
 * - notString("x") → "not x"
 * - notString("not bad") → "not bad"
 */

package javaexercicios.exercicios21a30;

public class Exercicio27 {

    public static void main(String[] args){
        Exercicio27 exercicio = new Exercicio27();
        String resultado = exercicio.notString("not bad");
        System.out.println(resultado);
    }

    public String notString(String str) {
        if (str.equals("not") || str.contains("not ")) {
            return str;
        }
        return "not " + str;
    }
}
