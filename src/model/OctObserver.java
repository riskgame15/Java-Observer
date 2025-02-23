import abstracts.Observer;
import abstracts.Subject;

public class OctObserver extends Observer {

    public OctObserver(Subject subject) {
        super(subject);
    }

    public void update() {
        System.out.print(" Oct: " + Integer.toOctalString(super.getSubject().getState()) + "\t");
    }
}