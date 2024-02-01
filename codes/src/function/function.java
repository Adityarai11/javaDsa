import java.util.Scanner;

public class function {
    public static int calculate( int a ,int b  ) {
        int mult = a * b;
      return mult;

        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int mult = calculate(a, b);
        System.out.println("multiple =" + mult);


        
    }
    
}