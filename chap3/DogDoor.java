import java.util.LinkedList;
import java.util.List;

public class DogDoor {

    private boolean open;
    private List allowedBarks;

    public DogDoor() {
        this.allowedBarks = new LinkedList();
        open = false;
    }

    public void open() {
        System.out.println("The dog door opens.");
        open = true;
    }

    public void close() {
        System.out.println("The dog door closes.");
        open = false;
    }

    public boolean isOpen() {
        return open;
    }

    public void addAllowedBark(Bark bark) {
        allowedBarks.add(bark);
    }

    public List getAllowedBarks() {
        return allowedBarks;
    }
}
