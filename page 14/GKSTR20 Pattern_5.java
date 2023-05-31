import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        for (int i=1;i<=n;i++) {
            // Inner Loop --> Space Print 
            for (int j=1;j<=n-i;j++) {
                    System.out.print(" ");
            }
            // This is for the printing star
            for (int j=1;j<=i;j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
