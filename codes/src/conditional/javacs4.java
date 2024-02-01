import java.util.Scanner;

public class javacs4 {
    public static void main(String args[]) {
        Scanner n = new Scanner(System.in);
        int income = n.nextInt();
        int tax ;
        if (income<500000){
            tax = 0;
            System.out.println( "0% tax");
        }
        else if(income>=500000 && income<1000000l){
            tax =(int)(income*0.2);


        }
        else{
            tax = (int)(income*0.2);
            System.out.println("30%tax");
        }
        System.out.println("your tax is:"+tax);
    }
    
    
}
