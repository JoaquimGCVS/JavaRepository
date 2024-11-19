package Estudos.arrays.entitiesG;

import java.util.Scanner;

public class Program {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digit N: ");
        int n = sc.nextInt();
        int[] numPares = new int[n];
        for(int i=0;i<n;i++) {
            System.out.println("Digit the number: ");
            int number = sc.nextInt();
            if(number%2==0) {
                numPares[i] = number;
            }
        }
        System.out.println("NUMEROS PARES");
        for (int number : numPares) {
            if (number != 0) {
                System.out.print(number + " ");
            }
        }
        sc.close();
    }
}
