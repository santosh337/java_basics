import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int i = 1;
        
        while (i<=n) {
            int val = scn.nextInt();
            int steps = 0;
            while (val>0) {
                steps++;
                if (val%2==0) {
                    val -= 1;
                } else {
                    val -= 3;
                }
                
            }
            System.out.println(steps);
            i++;
        }
    }
}
