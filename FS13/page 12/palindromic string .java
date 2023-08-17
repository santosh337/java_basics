import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        int i = 0;
        int j = str.length()-1;
        boolean ans = false;
        String t = "";
        
        for (i=0;i<str.length();i++) {
            char ch = str.charAt(i);
            if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z') || (ch >= '0' && ch <= '9')) {
                if (ch >= 'A' && ch <= 'Z') {
                    ch = (char)(ch-'A'+'a');
                }
                t += ch;
            }
        }
        
        
        while (i<j) {
            if (t.charAt(i) == t.charAt(j)) {
                ans = true;
            } else {
                ans = false;
                break;
            }
            i++;
            j--;
        }
        System.out.println(ans);
    }
}
