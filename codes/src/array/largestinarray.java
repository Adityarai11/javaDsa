import java.util.*;
public class largestinarray {
    public static int Largest(int arr[]){
        //optimal solution
        //     int largest = arr[0];// let assume index or first element is largest 
        //     for(int i=0;i<arr.length;i++){// checking for each element
        //         if(arr[i]>largest){//checking arr "i" greter then each element
        //             largest=arr[i];
        //         }
        //     }return largest;

        // }public static void main(String[] args) {
        //     int arr[] = {1,2,3,8,4,2,10};
        //     System.out.println("largest element in array = " + Largest(arr));
        // }
        int largest = Integer.MIN_VALUE ;
        for(int i=0; i < arr.length ;i++){
            if(largest < arr[i]){
                largest = arr[i];
            }
        }
        return largest;
    }
    public static void main(String[] args) {
        int arr[] = {0,2,15,4,9};
        System.out.println("The largest element is " + Largest(arr));
    }

    
}