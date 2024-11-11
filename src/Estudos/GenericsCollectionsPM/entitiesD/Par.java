package Estudos.GenericsCollectionsPM.entitiesD;

public class Par<T,S> {
    private T primeiro;
    private S segundo;

    public Par(T primeiro, S segundo) {
        setPrimeiro(primeiro);
        setSegundo(segundo);
    }

    public T getPrimeiro() {
        return primeiro;
    }

    public void setPrimeiro(T primeiro) {
        this.primeiro=primeiro;
    }

    public S getSegundo() {
        return segundo;
    }

    public void setSegundo(S segundo) {
        this.segundo=segundo;
    }

    public void trocar() {
        T temp = this.primeiro;
        this.primeiro = (T)segundo;
        this.segundo = (S) temp;
    }

    @Override
    public String toString() {
        return "Primeiro: " + getPrimeiro() + ", Segundo: " + getSegundo();
    }
}
