public class Weekly_Quiz_Java_01 {

    public int solution(int a, int b){
        String first = a+""+b;
        String second = b+""+a;

        int firstInt = Integer.parseInt(first);
        int secondInt = Integer.parseInt(second);

        if(firstInt > secondInt){
            return firstInt;
        }
        return 0;
    }

    public static void main(String[] args) {

    }
}