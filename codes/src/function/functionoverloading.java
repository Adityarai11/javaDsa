import java.util.Scanner;

public class functionoverloading {
    public static int sum (int a ,int b) {
        return(a+b);       
    }
    public static float sum(float a, float b) {
        return(a + b);
        
    }public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number =");
        int a = sc.nextInt();
        System.out.print("Enter float number=");
        float c = sc.nextFloat();
        System.out.println("");
        System.out.print("Enter second number = ");
        int b=sc.nextInt();
        System.out.print("Enter float number=");
        float d = sc .nextFloat();
        System.out.println("sum of 2 numbers is = "+ sum(a,b));
        System.out.println("sum of two floats is = "+ sum(c,d)) ;
    }
}
