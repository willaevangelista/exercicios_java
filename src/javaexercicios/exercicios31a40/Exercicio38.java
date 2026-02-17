/*
 * Warmup-1 > loneTeen
 *
 * We'll say that a number is "teen" if it is in the range 13..19 inclusive.
 * Given 2 int values, return true if one or the other is teen, but not both.
 *
 * - loneTeen(13, 99) → true
 * - loneTeen(21, 19) → true
 * - loneTeen(13, 13) → false
 */

package javaexercicios.exercicios31a40;

public class Exercicio38 {

    public static void main(String[] args){
        Exercicio38 exercicio = new Exercicio38();
        boolean resultado = exercicio.loneTeen(14,13);
        System.out.println(resultado);
    }

    public boolean loneTeen(int a, int b) {

        boolean aTeen = (a >= 13 && a <= 19);
        boolean bTeen = (b >= 13 && b <= 19);

        return (((aTeen) && (!bTeen)) ||
                ((!aTeen) && bTeen));
    }
}
