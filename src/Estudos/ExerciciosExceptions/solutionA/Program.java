package Estudos.ExerciciosExceptions.solutionA;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {
    public static void main (String[] arg) {
        Scanner sc = new Scanner(System.in);

        try {
            String[] vect = sc.nextLine().split(" "); //split: define que quando "space" (" ") ocorre uma quebra de linha,
            //definindo uma nova Substring/Posicao no vetor
            int index = sc.nextInt(); // Le a psoicao no vetor que sera impressa
            System.out.println(vect[index]);
        } catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index"); // lanca uma excecao caso o endereco de array digitado
            // seja invalido ou inexistente no array
        } catch(InputMismatchException e) {
            System.out.println("Invalid format for index"); // lanca uma excecao caso o formato digitado
            // para o endereco no array seja invalido (ex: "a" caracter)
        }
        finally {
            sc.close();
            System.out.println("(Finally) block executed");
        }
    }
}
