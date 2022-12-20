package Task;

import java.util.Formatter;

public class StringInsert {
    public static void main(String[] args) {
        Formatter str = new Formatter();
        str.format ("Hello %s - make me a %s", "John", "bar");
        System.out.println(str);


    }


}
