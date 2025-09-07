import java.util.Scanner;

class NoOfRounds{
    public static float Parameter(){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter length of first side of triangle:");
        float F=sc.nextFloat();
        System.out.println("Enter length of second side of triangle:");
        float S=sc.nextFloat();
        System.out.println("Enter length of third side of triangle:");
        float T=sc.nextFloat();
        float P=F+S+T;
        return P;
        
        
    }
    public static void main(String[] args)
    {
        float Pm=Parameter();
        float Rounds=Pm/5000; 
        System.out.println("No. of rounds that can be made:"+Rounds);
        }
}