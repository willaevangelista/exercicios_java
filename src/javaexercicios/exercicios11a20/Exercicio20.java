/*
 * Warmup-1 > monkeyTrouble
 * We have two monkeys, a and b, and the parameters aSmile and bSmile indicate if each is smiling.
 * We are in trouble if they are both smiling or if neither of them is smiling. Return true if we are in trouble.
 *
 * - monkeyTrouble(true, true) → true
 * - monkeyTrouble(false, false) → true
 * - monkeyTrouble(true, false) → false
 */

package javaexercicios.exercicios11a20;

public class Exercicio20 {

    public static void main(String[] args) {

        Exercicio20 exercicio = new Exercicio20();

        boolean resultado = exercicio.monkeyTrouble(true, true);

        System.out.println(resultado);
    }

    public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
        return (aSmile && bSmile) || (!aSmile && !bSmile);
    }
}
