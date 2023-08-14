import java.io.*;
import java.util.*;

public class Solution {
    
    public static int [] nsol(int [] A){
        int [] ans = new int[A.length];
        ans[0] = -1;
        Stack<Integer> st = new Stack<>();
        st.push(0);     //I am inserting index not value
        
        for(int i = 1; i < ans.length; i++){
            while(st.size() != 0 && A[st.peek()] >= A[i]){
                st.pop();
            }
            if(st.size() == 0){
                ans[i] = -1;
            }
            else {
                ans[i] = st.peek();
            }
            
            st.push(i);
        }
        return ans;
    }
    
    
    public static int [] nsor(int [] A){
        int n = A.length;
        int [] ans = new int[n];
        ans[n-1] = n;
        Stack<Integer> st = new Stack<>();
        st.push(n-1);     //I am inserting index not value
        
        for(int i = n-2; i >= 0; i--){
            while(st.size() != 0 && A[st.peek()] >= A[i]){
                st.pop();
            }
            if(st.size() == 0){
                ans[i] = n;
            }
            else {
                ans[i] = st.peek();
            }
            
            st.push(i);
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] heights = new int[n];
        for (int i=0;i<n;i++) {
            heights[i] = scn.nextInt();
        }
        
        int [] nsol = nsol(heights);
        int [] nsor = nsor(heights);
        
        int ans = 0;
        for(int i = 0; i < heights.length; i++){
            int h = heights[i];
            int w = nsor[i] - nsol[i] - 1;
            
            int area = h * w;
            ans = Math.max(ans, area);
        }
        System.out.println(ans);
    }
}
