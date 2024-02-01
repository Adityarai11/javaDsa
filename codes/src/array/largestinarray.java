import java.util.*;
public class largestinarray {
    public static int Largest(int number[]){
    //optimal solution
    //     int largest = number[0];// let assume index or first element is largest 
    //     for(int i=0;i<number.length;i++){// checking for each element
    //         if(number[i]>largest){//checking number "i" greter then each element
    //             largest=number[i];
    //         }
    //     }return largest;

    // }public static void main(String[] args) {
    //     int number[] = {1,2,3,8,4,2,10};
    //     System.out.println("largest element in array = " + Largest(number));
    // }
        int largest = Integer.MIN_VALUE ;
        for(int i=0; i < number.length ;i++){
            if(largest < number[i]){
                largest = number[i];
            }
        }
        return largest;
    }
    public static void main(String[] args) {
        int number[] = {0,2,5,4,9};
        System.out.println("The largest element is " + Largest(number));
    }

    
}