package Estudos.generics.entitiesA;

public class Pair<T, S> { //tipos genericos
    private T first;
    private S second;

    public Pair(T first, S second) {
        this.first = first;
        this.second = second;
    }

    public T getFirst() {
        return first;
    }

    public void setFirst(T first) {
        this.first=first;
    }

    public S getSecond() {
        return second;
    }

    public void setSecond(S second) {
        this.second=second;
    }

    public String toString() {
        return "Key: " + getFirst() + ", Value: " + getSecond();
    }
}
