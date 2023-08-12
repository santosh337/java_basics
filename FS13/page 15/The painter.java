import java.io.*;
import java.util.*;

public class Solution {
    public static boolean isPossibleToPaint (int[] arr,int k , int limit) {
        int countOfPainter = 1;
        int sum = 0;
        
        for (int ele: arr) {
            if (sum + ele <= limit) {
                sum += ele;
            } else {
                countOfPainter++;
                sum = ele;
            }
        }
        return countOfPainter <= k;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i=0;i<n;i++) {
            arr[i] = scn.nextInt();
        }
        int k = scn.nextInt();
        
        int low = 0;
        int high = 0;
        int ans = -1;
        
        for (int ele : arr) {
            low = Math.max(ele,low);
            high += ele;
        }
        
        while (low <= high) {
            int mid = low + (high - low)/2;
            if(isPossibleToPaint(arr,k,mid)) {
                ans = mid;
                high = mid  - 1;
            } else {
                low = mid + 1;
            }
        }
        
        System.out.println(ans);
    }
}
