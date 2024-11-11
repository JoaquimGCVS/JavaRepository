package Estudos.ExercicosArrays.entitiesB;

import java.util.Scanner;

public class Main {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Write the number of elements for the array of products:");
        int n= sc.nextInt();
        System.out.println("Now digit the names and prices");
        Product[] product = new Product[n];
        for (int i=0;i<n;i++) {
            System.out.println("Name: ");
            String name=sc.next();
            sc.nextLine();
            System.out.println("Price: ");
            double price= sc.nextDouble();
            sc.nextLine();
            product[i] = new Product(name,price);
        }
        double sum=0.0;
        for(int i=0;i<n;i++) {
            sum+=product[i].getPrice();
        }

        System.out.println("The avarege price of products is: " + sum/product.length);
    }
}
