import java.util.*;
public class javabreakq {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        for(int a = sc.nextInt();a<100; a++){
            if (a%10==0) {
                break;
                
            }System.out.println(a);
            
        }
       
       /*  do{
            System.out.print("enter your no = ");
            int a = sc.nextInt();
            if (a % 10 == 0) {
                break;
                
            }System.out.println(a);
        }while(true);*/
        
    }
    
}
