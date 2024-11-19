package Estudos.files.C;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main (String[] args) {
        String path = "C:\\Users\\jgui9\\Desktop\\PROJETOS INTELLJ\\ExerciciosCurso\\src\\Estudos\\files\\in.txt";
        try (BufferedReader br = new BufferedReader(new FileReader(path))){
            String line = br.readLine();
            while (line!=null) {
                System.out.println(line);
                line = br.readLine();
            }
        } catch (IOException e) {
            System.out.printf("Error: " + e.getMessage());
        }
    }
}
