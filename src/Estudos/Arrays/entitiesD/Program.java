package Estudos.Arrays.entitiesD;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        double sum=0.0;
        double[] vect = new double[n];
        for(int i=0;i<n;i++) {
            double numeroReal = sc.nextDouble();
            vect[i]=numeroReal;
            sum+=numeroReal;
        }
        System.out.print("Values = ");
        for (int i=0;i<n;i++) {
            System.out.print(vect[i] + ", ");
        }
        sc.nextLine();
        System.out.println("Summury: " + sum);
        System.out.println("Avarege: " + sum/vect.length);
        sc.close();
    }
}
