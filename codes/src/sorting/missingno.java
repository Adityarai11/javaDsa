package sorting;

public class missingno {
    public static void main(String[] args){
        int nums [] ={-1,1,2,4};
        System.out.println(missing(nums));
    }
    public static int missing(int[] nums){
        int i = 0;
        while (i< nums.length){
            int currentindex = nums[i]-1;
            if(nums[i]<nums.length && nums[i]!=nums[currentindex]) {
                int temp = nums[i];
                nums[i] = nums[currentindex];
                nums[currentindex] = temp;
            }else{
                i++;
            }
        }//missing positive no
        for(int index = 0 ; index< nums.length;index++){
            if(nums[index]!=index){
                return index;
            }
        }return nums.length;
    }
}
