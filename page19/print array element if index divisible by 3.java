import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int a[]= new int[n]; 
        for (int j=0;j<n;j++) {
            int t = scn.nextInt();
            a[j] = t;
        }
        
        for (int i=0;i<a.length;i++) {
            if (i%3==0) {
                System.out.print(a[i] + " "); 
            }
        }
        
        
    }
}
