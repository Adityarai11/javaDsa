// Write a Java method to compute the sum of the digits in an integer.
//(Hint : Approach this question in the following way :
//a. Take a variable sum = 0
//b. Find the last digit of the number
//c. Add it to the sum
public class question0{
    public static int sumofdigit(int num) {
        int sum=0;
        while (num > 0){
            int rem = num % 10;
            sum +=rem;
            num /= 10;
            }
            return sum;
    }public static void main(String[] args) {
        System.out.print("Enter an Integer: ");
        int n = new java.util.Scanner(System.in).nextInt();
        System.out.println("\n The Sum of Digits is :" + sumofdigit(n));
        
    }

}