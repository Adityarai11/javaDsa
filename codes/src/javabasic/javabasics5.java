import java.util.Scanner;

import javax.swing.plaf.synth.SynthIcon;

public class javabasics5 {
    public static void main(String args[]){
        Scanner n = new Scanner (System.in);
        int a = n.nextInt();
        int b = n.nextInt();
        System.out.println(a+b);
        System.out.println(a*b);
        float radius = n.nextFloat();
        float area =3.14f *radius*radius;/*(3.14f) hame java mei floating value ke liye 'f'mention ker na pedh ta h ku ki java mei her ek decimal
                                                     ko java double mention ker le ta hai */ 
        System.out.println(area);

    }
    
}
//user input add & mult. of 2no
//area 