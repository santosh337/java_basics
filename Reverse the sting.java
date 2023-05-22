import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        int len = str.length();
        
        for (int i= len - 1;i>=0;i--) {
            System.out.print(str.charAt(i));
        }
    }
}
