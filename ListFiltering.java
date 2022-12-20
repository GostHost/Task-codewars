package Task;

import java.util.ArrayList;
import java.util.Arrays;

public class ListFiltering {
    private String [] arr;

    public ListFiltering(){}

    public int [] method (String [] arr){
        this.arr = arr;

        int[] arr2 = new int[5];
        try{
        for (int i = 0; i < arr.length; i++){
            arr2[i] = Integer.parseInt(arr[i]);
        }
        System.out.print(Arrays.toString(arr2));
        return arr2;}
        catch (NumberFormatException e) {
            return null;
        }
    }

    public static void main(String[] args) {
        ListFiltering filter = new ListFiltering();
        filter.method(new String[]{"1", "4", "a", "5"});


    }
}
