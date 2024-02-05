package dailyquizItemAnswer240201;

public class ItemManager {
    public static void main(String[] args) {
        Book book = new Book(1,"Queen Of The South", 13000, "아르투로 페레스 레베르테", "123456789");
        book.print();

        Album album = new Album(2,"PokerFace", 10000);
        album.print();

        Movie movie = new Movie(3, "Titanic", 15000);
        movie.print();
    }
}
