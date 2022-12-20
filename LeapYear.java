package Task;

public class LeapYear {
    boolean isLeap;

    public LeapYear (){}

    public boolean isLeapYear (int a){
        if (a % 4 == 0){
            isLeap = true;
        }
        else isLeap = false;
        return isLeap;
    }

    public static void main(String[] args) {
        LeapYear year = new LeapYear();

        System.out.println(year.isLeapYear(2016));
    }
}
