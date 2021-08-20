public class Instrument {
    public String serialNumber;
    public double price;

    public Instrument(String serialNumber, double price, InstrumentSpec spec) {
    }

    public InstrumentSpec getSpec() {
    }

    public double getPrice() {
        return price;
    }
}
