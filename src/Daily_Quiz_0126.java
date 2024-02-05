public class Daily_Quiz_0126 {
    public static void main(String[] args) {
        /* 1번
         * serialNo는 15자리의 숫자로 이루어져 있습니다.
         * serialNo 변수를 선언하는 한 줄의 코드를 적으세요.
         */
        String serialNo = "123456789101112\n";
        System.out.println(serialNo);

        //2번 문장들의 출력 결과를 확인
        System.out.println("10" + "04");
        System.out.println("" + false);
        System.out.println('a' + 100+"\n");

        //3. 에러가 발생하는 부분 고치기
        byte a = 9; //byte는 -127 ~ 127까지 표현 가능
        char b = 'a';
        double c = 1.23d; //d가 오려면 double로 선언해야 한다. f는 float

        System.out.println(100+10.5);
        System.out.println(100/5);
        System.out.println(10.0/5+"\n");

        char cc = '\uAC00';
        System.out.println(cc+"\n");


        int x = 1;
        int y = 20;
        int z = 300;

        int temp = x;
        x = y;
        y = z;
        z = temp;


        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("z = " + z);


//        String strValue1 = String.valueOf(x);
//        String strValue2 = String.valueOf(y);
//        String strValue3 = String.valueOf(z);
//
//        System.out.println("x = " + strValue1.replaceAll("1", "20"));
//        System.out.println("y = " + strValue2.replaceAll("20", "300"));
//        System.out.println("z = " + strValue3.replaceAll("300", "1"));


    }
}
