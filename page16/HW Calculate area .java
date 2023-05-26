import java.io.*;
import java.util.*;

public class Solution {

    // Own Function
    public static int findProduct(int len, int breath) {
        int ans = len * breath;
        return ans;
    }
    public static void main(String[] args) {
       Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        
        for(int i  = 1; i <= t; i++){
            int len = scn.nextInt();
            int bre = scn.nextInt();
            System.out.println(findProduct(len , bre));
        }
    }
}
