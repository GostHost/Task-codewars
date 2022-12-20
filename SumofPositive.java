package Task;

public class SumofPositive {
    private int []arr;

    public SumofPositive (){}

    public int method (int [] arr){
        this.arr = arr;
        int res = 0;
        for(int i = 0; i < arr.length; i++){
            if (arr[i] > 0){
                res = res + arr[i];
            }
        }
        return res;
    }

    public static void main(String[] args) {
        SumofPositive sum = new SumofPositive();
        System.out.println(sum.method(new int[]{-5, -1, -2, -3}));

    }
}
