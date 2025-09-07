import java.util.Scanner;
class PossibleHandshakes{
    public static void PH(){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter NO of student:");
        float N=sc.nextFloat();
        float P= (N * (N - 1)) / 2;
        System.out.println("No. of possible handshake:"+P);
        
    }
    public static void main(String[] args)
    {
        PossibleHandshakes.PH();
        }
}