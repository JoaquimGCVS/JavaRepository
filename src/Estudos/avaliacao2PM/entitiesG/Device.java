package Estudos.avaliacao2PM.entitiesG;

public abstract class Device {
    private String serialNumber;
    public Device(String serialNumber) {
        setSerialNumber(serialNumber);
    }

    public String getSerialNumber() {
        return serialNumber;
    }
    public void setSerialNumber(String serialNumber) {
        this.serialNumber=serialNumber;
    }

    public abstract void procesDoc(String doc);
}
