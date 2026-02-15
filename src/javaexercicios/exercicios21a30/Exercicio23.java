/*
 * Warmup-1 > parrotTrouble
 *
 * We have a loud talking parrot. The "hour" parameter is the current hour time in the range 0..23. We are in trouble if the parrot is talking and the hour is before 7 or after 20. Return true if we are in trouble.
 *
 * - parrotTrouble(true, 6) → true
 * - parrotTrouble(true, 7) → false
 * - parrotTrouble(false, 6) → false
 */

package javaexercicios.exercicios21a30;

public class Exercicio23 {

    public static void main(String[] args){

        Exercicio23 exercicio = new Exercicio23();

        boolean resultado = exercicio.parrotTrouble(true, 7);

        System.out.println(resultado);

    }

    public boolean parrotTrouble(boolean talking, int hour) {

        if (talking && (hour < 7 || hour > 20)) {
            return true;
        }
        return false;
    }
}
