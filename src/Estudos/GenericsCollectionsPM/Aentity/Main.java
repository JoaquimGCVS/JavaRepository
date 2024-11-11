package Estudos.GenericsCollectionsPM.Aentity;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main (String[] arg) {
        System.out.println("Map interface: ");
        GenericClassTwo<Long,String> mapeador = new GenericClassTwo<>();
        mapeador.addMapElement(1L,"Joaquim");
        mapeador.addMapElement(2L,"Anna");
        System.out.println("Elemento especifico: ");
        mapeador.mapFindByKey(2L);
        System.out.println("Todos:");
        mapeador.mapGetAll();
        mapeador.removeMapElement(2L);
        System.out.println("Depois de remover um: ");
        mapeador.mapGetAll();

        System.out.println();

        System.out.println("List interface:");
        GenericClass<String> lista = new GenericClass<>();
        lista.addListElement("Joaquim");
        lista.addListElement("Anna");
        lista.addListElement("Anna"); //elemento duplicado possivel
        System.out.println("Elemento especifico:");
        lista.getElementByIndex(1);
        System.out.println("Todos:");
        lista.listGetAll();
        System.out.println("Depois de remover um:");
        lista.removeListElement("Anna");
        lista.listGetAll();

        System.out.println();

        System.out.println("Set interface: ");
        GenericClass<String> playlist = new GenericClass<>();
        playlist.addPlaylistElement("NEW MAGIC WANT");
        playlist.addPlaylistElement("See you again");
        playlist.addPlaylistElement("See you again");
        System.out.println("Elemento especifico: ");
        playlist.getSpecificElement("NEW MAGIC WANT");
        System.out.println("Todos:"); // elemento see you again so vai aparecer uma vez
        playlist.playlistGetAll();
        System.out.println("Depois de remover um:");
        playlist.removePlaylistElement("See you again");
        playlist.playlistGetAll();
    }
}
