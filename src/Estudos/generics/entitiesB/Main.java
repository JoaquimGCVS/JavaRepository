package Estudos.generics.entitiesB;

public class Main {
    public static void main (String[] arg) {
        // instanciar classe generica
        BagNinja<Object> bagninja = new BagNinja<>();

        // adicionar ferramentas
        System.out.println("Itens da bolsa ninja: ");
        bagninja.addFerramenta(new Kunai("KunaiDoJoaquim"));
        bagninja.addFerramenta(new Kunai("KunaiDoPedro"));
        bagninja.addFerramenta(new Pergaminho("PergaminhoDoPedro"));
        bagninja.addFerramenta(new Pergaminho("PergaminhoDoJoaquim"));
        bagninja.addFerramenta(new Shuriken(10));
        bagninja.addFerramenta(new Shuriken(15));

        // listar a bag ninja
        bagninja.getFerramentas();
    }
}
