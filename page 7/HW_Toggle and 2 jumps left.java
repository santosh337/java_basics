import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        char x = scn.next().charAt(0);
       
       if ((x>= 'c' && x<= 'z') || (x >= 'C' && x <= 'Z')) {
           char toogle = 'A';
           if (Character.isUpperCase(x)) {
               toogle = Character.toLowerCase(x);
           } else {
               toogle = Character.toUpperCase(x);
           }
           int convert = toogle - 2;
           char result = (char)(convert);
           System.out.println(result);
       } else if (x == 'a' || x == 'A' || x == 'b' || x == 'B') {
           char toogle = 'A';
           if (Character.isUpperCase(x)) {
               toogle = Character.toLowerCase(x);
           } else {
               toogle = Character.toUpperCase(x);
           }
           System.out.println("Sorry");
       } else {
           System.out.println("No alphabet");
       }
    }
}
