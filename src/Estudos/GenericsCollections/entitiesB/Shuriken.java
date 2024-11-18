package Estudos.GenericsCollections.entitiesB;

public class Shuriken {
    private int tamanho;

    public Shuriken(int tamanho) {
        setTamanho(tamanho);
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    @Override
    public String toString() {
        return "Shuriken de tamanho: " + getTamanho() + " centimetros";
    }
}
