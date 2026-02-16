package javaexercicios.exercicios21a30;

public class Exercicio28 {

    public static void main(String[] args){
        Exercicio28 exercicio = new Exercicio28();
        String resultado = exercicio.missingChar("kitten", 0);
        System.out.println(resultado);
    }

    public String missingChar(String str, int n) {

        String beginning = str.substring(0, n);
        String end = str.substring(n+1);

        return beginning + end;
    }


}
