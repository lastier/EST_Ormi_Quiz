package dailyquiz240201;

public class Book extends Item{
    private String author;
    private String isbn;

    public Book(int id, String name, double price, String author, String isbn){
        super(id, name, price);
        this.author = author;
        this.isbn = isbn;
    }
    public String getAuthor(){
        return author;
    }
    public String getIsbn(){
        return isbn;
    }
    public void showDetails(){
        super.showDetails();
        System.out.println("Author : "+author+", ISBN : "+isbn);
    }
}
