import java.util.*;

public class RandomNumbers {
    public static int[] generate4DigitRandomArray(int size) {
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = 1000 + (int)(Math.random() * 9000);
        }
        return arr;
    }

    public static double[] findAverageMinMax(int[] arr) {
        int min = arr[0], max = arr[0], sum = 0;
        for (int val : arr) {
            sum += val;
            min = Math.min(min, val);
            max = Math.max(max, val);
        }
        double avg = (double)sum / arr.length;
        return new double[] {avg, min, max};
    }

    public static void main(String[] args) {
        int[] arr = generate4DigitRandomArray(5);
        System.out.println("Generated numbers: " + Arrays.toString(arr));
        double[] res = findAverageMinMax(arr);
        System.out.println("Average=" + res[0] + " Min=" + res[1] + " Max=" + res[2]);
    }
}
