import java.util.Scanner;

public class javacs5 {
    public static void main(String arg[]) {
        Scanner n = new Scanner(System.in);
        int a = n.nextInt();
        int b = n.nextInt();
        int c= n.nextInt();
        if (a>=b && a>=c){
            System.out.println("a is the largest of 3 no");
        }
        else if (a<=c&&b<=c){
            System.out.println("c is the largest of 3 no");
        }
        else{
            System.out.println("b is the largest of 3 no");
        }        
    }
    
}
