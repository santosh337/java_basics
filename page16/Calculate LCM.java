import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        
        for (int j=1;j<=t;j++) {
            int x = scn.nextInt();
        int y = scn.nextInt();
        
        int product = x * y;
        
        for (int i = y;i<=product;i+= y) {
            if (i%x==0) {
                System.out.println(i);
                break;
            }
        }
        }
    }
}
