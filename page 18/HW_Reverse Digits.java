import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        
        for (int i = 1;i<=n;i++) {
            int rev = 0;
            int digit = scn.nextInt();
            while (digit>0) {
            int rem = digit%10;
            rev = rev * 10 + rem;
            digit /= 10;
            }
            System.out.println(rev);
        }
        
    }
}
