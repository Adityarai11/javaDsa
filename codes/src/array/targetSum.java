package array;

import java.util.Scanner;

public class targetSum {
    static int pairsum(int[] arr,int target){
        int n = arr.length;
        int ans =0;
        for(int i =0;i<n;i++){//first number
            for (int j =i+1;j<n;j++){
                for(int k = j+1;k<n;k++){
                    if(arr[i]+arr[j]+arr[k]==target ){
                        ans++;
                    }
                }
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter array size");
        int n =sc.nextInt();
        int [] arr =new int [n];
        System.out.println("enter " + n + " element ");
        for (int i = 0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int target = 12;
        System.out.println(pairsum(arr,target));

    }
}
