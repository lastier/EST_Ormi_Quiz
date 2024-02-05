package WeeklyQuiz02_Anaswer.util;

public class Calculator {
    public static int getDeliveryCharge(double weight, double price){
        int baseDeliveryCharge = getBaseDeliveryCharge(double weight);

        //무게 3키로 미만 1000, 3-10키로 5000
        int deliveryCharge=0;
        if(weight<3.0){
            deliveryCharge = 1000;
        }else if(weight >=3 && weight < 10){
            deliveryCharge = 5000;
        }else{
            deliveryCharge = 10000;
        }
        return deliveryCharge;
    }
}
