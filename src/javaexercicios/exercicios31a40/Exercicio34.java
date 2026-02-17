package javaexercicios.exercicios31a40;

public class Exercicio34 {

    public static void main(String[] args) {
        Exercicio34 exercicio = new Exercicio34();
        boolean resultado = exercicio.startHi("Willa");
        System.out.println(resultado);
    }

    public boolean startHi(String str) {
        return str.startsWith("hi");
    }
}
