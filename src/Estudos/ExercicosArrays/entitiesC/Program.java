package Estudos.ExercicosArrays.entitiesC;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double[] vect = new double[n];
        if (n <= 10) {
            for (int j = 0; j < n; j++) {
                double numero = sc.nextDouble();
                vect[j]=numero;
            }
        }
        for(int i=0;i<vect.length;i++){
            if (vect[i] % 2 != 0) {
                System.out.println(vect[i]);
            }
        }
        sc.close();
    }
}
