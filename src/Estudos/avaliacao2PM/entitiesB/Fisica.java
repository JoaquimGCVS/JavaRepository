package Estudos.avaliacao2PM.entitiesB;

public class Fisica extends Pessoa{
    private double gastosSaude;
    public Fisica(String nome, double rendaAnual, double gastosSaude) {
        super(nome, rendaAnual);
        setGastosSaude(gastosSaude);
    }
    public double getGastosSaude() {
        return gastosSaude;
    }
    public void setGastosSaude(double gastosSaude){
        this.gastosSaude=gastosSaude;
    }
    @Override
    public double calcImposto() {
        if (super.getRendaAnual()<20000 && gastosSaude!=0) {
            return (super.getRendaAnual()*0.15) - (gastosSaude*0.5);
        }
        else if (super.getRendaAnual()<20000 && gastosSaude==0) {
            return super.getRendaAnual()*0.15;
        }
        else if (super.getRendaAnual()>20000 && gastosSaude!=0){
            return super.getRendaAnual()*0.25 - (gastosSaude*0.5);
        }
        else {
            return super.getRendaAnual()*0.25;
        }
    }

}
