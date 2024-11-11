package Estudos.ExercicosArrays.entitiesH;

import java.util.Scanner;

public class Program {
    public static void main (String[] arg) {
        System.out.println("Digit N: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] vect = new int[n];
        for(int i=0;i<n;i++) {
            System.out.println("Digit he number: ");
            int number = sc.nextInt();
            vect[i]=number;
        }
        int maior = vect[0];
        int position = 0;
        for(int i=0;i<vect.length;i++) {
            if (vect[i]>maior) {
                maior = vect[i];
                position = i;
            }
        }
        System.out.println("The highest number is: " + maior);
        System.out.println("It`s position is: " + position);
    }
}
