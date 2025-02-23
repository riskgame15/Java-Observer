import abstracts.Observer;
import abstracts.Subject;

public class HexObserver extends Observer {

    public HexObserver(Subject subject) {
        super(subject);
    }

    public void update() {
        System.out.print(" Hex: " + Integer.toHexString(super.getSubject().getState()) + "\t");
    }
}