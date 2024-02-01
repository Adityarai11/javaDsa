import java.util.Scanner;
public class javacs6 {
    public static void main(String args[]) {
        Scanner n = new Scanner (System.in);
        double marks =n.nextDouble();
        String type =((marks>=100)) ?"fever" : "fail";
        System.out.println(type);
        
        
    }
    
}// ternary operator
