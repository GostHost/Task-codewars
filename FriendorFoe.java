package Task;

public class FriendorFoe {
    public static void main(String[] args) {
        String [] people = new String[]{"Ryan", "Kieran", "Jason", "Yous"};
        for (String s : people){
            if (s.length() == 4){
                System.out.print(s + " ");
            }
        }
    }
}
