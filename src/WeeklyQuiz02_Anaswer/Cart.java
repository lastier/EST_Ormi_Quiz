package WeeklyQuiz02_Anaswer;

public class Cart {
    private Product[] products;

    public Cart(Product[] products){
        this.products = products;
    }

    public int getTotalPrice(){
        int total = 0;
        for(Product product : products){
            total = total+product.price;
        }
        return total;
    }

    public double getTotalWeight(){
        double weight=0;
        for(Product product : products){
//            weight = weight + product.weight;
            weight += product.weight;
        }
        return weight;
    }
}
