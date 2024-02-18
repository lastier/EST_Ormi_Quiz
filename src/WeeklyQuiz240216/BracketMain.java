package WeeklyQuiz240216;

import java.util.Iterator;
import java.util.Stack;

public class BracketMain {
    public static void main(String[] args) {

        String input = "((())())";
        String compare1 = "((())())";
        String compare2 = "(()()))(";
        String compare3 = "((())";

        if(input.equals(compare1)){
            System.out.println(true);
        } else{
            System.out.println(false);
        }

        if(input.equals(compare2)){
            System.out.println(true);
        } else{
            System.out.println(false);
        }

        if(input.equals(compare3)){
            System.out.println(true);
        } else{
            System.out.println(false);
        }

    }
}
