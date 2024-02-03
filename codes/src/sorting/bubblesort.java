public class bubblesort {
    public static void BubbleSort(int arr []) {
        for (int i=0; i<arr.length;i++){//is ke liye loop hai 
            for (int j=1;j<arr.length-i;j++){
                if(arr[j]<arr[j-1]){
                    //swap
                    int temp = arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1] = temp;
                }
            }
        }
        
    }
    public static void main(String[] args) {
    int arr [] = {-2,4,8,-1};
    BubbleSort(arr);
    for(int i = 0 ; i<arr.length;i++){
        System.out.print(arr[i]+ " ");
    }    
    System.out.println( );
  
    }
    
}
