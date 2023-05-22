import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        char upper;
               int convert = (char)('a');
               for (int i = convert; i<=(convert+25);i++) {
                   char c = (char)(i);
                   if (i%2==0) {
                       upper = Character.toUpperCase(c);
                   } else {
                       upper = c;
                   }
                   System.out.println(upper);
               }
    }
}
