/*
 * Warmup-1 > lastDigit
 *
 * Given two non-negative int values, return true if they have the same last digit, such as with 27 and 57. Note that the % "mod" operator computes remainders, so 17 % 10 is 7.
 *
 * - lastDigit(7, 17) → true
 * - lastDigit(6, 17) → false
 * - lastDigit(3, 113) → true
 */

package javaexercicios.exercicios41a50;

public class Exercicio47 {

    public static void main(String[] args){
        Exercicio47 exercicio = new Exercicio47();
        boolean resultado = exercicio.lastDigit(102, 122);
        System.out.println(resultado);
    }

    public boolean lastDigit(int a, int b) {
        return (a % 10) == (b % 10);
    }
}
