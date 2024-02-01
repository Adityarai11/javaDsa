public class kadanesalgo {
    public static void kadanes(int a[]) {
        int ms = Integer.MIN_VALUE;
        int cs = 0;
        for(int i =0;i<a.length;i++){
            cs+=a[i];
            if (cs<0){
                 cs=-1;
            }
            ms = Math.max(ms,cs);
        }System.out.println("the max sum = "+ ms);
    }
    public static void main(String[] args) {
        int a[] = {-1,-2,-4,6};
        kadanes(a);
    }
    
}
