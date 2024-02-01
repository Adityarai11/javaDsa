import java.util.*;
public class javacontinue {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter your no =");
        int n = sc.nextInt();
        for(int a = sc.nextInt();a<=n; a++){
            if(a==3){
                continue;
            }
            System.out.println(a);
        }
    }
    
}
