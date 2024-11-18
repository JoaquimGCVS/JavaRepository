package Estudos.Arrays.entitiesA;


import java.util.Scanner;

public class MainVector {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Write the number of elements in the array of heights: ");
        int n = sc.nextInt();

        System.out.println();

        System.out.println("Now digit the height of each person -->");
        double[] vect = new double[n];

        for (int i=0;i<n;i++) {
            System.out.println("Person " + (i+1) + ": ");
            double height = sc.nextDouble();
            vect[i]=height;
        }

        double sum=0.0;
        for (int i=0; i<n;i++) {
            sum+=vect[i];
        }

        System.out.println();
        System.out.println("A media das " + n + " heights cadastradas eh: " + sum/n);

        sc.close();
    }
}
