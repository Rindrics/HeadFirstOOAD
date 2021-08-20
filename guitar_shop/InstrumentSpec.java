import java.util.Iterator;
import java.util.Map;

public class InstrumentSpec {
    public String model;
    private Map properties;

    public InstrumentSpec(Map properties) {
    }

    public String getProperty(String propertyName) {
    }

    public Map getProperties() {
        return properties;
    }

    public boolean matches(InstrumentSpec otherSpec) {
        for (Iterator i = otherSpec.getProperties().keySet().iterator();
             i.hasNext();) {
            String propertyName = (String)i.next();
            if (!properties.get(propertyName).equals(otherSpec.getProperty(propertyName))) {
                return false;
            }
        }
        return true;
    }
}
