package WeeklyQuiz02_Anaswer;

import WeeklyQuiz240202.DeliveryChargeCalculator;
import WeeklyQuiz240202.Product;

public class Beauty extends Product {
    public Beauty(String name, int price, double weight){
        super(name, price, weight);
    }

    public int getPrice(){
        return price();
    }

    public double getWeight(){
        return weight();
    }

}
