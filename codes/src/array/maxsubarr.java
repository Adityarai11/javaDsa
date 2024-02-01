   //sum of subarray and maximum sub array

    public class maxsubarr {
    public static void Subarrays(int number[]){
        int currsum =0;
        int maxsum = Integer.MIN_VALUE;
        for(int i=0;i<number.length;i++){
            int start = i;
            for(int j=i;j<number.length;j++){
                int end =j;
                currsum = 0;
                for(int k =start;k<=end;k++){
                    
                    currsum += number[k];
                   
                }
                System.out.println( currsum);
                if(currsum>maxsum){
                    maxsum=currsum;
                }
            }
            
        }System.out.println("the sum of subarray = "+ maxsum);
    }
    public static void main(String[] args) {
        int number[]= {1,2,3,4,5};
        Subarrays(number);
    }
    
}