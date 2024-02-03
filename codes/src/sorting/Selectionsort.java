public class Selectionsort {
    public static int selection(int arr []){
        int swap=0;
        for(int i= 0;i<arr.length;i++){// no ternus ke liye 
            int minpos = i ;
            for(int j = i+1;j<arr.length;j++){
                if(arr[minpos]>arr[j]){
                minpos= j;
                }
            }if(minpos!=i){
            int temp = arr[minpos];
            arr[minpos] = arr[i];
            arr[i] = temp;
            }
            swap++;
        }return swap;
    }
    public static void main(String[] args) {
        int arr[] = {5,4,1,3,2};
        System.out.print("Original arr = ");
        for (int i = 0 ; i<arr.length;i++){
            System.out.print(arr[i]+" ");

        }System.out.println( );
        selection(arr);
        System.out.print("sorted arr  = ");
        for (int i = 0 ; i<arr.length;i++){
            System.out.print(arr[i]+" ");

        }
        
    }
    
}
