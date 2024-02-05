package dailyquiz240201;

public class Album extends Item{
    private String artist;

    public Album(int id, String name, double price, String artist){
        super(id, name, price);
        this.artist = artist;
    }

    public String getArtist(){
        return artist;
    }

    public void showDetails(){
        super.showDetails();
        System.out.println("Artist : "+artist);
    }
}
