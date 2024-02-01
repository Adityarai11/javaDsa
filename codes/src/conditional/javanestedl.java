import java.util.Scanner;

public class javanestedl {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        for(int line= 1; line<=n; line++){
            //for(int star=1;star<=line; star++)//printing star pattern 
            for(int star =1; star<=(n-line+1);star++)//for inverted star pattern
            {
                System.out.print("*");

            }System.out.println();
        }
        
    }

    
}
