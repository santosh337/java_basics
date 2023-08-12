import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        Stack<Integer> st = new Stack<>();
        int T = scn.nextInt();
        
        for (int i=0;i<T;i++) {
            int code = scn.nextInt();
            if (code == 1) {
            System.out.println(st.size());
        } else if (code == 2) {
                if (st.size() == 0) {
                    System.out.println(-1);
                } else {
                    st.pop();
                }
            } else if (code == 3) {
                int x = scn.nextInt();
                st.push(x);
            } else {
                if (st.size() == 0) {
                    System.out.println(-1);
                } else {
                    System.out.println(st.peek());
                }
            }
        }
    }
}
