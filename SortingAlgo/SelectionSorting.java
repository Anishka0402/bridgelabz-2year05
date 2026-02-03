

public class SelectionSorting {
    public static void main(String[] args) {
        int [] arr={3,7,8,2,1};
        int n=arr.length;
        for(int i=0;i<n;i++){
            int min_index=i;
            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[min_index]){
                    min_index=j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[min_index];
            arr[min_index]=temp;

        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }

}
