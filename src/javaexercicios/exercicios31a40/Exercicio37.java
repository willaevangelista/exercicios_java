/*
 * Warmup-1 > hasTeen
 *
 * We'll say that a number is "teen" if it is in the range 13..19 inclusive.
 * Given 3 int values, return true if 1 or more of them are teen.
 *
 * - hasTeen(13, 20, 10) → true
 * - hasTeen(20, 19, 10) → true
 * - hasTeen(20, 10, 13) → true
 */

package javaexercicios.exercicios31a40;

public class Exercicio37 {

    public static void main(String[] args){
        Exercicio37 exercicio = new Exercicio37();
        boolean resultado = exercicio.hasTeen(1, 2, 13);
        System.out.println(resultado);
    }

    public boolean hasTeen(int a, int b, int c) {
        return (a >= 13 && a <= 19) || (b >= 13 && b <= 19) || (c >= 13 && c <= 19);
    }
}
