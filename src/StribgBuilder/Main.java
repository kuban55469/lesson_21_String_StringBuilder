package StribgBuilder;

public class Main {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder("Java");
        System.out.println(stringBuilder);
        System.out.println("CharAt: " + stringBuilder.charAt(1));
        stringBuilder.setCharAt(0,'j');
        System.out.println("Set char At: " + stringBuilder);
        System.out.println("Append: " + stringBuilder.append(" 8 "));
        System.out.println(stringBuilder.insert(5, '8'));
        System.out.println(stringBuilder.reverse());
        //полиндром деген эмне??
        System.out.println(stringBuilder.delete(0, 2));
        
    }
}