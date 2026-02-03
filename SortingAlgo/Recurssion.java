public class Recurssion {
//    static int sum(int n) {
//        if (n == 1)
//            return 1;
//        return n + sum(n - 1);
//    }
//
//    public static void main(String[] args) {
//        int n = 5;
//        System.out.println(sum(n));
//    }
//    static int fact(int n){
//        if (n==0)
//            return 1;
   //       int fact=n* fact(n-1);
//       return fact;
//    }
//    public static void main(String[] args) {
//        int n = 4;
//       System.out.println(fact(n));
// }
//static int fib(int n) {
//    if (n == 0)
//        return 0;
//    if (n == 1)
//        return 1;
//    return fib(n - 1) + fib(n - 2);
//}
//    public static void main(String[] args) {
//        int n = 10;
//        for(int i=0;i<n;i++){
//            System.out.print(fib(n)+"");}
//
//
//    }


//    static boolean isPalindrome(String s, int start, int end) {
//
//        // Base case
//        if (start >= end)
//            return true;
//
//        // If characters don't match
//        if (s.charAt(start) != s.charAt(end))
//            return false;
//
//        // Recursive call
//        return isPalindrome(s, start + 1, end - 1);
//    }
//
//    public static void main(String[] args) {
//
//        String s = "madam";
//
//        if (isPalindrome(s, 0, s.length() - 1))
//            System.out.println("Palindrome");
//        else
//            System.out.println("Not Palindrome");
//    }


    static int sum(int[] arr, int index, int total) {

        // Base case
        if (index == arr.length)
            return total;

        // Tail recursive call
        return sum(arr, index + 1, total + arr[index]);
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};

        int result = sum(arr, 0, 0);
        System.out.println( result);
    }
}



