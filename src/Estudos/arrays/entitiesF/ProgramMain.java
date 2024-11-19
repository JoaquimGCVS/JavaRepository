package Estudos.arrays.entitiesF;

import java.util.Scanner;

public class ProgramMain {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digit n: ");
        int n=sc.nextInt();
        int[] numPares = new int[n];
        int pares=0;
        for (int i=0;i<n;i++) {
            System.out.println("Digit the number: ");
            int number = sc.nextInt();
            if(number%2==0) {
                numPares[i]=number;
                pares++;
            }
        }
        System.out.println("Numeros pares:");
        for (int num: numPares ) {
            if (num!=0) {
                System.out.println(num);
            }
        }
        System.out.println("Quantity of pares: " + pares);
    }
}
