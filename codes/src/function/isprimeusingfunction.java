// check an no is prime or notprime using function . 
import java.util.*;
public class isprimeusingfunction {
    public static boolean isprime(int n) {
        for(int i=2; i<=n-1; i++){
            if (n%i==0){
                return false;
            }
        } 
        return true;
       // boolean Isprime = true ;
        // for(int i=2; i<=n-1; i++){
            // if (n%i==0){
                // Isprime =false;
            // }
        // } 
        // return Isprime;
    }
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a no = ");
        int n = sc.nextInt(); 
        System.out.println("prime or notprime = " + isprime(n )  );
        if(isprime(n) ){
            System.out.println(+n + " is prime no");
        }
        else{
                System.out.println(+n +"  is not prime  ");
        }
    }
}
