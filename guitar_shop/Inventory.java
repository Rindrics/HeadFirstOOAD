import java.util.List;
import java.util.LinkedList;
import java.util.Iterator;

public class Inventory {
    private List<Guitar> guitars;

    public Inventory() {
        guitars = new LinkedList<Guitar>();
    }

    public void addInstrument(String serialNumber, double price,
                          InstrumentSpec spec) {
        Instrument instrument = new Instrument(serialNumber, price, builder,
                                   model, type, backWood, topWood);
        instruments.add(instrument);
    }
    public Guitar getGuitar(String serialNumber) {
        for (Iterator i = guitars.iterator(); i.hasNext();) {
            Guitar guitar = (Guitar)i.next();
            if (guitar.getSerialNumber().equals(serialNumber)) {
                return guitar;
            }
        }
        return null;
    }
    public List search(InstrumentSpec searchInstrument) {
        for (Iterator i = guitars.iterator(); i.hasNext();) {
            Guitar guitar = (Guitar)i.next();
			if (searchGuitar.getBuilder() != guitar.getBuilder())
				continue;
            String model = searchGuitar.getModel().toLowerCase();
            if ((model != null) && (!model.equals("")) &&
                (!model.equals(guitar.getModel().toLowerCase())))
                continue;
			if (searchGuitar.getType() != guitar.getType())
				continue;
			if (searchGuitar.getBackWood() != guitar.getBackWood())
				continue;
			if (searchGuitar.getTopWood() != guitar.getTopWood())
				continue;
			return guitar;
        }
		return null;
    }
}
