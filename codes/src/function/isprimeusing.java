// check if an no is prime or not using function (in optimized form)
public class isprimeusing {
    public static boolean isprime(int n) {
        if (n==2){//corner cases ---> it is an spacial case in which we can give an veriable spacial case for it
            return true ;
        }
        for(int i=2; i<=Math.sqrt(n); i++){
            if (n%i==0){
                return false;
            }
        } 
        return true;
    }
    public static void main (String args[]){

        System.out.println("enter a no " + isprime(12));
    }
}
