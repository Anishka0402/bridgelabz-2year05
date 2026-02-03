public class Rotatearray {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int k = 2;
//        int[] arr = new int[n];
//        for (int i = 0; i < n; i++) {
//            arr[i] = sc.nextInt();
//        }
//        k = k % n;
//
//
//        for (int r = 0; r < k; r++) {
//            int first = arr[0];
//            for (int i = 0; i < n - 1; i++) {
//                arr[i] = arr[i + 1];
//            }
//            arr[n - 1] = first;
//        }
//
//        System.out.println("Rotated Array:");
//        for (int x : arr) {
//            System.out.print(x + " ");
//        }
//    }
    static void ra(int[] arr, int d){
        int n =arr.length;
        d%=n;
        reverse(arr,0,n-1-d);
        reverse(arr,n-d,n-1);
        reverse(arr,0,n-1);

    }
    static void reverse(int[] arr,int start,int end){
        while(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int d = 2;

        ra(arr, d);

        // Print rotated array
        for (int x : arr) {
            System.out.print(x + " ");
        }
    }
}
