package Estudos.Arrays.entitiesJ;

import java.util.Scanner;

public class Main {
    public static void main(String[] arg) {
        System.out.println("N: ");
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        double[] heights = new double[n];
        String[] genders = new String[n];
        System.out.println("Data: ");
        double maior = heights[0];
        double menor = heights[0];
        int mens =0;
        for(int i=0;i<n;i++) {
            sc.nextLine();
            System.out.println("Digit the height: ");
            double h = sc.nextDouble();
            heights[i] = h;
            System.out.println("Digit the gender (m/w) ");
            String g = sc.nextLine();
            genders[i]=g;

            if(heights[i] > maior) {
                maior = heights[i];
            }else if(heights[i] < menor) {
                menor = heights[i];
            }

            if (g.equalsIgnoreCase("m")) {
                mens++;
            }
        }
        double sum=0.0;
        for (int j=0;j<n;j++) {
            if (genders[j].equalsIgnoreCase("w")) {
                sum += heights[j];
            }
        }
        System.out.println("Highest person: " + maior);
        System.out.println("Smallest person: " + menor);
        System.out.println("Avarege height of womens: " + sum/(n-mens));
        System.out.println("Number of masculine genders: " + mens);
        sc.close();
    }
}
