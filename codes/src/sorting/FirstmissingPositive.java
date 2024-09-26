package sorting;

public class FirstmissingPositive {
    public static void main(String[] args){
        int nums [] ={1,2,0,4};
        System.out.println(firstmissing(nums));
    }
    public static int firstmissing(int[] nums){
        int i = 0;
        while (i< nums.length){
            int currentindex = nums[i]-1;
            if(nums[i]> 0 && nums[i]<nums.length && nums[i]!=nums[currentindex]) {
                int temp = nums[i];
                nums[i] = nums[currentindex];
                nums[currentindex] = temp;
            }else{
                i++;
            }
        }
        for(int index = 0 ; index< nums.length;index++){
            if(nums[index]!=index+1){
                return index+1;
            }
        }return nums.length+1;
    }
}
