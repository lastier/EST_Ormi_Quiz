package WeeklyQuiz02_Anaswer_BigDecimal;

import WeeklyQuiz240202.Product;

import java.math.BigDecimal;

public class LargeAppliance extends Product {
    public LargeAppliance (String name, BigDecimal price, double weight){
        super(name, price, weight);
    }

    public BigDecimal getPrice(){
        return price;
    }

    public double getWeight(){
        return weight;
    }
}
