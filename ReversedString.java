package Task;

public class ReversedString {
    private String word;

    public ReversedString(){}

    public String revers (String word){
        this.word = word;
        String res = "";
        for(int i = 0; i < word.length(); i++){
            res = word.charAt(i) + res;
        }
        return res;
    }

    public static void main(String[] args) {
        ReversedString str = new ReversedString();
        System.out.println(str.revers("Word"));
        System.out.println(str.revers("Revere"));
    }
}
