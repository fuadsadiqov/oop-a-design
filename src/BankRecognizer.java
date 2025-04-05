public class BankRecognizer {
    private DogDoor door;

    public BankRecognizer(DogDoor door) {
        this.door = door;
    }

    public void recognize(Bark bark) {
        System.out.println("Bank recognizing " + bark + ". ");
        door.open();
    }
}
