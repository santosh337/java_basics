import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        int i = 0;
        int j = str.length()-1;
        boolean ans = false;
        while (i<j) {
            if (str.charAt(i) == str.charAt(j)) {
                ans = true;
            } else {
                ans = false;
                break;
            }
            i++;
            j--;
        }
        if (ans) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a Palindrome");
        }
    }
}
