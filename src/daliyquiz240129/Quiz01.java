package daliyquiz240129;

public class Quiz01 {
    public static void main(String[] args) {

        //연산자 우선순위, 23
        int a = 5, b = 10;
        int result = a + b * 2 - 4 / 2;
        System.out.println(result);

        //증감연산자, 12
        int x = 5;
        int result1 = x++ + ++x;
        System.out.println(result1);

        //논리, 조건 연산자
        boolean aa = true, bb = false;
        boolean result2 = aa || (bb && !aa);
        System.out.println(result2+"\n");

        //복합 대입 연산자
        int a1 = 5;
        int b1 = 10;
        System.out.println(a1 *= b1 + 3);

        //삼항연산자
        int x1 = 5;
        int y1 = 10;
        int result3 = (x1 > y1) ? (x1 + y1) : (x1 - y1);
        System.out.println(result3);

        //비트연산자
        int a2 = 5; // 0101 in binary
        int b2 = 3; // 0011 in binary
        int result4 = a2 & b2;
        System.out.println(result4);
        System.out.println("2진수 값 : " + Integer.toBinaryString(a2));
        System.out.println("2진수 값 : " + Integer.toBinaryString(b2));
    }
}
