package WeeklyQuiz240202;

public abstract class Product {
    private String name;
    private double price;
    private double weight;
    public Product(String name, double price, double weight){
        this.name=name;
        this.price=price;
        this.weight=weight;
    }

    public String getName(String name){
        return name;
    }

    public double getPrice(double price){
        return price;
    }

    public double getWeight(double weight){
        return weight;
    }

}
