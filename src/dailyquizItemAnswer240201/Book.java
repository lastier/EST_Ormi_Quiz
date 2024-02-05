package dailyquizItemAnswer240201;

public class Book extends Item{
    String author;
    String isbn;
    Book(int id, String name, int price, String author, String isbn){
        super(id, name, price);
        this.author = author;
        this.isbn = isbn;
    }

    public String toString(){
        return """
                Name : %s;
                ID : %s;
                Price : %s;
                Author : %s;
                ISBN : %s;
                """.formatted(this.name, this.id, this.price, this.author, this.isbn);
    }


}
