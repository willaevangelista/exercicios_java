/*
 * Warmup-1 > in3050
 *
 * Given 2 int values, return true if they are both in the range 30..40 inclusive, or they are both in the range 40..50 inclusive.
 *
 * - in3050(30, 31) → true
 * - in3050(30, 41) → false
 * - in3050(40, 50) → true
 */

package javaexercicios.exercicios41a50;

public class Exercicio44 {

    public static void main(String[] args) {
        Exercicio44 exercicio = new Exercicio44();
        boolean resultado = exercicio.in3050(31, 40);
        System.out.println(resultado);
    }

    public boolean in3050(int a, int b) {

        boolean aRange30 = (a >= 30 && a <= 40);
        boolean bRange30 = (b >= 30 && b <= 40);
        boolean aRange40 = (a >= 40 && a <= 50);
        boolean bRange40 = (b >= 40 && b <= 50);

        return (aRange30 && bRange30) || (aRange40 && bRange40);
    }

}
