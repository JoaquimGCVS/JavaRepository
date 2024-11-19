package Estudos.generics.entitiesC;

public class Program {
    public static void main(String[] arg) {
        Familia<Object> familia = new Familia<>();

        familia.addFamiliar(new Mae("Adriana"));
        familia.addFamiliar(new Pai("Anderson"));
        familia.addFamiliar(new Namorada("Anna"));

        System.out.println("Familia: ");
        familia.getAll();

    }
}
