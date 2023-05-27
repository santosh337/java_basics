import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
         Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        
        for (int i=n; i>=0;i--) {
            if (n%8!=0) {
                n--;
            } else {
                break;
            }
        }
        
        for (int i=n;i>=1;i -= 8) {
            System.out.print(i+" ");
        }
    }
}
