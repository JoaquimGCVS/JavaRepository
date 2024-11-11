package Estudos.GenericsCollectionsPM.Aentity;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class GenericClass<T> {
    private List<T> lista;
    private Set<T> playlist;

    public GenericClass() {
        lista = new ArrayList<>();
        playlist = new HashSet<>();
    }

    // List interface
    public void addListElement(T element) {
        lista.add(element);
    }
    public void removeListElement(T element) {
        lista.remove(element);
    }
    public void listGetAll() {
        for (T element : lista) {
            System.out.println(element);
        }
    }
    public void getElementByIndex(int n) {
        System.out.println(lista.get(n));
    }

    // Set interface
    public void addPlaylistElement(T element) {
        playlist.add(element);
    }
    public void removePlaylistElement(T element) {
        playlist.remove(element);
    }
    public void playlistGetAll() {
        for (T element: playlist) {
            System.out.println(element);
        }
    }
    public void getSpecificElement(T element) {
        for(T playlistElement : playlist) {
            if (playlistElement.equals(element)) {
                System.out.println(element);
            }
        }
    }


}
