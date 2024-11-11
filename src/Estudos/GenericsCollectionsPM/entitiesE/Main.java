package Estudos.GenericsCollectionsPM.entitiesE;

import java.util.Scanner;

public class Main {
    public static void main (String[] arg) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Quantos produtos deseja cadastrar?");
        int n = sc.nextInt();
        System.out.println("Preencha os dados:");
        Generic<Long,Product> product = new Generic<>();
        for (int i=0;i<n;i++) {
            System.out.println("Qual o id do produto?");
            Long id = sc.nextLong();
            sc.nextLine();
            System.out.println("Qual o nome do produto?");
            String name = sc.nextLine();
            System.out.println("Qual o valor do produto?");
            Double value = sc.nextDouble();
            product.addElements(id,new Product(name,value));
        }
        System.out.println("Produto mais caro: " + product.max());

    }
}
