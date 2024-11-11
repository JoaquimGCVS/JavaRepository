package Estudos.ExercicosArrays.entitiesA;

import java.util.ArrayList;
import java.util.Scanner;

public class MainList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Write the number of elements in the array of heights: ");
        int n = sc.nextInt();

        System.out.println();

        System.out.println("Now digit the height of each person -->");
        ArrayList<Double> heights = new ArrayList<>();

        for(int i =0;i<n;i++) {
            System.out.println("Person " + (i+1) + ": ");
            double height = sc.nextDouble();
            heights.add(height);
        }

        double sum=0.0;
        for (Double height : heights) {
            sum+=height;
        }

        System.out.println();
        System.out.println("The avarege of the " + n + " registered heights is: " + sum/n);

        sc.close();


    }
}
