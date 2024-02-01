import java.util.Scanner;

public class javacs {
    public static void main(String args[]) {
        Scanner n = new Scanner (System.in);
        int age = n.nextInt();
        if(age>=18){
            System.out.println("adult:drive,vote");
        }
        if (age>24) {
            System.out.println("earn money28");
        }
        else {
            System.out.println("not adult");
        }
        
        
    }
    
}
