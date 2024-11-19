package Estudos.files.E;

import java.io.File;
import java.util.Scanner;
public class Program {
 public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entera folder path: ");  //C:\Users\jgui9\Desktop\PROJETOS INTELLJ\ExerciciosCurso\src\Estudos\files
        String strPath = sc.nextLine();
        File path = new File(strPath);
        File[] folders = path.listFiles(File::isDirectory);
        System.out.println("FOLDERS:");
        for(File folder : folders) {
            System.out.println(folder);
        }
        File[] files= path.listFiles(File::isFile);
        System.out.println("FILES:");
        for(File file : files) {
            System.out.println(file);
        }
        boolean success= new File(strPath + "\\subdir").mkdir(); // cria subaqruivo no path passado
        System.out.println("Directory created successfully: "+ success);
        sc.close();
    }
}
