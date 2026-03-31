import java.util.HashSet;
import java.util.Set;

public class Count_subarray {


        public static int countDistinctDiff(int[] arr) {
            int n = arr.length;
            Set<Integer> set = new HashSet<>();

            for (int i = 0; i < n; i++) {

                int max1 = Integer.MIN_VALUE;
                int max2 = Integer.MIN_VALUE;

                for (int j = i; j < n; j++) {

                    int x = arr[j];

                    if (x > max1) {
                        max2 = max1;
                        max1 = x;
                    } else if (x > max2) {
                        max2 = x;
                    }

                    if (max2 != Integer.MIN_VALUE) {
                        set.add(max1 - max2);
                    }
                }
            }

            return set.size();



    }

    public static void main(String[] args) {

    }
    }
