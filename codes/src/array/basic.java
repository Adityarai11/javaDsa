package array;

public class basic {
    static boolean SortedArr(int[]arr){
        boolean check = true;
        for (int i =1;i< arr.length;i++){
            if(arr[i] < arr[i-1]){
                check = false;
                break;
            }
        }return check;
    }
    static int countOccurrence(int[] arr, int x) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i ] == x) {
                count++;

            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr = {5, 2, 4, 3, 9};
        int x = 7 ;
        System.out.println(countOccurrence(arr, x));
        System.out.println(SortedArr(arr));
    }
}
