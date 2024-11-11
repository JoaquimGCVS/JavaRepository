package Estudos.Avaliacao2PM.entitiesG;

public class ConcreteScanner extends Device implements Scannner{
    public ConcreteScanner(String serialNumber) {
        super(serialNumber);
    }
    @Override
    public void procesDoc(String doc) {
        System.out.println("Processando documendo via Scanner");
    }
    @Override
    public String scan(String doc) {
        return "Documento scaneado";
    }
}
