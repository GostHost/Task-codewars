package Task;

public class CreatePhoneNumber {
    final private int min = 0;
    final private int max = 9;


    public CreatePhoneNumber(){}

    public void number (){
        String tel3 = "+7";
        System.out.print(tel3);
        for(int i = 0; i < 10; i ++){
            int tel1 = (int)(Math.random()*((max - min)+1));
            String tel2 =Integer.toString(tel1);
            System.out.print(tel2);
        }
    }


    public static void main(String[] args) {
        CreatePhoneNumber number = new CreatePhoneNumber();
        number.number();
    }
}
