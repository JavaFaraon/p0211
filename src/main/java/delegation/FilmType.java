package delegation;

public interface FilmType {
    FilmType CHILDREN = days -> days;
    FilmType REGULAR = days -> 2 * days;
    FilmType NEW_FILM = days -> 3 * days;

    int getPrice(int days);
}
