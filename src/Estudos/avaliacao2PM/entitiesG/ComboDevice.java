package Estudos.avaliacao2PM.entitiesG;

public class ComboDevice extends Device implements Printer, Scannner{
    public ComboDevice(String serialNumber) {
        super(serialNumber);
    }
    @Override
    public void procesDoc(String doc) {
        System.out.println("Processando documendo via ComboDevice");
    }
    @Override
    public String scan(String doc) {
        return "Documento scaneado";
    }

    @Override
    public String print(String doc){
        return "Documento printado";
    }

}
