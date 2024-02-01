public class Linearsearch {
    public static int linearserch(int marks[] , int key){
        for(int i=0;i<marks.length;i++){
            if(marks[i]==key){
                return i;
            }
        }return -1;
    } 
    public static String linearserch(String menu[], String k){
        for (int j = 0 ; j < menu.length ; j++ ){
            if (menu[j]==k){
                return "Item found at index "+j;
            }
        }return null;
    }
    // second largest in array
    public static void main(String args[]){
        int marks[] ={12,14,15,13,18,15};
        String menu[] ={"apple","banana","orange","mango"};
        int key = new java.util.Scanner(System.in).nextInt();
        String k = new java.util.Scanner(System.in).next();
        System.out.println("Element found at index : "+linearserch(marks,key));
        System.out.println("Fruit found at index : "+linearserch(menu,k));
        // if (linearserch(marks, key)==-1) {
        //     System.out.println("Element is not present in the array");            
        // }else{
        //     System.out.println("Element is present at index " + linearserch(marks,key))
        // }


    }
}