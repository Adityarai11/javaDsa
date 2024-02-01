import java.util.Scanner;

public class javacsQ1 {
    public static void main(String args[]) {
        Scanner n = new Scanner(System.in);
        double a = n.nextDouble();
       /*  if(a>=100){
            System.out.println("person having fever");
        }
        else{
            System.out.println("person not having fever");
            
        }*/
       String type = ((a>=100)) ?"fever" : "not fever"; 
       System.out.println(type);
    }
    
}//prints You have a fever if your temperature is above 100 and otherwise prints You don't have a fever.
