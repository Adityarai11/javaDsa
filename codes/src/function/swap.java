public class swap {
    public static void Swap(int a ,int b) {
         int temp = a;
         a = b;
         b = temp;
        System.out.println("a =" + a);
        System.out.println("B=" + b);
    }
    public static void main(String[] args) {
        int a = 7;
        int b = 4;
       Swap(a,b);
    }
}
    
