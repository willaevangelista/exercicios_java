/*
 * Warmup-1 > close10
 *
 * Given 2 int values, return whichever value is nearest to the value 10, or return 0 in the event of a tie.
 * Note that Math.abs(n) returns the absolute value of a number.
 *
 * - close10(8, 13) → 8
 * - close10(13, 8) → 8
 * - close10(13, 7) → 0
 */

package javaexercicios.exercicios41a50;

public class Exercicio43 {

    public static void main(String[] args){
        Exercicio43 exercicio = new Exercicio43();
        int resultado = exercicio.close10(9, 15);
        System.out.println(resultado);
    }

    public int close10(int a, int b) {

        int absA = Math.abs(a - 10);
        int absB = Math.abs(b - 10);

        if (absA == absB){
            return 0;
        }
        if (absA < absB) {
            return a;
        }
        return b;
    }
}
