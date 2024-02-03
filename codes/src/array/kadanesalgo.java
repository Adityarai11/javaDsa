public class kadanesalgo {
    public static void kadanes(int a[]) {
        int ms = Integer.MIN_VALUE;
        int cs = 0;
        for(int i =0;i<a.length;i++){
            cs = Math.max(a[i], cs + a[i]);
            ms = Math.max(ms,cs);
        }System.out.println("the max sum = "+ ms);
    }
    public static void main(String[] args) {
        int a[] = {-1,-2};
        kadanes(a);
    }
    
}
