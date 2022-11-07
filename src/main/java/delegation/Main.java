package delegation;

public class Main {
    public static void main(String[] args) {
        Film f = new Film();
        System.out.println(f.price(4));

        f.setType(FilmType.REGULAR);
        System.out.println(f.price(4));
    }
}
