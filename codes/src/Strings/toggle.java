package Strings;
import java.util.*;
public class toggle {
    public static String TOGGle(String str ) {
        for (int i =0 ;i<str.length();i++){
            boolean flag = true;//capital
            char ch = str.charAt(i);
            if (ch==' ') continue;
            int asci = (int)ch;
            if(asci>=97) flag =false;// small
            if (flag==true){
                asci += 32;
                char dh =(char)asci;
                // str.setCharAt(i,dh);for stringbuilder
                str = str.substring(0,i) + dh + str.substring(i+1);
            }else{
                asci -= 32;
                char dh = (char)asci;
                //str.setCharAt(i,dh); for stringbuilder
                str = str.substring(0,i) +dh+ str.substring(i+1);
            }
        }
        return str;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = " RAiji ";
        //StringBuilder str = new StringBuilder(sc.nextLine());for stringbuilder
        String s = TOGGle(str);
        System.out.println(s);

    }
}
