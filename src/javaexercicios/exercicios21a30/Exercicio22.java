/*
 * Warmup-1 > diff21
 *
 * Given an int n, return the absolute difference between n and 21, except return double the absolute difference if n is over 21.
 *
 * - diff21(19) → 2
 * - diff21(10) → 11
 * - diff21(21) → 0
 */

package javaexercicios.exercicios21a30;

public class Exercicio22 {

    public static void main(String[] args){
        Exercicio22 exercicio = new Exercicio22();

        int resultado = exercicio.diff21(1);

        System.out.println(resultado);

    }

    public int diff21(int n) {
        if (n <= 21) {
            return 21 - n;
        }
        return (n - 21) * 2;
    }
}
