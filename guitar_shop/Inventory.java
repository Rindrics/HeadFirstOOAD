import java.util.List;
import java.util.LinkedList;
import java.util.Iterator;

public class Inventory {
    private List<Instrument> instruments;

    public Inventory() {
        instruments = new LinkedList<Instrument>();
    }

    public void addInstrument(String serialNumber, double price,
                          InstrumentSpec spec) {
        Instrument instrument = new Instrument(serialNumber, price, spec);
        instruments.add(instrument);
    }
    public Instrument getInstrument(String serialNumber) {
        for (Iterator i = instruments.iterator(); i.hasNext();) {
            Instrument instrument = (Instrument)i.next();
            if (instrument.getSerialNumber().equals(serialNumber)) {
                return instrument;
            }
        }
        return null;
    }
    public List search(InstrumentSpec searchInstrument) {
        for (Iterator i = instruments.iterator(); i.hasNext();) {
            Instrument instrument = (Instrument)i.next();
			if (searchInstrument.getBuilder() != instrument.getBuilder())
				continue;
            String model = searchInstrument.getModel().toLowerCase();
            if ((model != null) && (!model.equals("")) &&
                (!model.equals(instrument.getModel().toLowerCase())))
                continue;
			if (searchInstrument.getType() != instrument.getType())
				continue;
			if (searchInstrument.getBackWood() != instrument.getBackWood())
				continue;
			if (searchInstrument.getTopWood() != instrument.getTopWood())
				continue;
			return instrument;
        }
		return null;
    }
}
