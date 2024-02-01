import java.util.* ;
public class decTobinary {
    public static void Dectobinary(int decno) {
        int n = decno;
        int pow = 0;// power of 10
        int ans = 0;// binary no
        while (decno > 0) {
            int rem = decno % 2; // parity 
            ans += (rem * (int)Math.pow(10, pow));
            pow++;
            decno /= 2; 
        }
        System.out.print("The binary representation of "+ n + " is " + ans ) ;
    }
       public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        int decno = sc.nextInt();
        Dectobinary(decno);
        
        
    }
}
