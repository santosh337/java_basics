import java.io.*;
import java.util.*;

public class Solution {

     // Own Function
    public static void findEvenBetweenNumbers(int x, int y) {
        for (int i = x;i<=y;i++) {
            if (i%2==0) {
                System.out.print(i+" ");
            }
        }
    }
    public static void main(String[] args) {
       Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        
        for(int i  = 1; i <= t; i++){
            int x = scn.nextInt();
            int y = scn.nextInt();
            findEvenBetweenNumbers(x , y);
            System.out.println();
        }
    }
}
