package Estudos.Arrays.entitiesI;

import java.util.Scanner;

public class Program {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digit N:");
        int n = sc.nextInt();
        int[] vect1 = new int[n];
        int[] vect2 = new int[n];
        int[] sum = new int[n];
        System.out.println("Digit the values for the first vector: ");
        for(int i =0; i<n;i++) {
            System.out.println("Number: ");
            int number = sc.nextInt();
            vect1[i]= number;
        }
        System.out.println("Digit the values for the second vector: ");
        for(int i =0; i<n;i++) {
            System.out.println("Number: ");
            int number = sc.nextInt();
            vect2[i]= number;
        }
        for(int i =0; i<n;i++) {
            sum[i]= vect1[i] + vect2[i];
        }
        System.out.println("The sum of the elements is: ");
        for (int sumNumber : sum) {
            System.out.println(sumNumber);
        }

        sc.close();
    }
}
