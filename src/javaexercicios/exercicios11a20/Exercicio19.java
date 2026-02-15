/*
 *
 * Warmup-1 > sleepIn
 *
 * The parameter weekday is true if it is a weekday, and the parameter vacation is true if we are on vacation. We sleep in if it is not a weekday or we're on vacation. Return true if we sleep in.
 *
 * - sleepIn(false, false) → true
 * - sleepIn(true, false) → false
 * - sleepIn(false, true) → true
 */

package javaexercicios.exercicios11a20;

public class Exercicio19{

    public static void main(String[] args) {

        Exercicio19 exercicio = new Exercicio19();

        boolean resultado = exercicio.sleepIn(false, true);

        System.out.println(resultado);
    }

    public boolean sleepIn(boolean weekday, boolean vacation) {
        return (!weekday || vacation);
    }
}
