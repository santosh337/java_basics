import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        
        for (int i=0;i<n;i++) {
            arr[i] = scn.nextInt();
        }
        int[] ans = new int[n];

        //initialize the stack
        Stack<Integer> st = new Stack<>();

        //traverse
        for (int i=0;i<n;i++) {
            /*while stack is not become empty and while we didn't found
            a lower temperature*/
            while(!st.isEmpty() &&
             arr[i] > arr[st.peek()]){
                 int j = st.pop();
                 ans[j] = i-j;
             }
             //add to stack
             st.add(i);
        }
        for (int val : ans) {
            System.out.print(val+" ");
        }
    }
}
