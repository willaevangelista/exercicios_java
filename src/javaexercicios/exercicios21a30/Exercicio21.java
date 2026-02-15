/*
 * Warmup-1 > sumDouble
 *
 * Given two int values, return their sum.
 * Unless the two values are the same, then return double their sum.
 *
 * - sumDouble(1, 2) → 3
 * - sumDouble(3, 2) → 5
 * - sumDouble(2, 2) → 8
 */

package javaexercicios.exercicios21a30;

public class Exercicio21 {
    public static void main(String[] args){

        Exercicio21 exercicio = new Exercicio21();

        int resultado = exercicio.sumDouble(12, 11);

        System.out.println(resultado);

    }

    public int sumDouble(int a, int b) {
        if (a == b) {
            return (a + a) * 2;
        }
        return a + b;
    }
}
