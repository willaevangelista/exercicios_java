/*
 * Warmup-1 > startOz
 *
 * Given a string, return a string made of the first 2 chars (if present), however include first char only if it is 'o' and include the second only if it is 'z', so "ozymandias" yields "oz".
 *
 * - startOz("ozymandias") → "oz"
 * - startOz("bzoo") → "z"
 * - startOz("oxx") → "o"
 */

package javaexercicios.exercicios41a50;

public class Exercicio41 {

    public static void main(String[] args){
        Exercicio41 exercicio = new Exercicio41();
        String resultado = exercicio.startOz("Ozimaria");
        System.out.println(resultado);
    }

    public String startOz(String str) {

        if (!str.isEmpty()) {

            if (str.length() > 1 && str.substring(0, 2).equals("oz")){
                return str.substring(0, 2);

            }

            if (str.length() > 1 && str.substring(1, 2).equals("z")) {
                return str.substring(1, 2);
            }

            if (str.substring(0, 1).equals("o")){

                return str.substring(0, 1);

            }

        }

        return "";

    }
}
