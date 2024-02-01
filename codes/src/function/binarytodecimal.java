public class binarytodecimal {
    public static void main(String[] args) {
        int n = 101;
        int no = n;
        int pow = 0;
        int dec = 0;
        while (n > 0){
            int lastDigit = n % 10;
            dec = dec + (lastDigit * (int) Math.pow(2,pow));
            pow++;
            n /= 10;
        }
        System.out.println("decima of " + no + " = " + dec);

    }
    
}
