public class cyclesort {
    public static void main(String[] args) {
        int nums[] = {3,5,2,1,4};
        sort(nums);
        for (int i = 0 ; i<nums  .length;i++){
            System.out.print(nums[i]+" ");
        }System.out.println( );
    }
    static void sort(int nums[]){
        int i = 0;
        while (i<nums.length){
            int correctIndex = nums[i]-1;
            if(nums[i]!= nums[correctIndex]){// if index is not at correct index then swap
                int temp = nums[i];
                nums[i] = nums[correctIndex];
                nums [correctIndex] =temp;
            }else{// index is at correct index then move forward or to the next index
                i++;
            }
        }
    }
}
