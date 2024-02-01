public class binarysearch {
    public static int Binary(int a[], int key ) {
        int start = 0;
        int end = a.length-1;
        while(start <=end){
            int mid =(start+end)/2;//sexy
            if(a[mid]== key){
                return mid;
            }if(a[mid]<=key){
                start = mid+1;
            }else {
                end = mid-1;
            } 

        }return -1;
    }
    public static void main(String[] args) {
        int a[] = {2,3,4,5};
        int key = 2;
        System.out.println("find the element = "+ Binary(a, key));
        
    }
}
//binary