package Queue;

public class NextImmediateGreaterElement {
    public static int[] nextGreaterElement(int[] nums) {
        int[] result = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            // Check if there's a next element and if it's greater
            if (i < nums.length - 1 && nums[i + 1] > nums[i]) {
                result[i] = nums[i + 1];
            } else {
                result[i] = -1;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums = {2, 1, 1, 3, 2, 1};
        int[] result = nextGreaterElement(nums);

        System.out.print("Input:  ");
        for (int num : nums) {
            System.out.print(num + " ");
        }

        System.out.print("\nOutput: ");
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}