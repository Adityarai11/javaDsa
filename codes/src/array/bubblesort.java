public class bubblesort {
    public static void BubbleSort(int arr []) {
        for (int turn =0; turn<arr.length-1;turn++){
            for (int j =1;j<arr.length-1-turn;j++){
                if(arr[turn]<arr[j+1]){
                    //swap
                    int temp = arr[turn];
                    arr[turn]=arr[j+1];
                    arr[j+1] = arr[turn];
                }
            }
        }
        
    }
    public static void main(String[] args) {
    int arr [] = {1,2,3,4,5};
    for(int i = 0 ; i<arr.length;i++){
        System.out.print(arr[i]+ " ");
    }    
    System.out.println( );
    BubbleSort("sorted"+arr);
    }
    
}
