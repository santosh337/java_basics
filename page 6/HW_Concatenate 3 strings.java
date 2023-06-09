import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);
        String str1 = scn.nextLine();
        String str2 = scn.nextLine();
        String str3 = scn.nextLine();
        
        String leng = str1+str2+str3;
        System.out.println(leng.length());
        System.out.print(leng.charAt(2));
    }
}
