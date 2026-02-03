public class BubbleSort {


        public static void BubbleS(int[] arr) {
            int temp;
            boolean swapping;

            for (int i = 0; i < arr.length - 1; i++) {
                swapping = false;

                for (int j = 0; j < arr.length - i - 1; j++) {
                    if (arr[j] > arr[j + 1]) {
                        temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;
                        swapping = true;
                    }
                }


                if (!swapping) {
                    break;
                }
            }
        }

        public static void main(String[] args) {
            int[] arr = {1, 6, 3, 8, 9, 45, 323};

            BubbleS(arr);


            for (int num : arr) {
                System.out.print(num + " ");
            }
        }
    }
