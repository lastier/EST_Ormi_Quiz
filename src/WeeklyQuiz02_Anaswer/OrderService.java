package WeeklyQuiz02_Anaswer;

import WeeklyQuiz02_Anaswer.util.Calculator;

public class OrderService {
    public static void main(String[] args) {
        Beauty cosmetic = new Beauty("cosmetic",12000, 1.59);
        LargeAppliance tv = new LargeAppliance("TV", 35000, 12);
        Grocery grocery = new Grocery("grocery", 10000, 0.3);


        Product[] products = {cosmetic, tv, grocery};
        Cart cart = new Cart(products);
        int deliveryCharge = Calculator.getDeliveryCharge(cart.getTotalWeight(), cart.getTotalPrice());
        System.out.println("총 배송료 : "+ deliveryCharge);

    }
}
