import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
      char x = scn.next().charAt(0);
      char y = scn.next().charAt(0);
       
       String first = "" + x;
       String second = "" + y;

      if ((x>='0' && x<='9') && (y>='0' && y<='9')) {
          if (first.equalsIgnoreCase("0")) {
           System.out.println(second);
       } else {
           System.out.println(first + second);
       }
      }
       
    }
}
