/*
 * Warmup-1 > max1020
 *
 * Given 2 positive int values, return the larger value that is in the range 10..20 inclusive, or return 0 if neither is in that range.
 *
 * - max1020(11, 19) → 19
 * - max1020(19, 11) → 19
 * - max1020(11, 9) → 11
 */

package javaexercicios.exercicios41a50;

public class Exercicio45 {

    public static void main(String[] args){
        Exercicio45 exercicio = new Exercicio45();
        int resultado = exercicio.max1020(1,6);
        System.out.println(resultado);
    }

    public int max1020(int a, int b) {

        boolean rangeA10 = (a >= 10) && (a <= 20);
        boolean rangeB10 = (b >= 10) && (b <= 20);
        boolean range10 = (rangeA10 || rangeB10);
        boolean biggerA = a > b;
        boolean biggerB = b > a;

        if ((biggerA && rangeA10) ||
                (biggerB && !rangeB10) && range10) {
            return a;
        }

        if ((biggerB && rangeB10) ||
                (biggerA && !rangeA10) && range10) {
            return b;
        }

        return 0;
    }
}
