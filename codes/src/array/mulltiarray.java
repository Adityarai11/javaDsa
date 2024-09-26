package array;

public class mulltiarray {
    public static void basic() {
        int [] arr = {4,5,2,8,1};
        int max = 0;
        for (int i = 0; i<arr.length; i++){
            if (max < arr[i]) {
                max= arr [i];
            }
        }    System.out.println(max);

    }

//    public static void two_D_array(){
//        int [][] arr_1 = new int[5][3];
//        int [][] arr_2 = {{11,22},{33,44},{55,66}};
//
//        System.out.println(arr_2[0][0]+" "+ arr_2[1][0] +" "+ arr_2[2][0]);
//        System.out.println(arr_2[0][1]+" "+ arr_2[1][1] +" "+ arr_2[2][1]);
//
//        System.out.println(arr_2[1][0]);
//        System.out.println(arr_2[1][1]);
//
//        System.out.println(arr_2[2][0]);
//        System.out.println(arr_2[2][1]);
//
//
//    }
    public static void main(String[] args) {
//        two_D_array();
        basic();

    }
}
