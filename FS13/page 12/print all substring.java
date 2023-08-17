import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        
        for (int st=0;st<str.length();st++) {
           for (int end = st;end<str.length();end++) {
               for (int k=st;k<=end;k++) {
                   System.out.print(str.charAt(k)+"");
               }
               System.out.println();
           }
        }
    }
}
