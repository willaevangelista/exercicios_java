package javaexercicios.exercicios21a30;

public class Exercicio26 {

    public static void main(String[] args){
        Exercicio26 exercicio = new Exercicio26();
        boolean resultado = exercicio.posNeg(10, -11, true);
        System.out.println(resultado);
    }

    public boolean posNeg(int a, int b, boolean negative) {
        if ((negative && a < 0 && b < 0) ||
                (!negative && ((a < 0 && b > 0) || (a > 0 && b < 0))
                )) {
            return true;
        }
        return false;
    }
}
