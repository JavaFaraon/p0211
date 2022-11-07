package abstractclass;

public class Arfa extends Instrument {
    @Override
    protected void playNote(char note) {
        System.out.println("a : " + note);
    }
}
