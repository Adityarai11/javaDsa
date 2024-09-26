public class factorial {
    public static int Fact(int n) {
//        int f = 1;
////        for(int i =1; i<=n; i++){
////            f *=i;//f=f*i
////        }
////        return f;
        int ans = 1;
        //outer loop
        for(int i=1;i<=n;i++ ){
            int sum =0;
            for (int k= 0;k<i;k++){
                sum +=ans;
            }
            ans = sum;
        }return ans;
    }

    public static void main(String[] args) {
        int n = Fact(5);
        System.out.println("Factorial of a number is "+ n);

    }
}
// factorial 