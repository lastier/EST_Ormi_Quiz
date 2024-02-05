package dailyquiz240201;

public class ItemManager{
    public static void main(String[] args) {
        Album album = new Album(7, "Poker Face", 20, "Lady GaGa\n");
        Movie movie = new Movie(3, "The Dark knight Rises",25, "Christopher Nolan", "Bruce Wayne\n");
        Book book = new Book(2, "Little Prince", 10, "Saint", "112345789");

        album.showDetails();
        movie.showDetails();
        book.showDetails();

    }
}
