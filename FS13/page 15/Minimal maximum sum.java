import java.io.*;
import java.util.*;

public class Solution {
    
    public static int max_sum_of_subarray(int arr[], int n, int k)
    {
        int max_sum = 0;
        for (int i = 0; i + k <= n; i++) {
            int temp = 0;
            for (int j = i; j < i + k; j++) {
                temp += arr[j];
            }
            if (temp > max_sum)
                max_sum = temp;
        }
 
        return max_sum;
    }
    
    // Function to find maximum sum of
    // a subarray of size k
    public static int maxSum(int arr[], int n, int k)
    {
        // k must be smaller than n
        if (n < k) {
            System.out.println("Invalid");
            return -1;
        }
 
        // Create Queue
        Queue<Integer> q = new LinkedList<Integer>();
 
        // Initialize maximum and current sum
        int m = Integer.MIN_VALUE;
        int su = 0;
 
        // Compute sum of first k elements
        // and also store them inside queue
        for (int i = 0; i < k; i++) {
            q.add(arr[i]);
            su += arr[i];
        }
 
        // Compute sum of remaining elements
        for (int i = k; i < n; i++) {
 
            // remove first element from the queue
            su -= q.peek();
            q.remove();
 
            // add current element to the queue
            q.add(arr[i]);
            su += arr[i];
 
            // update maximum sum
            m = Math.max(m, su);
        }
        return m;
    }
    
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
