package delegation;

public class NewFilm implements FilmType {
    @Override
    public int getPrice(int days) {
        return days * 3;
    }
}
