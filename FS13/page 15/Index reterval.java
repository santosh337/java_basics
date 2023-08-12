import java.io.*;
import java.util.*;

public class Solution {
    
    public static int find_index(int[] arr, int n, int K)
{
     
    // Traverse the array
    for(int i = 0; i < n; i++)
     
        // If K is found
        if (arr[i] == K)
            return i;
 
        // If current array element
        // exceeds K
        else if (arr[i] > K)
            return i;
 
    // If all elements are smaller
    // than K
    return n;
}

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i=0;i<n;i++) {
            arr[i] = scn.nextInt();
        }
        int tar = scn.nextInt();
        System.out.println(find_index(arr, n, tar));
    }
}
