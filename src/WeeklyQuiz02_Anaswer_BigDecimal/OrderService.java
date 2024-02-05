package WeeklyQuiz02_Anaswer_BigDecimal;

import WeeklyQuiz02_Anaswer_BigDecimal.util.Calculator;

import java.math.BigDecimal;

public class OrderService {
    public static void main(String[] args) {
        Beauty cosmetic = new Beauty("cosmetic", BigDecimal.valueOf(12000), 1.59);
        LargeAppliance tv = new LargeAppliance("TV", BigDecimal.valueOf(35000), 12);
        Grocery grocery = new Grocery("grocery", BigDecimal.valueOf(10000), 0.3);


        Product[] products = {cosmetic, tv, grocery};
        Cart cart = new Cart(products);
        BigDecimal deliveryCharge = Calculator.getDeliveryCharge(cart.getTotalWeight(), cart.getTotalPrice());
        System.out.println("총 배송료 : "+ deliveryCharge);

    }
}
