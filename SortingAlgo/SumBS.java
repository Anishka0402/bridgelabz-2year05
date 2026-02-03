import java.util.Arrays;

public class SumBS {
    public static boolean binarySearch(int[] arr, int left, int right, int num) {
            while (left <= right) {
                int mid = left + (right - left) / 2;

                if (arr[mid] == num)
                    return true;
                else if (arr[mid] < num)
                    left = mid + 1;
                else
                    right = mid - 1;
            }
            return false;
        }

        public static void comp(int[] arr, int target) {
            Arrays.sort(arr);

            for (int i = 0; i < arr.length; i++) {
                int complement = target - arr[i];

                if (binarySearch(arr, i + 1, arr.length - 1, complement)) {
                    System.out.println("yes present");
                    return;
                }
            }
            System.out.println("Not present");
        }

        public static void main(String[] args) {
            int[] arr = {6, 2, 8, 1, 10, 4};
            int target = 20;

            comp(arr, target);
        }
    }




