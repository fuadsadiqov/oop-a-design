
public class Main {

    public static void main(String[] args) {
        DogDoor dogDoor = new DogDoor();
        dogDoor.setAllowedBark(new Bark("Havvvv"));
        dogDoor.setAllowedBark(new Bark("Havvvv"));
        BankRecognizer recognizer = new BankRecognizer(dogDoor);
        Remote remote = new Remote(dogDoor);


        System.out.println("Fido barks to go outside");
        recognizer.recognize(new Bark("Havvvv"));
        System.out.println("Fido has gone outside");
        System.out.println("Fido's all done");
        System.out.println("Fido's back inside");

        try{
            Thread.currentThread().sleep(10000);
        }catch (InterruptedException e){
            System.out.println("Fido starts barking");
            recognizer.recognize(new Bark("Havvvv"));
        }
    }
}