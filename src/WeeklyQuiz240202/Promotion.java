package WeeklyQuiz240202;

public interface Promotion {
    default double getDiscountAmount(double price){
        return price;
    }
}
