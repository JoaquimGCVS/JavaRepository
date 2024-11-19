package Estudos.generics.entitiesA;

import java.util.ArrayList;

public class Main {
    public static void main(String[] arg) {
        Pair<String,Integer> p1 = new Pair<>("Galo",1);
        Pair<String,Integer> p2;
        p2 = new Pair<>("Vasco",2);

        System.out.println(p1);
        System.out.println(p2);

        ArrayList<Pair<String,Integer>> list1 = new ArrayList<>();
        list1.add(p1);
        ArrayList<Pair<String,Integer>> list2 = new ArrayList<Pair<String,Integer>>(); //repetir o tipo depois eh inutil
        list2.add(p2);

        System.out.println("List 1: ");
        for(Pair<String,Integer> pair : list1) {
            System.out.println(pair);
        }

    }
}
