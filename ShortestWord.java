package Task;

public class ShortestWord {
    private String str;

    public ShortestWord (){}

    public int method (String str){
        this.str = str;
        int s;
        String [] words  = str.split(" ");
        s = words[0].length();
        for (String word : words){
            if(word.length() < s){
                s = word.length();
            }
        }
        return s;
    }

    public static void main(String[] args) {
        ShortestWord res = new ShortestWord();
        System.out.println(res.method("This is shortest string"));
    }
}
