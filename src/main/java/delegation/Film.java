package delegation;

public class Film {

    private FilmType type = FilmType.NEW_FILM;

    public void setType(FilmType type) {
        this.type = type;
    }

    // новинка (3)
    // детский (1)
    // обычный (2)
    public int price(int days){
        return type.getPrice(days);
    }
}
