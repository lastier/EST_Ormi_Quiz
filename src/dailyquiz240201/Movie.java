package dailyquiz240201;

public class Movie extends Item{
    private String director;
    private String actor;

    public Movie(int id, String name, double price, String director, String actor){
        super(id, name, price);
        this.director = director;
        this.actor = actor;
    }
    public String getDirector(){
        return director;
    }
    public String getActor(){
        return actor;
    }
    public void showDetails(){
        super.showDetails();
        System.out.println("Director : "+director+", Actor : "+actor);
    }
}
