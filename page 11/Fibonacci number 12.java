import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();
        
        int x = 0;
        int y = 1;
        int z = 0;
        for (int i=0;i<num;i++) {
            if (i>1) {
                System.out.print(z+" ");
                x = y;
               y = z;
               z = x+y;
            } else {
                System.out.print(i+" ");
                if (i == 1) {
                    z = (x+y);
                }
            }
            
        }
    }
}
