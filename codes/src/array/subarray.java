public class subarray {
    public static void Subarrays(int number[]){
        int ts = 0;//to print the total no of subarray n(n+1)/2
        for(int i=0;i<number.length;i++){//loop for starting element
            int start = i;
            for(int j=i+1;j<number.length;j++){
                int end =j;
                for(int k =start;k<=end;k++){
                    System.out.print(number[k]+ "  ");
                }
                ts++;
                System.out.println();
            }
            System.out.println();
        }System.out.println("total no of subarrays are = "+ ts);
    }
    public static void main(String[] args) {
        int number[]= {1,2,3,4,5};
        Subarrays(number);
    }
    //sum of subarray and maximum sub array

    // public class subarray {
//     public static void Subarrays(int number[]){
//         int currsum =0;
//         int maxsum = Integer.MIN_VALUE;
//         for(int i=0;i<number.length;i++){
//             int start = i;
//             for(int j=i;j<number.length;j++){
//                 int end =j;
//                 currsum = 0;
//                 for(int k =start;k<=end;k++){
                    
//                     currsum += number[k];
                   
//                 }
//                 System.out.println( currsum);
//                 if(currsum>maxsum){
//                     maxsum=currsum;
//                 }
//             }
            
//         }System.out.println("the sum of subarray = "+ maxsum);
//     }
//     public static void main(String[] args) {
//         int number[]= {1,2,3,4,5};
//         Subarrays(number);
//     }
    
// }

    
}
