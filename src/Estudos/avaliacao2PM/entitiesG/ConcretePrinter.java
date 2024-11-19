package Estudos.avaliacao2PM.entitiesG;

public class ConcretePrinter extends Device implements Printer{
    public ConcretePrinter(String serialNumber) {
        super(serialNumber);
    }
    @Override
    public void procesDoc(String doc) {
        System.out.println("Processando documendo via Printer");
    }

    @Override
    public String print(String doc){
        return "Documento printado";
    }
}
