public class Guitar extends Instrument {
    private String serialNumber, model;
    private Builder builder;
    private InstrumentSpec spec;

    public Guitar(String serialNumber, double price,
                  InstrumentSpec spec) {
        this.serialNumber = serialNumber;
        this.price = price;
        this.spec = spec;
    }
    public void setPrice(double newPrice) {
        this.price = newPrice;
    }
}
