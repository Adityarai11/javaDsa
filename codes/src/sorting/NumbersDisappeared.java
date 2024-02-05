package sorting;

public class NumbersDisappeared {
    public static void main(String[] args) {
        int nums[] ={1,1};
        sort(nums);
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

        } int missingNumber =0;
        for(int j =0 ; j< nums.length;j++) {
            if (nums[j] != j + 1) {
                 missingNumber = j + 1;
                 System.out.println("Missing number: " + missingNumber);
            }
        }
    }
}

