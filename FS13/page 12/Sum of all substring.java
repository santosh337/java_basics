import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        int ans = 0;
        for (int st=0;st<str.length();st++) {
           for (int end = st;end<str.length();end++) {
               String currStr = "";
               for (int k=st;k<=end;k++) {
                   currStr += str.charAt(k);
               }
               ans += Integer.parseInt(currStr);
           }
        }
        System.out.println(ans);
    }
}
