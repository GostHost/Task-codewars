package Task;

public class CreditCardMask {
    private String str;

    public CreditCardMask (){}

    public String method (String str){
        if (str.length() < 4) {
            return str;
        } else {
            String newStr = "";
            for (Integer i = 0; i < str.length(); i++) {
                if (i >= 4) {
                    newStr += "#";
                }
            }
            newStr += str.substring(str.length() - 4);
            return newStr;
        }
    }
    public static void main(String[] args) {
        CreditCardMask cred = new CreditCardMask();
        System.out.println(cred.method("Your secret question"));
        System.out.println(cred.method("Answer"));

    }
}
