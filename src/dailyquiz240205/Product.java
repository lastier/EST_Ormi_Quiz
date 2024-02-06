package dailyquiz240205;

import java.math.BigDecimal;

public abstract class Product {
    String name;
    BigDecimal price;
    double weight;

    public Product(String name, BigDecimal price, double weight) {
        this.name = name;
        this.price = price;
        this.weight = weight;
    }
}
