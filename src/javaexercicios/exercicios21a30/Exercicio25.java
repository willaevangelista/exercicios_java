/*
 * Warmup-1 > nearHundred
 *
 * Given an int n, return true if it is within 10 of 100 or 200.
 * Note: Math.abs(num) computes the absolute value of a number.
 *
 * - nearHundred(93) → true
 * - nearHundred(90) → true
 * - nearHundred(89) → false
 */

package javaexercicios.exercicios21a30;

public class Exercicio25 {

    public static void main(String[] args){
        Exercicio25 exercicio = new Exercicio25();
        boolean resultado = exercicio.nearHundred(101);
        System.out.println(resultado);
    }

    public boolean nearHundred(int n) {
        if (n >= Math.abs(90) && n <= Math.abs(110) || n >= Math.abs(190) && n <= Math.abs(210)) {
            return true;
        }
        return false;
    }
}
