package dailyquiz240130;

public class DailyQuiz03 {
    public static void main(String[] args) {
        // 0부터 20까지 짝수만 출력하는 코드를 작성해보세요.

        for(int i=0 ; i<=20 ; i++){
            if(i%2 == 0){
                System.out.println("짝수 i의 값 : "+i);
            }
        }
    }
}
