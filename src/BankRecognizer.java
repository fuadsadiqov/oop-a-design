import java.util.Iterator;
import java.util.List;

public class BankRecognizer {
    private DogDoor door;

    public BankRecognizer(DogDoor door) {
        this.door = door;
    }

    public void recognize(Bark bark) {
        door.equals(bark);
        System.out.println("Bank recognizing " + bark + ". ");
    }
}
