package Estudos.ExercicosArrays.entitiesE;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Quantas pessoas serao digitadas? ");
        int n =sc.nextInt();
        sc.nextLine();
        Pessoa[] pessoa = new Pessoa[n];
        double sum = 0.0;
        for(int i=0;i<n;i++) {
            System.out.println("Dados da " + (i + 1) + "a pessoa: ");
            System.out.println("Nome: ");
            String name = sc.nextLine();
            System.out.println("Idade: ");
            int age = sc.nextInt();
            System.out.println("Altura: ");
            double height = sc.nextDouble();
            sum+=height;
            sc.nextLine();
            pessoa[i] = new Pessoa(name,age,height);
        }
        int menores=0;
        String[] names = new String[n];
        for(int i=0;i<pessoa.length;i++) {
            if(pessoa[i].getAge()<16) {
                menores++;
                names[i] = pessoa[i].getName();
            }
        }
        System.out.println("Altura media: " + sum/pessoa.length);
        System.out.println("Pessoas com menos de 16 anos: " + ((double)menores*100 / pessoa.length) + "%");
        for (String string: names) {
            if(string!=null) {
                System.out.println(string);
            }
        }
        sc.close();
    }

}
