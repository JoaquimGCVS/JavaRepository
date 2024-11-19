package Estudos.avaliacao2PM.entitiesB;

public class Juridica extends Pessoa{
    private int numFuncionarios;

    public Juridica(String nome, double rendaAnual, int numFuncionarios) {
        super(nome, rendaAnual);
        setNumFuncionarios(numFuncionarios);
    }

    public int getNumFuncionarios() {
        return numFuncionarios;
    }
    public void setNumFuncionarios(int numFuncionarios) {
        this.numFuncionarios=numFuncionarios;
    }

    @Override
    public double calcImposto(){
        if(numFuncionarios>=10) {
            return super.getRendaAnual()*0.14;
        }
        else {
            return super.getRendaAnual()*0.16;
        }
    }

}
