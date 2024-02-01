import java.util.Scanner;
public class practiceque2 {
    public static void main (String args[]){
        Scanner n = new Scanner (System.in);
        float pencil = n.nextFloat();
        float pen = n.nextFloat();
        float eraser = n.nextFloat();
        float sum = pencil+pen+eraser+(pencil+pen+eraser)*0.18f;
        System.out.println(sum);
    }
    
}
/*Entercostof3itemsfromtheuser(usingfloatdatatype)-apencil,apenandan eraser. You have to output 
the total cost of the items back to the user as their bill.
(Add on : You can also try adding 18% gst tax to the items in the bill as an advanced problem)*/