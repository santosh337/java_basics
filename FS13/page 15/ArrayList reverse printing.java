import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        ArrayList<Integer> arr = new ArrayList<>(n);
        for (int i=0;i<n;i++) {
            arr.add(scn.nextInt());
        }
        
        for (int i = n-1;i>=0;i--) {
            System.out.print(arr.get(i)+" ");
        }
         System.out.println();
        int j = n-1;
        for (int val : arr) {
            System.out.print(arr.get(j)+" ");
            j--;
        }
    }
}
