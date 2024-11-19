package Estudos.files;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\jgui9\\Desktop\\temp\\in.txt");
        Scanner sc = null;
        try {
            sc = new Scanner(file);
            while (sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            if (sc != null) {
                sc.close();
            }
        }
    }
}
