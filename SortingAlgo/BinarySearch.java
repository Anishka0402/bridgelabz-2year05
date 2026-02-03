public class BinarySearch {
    public static int binarysearch(int[] arr,int target,int left,int right){
       while(left<=right){
          int mid=left+(right-left)/2;
          if(arr[mid]==target){
                return mid;

            }
           if(arr[mid]>target ){
               left=mid+1;
            }
            else{
                right=mid-1;
            }
        }
       return -1;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int n= arr.length;

        int result = binarysearch(arr, 4, 0, n - 1);

        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found");
        }
    }
}
