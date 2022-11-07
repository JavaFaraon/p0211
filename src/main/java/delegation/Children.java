package delegation;

public class Children implements FilmType {
    @Override
    public int getPrice(int days) {
        return days;
    }
}
