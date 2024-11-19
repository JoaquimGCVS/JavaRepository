package Estudos.exceptions.solutionD;

import java.util.Scanner;

public class Program {
    public static void main(String[] arg) throws ArithmeticException {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o numerador: ");
        float num = sc.nextFloat();
        System.out.print("Digite o denominador: ");
        float den = sc.nextFloat();

        if (den == 0) {
            throw new ArithmeticException("Erro: Não é possível dividir por zero.");
        }

        float division = num / den;
        System.out.println("Resultado: " + division);

        sc.close();
    }
}
