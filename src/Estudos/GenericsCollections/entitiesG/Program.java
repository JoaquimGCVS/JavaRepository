package Estudos.GenericsCollections.entitiesG;

import java.util.Scanner;

public class Program {
    public static void main (String[] arg) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many values: ");
        int n = sc.nextInt();
        Generic<Integer> array= new Generic<>();
        for (int i=0;i<n;i++) {
            int value = sc.nextInt();
            array.addElement(value);
        }
        array.getAll();
        System.out.println("First: " + array.getEspecificValue(0));
        sc.close();
    }
}
