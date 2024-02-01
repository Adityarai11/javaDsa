import java.util.Scanner;

public class isprimeinrange {
    public static boolean isprime(int n) {
        if(n==1){
            return false;
        }
        for(int i = 2 ;i<=Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }return true;
    }
    public static void primenorange(int n) {
        for(int i=1; i<=n; i++){
            if(isprime(i)){
                System.out.println("Is a Prime number = "+ i +" ");
            }else{
                System.out.println("Isn't a Prime number = " + i + " ");
            }
        }System.out.println( );
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        primenorange(n); 

    }
}
