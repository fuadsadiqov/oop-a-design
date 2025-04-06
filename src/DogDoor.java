import java.util.*;

public class DogDoor {
    private boolean open;
    private List<Bark> allowedBarks = new ArrayList<Bark>();

    public DogDoor() {
        open = false;
    }

    public void open() {
        System.out.println("The dog door opens");
        open = true;

        final Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            public void run() {
                close();
                timer.cancel();
            }
        }, 5000);
    }

    public void close() {
        System.out.println("The dog door closes");
        open = false;
    }

    public boolean isOpen() {
        return open;
    }

    public List<Bark> getAllowedBarks() {
        return allowedBarks;
    }

    public void setAllowedBark(Bark allowedBark) {
        this.allowedBarks.add(allowedBark);
    }

    public void equals(Bark bark) {
        List<Bark> allowedBarks = getAllowedBarks();
        for (Iterator i = allowedBarks.iterator(); i.hasNext(); ) {
            Bark allowedBark = (Bark) i.next();
            if(allowedBark.equals(bark)){
                open();
            }
        }
    }
}
