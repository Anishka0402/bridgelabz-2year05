public class Q7 {
    public static void main(String[] args) {
        int num = 25;
        Integer obj = Integer.valueOf(num);  // int → Integer
        System.out.println("Integer: " + obj);

        String str = obj.toString();         // Integer → String
        System.out.println("String: " + str);

        Integer num2 = Integer.parseInt(str); // String → Integer
        System.out.println("Converted back: " + num2);
    }
}
