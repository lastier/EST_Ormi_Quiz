package dailyquiz240130;

public class DailyQuiz02 {
    public static void main(String[] args) {
        // for문을 이용하여 배열에 있는 숫자들의 최대값과 평균을 구하세요.
        int[] array = {12, 4, 7, 20, 1};

        // 코드 작성하는 부분
        // ...
        int max = 0;
        double avg = 0;

        for(int i=0;i<array.length;i++){
                max += array[i];
        }

        avg = max / (double)array.length;

        // 결과 출력 (최대값: max, 평균: avg)
        System.out.println("총 합 : "+max);
        System.out.println("평 균 : "+avg);
    }
}
