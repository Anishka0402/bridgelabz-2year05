import java.util.Scanner;
class SimpleIntrest{
    public static void SI(){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter principal amount:");
        float P=sc.nextFloat();
        System.out.println("Enter Time:");
        float T=sc.nextFloat();
        System.out.println("Enter Rate of intrest:");
        float R=sc.nextFloat();
        float SI=(P*T*R)/100;
        System.out.println("Simple Intrest is:"+SI);
        
    }
    public static void main(String[] args)
    {
        SimpleIntrest.SI();
        }
}