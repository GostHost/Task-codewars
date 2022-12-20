package Task;

public class AbbreviateaaTwoWordName {
    private String abb;

    public AbbreviateaaTwoWordName (){}

    public String method (String a){
        this.abb = abb;
        String f1 = a.charAt(0) + ".";
        String[] h = a.split(" ");
        String l2 = h[1].charAt(0) + ".";
        return f1 +l2;
    }

    public static void main(String[] args) {
        AbbreviateaaTwoWordName abb1 = new AbbreviateaaTwoWordName();
        System.out.println(abb1.method("Vasya Pupkin"));
        System.out.println(abb1.method("tunba yumba"));
        System.out.println(abb1.method("Rex Tex"));

    }
}
