import java.util.*;

public class javacsQ2 {
    public static void main(String args[]) {
        Scanner n = new Scanner(System.in);
        int a = n.nextInt();
        switch (a) {
            case 1: System.out.println("monday");
                break;
            case 2: System.out.println("tuesday");
                break;
            case 3: System.out.println("wednesday");
                break;
            case 4: System.out.println("thursday");
                break;
            case 5: System.out.println("friday");
                break;    
            case 6: System.out.println("saturday");
                break;
            case 7: System.out.println("sunday");
                break;
            default:System.out.println("new week sterted");
                break;
        }
        
    }
    
}//Write a Java program to input week number (1-7) and print day of week name using switch case
