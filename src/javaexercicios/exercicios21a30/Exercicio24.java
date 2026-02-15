/*
 * Warmup-1 > makes10
 *
 * Given 2 ints, a and b, return true if one if them is 10 or if their sum is 10.
 *
 * - makes10(9, 10) → true
 * - makes10(9, 9) → false
 * - makes10(1, 9) → true
 */

package javaexercicios.exercicios21a30;

public class Exercicio24 {

    public static void main(String[] args){
        Exercicio24 exercicio = new Exercicio24();
        boolean resultado = exercicio.makes10(5, 11);
        System.out.println(resultado);
    }

    public boolean makes10(int a, int b) {
        if (a == 10 || b == 10 || (a + b) == 10) {
            return true;
        }
        return false;
    }
}
