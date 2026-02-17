/*
 * Warmup-1 > intMax
 *
 * Given three int values, a b c, return the largest.
 *
 * - intMax(1, 2, 3) → 3
 * - intMax(1, 3, 2) → 3
 * - intMax(3, 2, 1) → 3
 */

package javaexercicios.exercicios41a50;

public class Exercicio42 {

    public static void main(String[] args){
        Exercicio42 exercicio = new Exercicio42();
        int resultado = exercicio.intMax(-12, -99, -6);
        System.out.println(resultado);
    }

    public int intMax(int a, int b, int c) {

        int result = 0;

        if (a > b && a > c) {
            result = a;
        }

        if (b > a && b > c) {
            result = b;
        }

        if (c > a && c > b) {
            result = c;
        }

        return result;
    }

}
