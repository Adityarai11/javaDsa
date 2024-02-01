public class factorial {
    public static int Fact(int n) {
        int f = 1;
        for(int i =1; i<=n; i++){
            f *=i;//f=f*i
        }
        return f;
    }
    public static void main(String[] args) {
    int n = Fact(4);
     System.out.println("Factorial of a number is "+ n);
    }
}
// factorial 