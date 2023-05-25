import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
         Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int a[] = new int[n];
        
        for (int j=0;j<n;j++) {
            a[j] = scn.nextInt();
        }
        for (int i=0;i<a.length;i++) {
            if (a[i]%2==1) {
                System.out.print(i + " "); 
            }
        }
    }
}
