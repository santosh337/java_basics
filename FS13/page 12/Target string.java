import java.io.*;
import java.util.*;

public class Solution {
    
    // function that rotates s towards left by d
    public static String leftrotate(String str, int d)
    {
            String ans = str.substring(d) + str.substring(0, d);
            return ans;
    }
 
    // function that rotates s towards right by d
    public static String rightrotate(String str, int d)
    {
            return leftrotate(str, str.length() - d);
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str1 = scn.nextLine();
        String target = scn.nextLine();
        String rotateStr = rightrotate(str1, 3);
        if (rotateStr == target) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}
