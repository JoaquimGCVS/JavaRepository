package Estudos.GenericsCollectionsPM.entitiesB;

public class Pergaminho {
    private String conteudo;

    public Pergaminho(String conteudo) {
        setConteudo(conteudo);
    }

    public String getConteudo() {
        return conteudo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }

    @Override
    public String toString() {
        return "Pergaminho: " + getConteudo();
    }
}
