package Estudos.GenericsCollectionsPM.entitiesG;

import java.util.Scanner;

public class ProgramTwo {
    public static void main (String[] arg) {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many values: ");
        int n = sc.nextInt();
        sc.nextLine();
        Generic<String> array= new Generic<>();
        for (int i=0;i<n;i++) {
            String value = sc.nextLine();
            array.addElement(value);
        }
        array.getAll();
        System.out.println("First: " + array.getEspecificValue(0));
    }
}
