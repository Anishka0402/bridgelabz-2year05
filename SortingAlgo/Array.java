
import java.util.Arrays;

public class Array {

        public static void main(String[] args) {
            int[] arr1 = {1, 3, 5};
            int[] arr2 = {2, 4, 6};

            // Step 1: Sort arrays
            Arrays.sort(arr1);
            Arrays.sort(arr2);

            // Step 2: Merge arrays
            int n1 = arr1.length;
            int n2 = arr2.length;
            int[] merged = new int[n1 + n2];

            int i = 0, j = 0, k = 0;

            while (i < n1 && j < n2) {
                if (arr1[i] < arr2[j])
                    merged[k++] = arr1[i++];
                else
                    merged[k++] = arr2[j++];
            }

            while (i < n1)
                merged[k++] = arr1[i++];

            while (j < n2)
                merged[k++] = arr2[j++];

            // Step 3: Find median
            int n = merged.length;
            double median;

            if (n % 2 == 0)
                median = (merged[n/2 - 1] + merged[n/2]) / 2.0;
            else
                median = merged[n/2];

            System.out.println("Median = " + median);
        }
    }


