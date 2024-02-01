//Write a Java program to check if a number is a palindrome in Java? ( 121 is a
//palindrome, 321 is not)
public class palindrome{
    public static boolean Palindrome(int num){
      int n = num;
        int ans = 0;
        while(num != 0){
            int rem = num % 10;
            ans = ans * 10 + rem;
            num /= 10;
            }
        if(n ==ans){
            return true;

        }else{
            return false;

        }
    }
    public static void main(String[] args) {
        System.out.print("Enter the Number:");
        int n = new java.util.Scanner(System.in).nextInt();
        if(Palindrome(n)){
        System.out.println(n +" is a Palindrome Number.");
        }else{
        System.out.println(n +" is Not a Palindrome Number.");
        }
        
    }

}