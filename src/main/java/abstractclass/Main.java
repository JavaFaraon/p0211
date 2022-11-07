package abstractclass;

public class Main {
    public static void main(String[] args) {
        Instrument drum = new Drum();
        drum.play("dfghfghfg");
        Instrument guitar = new Guitar();
        drum.play("lalalalal");
        Instrument arfa = new Arfa();
        drum.play("doremifa");
    }
}
