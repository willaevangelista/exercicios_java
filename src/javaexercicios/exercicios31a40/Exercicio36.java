/*
 * Warmup-1 > in1020
 *
 * Given 2 int values, return true if either of them is in the range 10..20 inclusive.
 *
 * - in1020(12, 99) → true
 * - in1020(21, 12) → true
 * - in1020(8, 99) → false
 */

package javaexercicios.exercicios31a40;

public class Exercicio36 {

    public static void main(String[] args){
        Exercicio36 exercicio = new Exercicio36();
        boolean resultado = exercicio.in1020(-20,2);
        System.out.println(resultado);
    }

    public boolean in1020(int a, int b) {
        return (a >= 10 && a <= 20) ||(b >= 10 && b <= 20);
    }
}
