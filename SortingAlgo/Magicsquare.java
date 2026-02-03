import java.util.Scanner;

public class Magicsquare {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n =sc.nextInt();
        if(n%2==0){
            System.out.println("magic square doesn't exist");

        }
        int[][] arr=new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        int sum=0;
        int sum2=0;
        for(int i=0;i<n;i++){
            sum+=arr[i][i];
            sum2=sum2+arr[n-1-i][i];

        }
        if (sum != sum2) {
            System.out.println("Not a Magic Square");
            return;
        }

        // Check rows and columns
        for (int i = 0; i < n; i++) {
            int rowSum = 0;
            int colSum = 0;

            for (int j = 0; j < n; j++) {
                rowSum += arr[i][j];
                colSum += arr[j][i];
            }

            if (rowSum != sum || colSum != sum) {
                System.out.println("Not a Magic Square");
                return;
            }
        }

        System.out.println("It is a Magic Square");
        sc.close();
    }
}



