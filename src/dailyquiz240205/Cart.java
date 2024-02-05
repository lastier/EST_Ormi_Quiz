package dailyquiz240205;

import java.math.BigDecimal;

public class Cart {
    private Product[] products;

    public Cart(WeeklyQuiz02_Anaswer_BigDecimal.Product[] products){
        this.products = products;
    }
    public int getTotalPrice() {
        BigDecimal total = BigDecimal.ZERO;
        for (WeeklyQuiz02_Anaswer_BigDecimal.Product product : products) {
            total = total.add(product.price);
        }
        return total;
    }

    public double getTotalWeight() {
        double weight = 0;
        for (WeeklyQuiz02_Anaswer_BigDecimal.Product product : products) {
//            weight = weight + product.weight;
            weight += product.weight;
        }
        return weight;
    }

}
