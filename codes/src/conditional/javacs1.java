import java.util.Scanner;

public class javacs1{
    public static void main(String arg[]) {
        Scanner n = new Scanner (System.in);
        int A = n.nextInt();
        int B = n.nextInt();
        if (A>=B) {
            System.out.println("A is the largest of 2");
        }
        else {
            System.out.println("b is the largest of 2");
        }
    }
}