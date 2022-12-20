package Task;

public class EvenOrOdd {
    private int a;

    public EvenOrOdd (){}

    public String method (int a){
        this.a = a;
        String b;
        if(a % 2 == 0){
            b = "Even";
        }
        else
            b = "Odd";
        return b;
    }

    public static void main(String[] args) {
        EvenOrOdd res = new EvenOrOdd();
        System.out.println(res.method(5));
        System.out.println(res.method(10));
    }
}
