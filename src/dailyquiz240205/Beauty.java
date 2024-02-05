package dailyquiz240205;

import java.math.BigDecimal;

public class Beauty extends Product {
    Beauty(String name, BigDecimal price, double weight) {
        super(name, price, weight);
    }

    public BigDecimal getPrice(BigDecimal price){
        return price;
    }

    public double getWeight(double weight){
        return weight;
    }

}
