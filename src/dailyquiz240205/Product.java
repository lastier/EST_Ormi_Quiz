package dailyquiz240205;

import java.math.BigDecimal;

public abstract class Product {
    private String name;
    private BigDecimal price;
    private double weight;

    public Product(String name, BigDecimal price, double weight){
        this.name=name;
        this.price=price;
        this.weight=weight;
    }
}
