package WeeklyQuiz02_Anaswer_BigDecimal;

import java.math.BigDecimal;

public class Cart {
    private Product[] products;

    public Cart(Product[] products){
        this.products = products;
    }

    public int getTotalPrice(){
        BigDecimal total = BigDecimal.ZERO;
        for(Product product : products){
            total = total.add(product.price);
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
