import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
         Scanner scn = new Scanner(System.in);
        
        int m = scn.nextInt();
        int n = scn.nextInt();
        int inc = 1;
        for (int i=1;i<=n;i++) {
            if (i == inc) {
                for (int j=1;j<=m;j++) {
                System.out.print("* ");
                }
                inc += 3;
            } else {
                System.out.print("*");
            for(int csp = 1; csp <= m-2; csp++){
                     System.out.print("  ");
            }
             System.out.print(" *");
            }
            System.out.println();
        }
    }
}
