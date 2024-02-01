import java.util.Scanner;

public class javacs8 {
    public static void main(String args[] ) {
        Scanner n = new Scanner(System.in);
        int a = n.nextInt();
        int b = n.nextInt();
        char c = n.next().charAt(0);//char user input ker ne ke liye use kiya hai

        switch(c) {
            case '+' : System.out.println(a+b);
                        break ;
            case '-' : System.out.println(a-b);
                        break ;
            case '*' : System.out.println(a*b);
                        break ;
            case '%' : System.out.println(a%b);
                        break ;
            case '/' : System.out.println(a/b);
                        break ;
            default : System.out.println("wrong entery");

         }
       
    }
}
// using switich statement create calculator
