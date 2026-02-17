/*
 * Warmup-1 > or35
 *
 * Return true if the given non-negative number is a multiple of 3 or a multiple of 5.
 * Use the % "mod" operator -- see Introduction to Mod
 *
 * - or35(3) → true
 * - or35(10) → true
 * - or35(8) → false
 */

package javaexercicios.exercicios31a40;

public class Exercicio32 {

    public static void main(String[] args){
        Exercicio32 exercicio = new Exercicio32();
        boolean resultado = exercicio.or35(61);
        System.out.println(resultado);
    }

    public boolean or35(int n) {
        return n > 0 && (n % 3 == 0 || n % 5 == 0);
    }
}
