package String.level1;
public class NullPointerDemo {
    public static void generateException() {
        String text = null;
        if (text != null) 
        {
            System.out.println(text.length());
        } 
        else {
            System.out.println("text is null");
        }
    }

    public static void handleException() {
        try {
            String text = null;
            System.out.println(text.length());
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException: " + e);
        }
    }

    public static void main(String[] args) {
        // generateException(); // uncomment to see crash
        handleException();
    }
}
