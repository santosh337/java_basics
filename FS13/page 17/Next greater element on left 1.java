import java.io.*;
import java.util.*;

public class Solution {
    
    public static int[] nextGreaterEleLeft(int[] arr) {
        Stack<Integer> st = new Stack<>();
        int[] ans = new int[arr.length];
        ans[0] = -1;
        
        st.push(0); // Inserting the index here not the value;
        
        for (int i = 1;i<arr.length;i++) {
            while (st.size() != 0 && arr[st.peek()] <= arr[i]) {
                st.pop();
            }
            if (st.size() == 0) {
                ans[i] = -1;
            } else {
                ans[i] = arr[st.peek()];
            }
            st.push(i);
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i=0;i<n;i++) {
            arr[i] = scn.nextInt();
        }
        int[] ans = nextGreaterEleLeft(arr); //function to find the greater elements.
        
        for (int val: ans) {
            System.out.print(val+" ");
        }
    }
}
