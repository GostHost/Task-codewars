package Task;

import java.util.ArrayList;

public class SquareEveryDigit {
    private int num;

    public SquareEveryDigit (){}

    public int method (int num){
        this.num = num;
        String result = "";
        while (num != 0) {
            int digit = num % 10 ;
            result = digit*digit + result ;
            num /= 10 ;
        }
        return Integer.parseInt(result) ;
    }

    public static void main(String[] args) {
        SquareEveryDigit sq = new SquareEveryDigit();
        System.out.println(sq.method(9119));
    }
}
