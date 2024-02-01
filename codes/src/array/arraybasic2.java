import java.util.Scanner;
public class arraybasic2 {
    public static void main(String[] args) {
        int mark[] = new int[50];//creating  array 
        Scanner sc = new Scanner (System .in);
        mark[0]=sc.nextInt();//input an array
        mark[1]=sc.nextInt();//input an array
        mark[2]=sc.nextInt();//input an array
        System.out.println("Phy = " + mark[0]);
        System.out.println("Math = " + mark[1]);
        System.out.println("Chem = " + mark[2]);
        mark[1]=100;//updating in  array
        mark[2]+=4;//updating in  array
        System.out.println("Math = " + mark[1]);
        System.out.println("Chem = " + mark[2]);

        //persentage
        int marks = (mark[0]+mark[1]+mark[2])/3;
        System.out.println("Total persentage = " + marks +"%" );


        
    }
    
}
