package Task;

public class HowManyArguments {
    private int a;

    public HowManyArguments (){}

    public int how (int [] arr){
        this.a = a;
        a = arr.length;
        return a;
    }

    public static void main(String[] args) {
        HowManyArguments num = new HowManyArguments ();
        System.out.println(num.how(new int[]{1, 20, 3, 4}));
    }
}
