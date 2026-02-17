/*
 * Warmup-1 > icyHot
 *
 * Given two temperatures, return true if one is less than 0 and the other is greater than 100.
 *
 * - icyHot(120, -1) → true
 * - icyHot(-1, 120) → true
 * - icyHot(2, 120) → false
 */

package javaexercicios.exercicios31a40;

public class Exercicio35 {

    public static void main(String[] args){
        Exercicio35 exercicio = new Exercicio35();
        boolean resultado = exercicio.icyHot(101,-101);
        System.out.println(resultado);
    }

    public boolean icyHot(int temp1, int temp2) {
        return (temp1 < 0 && temp2 > 100) || (temp1 > 100 && temp2 < 0);
    }
}
