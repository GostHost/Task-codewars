package Task;

public class RemoveFirstandLastCharacter {
    private String str;

    public RemoveFirstandLastCharacter (){}

    public String remove (String str){
        this.str = str;
        String rem = str.substring(1, str.length() - 1);
        return rem;
    }

    public static void main(String[] args) {
        RemoveFirstandLastCharacter string = new RemoveFirstandLastCharacter();
        System.out.println(string.remove("Bla Bla Bla"));
    }
}
