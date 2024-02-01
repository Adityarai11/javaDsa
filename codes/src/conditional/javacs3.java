import java.util.Scanner;

public class javacs3 {
    public static void main(String args[]){
        Scanner n = new Scanner (System.in);
        int kbd = n.nextInt();
        if(kbd >= 10){
            System.out.println("pro player");

        }
        else if (kbd <=50){
            System.out.println("pro defender");

        }
        else{
            System.out.println("noob");
        

        }

    }
    
}
