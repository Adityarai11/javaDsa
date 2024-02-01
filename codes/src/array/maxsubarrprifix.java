//better solutionn
public class maxsubarrprifix {
    public static void maxsubarr(int number[]){
        int currsum=0;
        int maxsum=Integer.MIN_VALUE;
        int prifix[] = new int[number.length];
        prifix[0] = number[0];
        for(int i=1;i<prifix.length;i++){
            prifix[i] = prifix[i-1] + number[i];

        }for(int i =0;i<number.length;i++){
            int start = i;
            for(int j =i+1;j<number.length;j++){
                int end = j;
                currsum = start ==0 ? prifix[end]: prifix[end]-prifix[start-1];
                if(maxsum<currsum){
                maxsum = currsum;
                }
            }
        }System.out.println("The maxsubarray = " + maxsum);
    }
    public static void main(String[] args) {
        int number [] = {1,-2,6,-1,3};
        maxsubarr(number);
        
    }
    
}
