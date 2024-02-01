import java.util.Scanner;

public class javabasics10 {
    public static void main (String args[]) {
        Scanner n = new Scanner (System.in ) ;
        int a = n.nextInt();
        float b = n.nextFloat();
        int c= n.nextInt();
        float sum = a+b-c/a ;
        float modulos = a%b;  
        System.out.println(sum);
        System.out.println(modulos);
    }    
}
