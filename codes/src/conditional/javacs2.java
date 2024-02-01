import java.util.Scanner;

public class javacs2 {
    public static void main(String args[]) {
        Scanner n = new Scanner(System.in);
        int a= n.nextInt();
        int b= n.nextInt();
        if (a%2==0) {
            System.out.println("even");   
        }
        else {
            System.out.println("odd");
        }
    }
    
}
