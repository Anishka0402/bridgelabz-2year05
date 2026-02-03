public class LinearSearch {
    public static void main(String[] args) {
        int[] arr={3,2,-1,4,2};
        int target=5;
        boolean f=false;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;i< arr.length;j++){
                if(arr[i]+arr[j]==target){
                    System.out.println("True");
                    f=true;
                    break;
                }

            }if(f) break;
        }
        if(!f){
            System.out.println("no pair found");
        }


    }
}
