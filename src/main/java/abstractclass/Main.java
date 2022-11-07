package abstractclass;

public class Main {
    public static void main(String[] args) {
        Instrument drum = new Drum();
        drum.play("bambambam");
        Instrument guitar = new Guitar();
        guitar.play("lalalalal");
        Instrument arfa = new Arfa();
        arfa.play("doremifa");
    }
}
