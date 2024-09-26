package sorting;

public class FindDuplicate {
    public static void main(String[] args) {
        int nums[] = {4,3,2,7,8,2,3,1};
        System.out.println(duplicate(nums));
    }
    public static int duplicate(int nums[]) {
        int i = 0;
        while (i < nums.length){
            if(nums[i] != i+1){
                int current = nums[i]-1;
                if(nums[i]!=nums[current]) {
                    int temp = nums[i];
                    nums[i] = nums[current];
                    nums[current] = temp;
                }  else{
                    return nums[i];
                }
            }else{
                i++;
            }
        }return -1;
    }
}
