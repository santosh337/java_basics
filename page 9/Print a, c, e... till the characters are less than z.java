import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        int convert = (char)('a');
               char skip;
               for (int i = convert; i<=(convert+25);i++) {
                   char c = (char)(i);
                   if (i%2==1) {
                       System.out.println(c);
                   }
               }
    }
}
