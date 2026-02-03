import java.util.*;
public class MaxSubarraySum {
    static int  MaxSubarray(int[] arr) {
        int currentsum = arr[0];
        int maxsum = arr[0];


        for (int i = 0; i < arr.length; i++) {
            int Current = 0;
            for (int j = i; j < arr.length; j++) {
                Current = Current + arr[j];

                maxsum = Math.max(maxsum, Current);

            }
        }
        return maxsum;
    }

    public static void main(String[] args) {
        int [] arr={1,-11,7,3,-4,2};
        System.out.println(MaxSubarray(arr));
    }
}
