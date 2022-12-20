package Task;

import com.sun.security.jgss.GSSUtil;

public class CountSheep {
    private String count = "";

    public CountSheep(){}

    public String countSheep (int a){
        if (a < 0){
            System.out.println("Error");}
            else{
        for(int i = 1; i <= a; i++){
            count = count + (i + " sheeps...");
        }}
        return count;
    }

    public static void main(String[] args) {
        CountSheep number = new CountSheep();
        CountSheep number2 = new CountSheep();
        System.out.println(number.countSheep(5));
        System.out.println(number2.countSheep(-3));
    }
}
