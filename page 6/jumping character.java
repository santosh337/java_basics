import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
       char chr = scn.next().charAt(0);
       if (chr >= 'a' && chr<= 'w') {
           int val = chr+3;
           char converted = (char)(val);
           System.out.println(converted);
       }  else if (chr >= 'D' && chr<= 'Z') {
           int val = chr-3;
           char converted = (char)(val);
           System.out.println(converted);
       } else {
           System.out.println("Can't jump");
       }
    }
}
