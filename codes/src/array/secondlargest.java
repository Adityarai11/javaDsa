public class secondlargest {
    public static int sLargest(int a[]) {
        int slargest =Integer.MIN_VALUE;// creted nearest minimum value
        int largest = a[0];// assumeing first element is lergest 
        for(int i = 0;i<a.length;i++){
            if(a[i]>largest){//same as largest checking each element with each other
                slargest = largest;
                largest = a[i];
            }else if (a[i]<largest && a[i]>slargest){
                slargest =a[i];
            }if (a[0]== a.length-1){
                return -1;
            }
        }return slargest;
    }
    public static int sSmallest(int a[]){
        int ssmallest = Integer.MAX_VALUE;
        int smallest = a[0];
        for(int j= 0;j<a.length;j++){
            if(a[j]< smallest){
                ssmallest = smallest ;
                smallest = a[j];
            }else if (a[j]!=smallest && a[j]<ssmallest){
                ssmallest=a[j];
            }
        }return ssmallest;
        
    }
    public static void main(String[] args) {
        int a [] ={3,3,3,3};
        System.out.println("slargest element = " + sLargest(a));
        System.out.println("sSmallest element = " + sSmallest(a));

    }
    
}
