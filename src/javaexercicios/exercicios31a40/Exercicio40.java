/*
 * Warmup-1 > mixStart
 *
 * Return true if the given string begins with "mix", except the 'm' can be anything, so "pix", "9ix" .. all count.
 *
 * - mixStart("mix snacks") → true
 * - mixStart("pix snacks") → true
 * - mixStart("piz snacks") → false
 */

package javaexercicios.exercicios31a40;

public class Exercicio40 {

    public static void main(String[] args){
        Exercicio40 exercicio = new Exercicio40();
        boolean resultado = exercicio.mixStart("pix snacks");
        System.out.println(resultado);
    }

    public boolean mixStart(String str) {
        return (str.length() >= 3 && str.substring(1,3).startsWith("ix"));
    }

}
