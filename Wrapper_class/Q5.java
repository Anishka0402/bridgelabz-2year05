public class Q5 {
    public static void main(String[] args) {
        Integer a = 100;
        Integer b = 100;
        Integer c = 200;
        Integer d = 200;

        System.out.println(a == b);      // true (within -128 to 127 cache range)
        System.out.println(c == d);      // false (outside cache range)
        System.out.println(a.equals(b)); // true
        System.out.println(c.equals(d)); // true
    }
}
