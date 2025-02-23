import abstracts.Observer;
import abstracts.Subject;

public class IntSubject extends Subject {

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }
}