package Task;

public class VowelCount {
    public static void main(String[] args) {
         String a = "adhfyriovndah";
         int b = 0;
         for (int i = 0; i < a.length(); i++) {
             String [] arr = a.split("");
             if (arr[i].equals("a") ||arr[i].equals("e") || arr[i].equals("i") || arr[i].equals("o")){
                 b ++;
             }
         }
        System.out.print(b);
    }
}
