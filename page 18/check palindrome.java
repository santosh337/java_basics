import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        
        for (int i = 1;i<=n;i++) {
            int rev = 0;
            int saved = 0;
            int digit = scn.nextInt();
            saved = digit;
            while (digit>0) {
            int rem = digit%10;
            rev = rev * 10 + rem;
            digit /= 10;
            }
            if (saved == rev) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
            
        }
    }
}
