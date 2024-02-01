public class reversarr {
    public static void reverse(int number[]) {
        int start =0,end= number.length-1;
        
        while (start<end){
            int temp = number[end];
            number[end] = number[start];
            number[start] = temp;
            start ++;// start ek index aage badega 
            end --;//last ek index piche aaye ga
        }
    }    public static void main(String[] args) {
        int number[]={1,3,4,5,6};
        reverse(number);
        for(int i =0 ;i<number.length;i++){// array ko pinrt kiya hai
            System.out.print(number[i]+" ");

        }System.out.println( );
      
    }
    
}
