import java.util.*;
public class binomialcoeff {
    public static int function(int n) {
        int f = 1;
        for(int i=1; i<=n ; i++ ){
            f=f*i;
        }
        return f;
    }public static int  binomial(int n, int r){
        int func_n = function(n);
        int func_r = function(r);
        int func_c = function(n-r);
        int bino = func_n/(func_r*func_c);
        return bino;     
    }public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("enter n coff =");
        int n =sc.nextInt();
        System.out.print("enter r coff =");
        int r =sc.nextInt();
        int b = binomial(n, r);
        System.out.println("binomial coeff =" + b);
    }
}