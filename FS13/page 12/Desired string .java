import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        int count = 0;
        int maxStringLen = 0;
        String maxStr = "";
        for (int start=0;start<str.length();start++) {
           for (int end = start;end<str.length();end++) {
               
               String currString = "";
               for (int k=start;k<=end;k++) {
                   currString += str.charAt(k);
               }
               if (currString.length() > 1 && currString.charAt(0) == 'A' && currString.charAt(currString.length() - 1) == 'A') {
                   
                   if (currString.length() > maxStringLen) {
                       maxStr = currString;
                       maxStringLen = currString.length();
                   }
                   count++;
               }
           }
        }
        if (count == 0) {
            System.out.println("-1");
        } else {
            System.out.println(count);
             System.out.println(maxStringLen);
            System.out.println(maxStr);
        }
       
    }
}
