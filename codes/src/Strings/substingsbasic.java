package Strings;

public class substingsbasic {
    public static void main(String[] args) {
        String str = "abcd";
        for (int j =0;j<4;j++) {
            for (int i = j + 1; i <= 4; i++) {
                System.out.println(str.substring(j,i));
            }
        }
    }
}
