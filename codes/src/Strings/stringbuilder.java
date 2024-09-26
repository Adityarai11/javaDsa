package Strings;
import java.sql.SQLOutput;
import java.util.*;
public class stringbuilder {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("hello");
        //hello-->mello
        str.setCharAt(0,'m');
        System.out.println(str);
        //mello--> mellow world a.
        str.append(" world a");
        System.out.println(str);
        str.insert(2,'y');
        System.out.println(str);
        str.deleteCharAt(2);
        System.out.println(str);
        str.delete(3,5);
        System.out.println(str);
        str.reverse();
        System.out.println(str);
    }
}
