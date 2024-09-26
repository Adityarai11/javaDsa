public class reversarr {
    public static void reverse(int number[]) {
        int n= number.length;
        for(int i = 0;i<n/2;i++){
          int temp = number[i];
          number[i] = number[n-i-1];
          number[n-i-1]=temp;

        }
//        int start =0,end= number.length-1;
//
//        while (start<end){
//            int temp = number[end];
//            number[end] = number[start];
//            number[start] = temp;
//            start ++;// start ek index aage badega
//            end --;//last ek index piche aaye ga
//        }
    }
    static void printfunc(int [] number){
        for(int i =0 ;i<number.length;i++){// array ko pinrt kiya hai
            System.out.print(number[i]+" ");

        }System.out.println( );

    }
    static int[] revversearr(int[] number){
        int n = number.length;
        int[] ans = new int[n];
        int j= 0;
        for (int i = n-1;i>=0;i--){
            ans[j++] =number[i];
        }
        return ans;
    }
    public static void main(String[] args) {
        int number[]={1,8,4,5,6};
        int [] ans = revversearr(number);
        printfunc(ans);
//        reverse(number);


    }
    
}
