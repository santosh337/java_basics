import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
       Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        
        for (int i = 1;i<=n;i++) {
            int val = scn.nextInt();
            int i1 = 2;
             boolean flag = false;
            while (i1 <= val / 2) {
            // condition for nonprime number
            if (val % i1 == 0) {
                flag = true;
                break;
            }
            ++i1;
            }

            if (!flag)
                System.out.println("prime");
            else
                System.out.println("not prime");
            
        }
        
    }
}
