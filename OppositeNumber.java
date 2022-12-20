package Task;

public class OppositeNumber {
    private int a;

    public OppositeNumber (){}

    public int method (int a){
        this.a = a;
        int b = - a;
        return b;
    }

    public static void main(String[] args) {
        OppositeNumber num = new OppositeNumber();
        System.out.println(num.method(8));
        int c = 8;
        System.out.println(c + num.method(8));
    }
}
